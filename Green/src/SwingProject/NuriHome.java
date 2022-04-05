package SwingProject;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;

public class NuriHome extends JFrame {
	private JTextField txtSearch;
	
	String selected = "";
	String value = "";
	
	public NuriHome() {
		super("누리도서관 홈");
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 0, 656, 50);
		pn1.setBackground(new Color(216, 191, 216));
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("누리 도서관");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		lblNewLabel.setBounds(197, 3, 256, 43);
		pn1.add(lblNewLabel);
		
		JPanel pn5 = new JPanel();
		pn5.setBounds(0, 789, 656, 70);
		pn5.setBackground(UIManager.getColor("CheckBox.background"));
		getContentPane().add(pn5);
		pn5.setLayout(null);
		
		JButton btnEnd = new JButton("종료");
		btnEnd.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		btnEnd.setBackground(new Color(255, 255, 255));
		btnEnd.setBounds(518, 20, 90, 29);
		pn5.add(btnEnd);
		
		JButton btnNewButton_3_1_1 = new JButton("자료조회");
		btnNewButton_3_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		btnNewButton_3_1_1.setBackground(new Color(255, 255, 255));
		btnNewButton_3_1_1.setBounds(186, 20, 118, 29);
		pn5.add(btnNewButton_3_1_1);
		
		JButton btnHome = new JButton("홈");
		btnHome.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setBounds(48, 20, 90, 29);
		pn5.add(btnHome);
		
		JButton btnLogin_1 = new JButton("로그아웃");
		btnLogin_1.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		btnLogin_1.setBackground(Color.WHITE);
		btnLogin_1.setBounds(352, 20, 118, 29);
		pn5.add(btnLogin_1);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(0, 49, 656, 64);
		pn2.setBackground(SystemColor.inactiveCaptionBorder);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JComboBox comboCategory = new JComboBox();
		comboCategory.setModel(new DefaultComboBoxModel(new String[] {"도서명(중간일치)", "도서명(완전일치)", "저자", "출판사", "ISBN"}));
		comboCategory.setBackground(new Color(255, 255, 255));
		comboCategory.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		comboCategory.setBounds(12, 17, 182, 27);
		pn2.add(comboCategory);
		
		txtSearch = new JTextField();
		txtSearch.setBackground(new Color(255, 255, 255));
		txtSearch.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		txtSearch.setBounds(206, 18, 325, 27);
		pn2.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnSearch = new JButton("검색");
		btnSearch.setBackground(new Color(255, 255, 255));
		btnSearch.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnSearch.setBounds(543, 17, 95, 27);
		pn2.add(btnSearch);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("CheckBox.background"));
		panel.setBounds(0, 109, 656, 38);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("베스트");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(235, 4, 186, 30);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("CheckBox.background"));
		panel_1.setBounds(0, 448, 656, 38);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("신착도서");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(235, 4, 186, 30);
		panel_1.add(lblNewLabel_1_1);
		
		JPanel pn3 = new JPanel();
		pn3.setBackground(Color.WHITE);
		pn3.setBounds(0, 156, 656, 304);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		setSize(670, 903);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pn3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		URL imgUrl = this.getClass().getClassLoader().getResource("book1.jpg");
		lblNewLabel_3.setIcon(new ImageIcon(imgUrl));
		lblNewLabel_3.setBounds(12, -10, 644, 304);
		pn3.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 498, 656, 304);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(Color.WHITE);
		URL imgUrl2 = this.getClass().getClassLoader().getResource("book4.jpg");
		lblNewLabel_2.setIcon(new ImageIcon(imgUrl2));
		lblNewLabel_2.setBounds(12, -10, 644, 292);
		panel_2.add(lblNewLabel_2);
		
		
		setVisible(true);
		
		//종료버튼
		btnEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//검색버튼
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selected = comboCategory.getSelectedItem().toString();
				String value = txtSearch.getText();
				new NuriSearch(selected, value);
			}
		});
		
		//자료 조회 버튼
		btnNewButton_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new NuriSearch(selected, value);
			}
		});
		
		//엔터를 치면...!
		txtSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnSearch.doClick();
				}
			}
		});
		
		
		//로그아웃버튼
		btnLogin_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "로그아웃 하시겠습니까?", "로그아웃", JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_OPTION) {
					dispose();
					new NuriLogin();
				}
			}
		});
		
	}
	
	
	public static void main(String[] args) {
		new NuriHome();
	}
}
