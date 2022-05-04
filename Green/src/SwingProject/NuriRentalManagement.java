package SwingProject;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.Vector;
import java.util.regex.Pattern;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;

public class NuriRentalManagement extends JFrame {
	private JTable tblContent;
// TODO 개별조회/전체조회 넣기
	public static int newCreateCheck = 0;
	Object value;
	String fieldName;
	String selectedvalue;
	NuriManageVO vo;
	NuriManageVO vo2;
	int mIdx;
	String input;
	boolean run;
	Vector vData, vData2;
	Vector title;
	Vector title2;
	NuriDAO dao = new NuriDAO();
	private JTable tblContent1_2;
	private JTable tblContent1;

	@SuppressWarnings("unchecked")
	public NuriRentalManagement() {
		super("관리자 계정 관리");
		setResizable(false);
		getContentPane().setBackground(new Color(255, 255, 255));
		setSize(1035, 857);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JPanel pn1 = new JPanel();
		pn1.setBounds(338, 10, 345, 56);
		pn1.setBackground(new Color(255, 255, 255));
		getContentPane().add(pn1);
		pn1.setLayout(null);

		JLabel lblNewLabel = new JLabel("대여목록 조회");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 27));
		lblNewLabel.setBounds(54, 17, 237, 41);
		pn1.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("누리도서관");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 17));
		lblNewLabel_2.setBounds(128, 0, 89, 29);
		pn1.add(lblNewLabel_2);

	

		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(610, 57, 351, 111);
		panel_2.setBackground(new Color(255, 255, 255));
		getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JButton btnNewButton_1_1_1 = new JButton("새로고침");
		btnNewButton_1_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_1_1_1.setBackground(new Color(238, 232, 170));
		btnNewButton_1_1_1.setBounds(252, 47, 99, 33);
		panel_2.add(btnNewButton_1_1_1);

		JButton btnDispose = new JButton("홈으로");
		btnDispose.setBounds(463, 763, 94, 33);
		btnDispose.setBackground(new Color(255, 255, 255));
		btnDispose.setFont(new Font("굴림", Font.PLAIN, 15));
		getContentPane().add(btnDispose);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(415, 385, 189, 39);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(new Color(176, 196, 222));
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("대여상세목록");
		lblNewLabel_1.setBounds(10, 10, 167, 25);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 22));
		panel_1.add(lblNewLabel_1);
		
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1.setBackground(new Color(176, 196, 222));
		panel_1_1.setBounds(416, 159, 189, 39);
		getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("대여목록");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(10, 10, 167, 25);
		panel_1_1.add(lblNewLabel_1_1);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(260, 207, 490, 168);
		getContentPane().add(panel2);
		panel2.setLayout(null);
		
		
		title2 = new Vector();
		title2.add("고유번호");
		title2.add("회원번호");
		title2.add("대여날짜");
		
		vData2 = dao.getRental();
//		System.out.println("vData2 : "+vData2);
		DefaultTableModel model2 = new DefaultTableModel(vData2, title2);
		tblContent1_2 = new JTable(model2);
		
		JScrollPane scrollPane2 = new JScrollPane(tblContent1_2);
		scrollPane2.setBounds(0, 0, 490, 168);
		panel2.add(scrollPane2);
//		scrollPane2.setViewportView(tblContent1_2);
		panel2.add(scrollPane2);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(79, 434, 882, 296);
		getContentPane().add(panel1);
		panel1.setLayout(null);
		
		// 타이틀을 벡터로 처리
		title = new Vector();
		title.add("고유번호");
		title.add("대여목록 고유번호");
		title.add("회원 고유번호");
		title.add("대여도서 ISBN");
		title.add("대여상태");
		title.add("반납기한");
		title.add("대여날짜");

		// 테이터를 벡터로 준비해둔다.
		vData = dao.getRentalList();
//		System.out.println("vData : " + vData);
		DefaultTableModel model = new DefaultTableModel(vData, title);
		tblContent1 = new JTable(model);
		
		JScrollPane scrollPane1 = new JScrollPane(tblContent1);
		scrollPane1.setBounds(0, 0, 882, 296);
		panel1.add(scrollPane1);
		
//		scrollPane1.setViewportView(tblContent1);
		
		

//		scrollPane.setViewportView(tblContent);
//		scrollPane2.setViewportView(tblContent2);

		setVisible(true);
		
		// 새로고침 버튼
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new NuriRentalManagement();
			}
		});

		// 홈 버튼
		btnDispose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

	}

	public boolean isCellEditable(int row, int column) {
		return false;
	}

	public static void main(String[] args) {
		new NuriRentalManagement();
	}
}
