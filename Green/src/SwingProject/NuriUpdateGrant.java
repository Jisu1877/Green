package SwingProject;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class NuriUpdateGrant extends JFrame{
	private JTextField txtName;
	private JTextField txtMid;
	private JTextField txtHint;
	
	NuriDAO dao = new NuriDAO();
	
	String mName;
	String mMid; 
	String mPwd; 
	String mNum;
	String mHint;
	String mHintAns;
	int overLap = 0;
	int pwdCheak = 0;
	int numCheak = 0;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtNum3;
	
	public NuriUpdateGrant(String mIdx, String mName2B, String mMid2B, String mPwd2B, String mNumberB, String mHint2B, String mHintAns2B) {
		super("Nuri 관리자 계정 생성");
		getContentPane().setBackground(new Color(255, 255, 255));
		setResizable(false);
		setBounds(100, 100, 580, 461);
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(46, 117, 478, 235);
		getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("관리자 이름");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 13));
		lblNewLabel_1.setBounds(64, 21, 73, 32);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("아이디");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(64, 63, 73, 32);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("찾기 힌트");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1.setFont(new Font("굴림", Font.BOLD, 13));
		lblNewLabel_1_1_1_1_1.setBounds(52, 147, 85, 32);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		txtName = new JTextField();
		txtName.setHorizontalAlignment(SwingConstants.LEFT);
		txtName.setText(mName2B);
		txtName.setToolTipText("");
		txtName.setFont(new Font("굴림", Font.PLAIN, 14));
		txtName.setColumns(10);
		txtName.setBounds(163, 23, 179, 27);
		panel.add(txtName);
		
		txtMid = new JTextField();
		txtMid.setText(mMid2B);
		txtMid.setFont(new Font("굴림", Font.PLAIN, 14));
		txtMid.setColumns(10);
		txtMid.setBounds(163, 65, 179, 27);
		panel.add(txtMid);
		
		txtHint = new JTextField();
		txtHint.setFont(new Font("굴림", Font.PLAIN, 14));
		txtHint.setColumns(10);
		txtHint.setBounds(165, 181, 179, 27);
		panel.add(txtHint);
		
		JButton btnOverLap = new JButton("중복확인");
		btnOverLap.setBackground(SystemColor.menu);
		btnOverLap.setBounds(354, 65, 85, 27);
		panel.add(btnOverLap);
		
		JComboBox comboHint = new JComboBox();
		comboHint.setModel(new DefaultComboBoxModel(new String[] {"나의 보물은?", "출신 초등학교는?", "가장 친한 친구는?", "가장 좋아하는 음식은?", "가장 좋아하는 책제목은?", "가장 좋아하는 영화제목은?"}));
		comboHint.setFont(new Font("굴림", Font.PLAIN, 13));
		comboHint.setBackground(new Color(250, 240, 230));
		comboHint.setBounds(165, 152, 179, 23);
		panel.add(comboHint);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("힌트 정답");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("굴림", Font.BOLD, 13));
		lblNewLabel_1_1_1_1_1_1.setBounds(40, 178, 97, 32);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("휴대폰 번호");
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_2.setFont(new Font("굴림", Font.BOLD, 13));
		lblNewLabel_1_1_1_2.setBounds(64, 105, 73, 32);
		panel.add(lblNewLabel_1_1_1_2);
		
		String[] NumArrs = mNumberB.split("-");
		
		txtNum1 = new JTextField();
		txtNum1.setText(NumArrs[0]);
		txtNum1.setHorizontalAlignment(SwingConstants.CENTER);
		txtNum1.setFont(new Font("굴림", Font.PLAIN, 14));
		txtNum1.setColumns(10);
		txtNum1.setBounds(163, 108, 51, 27);
		panel.add(txtNum1);
		
		txtNum2 = new JTextField();
		txtNum2.setText(NumArrs[1]);
		txtNum2.setHorizontalAlignment(SwingConstants.CENTER);
		txtNum2.setFont(new Font("굴림", Font.PLAIN, 14));
		txtNum2.setColumns(10);
		txtNum2.setBounds(239, 108, 51, 27);
		panel.add(txtNum2);
		
		txtNum3 = new JTextField();
		txtNum3.setText(NumArrs[2]);
		txtNum3.setHorizontalAlignment(SwingConstants.CENTER);
		txtNum3.setFont(new Font("굴림", Font.PLAIN, 14));
		txtNum3.setColumns(10);
		txtNum3.setBounds(315, 108, 51, 27);
		panel.add(txtNum3);
		
		JLabel lblNewLabel_3 = new JLabel("-");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(200, 198, 50, 15);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("-");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(276, 198, 50, 15);
		panel.add(lblNewLabel_3_1);
		
		JButton btnNumCheck = new JButton("중복확인");
		btnNumCheck.setBackground(SystemColor.menu);
		btnNumCheck.setBounds(381, 108, 85, 27);
		panel.add(btnNumCheck);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setLayout(null);
		panel_1.setBounds(46, 362, 478, 48);
		getContentPane().add(panel_1);
		
		JButton btnDispose = new JButton("취소");
		btnDispose.setFont(new Font("굴림", Font.BOLD, 15));
		btnDispose.setBackground(new Color(255, 255, 255));
		btnDispose.setBounds(96, 10, 91, 29);
		panel_1.add(btnDispose);
		
		JButton btnCreate = new JButton("생성");
		btnCreate.setFont(new Font("굴림", Font.BOLD, 15));
		btnCreate.setBackground(new Color(255, 255, 255));
		btnCreate.setBounds(283, 10, 91, 29);
		panel_1.add(btnCreate);
		
		JLabel lblNewLabel = new JLabel("관리자 계정 수정");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(144, 27, 278, 41);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("누리도서관");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_2.setBounds(240, 10, 85, 29);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("※ 안내사항 :  보안상의 이유로, 비밀번호 수정은 불가하며,");
		lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_4.setBounds(46, 65, 478, 29);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("찾기힌트는 새로 입력하셔야 합니다.");
		lblNewLabel_4_1.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_4_1.setBounds(142, 89, 327, 29);
		getContentPane().add(lblNewLabel_4_1);
		
		
		setVisible(true);
		//처음 포커스를 생성 버튼에 두기(텍스트필드 기본값을 보여주기 위함..)
		btnCreate.requestFocus();
		
		/* 아래는 메소드 영역 */
		

		//중복확인 버튼 처리
		btnOverLap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mMid = txtMid.getText();
				NuriManageVO vo = dao.overLap(mMid);
//				System.out.println("vo :" + vo);
				
				int getIdx = vo.getmIdx();
				
				if(getIdx == 0) {
					JOptionPane.showMessageDialog(null, "사용가능한 아이디입니다.", "아이디 사용 가능", JOptionPane.PLAIN_MESSAGE);
					overLap = 1;
				}
				else if(!vo.getmMid().equals("null")) {
					JOptionPane.showMessageDialog(null, "중복된 아이디입니다. \n 다시 입력해주세요.", "아이디 중복", JOptionPane.INFORMATION_MESSAGE);
					txtMid.setText("");
					txtMid.requestFocus();
				}
				
			} 
		});
		
		//휴대폰번호 중복확인
		btnNumCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String imsi1 = txtNum1.getText();
				String imsi2 = txtNum2.getText();
				String imsi3 = txtNum3.getText();
				mNum = imsi1 + "-" + imsi2 + "-" +imsi3;
				NuriManageVO vo = dao.numCheck(mNum);
				
				if(!Pattern.matches("[0-9]{3,4}", imsi2)) {
					JOptionPane.showMessageDialog(null, "핸드폰번호 형식에 맞지 않습니다. \n 핸드폰 번호를 확인해주세요.", "핸드폰번호 입력 오류", JOptionPane.WARNING_MESSAGE);
				}else if(!Pattern.matches("[0-9]{4}", imsi3)) {
					JOptionPane.showMessageDialog(null, "핸드폰번호 형식에 맞지 않습니다. \n 핸드폰 번호를 확인해주세요.", "핸드폰번호 입력 오류", JOptionPane.WARNING_MESSAGE);
				}else if(!Pattern.matches("^01([0|1|6|7|8|9])([0-9]{3,4})([0-9]{4})$", mNum)) {
					JOptionPane.showMessageDialog(null, "핸드폰번호 형식에 맞지 않습니다. \n 핸드폰 번호를 확인해주세요.", "핸드폰번호 입력 오류", JOptionPane.WARNING_MESSAGE);
				}else if(vo.getmIdx() == 0) {
					JOptionPane.showMessageDialog(null, "등록가능한 핸드폰번호입니다.");
					numCheak = 1;
				}else {
					JOptionPane.showMessageDialog(null, "이미 등록된 핸드폰번호입니다.", "핸드폰 번호 중복", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		
		//생성하기 버튼 (계정생성)
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mName = txtName.getText();
				mMid = txtMid.getText();
				String imsi1 = txtNum1.getText();
				String imsi2 = txtNum2.getText();
				String imsi3 = txtNum3.getText();
				mNum = imsi1 + "-" + imsi2 + "-" + imsi3;
				mHint = comboHint.getSelectedItem().toString();
				mHintAns = txtHint.getText();
				
				//유효성검사
				if(mName.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "관리자 이름을 입력하세요.", "관리자 이름 미입력", JOptionPane.WARNING_MESSAGE);
					txtName.requestFocus();
				}else if(!Pattern.matches("^[가-힣a-zA-z]*$", mName)) {
					JOptionPane.showMessageDialog(null, "관리자 이름은 한글 / 영어(대·소문자)만 입력 가능합니다.", "관리자 이름 입력오류", JOptionPane.ERROR_MESSAGE);
					txtName.requestFocus();
				}else if(mMid.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "아이디를 입력하세요.", "아이디 미입력", JOptionPane.WARNING_MESSAGE);
					txtMid.requestFocus();
				}else if(!Pattern.matches("^[a-zA-z0-9]*$", mMid)) {
					JOptionPane.showMessageDialog(null, "아이디는 영어(대·소문자) / 숫자만 입력 가능합니다.", "아이디 입력오류", JOptionPane.ERROR_MESSAGE);
					txtName.requestFocus();
				}else if(overLap == 0) {
					JOptionPane.showMessageDialog(null, "아이디 중복확인이 필요합니다.", "아이디 중복 미확인", JOptionPane.WARNING_MESSAGE);
					btnOverLap.requestFocus();
				}else if(imsi1.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "핸드폰번호를 입력하세요.", "핸드폰번호 미입력", JOptionPane.WARNING_MESSAGE);
					txtNum1.requestFocus();
				}else if(imsi2.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "핸드폰번호를 입력하세요.", "핸드폰번호 미입력", JOptionPane.WARNING_MESSAGE);
					txtNum2.requestFocus();
				}else if(imsi3.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "핸드폰번호를 입력하세요.", "핸드폰번호 미입력", JOptionPane.WARNING_MESSAGE);
					txtNum3.requestFocus();
				}else if(!Pattern.matches("[0-9]{3,4}", imsi2)) {
					JOptionPane.showMessageDialog(null, "핸드폰번호 형식에 맞지 않습니다. \n 핸드폰 번호를 확인해주세요.", "핸드폰번호 입력 오류", JOptionPane.WARNING_MESSAGE);
				}else if(!Pattern.matches("[0-9]{4}", imsi3)) {
					JOptionPane.showMessageDialog(null, "핸드폰번호 형식에 맞지 않습니다. \n 핸드폰 번호를 확인해주세요.", "핸드폰번호 입력 오류", JOptionPane.WARNING_MESSAGE);
				}else if(!Pattern.matches("^01([0|1|6|7|8|9])([0-9]{3,4})([0-9]{4})$", mNum)) {
					JOptionPane.showMessageDialog(null, "핸드폰번호 형식에 맞지 않습니다. \n 핸드폰 번호를 확인해주세요.", "핸드폰번호 입력 오류", JOptionPane.WARNING_MESSAGE);
				}else if(numCheak == 0) {
					JOptionPane.showMessageDialog(null, "휴대폰번호 중복확인이 필요합니다.", "휴대폰번호 미확인", JOptionPane.WARNING_MESSAGE);
					btnNumCheck.requestFocus();
				}
				else if(mHintAns.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "힌트정답을 입력하세요.", "힌트정답 미입력", JOptionPane.WARNING_MESSAGE);
					txtHint.requestFocus();
				}
				else {
					//계정 생성시키기
					dao.create(mName, mMid, mPwd, mNum, mHint, mHintAns);
					//계정 생성여부 확인하고 메세지 띄우기
					NuriManageVO vo = dao.createCheak(mName);
					if(vo.getmName().equals(mName)) {
						JOptionPane.showMessageDialog(null, "관리자 계정 생성완료.", "관리자 계정 생성완료", JOptionPane.INFORMATION_MESSAGE);
						dispose();
						if(NuriRentalManagement.newCreateCheck == 1) {
							new NuriRentalManagement();
						}
					}
				}
				
			}

		});
		
		//취소하기
		btnDispose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
	}


	public static void main(String[] args) {
//		new NuriUpdateGrant(null, null, null, null, null, null, null);
	}
}
