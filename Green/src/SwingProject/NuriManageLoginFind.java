package SwingProject;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

public class NuriManageLoginFind extends JFrame {

	NuriDAO dao = new NuriDAO();
	private JTextField txtHintId;
	private JTextField txtHintPwd;
	private JTextField txtMid;

	String mNum, mHint, mHintAns, mMid;
	private JTextField txtNum1Id;
	private JTextField txtNum2Id;
	private JTextField txtNum3Id;
	private JTextField txtNum1;
	private JTextField txtNum2Pwd;
	private JTextField txtNum3Pwd;

	public NuriManageLoginFind() {
		super("Nuri 관리자 로그인");
		getContentPane().setBackground(new Color(255, 255, 255));
		setResizable(false);
		setTitle("Nuri 관리자 아이디·비밀번호 찾기");
		setBounds(100, 100, 811, 474);
		setLocationRelativeTo(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JButton btnDispose = new JButton("취소");
		btnDispose.setBounds(353, 390, 91, 29);
		getContentPane().add(btnDispose);
		btnDispose.setFont(new Font("굴림", Font.BOLD, 17));
		btnDispose.setBackground(Color.WHITE);

		JPanel pn1 = new JPanel();
		pn1.setBackground(SystemColor.inactiveCaptionBorder);
		pn1.setBounds(12, 10, 384, 359);
		getContentPane().add(pn1);
		pn1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("아이디 찾기");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(79, 48, 225, 38);
		pn1.add(lblNewLabel_1);

		JLabel lblNewLabel_2_1 = new JLabel("관리자");
		lblNewLabel_2_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(163, 28, 55, 29);
		pn1.add(lblNewLabel_2_1);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(33, 104, 318, 167);
		pn1.add(panel);

		JLabel lblNewLabel = new JLabel("찾기 힌트");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel.setBounds(12, 73, 80, 32);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("힌트정답");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_2.setBounds(12, 114, 80, 32);
		panel.add(lblNewLabel_2);

		JComboBox comboHintId = new JComboBox();
		comboHintId.setModel(new DefaultComboBoxModel(new String[] { "나의 보물은?", "출신 초등학교는?", "가장 친한 친구는?",
				"가장 좋아하는 음식은?", "가장 좋아하는 책제목은?", "가장 좋아하는 영화제목은?" }));
		comboHintId.setFont(new Font("굴림", Font.PLAIN, 13));
		comboHintId.setBackground(new Color(250, 240, 230));
		comboHintId.setBounds(104, 78, 179, 23);
		panel.add(comboHintId);

		txtHintId = new JTextField();
		txtHintId.setFont(new Font("굴림", Font.PLAIN, 14));
		txtHintId.setColumns(10);
		txtHintId.setBounds(104, 114, 179, 27);
		panel.add(txtHintId);

		JLabel lblNewLabel_3 = new JLabel("휴대폰번호");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_3.setBounds(0, 27, 92, 32);
		panel.add(lblNewLabel_3);

		txtNum1Id = new JTextField();
		txtNum1Id.setHorizontalAlignment(SwingConstants.CENTER);
		txtNum1Id.setFont(new Font("굴림", Font.PLAIN, 14));
		txtNum1Id.setColumns(10);
		txtNum1Id.setBounds(103, 31, 51, 27);
		panel.add(txtNum1Id);

		JLabel lblNewLabel_3_2 = new JLabel("-");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setBounds(140, 37, 50, 15);
		panel.add(lblNewLabel_3_2);

		txtNum2Id = new JTextField();
		txtNum2Id.setHorizontalAlignment(SwingConstants.CENTER);
		txtNum2Id.setFont(new Font("굴림", Font.PLAIN, 14));
		txtNum2Id.setColumns(10);
		txtNum2Id.setBounds(179, 31, 51, 27);
		panel.add(txtNum2Id);

		JLabel lblNewLabel_3_1_2 = new JLabel("-");
		lblNewLabel_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_2.setBounds(216, 37, 50, 15);
		panel.add(lblNewLabel_3_1_2);

		txtNum3Id = new JTextField();
		txtNum3Id.setHorizontalAlignment(SwingConstants.CENTER);
		txtNum3Id.setFont(new Font("굴림", Font.PLAIN, 14));
		txtNum3Id.setColumns(10);
		txtNum3Id.setBounds(255, 31, 51, 27);
		panel.add(txtNum3Id);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(33, 281, 318, 50);
		pn1.add(panel_1_1);

		JButton btnFind = new JButton("ID찾기");
		btnFind.setFont(new Font("굴림", Font.BOLD, 14));
		btnFind.setBackground(Color.WHITE);
		btnFind.setBounds(93, 10, 130, 29);
		panel_1_1.add(btnFind);

		JPanel pn1_1 = new JPanel();
		pn1_1.setBackground(SystemColor.inactiveCaptionBorder);
		pn1_1.setLayout(null);
		pn1_1.setBounds(397, 10, 384, 359);
		getContentPane().add(pn1_1);

		JLabel lblNewLabel_1_1 = new JLabel("비밀번호 찾기");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(79, 48, 225, 38);
		pn1_1.add(lblNewLabel_1_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("관리자");
		lblNewLabel_2_1_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_2_1_1.setBounds(163, 28, 55, 29);
		pn1_1.add(lblNewLabel_2_1_1);

		JPanel pn2 = new JPanel();
		pn2.setLayout(null);
		pn2.setBackground(SystemColor.inactiveCaption);
		pn2.setBounds(33, 104, 318, 167);
		pn1_1.add(pn2);

		JLabel lblNewLabel_4 = new JLabel("찾기 힌트");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_4.setBounds(12, 81, 80, 32);
		pn2.add(lblNewLabel_4);

		JLabel lblNewLabel_2_2 = new JLabel("힌트정답");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_2.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_2_2.setBounds(12, 122, 80, 32);
		pn2.add(lblNewLabel_2_2);

		JComboBox comboHintPwd = new JComboBox();
		comboHintPwd.setModel(new DefaultComboBoxModel(new String[] { "나의 보물은?", "출신 초등학교는?", "가장 친한 친구는?",
				"가장 좋아하는 음식은?", "가장 좋아하는 책제목은?", "가장 좋아하는 영화제목은?" }));
		comboHintPwd.setFont(new Font("굴림", Font.PLAIN, 13));
		comboHintPwd.setBackground(new Color(250, 240, 230));
		comboHintPwd.setBounds(102, 86, 179, 23);
		pn2.add(comboHintPwd);

		txtHintPwd = new JTextField();
		txtHintPwd.setFont(new Font("굴림", Font.PLAIN, 14));
		txtHintPwd.setColumns(10);
		txtHintPwd.setBounds(102, 122, 179, 27);
		pn2.add(txtHintPwd);

		JLabel lblNewLabel_3_1 = new JLabel("휴대폰번호");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_1.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(0, 44, 92, 32);
		pn2.add(lblNewLabel_3_1);

		JLabel lblNewLabel_3_1_1 = new JLabel("아이디");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_1_1.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_3_1_1.setBounds(0, 10, 92, 32);
		pn2.add(lblNewLabel_3_1_1);

		txtMid = new JTextField();
		txtMid.setFont(new Font("굴림", Font.PLAIN, 14));
		txtMid.setColumns(10);
		txtMid.setBounds(104, 13, 179, 27);
		pn2.add(txtMid);

		txtNum1 = new JTextField();
		txtNum1.setHorizontalAlignment(SwingConstants.CENTER);
		txtNum1.setFont(new Font("굴림", Font.PLAIN, 14));
		txtNum1.setColumns(10);
		txtNum1.setBounds(102, 49, 51, 27);
		pn2.add(txtNum1);

		JLabel lblNewLabel_3_2_1 = new JLabel("-");
		lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1.setBounds(139, 55, 50, 15);
		pn2.add(lblNewLabel_3_2_1);

		txtNum2Pwd = new JTextField();
		txtNum2Pwd.setHorizontalAlignment(SwingConstants.CENTER);
		txtNum2Pwd.setFont(new Font("굴림", Font.PLAIN, 14));
		txtNum2Pwd.setColumns(10);
		txtNum2Pwd.setBounds(178, 49, 51, 27);
		pn2.add(txtNum2Pwd);

		JLabel lblNewLabel_3_1_2_1 = new JLabel("-");
		lblNewLabel_3_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_2_1.setBounds(215, 55, 50, 15);
		pn2.add(lblNewLabel_3_1_2_1);

		txtNum3Pwd = new JTextField();
		txtNum3Pwd.setHorizontalAlignment(SwingConstants.CENTER);
		txtNum3Pwd.setFont(new Font("굴림", Font.PLAIN, 14));
		txtNum3Pwd.setColumns(10);
		txtNum3Pwd.setBounds(254, 49, 51, 27);
		pn2.add(txtNum3Pwd);

		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBounds(33, 281, 318, 50);
		pn1_1.add(panel_1_1_1);

		JButton btnFind_1 = new JButton("비밀번호 찾기");
		btnFind_1.setFont(new Font("굴림", Font.BOLD, 14));
		btnFind_1.setBackground(Color.WHITE);
		btnFind_1.setBounds(93, 10, 130, 29);
		panel_1_1_1.add(btnFind_1);

		setVisible(true);

		/* 메소드 영역 */

		// 아이디 찾기 버튼
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String imsi1 = txtNum1Id.getText();
				String imsi2 = txtNum2Id.getText();
				String imsi3 = txtNum3Id.getText();
				mNum = imsi1 + "-" + imsi2 + "-" + imsi3;
				mHint = comboHintId.getSelectedItem().toString();
				mHintAns = txtHintId.getText();
				NuriManageVO vo = dao.idFind(mNum, mHint, mHintAns);
				if (vo.getmIdx() == 0) {
					JOptionPane.showMessageDialog(null, "입력하신 정보와 일치하는 회원정보를 찾지 못했습니다. \n 입력하신 정보를 확인해주세요.",
							"아이디 찾기 실패", JOptionPane.ERROR_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "회원님의 아이디는 '" + vo.getmMid() + "' 입니다.", "아이디 안내",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		// 비밀번호 찾기 버튼
		btnFind_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mMid = txtMid.getText();
				String imsi1 = txtNum1.getText();
				String imsi2 = txtNum2Pwd.getText();
				String imsi3 = txtNum3Pwd.getText();
				mNum = imsi1 + "-" + imsi2 + "-" + imsi3;
				mHint = comboHintPwd.getSelectedItem().toString();
				mHintAns = txtHintPwd.getText();
				NuriManageVO vo = dao.pwdFind(mMid, mNum, mHint, mHintAns);
				if (vo.getmIdx() == 0) {
					JOptionPane.showMessageDialog(null, "입력하신 정보와 일치하는 회원정보를 찾지 못했습니다. \n 입력하신 정보를 확인해주세요.",
							"비밀번호 찾기 실패", JOptionPane.ERROR_MESSAGE);
				} else {
					dispose();
					new NuriNewPassword(vo);
				}
			}
		});

		// 취소 버튼
		btnDispose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}

	public static void main(String[] args) {
		new NuriManageLoginFind();
	}
}
