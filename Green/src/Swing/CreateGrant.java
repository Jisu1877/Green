package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class CreateGrant {

	private JFrame frmJs;
	private JTextField name;
	private JTextField id;
	private JTextField pwd;
	private JTextField pwd2;
	private JTextField hint;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateGrant window = new CreateGrant();
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
	public CreateGrant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJs = new JFrame();
		frmJs.setResizable(false);
		frmJs.setTitle("JS도서관 관리자 추가");
		frmJs.setBounds(100, 100, 503, 458);
		frmJs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJs.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("관리자 생성");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(47, 20, 241, 41);
		frmJs.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(46, 71, 396, 282);
		frmJs.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("관리자 이름");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 13));
		lblNewLabel_1.setBounds(24, 23, 73, 32);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("아이디");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(24, 65, 73, 32);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("비밀번호");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 13));
		lblNewLabel_1_1_1.setBounds(24, 107, 73, 32);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("비밀번호 확인");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1.setFont(new Font("굴림", Font.BOLD, 13));
		lblNewLabel_1_1_1_1.setBounds(12, 148, 85, 32);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("찾기 힌트");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1.setFont(new Font("굴림", Font.BOLD, 13));
		lblNewLabel_1_1_1_1_1.setBounds(12, 196, 85, 32);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		name = new JTextField();
		name.setBounds(122, 23, 137, 27);
		panel.add(name);
		name.setColumns(10);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(122, 65, 159, 27);
		panel.add(id);
		
		pwd = new JTextField();
		pwd.setColumns(10);
		pwd.setBounds(122, 107, 179, 27);
		panel.add(pwd);
		
		pwd2 = new JTextField();
		pwd2.setColumns(10);
		pwd2.setBounds(122, 148, 179, 27);
		panel.add(pwd2);
		
		hint = new JTextField();
		hint.setColumns(10);
		hint.setBounds(122, 230, 179, 27);
		panel.add(hint);
		
		JButton btnOverLap = new JButton("중복확인");
		btnOverLap.setBackground(SystemColor.menu);
		btnOverLap.setBounds(293, 65, 85, 27);
		panel.add(btnOverLap);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(250, 240, 230));
		comboBox.setFont(new Font("굴림", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"나의 보물은?", "내가 나온 초등학교는?", "가장 친한 친구는?", "가장 좋아하는 음식은?"}));
		comboBox.setBounds(122, 201, 179, 23);
		panel.add(comboBox);
		
		JButton btnOverLap_1 = new JButton("확인");
		btnOverLap_1.setBackground(SystemColor.menu);
		btnOverLap_1.setBounds(311, 230, 62, 27);
		panel.add(btnOverLap_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(46, 363, 396, 48);
		frmJs.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnCancel = new JButton("취소");
		btnCancel.setBackground(SystemColor.activeCaption);
		btnCancel.setFont(new Font("굴림", Font.BOLD, 15));
		btnCancel.setBounds(71, 10, 91, 29);
		panel_1.add(btnCancel);
		
		JButton btnCreate = new JButton("생성");
		btnCreate.setBackground(SystemColor.activeCaption);
		btnCreate.setFont(new Font("굴림", Font.BOLD, 15));
		btnCreate.setBounds(233, 10, 91, 29);
		panel_1.add(btnCreate);
	}
}
