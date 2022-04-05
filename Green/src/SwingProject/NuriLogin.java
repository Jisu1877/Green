package SwingProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class NuriLogin extends JFrame{
	private JTextField txtId;
	
	NuriDAO dao = new NuriDAO(); 
	private JPasswordField txtPwd;
	
	public static String midRemember = "noLogin";
	public static NuriCustomerVO vo;
	
	public NuriLogin() {
		super("Nuri 로그인");
		getContentPane().setBackground(new Color(255, 255, 255));
		setBounds(100, 100, 449, 310);
		setLocationRelativeTo(null);
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("로그인");
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
		panel.setBackground(SystemColor.inactiveCaptionBorder);
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
		
		txtId = new JTextField();
		txtId.setFont(new Font("굴림", Font.PLAIN, 16));
		txtId.setColumns(10);
		txtId.setBounds(109, 20, 169, 27);
		panel.add(txtId);
		
		txtPwd = new JPasswordField();
		txtPwd.setBounds(109, 62, 169, 27);
		panel.add(txtPwd);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(12, 213, 411, 50);
		getContentPane().add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(255, 255, 255));
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(0, 0, 411, 50);
		panel_1.add(panel_1_1);
		
		JButton btnFind = new JButton("ID/PW 찾기");
		btnFind.setBounds(3, 10, 91, 29);
		panel_1_1.add(btnFind);
		btnFind.setFont(new Font("굴림", Font.BOLD, 10));
		btnFind.setBackground(Color.WHITE);
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.setBounds(220, 10, 91, 29);
		panel_1_1.add(btnLogin);
		btnLogin.setFont(new Font("굴림", Font.BOLD, 17));
		btnLogin.setBackground(Color.WHITE);
		
		JButton btnExit = new JButton("종료");
		btnExit.setBounds(314, 10, 91, 29);
		panel_1_1.add(btnExit);
		btnExit.setFont(new Font("굴림", Font.BOLD, 17));
		btnExit.setBackground(Color.WHITE);
		
		JButton btnJoin = new JButton("회원가입");
		btnJoin.setFont(new Font("굴림", Font.BOLD, 17));
		btnJoin.setBackground(Color.WHITE);
		btnJoin.setBounds(97, 10, 120, 29);
		panel_1_1.add(btnJoin);
		
		setVisible(true);
	
		/* 메소드 영역 */
		
		//회원가입버튼
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "준비중인 기능입니다.");
			}
		});
		
		//종료하기 버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//로그인하기 버튼
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mid = txtId.getText();
				String pwd = txtPwd.getText();
				vo = dao.login(mid, pwd);
				if(vo.getcIdx() != 0) {
					dispose();
					midRemember = vo.getcMid();
					new NuriHome();
				}
				else if(vo.getcIdx() == 0) {
					JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호를 잘못 입력하셨습니다. \n 입력하신 내용을 확인해주세요.");
				}
			}
		});
		
		//아이디 비밀번호 찾기 버튼
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "준비중인 기능입니다.");
			}
		});
		
		
		
		
		//아이디 입력 후 엔터키 치면..
		txtId.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					txtPwd.requestFocus();
				}
			}
		});
		
		//비밀번호 입력 후 엔터키 치면..
		txtPwd.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnLogin.doClick();
				}
			}
		});
	}
//	
//	public static boolean isAdmin() {
//		return vo.getmMid().equals("root");
//	}
//	
	public static void main(String[] args) {
		new NuriLogin();
	}
}
