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

public class NuriManageLogin extends JFrame{
	private JTextField txtMid;
	
	NuriDAO dao = new NuriDAO(); 
	private JPasswordField txtPwd;
	
	public NuriManageLogin() {
		super("Nuri 관리자 로그인");
		setBounds(100, 100, 449, 310);
		setLocationRelativeTo(null);
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("관리자 로그인");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 23));
		lblNewLabel_1.setBounds(119, 29, 197, 38);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("누리도서관");
		lblNewLabel_2_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(174, 10, 85, 29);
		getContentPane().add(lblNewLabel_2_1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(58, 77, 318, 104);
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 17));
		lblNewLabel.setBounds(29, 20, 80, 32);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("비밀번호");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 17));
		lblNewLabel_2.setBounds(29, 62, 80, 32);
		panel.add(lblNewLabel_2);
		
		txtMid = new JTextField();
		txtMid.setFont(new Font("굴림", Font.PLAIN, 16));
		txtMid.setColumns(10);
		txtMid.setBounds(109, 20, 169, 27);
		panel.add(txtMid);
		
		txtPwd = new JPasswordField();
		txtPwd.setBounds(109, 62, 169, 27);
		panel.add(txtPwd);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(12, 213, 411, 50);
		getContentPane().add(panel_1);
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.setFont(new Font("굴림", Font.BOLD, 17));
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setBounds(160, 0, 91, 29);
		panel_1.add(btnLogin);
		
		JButton btnExit = new JButton("종료");
		btnExit.setFont(new Font("굴림", Font.BOLD, 17));
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(284, 0, 91, 29);
		panel_1.add(btnExit);
		
		JButton btnFind = new JButton("ID/PW 찾기");
		btnFind.setFont(new Font("굴림", Font.BOLD, 10));
		btnFind.setBackground(Color.WHITE);
		btnFind.setBounds(34, 0, 91, 29);
		panel_1.add(btnFind);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(0, 0, 411, 50);
		panel_1.add(panel_1_1);
		
		JButton btnLogin_1 = new JButton("로그인");
		btnLogin_1.setFont(new Font("굴림", Font.BOLD, 17));
		btnLogin_1.setBackground(Color.WHITE);
		btnLogin_1.setBounds(160, 0, 91, 29);
		panel_1_1.add(btnLogin_1);
		
		JButton btnExit_1 = new JButton("종료");
		btnExit_1.setFont(new Font("굴림", Font.BOLD, 17));
		btnExit_1.setBackground(Color.WHITE);
		btnExit_1.setBounds(284, 0, 91, 29);
		panel_1_1.add(btnExit_1);
		
		JButton btnFind_1 = new JButton("ID/PW 찾기");
		btnFind_1.setBackground(Color.WHITE);
		btnFind_1.setBounds(34, 0, 91, 29);
		panel_1_1.add(btnFind_1);
		
		
		
		
		setVisible(true);
	
		/* 메소드 영역 */
		
		//아이디 비밀번호 찾기 버튼
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new NuriManageLoginFind();
			}
		});
		
		//로그인하기 버튼
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mMid = txtMid.getText();
				char[] Pwd = txtPwd.getPassword();
				String mPwd = "";
				for(char cha : Pwd) {
					Character.toString(cha);
					mPwd += (mPwd.equals("")) ? "" + cha + "" : cha + "";
				}
				NuriManageVO vo = dao.mLogin(mMid, mPwd);
				if(vo.getmIdx() != 0) {
					JOptionPane.showMessageDialog(null, "로그인 성공.");
					dispose();
					new NuriHome(vo);
				}
				else if(vo.getmIdx() == 0) {
					JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호를 잘못 입력하셨습니다. \n 입력하신 내용을 확인해주세요.");
				}
			}
		});
		
		//종료하기 버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
//	
//	public static boolean isAdmin() {
//		return vo.getmMid().equals("root");
//	}
//	
	public static void main(String[] args) {
		new NuriManageLogin();
	}
}
