package SwingProject;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;

public class NuriBooksInfomation extends JFrame {
	private JTextField txtIsbn;
	private JTextField txtAuthor;
	private JTextField txtPublish;
	private JTextField txtCategory;
	private JTextField txtBookPosition;
	private JTextField txtRentalCheck;
	private JTextField txtBookName;
	
	NuriDAO dao = new NuriDAO();
	
	public NuriBooksInfomation(String bIdx) {
		super("도서 상세 정보");
		getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		setSize(887, 643);
		setLocationRelativeTo(null);
		setResizable(false);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBackground(new Color(230, 230, 250));
		pn1.setBounds(304, 22, 264, 48);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("도서 상세정보");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 27));
		lblNewLabel.setBounds(18, 2, 228, 43);
		pn1.add(lblNewLabel);
		
		JPanel pn2 = new JPanel();
		pn2.setBackground(SystemColor.inactiveCaptionBorder);
		pn2.setBounds(76, 92, 293, 439);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lblImage = new JLabel("이미지 없음");
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lblImage.setBackground(SystemColor.inactiveCaptionBorder);
		lblImage.setBounds(0, 0, 293, 439);
		pn2.add(lblImage);
		
		JPanel pn3 = new JPanel();
		pn3.setBackground(SystemColor.inactiveCaptionBorder);
		pn3.setBounds(397, 110, 424, 383);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("도서명 :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblNewLabel_1.setBounds(25, 79, 72, 30);
		pn3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("저자 :");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(25, 123, 72, 30);
		pn3.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("출판사 :");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(14, 171, 83, 30);
		pn3.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("대분류 :");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblNewLabel_1_1_1_1.setBounds(14, 215, 83, 30);
		pn3.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("서고위치 :");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblNewLabel_1_1_1_1_1.setBounds(14, 259, 83, 30);
		pn3.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("대여가능여부 :");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblNewLabel_1_1_1_1_1_1.setBounds(12, 299, 124, 30);
		pn3.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("ISBN :");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(25, 35, 72, 30);
		pn3.add(lblNewLabel_1_2);
		
		txtIsbn = new JTextField();
		txtIsbn.setHorizontalAlignment(SwingConstants.LEFT);
		txtIsbn.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		txtIsbn.setEditable(false);
		txtIsbn.setBounds(109, 35, 304, 34);
		pn3.add(txtIsbn);
		txtIsbn.setColumns(10);
		
		txtBookName = new JTextField();
		txtBookName.setHorizontalAlignment(SwingConstants.LEFT);
		txtBookName.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		txtBookName.setEditable(false);
		txtBookName.setColumns(10);
		txtBookName.setBounds(109, 79, 304, 34);
		pn3.add(txtBookName);
		
		txtAuthor = new JTextField();
		txtAuthor.setHorizontalAlignment(SwingConstants.LEFT);
		txtAuthor.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		txtAuthor.setEditable(false);
		txtAuthor.setColumns(10);
		txtAuthor.setBounds(109, 123, 304, 34);
		pn3.add(txtAuthor);
		
		txtPublish = new JTextField();
		txtPublish.setHorizontalAlignment(SwingConstants.LEFT);
		txtPublish.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		txtPublish.setEditable(false);
		txtPublish.setColumns(10);
		txtPublish.setBounds(109, 167, 304, 34);
		pn3.add(txtPublish);
		
		txtCategory = new JTextField();
		txtCategory.setHorizontalAlignment(SwingConstants.LEFT);
		txtCategory.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		txtCategory.setEditable(false);
		txtCategory.setColumns(10);
		txtCategory.setBounds(109, 211, 304, 34);
		pn3.add(txtCategory);
		
		txtBookPosition = new JTextField();
		txtBookPosition.setHorizontalAlignment(SwingConstants.LEFT);
		txtBookPosition.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		txtBookPosition.setEditable(false);
		txtBookPosition.setColumns(10);
		txtBookPosition.setBounds(109, 255, 304, 34);
		pn3.add(txtBookPosition);
		
		txtRentalCheck = new JTextField();
		txtRentalCheck.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		txtRentalCheck.setEditable(false);
		txtRentalCheck.setColumns(10);
		txtRentalCheck.setBounds(132, 299, 83, 34);
		pn3.add(txtRentalCheck);
		
		JPanel pn4 = new JPanel();
		pn4.setBackground(SystemColor.inactiveCaptionBorder);
		pn4.setBounds(545, 515, 276, 69);
		getContentPane().add(pn4);
		pn4.setLayout(null);
		
		JButton btnDispose = new JButton("취소");
		btnDispose.setBackground(SystemColor.inactiveCaption);
		btnDispose.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnDispose.setBounds(167, 20, 95, 31);
		pn4.add(btnDispose);
		
		JButton btnBookRental = new JButton("대여하기");
		btnBookRental.setBackground(SystemColor.inactiveCaption);
		btnBookRental.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnBookRental.setBounds(27, 20, 113, 31);
		pn4.add(btnBookRental);
		

		
		setVisible(true);
		
		/*메소드 영역*/
		//전달받은 고유번호로 내용 띄우기!!!
		NuriBooksVO vo = dao.NuriBooksChack(bIdx);
		txtIsbn.setText(vo.getIsbn());
		txtBookName.setText(vo.getBookName());
		txtAuthor.setText(vo.getAuthor());
		txtPublish.setText(vo.getPublish());
		txtCategory.setText(vo.getCategory());
		txtBookPosition.setText(vo.getBookPosition());
		if(!vo.getImage().equals("이미지 url없음")) {
			URL imgUrl = this.getClass().getClassLoader().getResource(vo.getImage());
			lblImage.setIcon(new ImageIcon(imgUrl));
		}
		String rental;
		if(vo.getRentalCheck().equals("Y")) {
			rental = "불가능";
		}
		else {
			rental = "가능";
		}
		txtRentalCheck.setText(rental);
		

		
		//대여하기 버튼
		btnBookRental.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(vo.getRentalCheck().equals("Y")) {
					JOptionPane.showInternalMessageDialog(null, "대여가 불가능한 도서입니다.");
				}else {
					dispose();
					new NuriBookRental(vo);
				}
			}
		});
		
		
		//취소버튼
		btnDispose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
	
	public static void main(String[] args) {
//		new NuriBooksInfomation(null, null);
	}
}
