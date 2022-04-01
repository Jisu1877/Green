package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home {

	private JFrame frmJsHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frmJsHome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJsHome = new JFrame();
		frmJsHome.setResizable(false);
		frmJsHome.getContentPane().setBackground(SystemColor.control);
		frmJsHome.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("JS도서관 관리시스템 HOME");
		lblNewLabel.setBounds(111, 23, 324, 54);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 24));
		frmJsHome.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(164, 87, 218, 150);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Hayoung\\Desktop\\JISU\\JavaGreen\\html5_css3_javascript\\images\\55.jpg"));
		frmJsHome.getContentPane().add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(87, 246, 171, 184);
		frmJsHome.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnBooks = new JButton("도서관리");
		btnBooks.setBackground(new Color(255, 222, 173));
		btnBooks.setBounds(27, 25, 100, 27);
		btnBooks.setFont(new Font("굴림", Font.BOLD, 14));
		panel.add(btnBooks);
		
		JButton btnCustomer = new JButton("회원관리");
		btnCustomer.setBackground(new Color(255, 222, 173));
		btnCustomer.setBounds(27, 77, 110, 27);
		btnCustomer.setFont(new Font("굴림", Font.BOLD, 14));
		panel.add(btnCustomer);
		
		JButton btnBorrow = new JButton("대여자 관리");
		btnBorrow.setBackground(new Color(255, 222, 173));
		btnBorrow.setBounds(27, 129, 122, 27);
		btnBorrow.setFont(new Font("굴림", Font.BOLD, 14));
		panel.add(btnBorrow);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.setBounds(295, 246, 171, 184);
		frmJsHome.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnRootInput = new JButton("관리자 생성");
		btnRootInput.setBackground(new Color(135, 206, 235));
		btnRootInput.setBounds(27, 77, 122, 27);
		btnRootInput.setFont(new Font("굴림", Font.BOLD, 14));
		panel_1.add(btnRootInput);
		
		JButton btnRoot = new JButton("관리자 관리");
		btnRoot.setBackground(new Color(135, 206, 235));
		btnRoot.setBounds(27, 25, 122, 27);
		btnRoot.setFont(new Font("굴림", Font.BOLD, 14));
		panel_1.add(btnRoot);
		
		JButton btnExit = new JButton("종료");
		btnExit.setBackground(UIManager.getColor("Button.light"));
		btnExit.setFont(new Font("굴림", Font.BOLD, 15));
		btnExit.setBounds(228, 452, 91, 25);
		frmJsHome.getContentPane().add(btnExit);
		frmJsHome.setTitle("JS도서관 관리시스템 HOME");
		frmJsHome.setBounds(100, 100, 561, 537);
		frmJsHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

}
