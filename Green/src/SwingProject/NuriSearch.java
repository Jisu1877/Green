package SwingProject;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class NuriSearch extends JFrame {
	private JTextField txtSearch;
	private JTable tblContent;
	
	Vector vData;
	Vector title;
	String fieldName;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public NuriSearch(String selected, String value) {
		super("누리도서관 홈");
		setResizable(false);
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBackground(new Color(216, 191, 216));
		pn1.setBounds(0, 0, 881, 63);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("소장자료 검색");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		lblNewLabel.setBounds(312, 10, 256, 43);
		pn1.add(lblNewLabel);
		
		JPanel pn3 = new JPanel();
		pn3.setBackground(new Color(255, 255, 255));
		pn3.setBounds(0, 120, 881, 323);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		//TODO jtable 열 크기 조정하기..
		// 타이틀을 벡터로 처리
		title = new Vector();
		title.add("고유번호");
		title.add("ISBN");
		title.add("도서명");
		title.add("저자");
		title.add("출판사");
		title.add("대분류");
		title.add("서고위치");
		title.add("대여가능여부[Y/N]");
		
		//데이터를 벡터로 준비하기
		NuriDAO dao = new NuriDAO();
		vData = dao.getBooksList();
		
		DefaultTableModel model = new DefaultTableModel(vData, title);
		
		tblContent = new JTable(model);
		
		for (int i = 0; i < vData.size(); i++) {
			String rentalCheck = tblContent.getValueAt(i, 7).toString();
			rentalCheck = rentalCheck.equals("Y") ? "대여중" : "대여 가능";
			tblContent.setValueAt(rentalCheck, i, 7);
		}
		
		JScrollPane scrollPane = new JScrollPane(tblContent);
		scrollPane.setBounds(0, 0, 881, 319);
		pn3.add(scrollPane);
		
//		scrollPane.setViewportView(tblContent);
		
		JPanel pn5 = new JPanel();
		pn5.setBackground(new Color(255, 255, 255));
		pn5.setBounds(0, 442, 881, 62);
		getContentPane().add(pn5);
		pn5.setLayout(null);
		
		JButton btnDispose = new JButton("취소");
		btnDispose.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		btnDispose.setBackground(SystemColor.inactiveCaptionBorder);
		btnDispose.setBounds(381, 16, 118, 29);
		pn5.add(btnDispose);
		
		JPanel pn2 = new JPanel();
		pn2.setBackground(new Color(255, 255, 255));
		pn2.setBounds(0, 60, 881, 63);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JComboBox comboCategory = new JComboBox();
		comboCategory.setModel(new DefaultComboBoxModel(new String[] {"도서명(중간일치)", "도서명(완전일치)", "저자", "출판사", "ISBN"}));
		comboCategory.setBackground(new Color(255, 255, 255));
		comboCategory.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		comboCategory.setBounds(69, 18, 182, 27);
		pn2.add(comboCategory);
		
		txtSearch = new JTextField();
		txtSearch.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		txtSearch.setBounds(263, 18, 325, 27);
		pn2.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnSearch = new JButton("검색");
		btnSearch.setBackground(new Color(255, 250, 250));
		btnSearch.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnSearch.setBounds(600, 18, 95, 27);
		pn2.add(btnSearch);
		
		JButton btnSearchAll = new JButton("자료전체조회");
		btnSearchAll.setBounds(707, 16, 162, 29);
		pn2.add(btnSearchAll);
		btnSearchAll.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		btnSearchAll.setBackground(SystemColor.inactiveCaptionBorder);
		
		setSize(895, 541);
		setLocationRelativeTo(null);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		setVisible(true);
		
		/* 메소드 영역 */
		
		//전체조회 버튼
		btnSearchAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				vData = dao.getBooksList();
//				for (int i = 0; i < vData.size(); i++) {
//					String rentalCheck = tblContent.getValueAt(i, 7).toString();
//					rentalCheck = rentalCheck.equals("Y") ? "대여중" : "대여 가능";
//					tblContent.setValueAt(rentalCheck, i, 7);
//				}
//				model.setDataVector(vData, title);
				dispose();
				new NuriSearch("","");
			}
		});
		
		//자료 상세 검색으로 넘어가기..!
		tblContent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JTable target = (JTable) e.getSource();
				int row = target.getSelectedRow();
				int col = target.getSelectedColumn();
				String bIdx = String.valueOf(model.getValueAt(row, 0));
				new NuriBooksInfomation(bIdx);
			}
		});
		
		
		//Home에서 검색해서 넘어왔을 경우 검색창에 바로 값 띄워주기..
		if(!selected.equals("null") && !value.equals("null")) {
			comboCategory.setSelectedItem(selected);
			txtSearch.setText(value);
		}
		
		//검색 버튼
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedCategory = comboCategory.getSelectedItem().toString();
				String value = txtSearch.getText();
				if(selectedCategory.equals("ISBN")) {
					fieldName = "isbn";
					vData = dao.booksSearch2(fieldName, value);
					model.setDataVector(vData, title);
				}else if(selectedCategory.equals("도서명(중간일치)")) {
					fieldName = "bookName";
					vData = dao.booksSearch2(fieldName, value);
					model.setDataVector(vData, title);
				}else if(selectedCategory.equals("도서명(완전일치)")) {
					fieldName = "bookName";
					vData = dao.booksSearch(fieldName, value);
					model.setDataVector(vData, title);
				}else if(selectedCategory.equals("출판사")) {
					fieldName = "publish";
					vData = dao.booksSearch2(fieldName, value);
					model.setDataVector(vData, title);
				}else if(selectedCategory.equals("저자")) {
					fieldName = "author";
					vData = dao.booksSearch2(fieldName, value);
					model.setDataVector(vData, title);
				}
			}
		});
		
		//취소버튼 
		btnDispose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		//엔터를 치면...!
		txtSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnSearch.doClick();
				}
			}
		});
	}
	
	
	public static void main(String[] args) {
//		new NuriSearch();
	}
}
