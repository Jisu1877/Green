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

public class NuriManagement extends JFrame {
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
	Vector vData;
	Vector title;

	public NuriManagement() {
		super("관리자 계정 관리");
		setResizable(false);
		getContentPane().setBackground(new Color(255, 255, 255));
		setSize(1035, 575);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JPanel pn1 = new JPanel();
		pn1.setBackground(new Color(255, 255, 255));
		pn1.setBounds(338, 10, 345, 56);
		getContentPane().add(pn1);
		pn1.setLayout(null);

		JLabel lblNewLabel = new JLabel("관리자 계정 관리");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 27));
		lblNewLabel.setBounds(54, 17, 237, 41);
		pn1.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("누리도서관");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 17));
		lblNewLabel_2.setBounds(128, 0, 89, 29);
		pn1.add(lblNewLabel_2);

		JPanel panel = new JPanel();
		panel.setBounds(58, 171, 903, 261);
		getContentPane().add(panel);
		panel.setLayout(null);

		// 타이틀을 벡터로 처리
		title = new Vector();
		title.add("고유번호");
		title.add("성명");
		title.add("아이디");
		title.add("비밀번호");
		title.add("휴대폰번호");
		title.add("찾기힌트");
		title.add("힌트정답");

		// 테이터를 벡터로 준비해둔다.
		NuriDAO dao = new NuriDAO();
		vData = dao.getList();
//		System.out.println("vData : " + vData);

		// DefaultTableModel에 준비한 벡터 자료를 담는다.
		DefaultTableModel model = new DefaultTableModel(vData, title);

		// DefaultTableModel를 JTable에 올린다.
		tblContent = new JTable(model);

		// JTable을 JScrollPane에 올려준다.
		JScrollPane scrollPane = new JScrollPane(tblContent);
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane.setBounds(0, 0, 904, 262);

		// JScrollPane을 패널에 올려준다.
		panel.add(scrollPane);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(610, 57, 351, 111);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JButton btnUpdate = new JButton("수정");
		btnUpdate.setBackground(new Color(135, 206, 235));
		btnUpdate.setFont(new Font("굴림", Font.PLAIN, 15));
		btnUpdate.setBounds(90, 78, 72, 33);
		panel_2.add(btnUpdate);

		JButton btnDelete = new JButton("삭제");
		btnDelete.setBackground(new Color(135, 206, 235));
		btnDelete.setFont(new Font("굴림", Font.PLAIN, 15));
		btnDelete.setBounds(279, 78, 72, 33);
		panel_2.add(btnDelete);

		JButton btnNewButton_1_1_1 = new JButton("새로고침");
		btnNewButton_1_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_1_1_1.setBackground(new Color(238, 232, 170));
		btnNewButton_1_1_1.setBounds(252, 35, 99, 33);
		panel_2.add(btnNewButton_1_1_1);

		JButton btnInput = new JButton("추가");
		btnInput.setFont(new Font("굴림", Font.PLAIN, 15));
		btnInput.setBackground(new Color(135, 206, 235));
		btnInput.setBounds(9, 78, 72, 33);
		panel_2.add(btnInput);
		
		JButton btnUpdateEnd = new JButton("수정완료");
		btnUpdateEnd.setFont(new Font("굴림", Font.PLAIN, 15));
		btnUpdateEnd.setBackground(new Color(135, 206, 235));
		btnUpdateEnd.setBounds(171, 78, 99, 33);
		panel_2.add(btnUpdateEnd);

		JButton btnDispose = new JButton("홈으로");
		btnDispose.setBackground(new Color(255, 255, 255));
		btnDispose.setFont(new Font("굴림", Font.PLAIN, 15));
		btnDispose.setBounds(452, 483, 94, 33);
		getContentPane().add(btnDispose);
		
		JLabel lblNewLabel_3 = new JLabel("※계정 수정은 '수정'버튼을 누른 후 수정을 원하는 정보를 클릭 / 수정을 마친뒤, '수정완료' 버튼 클릭※");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 13));
		lblNewLabel_3.setBounds(58, 442, 741, 31);
		getContentPane().add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(new Color(176, 196, 222));
		panel_1.setBounds(438, 122, 144, 39);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("계정목록");
		lblNewLabel_1.setBounds(10, 10, 123, 25);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 22));
		panel_1.add(lblNewLabel_1);

//		scrollPane.setViewportView(tblContent);

		setVisible(true);

		/* 메소드 영역 */

		// 추가버튼
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new NuriCreateGrant();
			}
		});

		// 수정버튼
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "수정을 원하는 정보를 클릭하세요.");
				// 값이 더블클릭되면..
				tblContent.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						JTable target = (JTable) e.getSource();
						int row = target.getSelectedRow();
						int col = target.getSelectedColumn();
						String num1, num2, num3;
						switch (col) {
							case 0:
								JOptionPane.showMessageDialog(null, "고유번호는 수정할 수 없습니다.", "고유번호 수정불가",
										JOptionPane.WARNING_MESSAGE);
								break;
							case 1:
								fieldName = "mName";
								selectedvalue = String.valueOf(model.getValueAt(row, 1));
								vo = dao.valueFind(fieldName, selectedvalue);
								mIdx = vo.getmIdx();
								input = JOptionPane.showInputDialog("수정할 성명을 입력하세요.");
								if (input != null) {
									run = true;
									while (run) {
										if (!Pattern.matches("^[가-힣a-zA-z]*$", input)) {
											JOptionPane.showMessageDialog(null, "관리자 이름은 한글 / 영어(대·소문자)만 입력 가능합니다.", "관리자 이름 입력오류", JOptionPane.ERROR_MESSAGE);
											input = JOptionPane.showInputDialog("수정할 성명을 입력하세요.");
										}
										
										else  {
											run = false;
										}
									}
									dao.updateAccount(fieldName, input, mIdx);
									vo2 = dao.updateAccountCheck(fieldName, input);
									if (vo2.getmIdx() == 0) {
										JOptionPane.showMessageDialog(null, "성명 수정 오류.", "수정오류", JOptionPane.ERROR_MESSAGE);
									} else {
										JOptionPane.showMessageDialog(null, "성명 수정 완료.");
										vData = dao.getList();
										model.setDataVector(vData, title);
									}
								}

								break;
							case 2:
								JOptionPane.showMessageDialog(null, "아이디는 수정할 수 없습니다.", "아이디 수정불가",
										JOptionPane.WARNING_MESSAGE);
//								input = null;
//								fieldName = "mMid";
//								selectedvalue = String.valueOf(model.getValueAt(row, 2));
//								vo = dao.valueFind(fieldName, selectedvalue);
//								mIdx = vo.getmIdx();
//								input = JOptionPane.showInputDialog("수정할 아이디를 입력하세요.");
//								run = true;
//								while(run) {
//									NuriManageVO vo3 = dao.overLap(input);
//									if (!Pattern.matches("^[a-zA-z0-9]*$", input)) {
//										JOptionPane.showMessageDialog(null, "아이디는 영어(대·소문자) / 숫자만 입력 가능합니다.", "관리자 아이디 입력오류", JOptionPane.ERROR_MESSAGE);
//										input = JOptionPane.showInputDialog("수정할 아이디를 입력하세요.");
//									}
//									else if(vo3.getmIdx() != 0) {
//										JOptionPane.showMessageDialog(null, "중복된 아이디입니다.", "아이디 수정 오류", JOptionPane.ERROR_MESSAGE);
//										input = JOptionPane.showInputDialog("수정할 아이디를 입력하세요.");
//									}
//									else {
//										run = false;
//									}
//								}
//								dao.updateAccount(fieldName, input, mIdx);
//								vo2 = dao.updateAccountCheck(fieldName, input);
//								if (vo2.getmIdx() == 0) {
//									JOptionPane.showMessageDialog(null, "아이디 수정 오류.", "수정오류", JOptionPane.ERROR_MESSAGE);
//								} else {
//									JOptionPane.showMessageDialog(null, "아이디 수정 완료.");
//									vData = dao.getList();
//									model.setDataVector(vData, title);
//								}
								break;
							case 3:
								JOptionPane.showMessageDialog(null, "비밀번호는 수정할 수 없습니다.\n비밀번호 찾기를 진행하세요.", "비밀번호 수정불가",
										JOptionPane.WARNING_MESSAGE);
								break;
							case 4:
								input = null;
								fieldName = "mNumber";
								selectedvalue = String.valueOf(model.getValueAt(row, 4));
								vo = dao.valueFind(fieldName, selectedvalue);
								mIdx = vo.getmIdx();
								input = JOptionPane.showInputDialog("수정할 휴대폰번호를 하이픈(-)을 넣어 입력하세요.\n Ex)010-0000-0000");
								run = true;
								if(input != null) {
									while(run) {
										NuriManageVO vo3 = dao.numCheck(input);
										if (!Pattern.matches("^01([0|1|6|7|8|9])-([0-9]{3,4})-([0-9]{4})$", input)) {
											JOptionPane.showMessageDialog(null, "휴대폰번호 형식에 맞지 않습니다.", "휴대폰 번호 입력오류", JOptionPane.ERROR_MESSAGE);
											input = JOptionPane.showInputDialog("수정할 휴대폰번호를 하이픈(-)을 넣어 입력하세요.\n Ex)010-0000-0000");
										}
										else if(vo3.getmIdx() != 0) {
											JOptionPane.showMessageDialog(null, "중복된 휴대폰 번호입니다.", "휴대폰번호 수정 오류", JOptionPane.ERROR_MESSAGE);
											input = JOptionPane.showInputDialog("수정할 휴대폰번호를 하이픈(-)을 넣어 입력하세요.\n Ex)010-0000-0000");
										}
										else {
											run = false;
										}
									}
									//수정하기
									dao.updateAccount(fieldName, input, mIdx);
									vo2 = dao.updateAccountCheck(fieldName, input);
									if (vo2.getmIdx() == 0) {
										JOptionPane.showMessageDialog(null, "휴대폰번호 수정 오류.", "수정오류", JOptionPane.ERROR_MESSAGE);
									} else {
										JOptionPane.showMessageDialog(null, "휴대폰번호 수정 완료.");
										vData = dao.getList();
										model.setDataVector(vData, title);
									}
								}
								break;
							case 5:
								JOptionPane.showMessageDialog(null, "찾기힌트는 수정하실 수 없습니다.", "힌트 수정불가",
										JOptionPane.WARNING_MESSAGE);
								break;
							case 6:
								JOptionPane.showMessageDialog(null, "힌트정답은 수정하실 수 없습니다.", "힌트정답 수정불가",
										JOptionPane.WARNING_MESSAGE);
								break;
								
						}
						vData = dao.getList();
						model.setDataVector(vData, title);
					}
				});
			}
		});

//				switch(tblContent.getSelectedRowCount()) {
//					case 0:
//						JOptionPane.showMessageDialog(null, "수정을 원하는 계정을 선택해주세요.", "계정 수정 오류", JOptionPane.WARNING_MESSAGE);
//						break;
//					case 1:
//						
////						DefaultTableModel에서 선택한 컬럼의 값들을 가져오기
//						String mIdx = String.valueOf(model.getValueAt(tblContent.getSelectedRow(), 0));
//						String mName = String.valueOf(model.getValueAt(tblContent.getSelectedRow(), 1));
//						String mMid = String.valueOf(model.getValueAt(tblContent.getSelectedRow(), 2));
//						String mPwd = String.valueOf(model.getValueAt(tblContent.getSelectedRow(), 3));
//						String mNumber = String.valueOf(model.getValueAt(tblContent.getSelectedRow(), 4));
//						String mHint = String.valueOf(model.getValueAt(tblContent.getSelectedRow(), 5));
//						String mHintAns = String.valueOf(model.getValueAt(tblContent.getSelectedRow(), 6));
//						
//						new NuriUpdateGrant(mIdx, mName, mMid, mPwd, mNumber, mHint, mHintAns);
//						
//						break;
//					default :
//						JOptionPane.showMessageDialog(null, "하나의 계정만 선택해주세요.", "계정 수정 오류", JOptionPane.WARNING_MESSAGE);
//						break;
//				}

		// 삭제버튼
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tblContent.getSelectedRowCount() == 1) {
					int result = JOptionPane.showConfirmDialog(null, "선택된 계정을 삭제하시겠습니까?", "삭제 확인",
							JOptionPane.YES_NO_OPTION);
					if (result == JOptionPane.YES_OPTION) {
						for (int i : tblContent.getSelectedRows()) {
//							System.out.println(String.valueOf(model.getValueAt(i, 0))); 고유번호(idx)가 넘어간다.
							dao.deleteAccount(String.valueOf(model.getValueAt(i, 0)));
							NuriManageVO vo = dao.deleteAccountCheck(String.valueOf(model.getValueAt(i, 0)));
							if (vo.getmIdx() == 0) {
								JOptionPane.showMessageDialog(null, "계정삭제 완료.");
								model.removeRow(tblContent.getSelectedRow());
							} else {
								JOptionPane.showMessageDialog(null, "계정삭제오류.\n다시 시도해주세요.", "계정삭제오류",
										JOptionPane.ERROR_MESSAGE);
							}
						}
					}
				} else if (tblContent.getSelectedRowCount() > 1) {
					JOptionPane.showMessageDialog(null, "하나의 계정만 선택해주세요.", "계정 삭제 오류", JOptionPane.WARNING_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "삭제를 원하는 계정을 선택해주세요.", "계정 삭제 오류", JOptionPane.WARNING_MESSAGE);
				}

			}
		});

		//수정완료 버튼
		btnUpdateEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new NuriManagement();
			}
		});
		
		// 새로고침 버튼
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new NuriManagement();
			}
		});

		// 홈 버튼
		btnDispose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		// 더블클릭으로 수정 불가하게..
//	     @Override public boolean isCellEditable(int row, int column) {
//	            return false;
//	     }

	}

	public boolean isCellEditable(int row, int column) {
		return false;
	}

	public static void main(String[] args) {
		new NuriManagement();
	}
}
