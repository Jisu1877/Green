package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frmJs;
	private JTextField id;
	private JTextField pwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmJs.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJs = new JFrame();
		frmJs.setResizable(false);
		frmJs.setTitle("JS도서관 관리 시스템");
		frmJs.setBounds(100, 100, 449, 310);
		frmJs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJs.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("관리자 로그인");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 23));
		lblNewLabel_1.setBounds(119, 29, 197, 38);
		frmJs.getContentPane().add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(58, 77, 318, 104);
		frmJs.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 17));
		lblNewLabel.setBounds(29, 20, 80, 32);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("비밀번호");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 17));
		lblNewLabel_2.setBounds(29, 62, 80, 32);
		panel.add(lblNewLabel_2);
		
		id = new JTextField();
		id.setBounds(109, 20, 169, 27);
		panel.add(id);
		id.setColumns(10);
		
		pwd = new JTextField();
		pwd.setColumns(10);
		pwd.setBounds(109, 62, 169, 27);
		panel.add(pwd);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 213, 411, 50);
		frmJs.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.setBackground(SystemColor.window);
		btnLogin.setFont(new Font("굴림", Font.BOLD, 17));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
