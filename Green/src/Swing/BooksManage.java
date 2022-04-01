package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BooksManage {

	private JFrame frmJs;
	private JTextField textField_4;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_19;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JPanel panel_6;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BooksManage window = new BooksManage();
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
	public BooksManage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJs = new JFrame();
		frmJs.setTitle("JS도서관 도서 관리 시스템");
		frmJs.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frmJs.setBounds(100, 100, 544, 774);
		frmJs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJs.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("JS 도서 관리");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 22));
		lblNewLabel.setBounds(29, 10, 143, 47);
		frmJs.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(24, 103, 482, 581);
		frmJs.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(12, 10, 458, 42);
		panel_2.setBackground(SystemColor.window);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("idx");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_2.setBounds(12, 3, 60, 40);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("도서명");
		lblNewLabel_2_1.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(58, 3, 60, 40);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("저자,역자");
		lblNewLabel_2_1_1.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(216, 3, 87, 40);
		panel_2.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("출판사");
		lblNewLabel_2_1_1_1.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_2_1_1_1.setBounds(335, 3, 87, 40);
		panel_2.add(lblNewLabel_2_1_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.window);
		panel_3.setBounds(12, 50, 51, 475);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("1");
		chckbxNewCheckBox.setBackground(SystemColor.window);
		chckbxNewCheckBox.setBounds(8, 6, 39, 23);
		panel_3.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("2");
		chckbxNewCheckBox_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1.setBounds(8, 35, 39, 23);
		panel_3.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("3");
		chckbxNewCheckBox_1_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_1.setBounds(8, 64, 39, 23);
		panel_3.add(chckbxNewCheckBox_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1 = new JCheckBox("4");
		chckbxNewCheckBox_1_1_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_1_1.setBounds(8, 93, 39, 23);
		panel_3.add(chckbxNewCheckBox_1_1_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("5");
		chckbxNewCheckBox_2.setBackground(Color.WHITE);
		chckbxNewCheckBox_2.setBounds(8, 122, 39, 23);
		panel_3.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_1_2 = new JCheckBox("6");
		chckbxNewCheckBox_1_2.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_2.setBounds(8, 151, 39, 23);
		panel_3.add(chckbxNewCheckBox_1_2);
		
		JCheckBox chckbxNewCheckBox_1_1_2 = new JCheckBox("7");
		chckbxNewCheckBox_1_1_2.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_1_2.setBounds(8, 180, 39, 23);
		panel_3.add(chckbxNewCheckBox_1_1_2);
		
		JCheckBox chckbxNewCheckBox_1_1_1_1 = new JCheckBox("8");
		chckbxNewCheckBox_1_1_1_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_1_1_1.setBounds(8, 209, 39, 23);
		panel_3.add(chckbxNewCheckBox_1_1_1_1);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("9");
		chckbxNewCheckBox_3.setBackground(Color.WHITE);
		chckbxNewCheckBox_3.setBounds(8, 238, 39, 23);
		panel_3.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_1_3 = new JCheckBox("10");
		chckbxNewCheckBox_1_3.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_3.setBounds(8, 267, 39, 23);
		panel_3.add(chckbxNewCheckBox_1_3);
		
		JCheckBox chckbxNewCheckBox_1_1_1_1_1 = new JCheckBox("16");
		chckbxNewCheckBox_1_1_1_1_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_1_1_1_1.setBounds(8, 441, 39, 23);
		panel_3.add(chckbxNewCheckBox_1_1_1_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_2_1 = new JCheckBox("15");
		chckbxNewCheckBox_1_1_2_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_1_2_1.setBounds(8, 412, 39, 23);
		panel_3.add(chckbxNewCheckBox_1_1_2_1);
		
		JCheckBox chckbxNewCheckBox_1_2_1 = new JCheckBox("14");
		chckbxNewCheckBox_1_2_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_2_1.setBounds(8, 383, 39, 23);
		panel_3.add(chckbxNewCheckBox_1_2_1);
		
		JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("13");
		chckbxNewCheckBox_2_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_2_1.setBounds(8, 354, 39, 23);
		panel_3.add(chckbxNewCheckBox_2_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1_2 = new JCheckBox("12");
		chckbxNewCheckBox_1_1_1_2.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_1_1_2.setBounds(8, 325, 39, 23);
		panel_3.add(chckbxNewCheckBox_1_1_1_2);
		
		JCheckBox chckbxNewCheckBox_1_1_3 = new JCheckBox("11");
		chckbxNewCheckBox_1_1_3.setBackground(Color.WHITE);
		chckbxNewCheckBox_1_1_3.setBounds(8, 296, 39, 23);
		panel_3.add(chckbxNewCheckBox_1_1_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.window);
		panel_4.setBounds(64, 50, 160, 475);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.LEFT);
		textField_4.setText("흐르지 않는 시간을 찾아서");
		textField_4.setColumns(10);
		textField_4.setBounds(0, 10, 160, 21);
		panel_4.add(textField_4);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(0, 37, 160, 21);
		panel_4.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(0, 68, 160, 21);
		panel_4.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(0, 95, 160, 21);
		panel_4.add(textField_2);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(0, 122, 160, 21);
		panel_4.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(0, 153, 160, 21);
		panel_4.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(0, 184, 160, 21);
		panel_4.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(0, 208, 160, 21);
		panel_4.add(textField_15);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(0, 239, 160, 21);
		panel_4.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(0, 266, 160, 21);
		panel_4.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(0, 297, 160, 21);
		panel_4.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(0, 324, 160, 21);
		panel_4.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(0, 351, 160, 21);
		panel_4.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(0, 382, 160, 21);
		panel_4.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(0, 413, 160, 21);
		panel_4.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(0, 444, 160, 21);
		panel_4.add(textField_27);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(Color.WHITE);
		panel_4_1.setBounds(225, 50, 110, 475);
		panel.add(panel_4_1);
		
		textField_3 = new JTextField();
		textField_3.setText("오정숙");
		textField_3.setHorizontalAlignment(SwingConstants.LEFT);
		textField_3.setColumns(10);
		textField_3.setBounds(0, 10, 110, 21);
		panel_4_1.add(textField_3);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(0, 37, 110, 21);
		panel_4_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(0, 68, 110, 21);
		panel_4_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(0, 95, 110, 21);
		panel_4_1.add(textField_7);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(0, 122, 110, 21);
		panel_4_1.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(0, 153, 110, 21);
		panel_4_1.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(0, 184, 110, 21);
		panel_4_1.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(0, 208, 110, 21);
		panel_4_1.add(textField_19);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(0, 239, 110, 21);
		panel_4_1.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(0, 266, 110, 21);
		panel_4_1.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(0, 297, 110, 21);
		panel_4_1.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(0, 324, 110, 21);
		panel_4_1.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(0, 351, 110, 21);
		panel_4_1.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(0, 382, 110, 21);
		panel_4_1.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(0, 413, 110, 21);
		panel_4_1.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(0, 444, 110, 21);
		panel_4_1.add(textField_35);
		
		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setBackground(Color.WHITE);
		panel_4_1_1.setBounds(337, 50, 133, 475);
		panel.add(panel_4_1_1);
		
		textField_8 = new JTextField();
		textField_8.setText("아마디아");
		textField_8.setColumns(10);
		textField_8.setBounds(0, 10, 133, 21);
		panel_4_1_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(0, 37, 133, 21);
		panel_4_1_1.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(0, 68, 133, 21);
		panel_4_1_1.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(0, 95, 133, 21);
		panel_4_1_1.add(textField_11);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(0, 122, 133, 21);
		panel_4_1_1.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(0, 153, 133, 21);
		panel_4_1_1.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(0, 184, 133, 21);
		panel_4_1_1.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(0, 208, 133, 21);
		panel_4_1_1.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(0, 239, 133, 21);
		panel_4_1_1.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(0, 266, 133, 21);
		panel_4_1_1.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(0, 297, 133, 21);
		panel_4_1_1.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(0, 324, 133, 21);
		panel_4_1_1.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(0, 351, 133, 21);
		panel_4_1_1.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(0, 382, 133, 21);
		panel_4_1_1.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(0, 413, 133, 21);
		panel_4_1_1.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(0, 444, 133, 21);
		panel_4_1_1.add(textField_47);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(12, 535, 458, 36);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton = new JButton("추가");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(248, 248, 255));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 14));
		btnNewButton.setBounds(46, 3, 91, 30);
		panel_5.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("수정");
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 14));
		btnNewButton_1.setBackground(new Color(248, 248, 255));
		btnNewButton_1.setBounds(183, 3, 91, 30);
		panel_5.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("삭제");
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 14));
		btnNewButton_1_1.setBackground(new Color(248, 248, 255));
		btnNewButton_1_1.setBounds(320, 3, 91, 30);
		panel_5.add(btnNewButton_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBackground(SystemColor.window);
		panel_1.setBounds(24, 65, 482, 47);
		frmJs.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("도서 목록");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(168, 4, 145, 38);
		panel_1.add(lblNewLabel_1);
		
		panel_6 = new JPanel();
		panel_6.setBackground(new Color(240, 248, 255));
		panel_6.setBounds(24, 690, 482, 47);
		frmJs.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		btnNewButton_2 = new JButton("HOME");
		btnNewButton_2.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 15));
		btnNewButton_2.setBounds(98, 10, 93, 27);
		panel_6.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("종료");
		btnNewButton_3.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_3.setFont(new Font("굴림", Font.BOLD, 15));
		btnNewButton_3.setBounds(289, 10, 93, 27);
		panel_6.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
