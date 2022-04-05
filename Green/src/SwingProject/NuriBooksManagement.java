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
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;

public class NuriBooksManagement extends JFrame {
	private JTable tblContent;
// TODO 개별조회/전체조회 넣기
	public static int newCreateCheck = 0;
	Object value;
	String bIdx2;
	Vector vData;
	Vector title;
	private JTextField txtIsbn;
	private JTextField txtBookName;
	private JTextField txtAuthor;
	private JTextField txtPublish;
	private JTextField txtBookPosition;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public NuriBooksManagement() {
		super("도서 관리");
		getContentPane().setBackground(new Color(255, 255, 255));
		setSize(1035, 808);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JPanel pn1 = new JPanel();
		pn1.setBackground(new Color(255, 255, 255));
		pn1.setBounds(346, 10, 328, 70);
		getContentPane().add(pn1);
		pn1.setLayout(null);

		JLabel lblNewLabel = new JLabel("도서 관리");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(59, 27, 209, 41);
		pn1.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("누리도서관");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_2.setBounds(108, 0, 112, 29);
		pn1.add(lblNewLabel_2);

		JPanel panel = new JPanel();
		panel.setBounds(58, 171, 903, 369);
		getContentPane().add(panel);
		panel.setLayout(null);
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
		title.add("대여여부[Y/N]");

		// 데이터를 벡터로 준비해둔다.
		NuriDAO dao = new NuriDAO();
		vData = dao.getBooksList();
//		System.out.println("vData : " + vData);

		// DefaultTableModel에 준비한 벡터 자료를 담는다.
		DefaultTableModel model = new DefaultTableModel(vData, title);

		// DefaultTableModel를 JTable에 올린다.
		tblContent = new JTable(model);

		// JTable을 JScrollPane에 올려준다.
		JScrollPane scrollPane = new JScrollPane(tblContent);
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane.setBounds(0, 0, 904, 369);

		// JScrollPane을 패널에 올려준다.
		panel.add(scrollPane);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(674, 100, 287, 61);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JButton btnNewButton_1_1_1 = new JButton("새로고침");
		btnNewButton_1_1_1.setFont(new Font("굴림", Font.BOLD, 15));
		btnNewButton_1_1_1.setBackground(new Color(238, 232, 170));
		btnNewButton_1_1_1.setBounds(188, 25, 99, 33);
		panel_2.add(btnNewButton_1_1_1);
		
		JButton btnDelete_1 = new JButton("대여여부 변경");
		btnDelete_1.setFont(new Font("굴림", Font.BOLD, 15));
		btnDelete_1.setBackground(new Color(245, 222, 179));
		btnDelete_1.setBounds(12, 25, 143, 33);
		panel_2.add(btnDelete_1);

		JButton btnDispose = new JButton("홈으로");
		btnDispose.setBackground(UIManager.getColor("Button.darkShadow"));
		btnDispose.setFont(new Font("굴림", Font.PLAIN, 15));
		btnDispose.setBounds(463, 716, 94, 33);
		getContentPane().add(btnDispose);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.setBounds(58, 555, 903, 151);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("ISBN :");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_3.setBounds(12, 24, 68, 27);
		panel_1.add(lblNewLabel_3);
		
		txtIsbn = new JTextField();
		txtIsbn.setFont(new Font("굴림", Font.PLAIN, 16));
		txtIsbn.setBounds(71, 25, 156, 27);
		panel_1.add(txtIsbn);
		txtIsbn.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("도서명 :");
		lblNewLabel_3_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_3_1.setBounds(239, 24, 68, 27);
		panel_1.add(lblNewLabel_3_1);
		
		txtBookName = new JTextField();
		txtBookName.setFont(new Font("굴림", Font.PLAIN, 16));
		txtBookName.setColumns(10);
		txtBookName.setBounds(309, 24, 156, 27);
		panel_1.add(txtBookName);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("저자 :");
		lblNewLabel_3_1_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_3_1_1.setBounds(478, 24, 68, 27);
		panel_1.add(lblNewLabel_3_1_1);
		
		txtAuthor = new JTextField();
		txtAuthor.setFont(new Font("굴림", Font.PLAIN, 16));
		txtAuthor.setColumns(10);
		txtAuthor.setBounds(530, 24, 143, 27);
		panel_1.add(txtAuthor);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("출판사 :");
		lblNewLabel_3_1_1_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_3_1_1_1.setBounds(685, 24, 68, 27);
		panel_1.add(lblNewLabel_3_1_1_1);
		
		txtPublish = new JTextField();
		txtPublish.setFont(new Font("굴림", Font.PLAIN, 16));
		txtPublish.setColumns(10);
		txtPublish.setBounds(757, 24, 136, 27);
		panel_1.add(txtPublish);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("대분류 :");
		lblNewLabel_3_1_1_1_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_3_1_1_1_1.setBounds(264, 62, 68, 27);
		panel_1.add(lblNewLabel_3_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("서고위치 :");
		lblNewLabel_3_1_1_1_1_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_3_1_1_1_1_1.setBounds(514, 62, 90, 27);
		panel_1.add(lblNewLabel_3_1_1_1_1_1);
		
		txtBookPosition = new JTextField();
		txtBookPosition.setFont(new Font("굴림", Font.PLAIN, 16));
		txtBookPosition.setColumns(10);
		txtBookPosition.setBounds(597, 62, 156, 27);
		panel_1.add(txtBookPosition);
		
		JButton btnInput = new JButton("도서추가");
		btnInput.setFont(new Font("굴림", Font.BOLD, 15));
		btnInput.setBackground(new Color(135, 206, 235));
		btnInput.setBounds(497, 114, 109, 27);
		panel_1.add(btnInput);
		
		JComboBox comboCategory = new JComboBox();
		comboCategory.setFont(new Font("굴림", Font.PLAIN, 16));
		comboCategory.setModel(new DefaultComboBoxModel(new String[] {"소설", "시/에세이", "인문", "가정/육아", "요리", "건강", "취미/실용/스포츠", "경제/경영", "자기계발", "정치/사회", "역사/문화", "종교", "잡지", "여행", "컴퓨터/IT", "청소년", "유아"}));
		comboCategory.setBounds(333, 62, 156, 27);
		panel_1.add(comboCategory);
		
		JButton btnUpdate = new JButton("도서수정");
		btnUpdate.setFont(new Font("굴림", Font.BOLD, 15));
		btnUpdate.setBackground(new Color(240, 230, 140));
		btnUpdate.setBounds(131, 114, 109, 27);
		panel_1.add(btnUpdate);
		
		JButton btnUpdateEnd = new JButton("수정완료");
		btnUpdateEnd.setFont(new Font("굴림", Font.BOLD, 15));
		btnUpdateEnd.setBackground(new Color(240, 230, 140));
		btnUpdateEnd.setBounds(295, 114, 109, 27);
		panel_1.add(btnUpdateEnd);
		
		JButton btnDelete = new JButton("도서삭제");
		btnDelete.setFont(new Font("굴림", Font.BOLD, 15));
		btnDelete.setBackground(new Color(135, 206, 235));
		btnDelete.setBounds(653, 114, 109, 27);
		panel_1.add(btnDelete);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.inactiveCaptionBorder);
		panel_3.setBounds(415, 125, 189, 36);
		getContentPane().add(panel_3);
		
		JLabel lblNewLabel_1 = new JLabel("도서목록");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 19));
		lblNewLabel_1.setBackground(new Color(176, 196, 222));
		panel_3.add(lblNewLabel_1);


		setVisible(true);

		//도서 추가 버튼
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String isbn = txtIsbn.getText();
				String bookName = txtBookName.getText();
				String Author = txtAuthor.getText();
				String publish = txtPublish.getText();
				String category = comboCategory.getSelectedItem().toString();
				String bookPosition = txtBookPosition.getText();
				
				// 이미등록했던 도서인지 확인(ISBN 중복확인)
				NuriBooksVO vo = dao.isbnOverLap(isbn);
				
				// 유효성검사
				if (isbn.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "ISBN을 입력하세요.", "ISBN 미입력", JOptionPane.WARNING_MESSAGE);
					txtIsbn.requestFocus();
				} else if(vo.getbIdx() != 0) {
					JOptionPane.showMessageDialog(null, "이미 등록된 도서입니다. \n입력하신 ISBN의 도서명은 '"+vo.getBookName()+"'입니다.", "중복된 도서", JOptionPane.WARNING_MESSAGE);
				} else if (bookName.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "도서명을 입력하세요.", "도서명 미입력", JOptionPane.WARNING_MESSAGE);
					txtIsbn.requestFocus();
				} else if (Author.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "저자를 입력하세요.", "저자 미입력", JOptionPane.WARNING_MESSAGE);
					txtIsbn.requestFocus();
				} else if (publish.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "출판사를 입력하세요.", "출판사 미입력", JOptionPane.WARNING_MESSAGE);
					txtIsbn.requestFocus();
				} else if (bookPosition.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "서고위치를 입력하세요.\n배정 전 서고는 '미지정'으로 입력해주세요.", "서고위치 미입력", JOptionPane.WARNING_MESSAGE);
					txtIsbn.requestFocus();
				}
				else {
					// 도서추가하기
					dao.inputBook(isbn, bookName, Author, publish, category, bookPosition);
					JOptionPane.showMessageDialog(null, "도서추가가 완료되었습니다.", "도서추가 완료", JOptionPane.INFORMATION_MESSAGE);
					vData = dao.getBooksList();
					model.setDataVector(vData, title);
					txtIsbn.setText("");
					txtBookName.setText("");
					txtAuthor.setText("");
					txtPublish.setText("");
					txtBookPosition.setText("");
				}
			}
		});
		
		//도서 수정버튼
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(tblContent.getSelectedRowCount()) {
					case 0:
						JOptionPane.showMessageDialog(null, "수정하고자 하는 도서를 선택해주세요.", "도서 수정 안내", JOptionPane.INFORMATION_MESSAGE);
						break;
					case 1:
						JOptionPane.showMessageDialog(null, "※하단에서 수정 내용을 변경 후 '수정완료'버튼을 클릭.※");
						bIdx2 = String.valueOf(model.getValueAt(tblContent.getSelectedRow(), 0));
						txtIsbn.setText(String.valueOf(model.getValueAt(tblContent.getSelectedRow(), 1)));
						txtBookName.setText(String.valueOf(model.getValueAt(tblContent.getSelectedRow(), 2)));
						txtAuthor.setText(String.valueOf(model.getValueAt(tblContent.getSelectedRow(), 3)));
						txtPublish.setText(String.valueOf(model.getValueAt(tblContent.getSelectedRow(), 4)));
						comboCategory.setSelectedItem(String.valueOf(model.getValueAt(tblContent.getSelectedRow(), 5)));
						txtBookPosition.setText(String.valueOf(model.getValueAt(tblContent.getSelectedRow(), 6)));
						
						break;
					default :
						JOptionPane.showMessageDialog(null, "하나의 도서만 선택해주세요.", "도서 수정 오류", JOptionPane.WARNING_MESSAGE);
						break;
				}
			}
		});
		
		//도서 수정 완료 버튼
		btnUpdateEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DefaultTableModel에서 선택한 컬럼의 값들을 가져오기
				//String bIdx = String.valueOf(model.getValueAt(tblContent.getSelectedRow(), 0));
				String isbn = txtIsbn.getText();
				String bookName = txtBookName.getText();
				String author = txtAuthor.getText();
				String publish = txtPublish.getText();
				String category = comboCategory.getSelectedItem().toString();
				String bookPosition = txtBookPosition.getText();
				//도서수정
				dao.NuriBooksUpdate(bIdx2, isbn, bookName, author, publish, category, bookPosition);
				//도서수정 확인
				NuriBooksVO vo = dao.NuriBooksChack(bIdx2);
				if(vo.getIsbn().equals(isbn) && vo.getBookName().equals(bookName) && vo.getAuthor().equals(author) && vo.getPublish().equals(publish) && vo.getCategory().equals(category) && vo.getBookPosition().equals(bookPosition)) {
					JOptionPane.showMessageDialog(null, "도서수정이 완료되었습니다.");
					vData = dao.getBooksList();
					model.setDataVector(vData, title);
					txtIsbn.setText("");
					txtBookName.setText("");
					txtAuthor.setText("");
					txtPublish.setText("");
					txtBookPosition.setText("");
				}else {
					JOptionPane.showMessageDialog(null, "도서수정 과정에 오류가 발생했습니다.", "도서수정 오류", JOptionPane.WARNING_MESSAGE);
				}
			}
		});

		//대여여부 변경
		btnDelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(tblContent.getSelectedRowCount()) {
					case 0: 
						JOptionPane.showMessageDialog(null, "변경을 원하는 도서를 선택 후 클릭하세요.", "대여여부 수정 안내", JOptionPane.INFORMATION_MESSAGE);
						break;
					case 1:
						String ibx3 = String.valueOf(model.getValueAt(tblContent.getSelectedRow(), 0));
						String rental = String.valueOf(model.getValueAt(tblContent.getSelectedRow(), 7));
						NuriBooksVO vo = dao.NuriBooksChack(ibx3);
						if(rental.equals("N")) {
							int result = JOptionPane.showConfirmDialog(null, "선택하신 '"+vo.getBookName()+"' 도서를 \n'대여(Y)'상태로 변경하시겠습니까?", "대여여부 변경확인", JOptionPane.YES_NO_OPTION);
							if(result == JOptionPane.YES_OPTION) {
								rental = "Y";
								//대여상태 변경
								dao.rentalUpdate(ibx3, rental);
								//대여상태 변경확인
								NuriBooksVO vo2 = dao.reanalUpdateCheck(ibx3, rental);
								if(vo2.getbIdx() != 0) {
									vData = dao.getBooksList();
									model.setDataVector(vData, title);
								}else {
									JOptionPane.showMessageDialog(null, "대여상태 변경 오류.", "대여상태 변경 오류", JOptionPane.WARNING_MESSAGE);
								}
							}
						}else if(rental.equals("Y")) {
							int result = JOptionPane.showConfirmDialog(null, "선택하신 '"+vo.getBookName()+"' 도서를 \n'미대여(N)'상태로 변경하시겠습니까?", "대여여부 변경확인", JOptionPane.YES_NO_OPTION);
							if(result == JOptionPane.YES_OPTION) {
								rental = "N";
								//대여상태 변경
								dao.rentalUpdate(ibx3, rental);
								//대여상태 변경확인
								NuriBooksVO vo2 = dao.reanalUpdateCheck(ibx3, rental);
								if(vo2.getbIdx() != 0) {
									vData = dao.getBooksList();
									model.setDataVector(vData, title);
								}else {
									JOptionPane.showMessageDialog(null, "대여상태 변경 오류.", "대여상태 변경 오류", JOptionPane.WARNING_MESSAGE);
								}
							}
						}
						break;
					default :
						JOptionPane.showMessageDialog(null, "하나의 도서만 선택해주세요.", "대여여부 수정 오류", JOptionPane.WARNING_MESSAGE);
						break;
						
				}
			}
		});
		
		//도서삭제 버튼
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tblContent.getSelectedRowCount() == 1) {
					int result = JOptionPane.showConfirmDialog(null, "선택된 도서를 삭제하시겠습니까?", "삭제 확인",
							JOptionPane.YES_NO_OPTION);
					if (result == JOptionPane.YES_OPTION) {
						for (int i : tblContent.getSelectedRows()) {
							dao.deleteBook(String.valueOf(model.getValueAt(i, 0)));
							NuriBooksVO vo = dao.deleteBookCheck(String.valueOf(model.getValueAt(i, 0)));
							if (vo.getbIdx() == 0) {
								JOptionPane.showMessageDialog(null, "도서삭제 완료.");
								model.removeRow(tblContent.getSelectedRow());
							} else {
								JOptionPane.showMessageDialog(null, "도서삭제오류.\n다시 시도해주세요.", "도서삭제오류",
										JOptionPane.ERROR_MESSAGE);
							}
						}
					}
				} else if (tblContent.getSelectedRowCount() > 1) {
					JOptionPane.showMessageDialog(null, "하나의 도서만 선택해주세요.", "도서 삭제 오류", JOptionPane.WARNING_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "삭제를 원하는 도서를 선택해주세요.", "도서 삭제 오류", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		// 새로고침 버튼
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new NuriBooksManagement();
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
		new NuriBooksManagement();
	}
}
