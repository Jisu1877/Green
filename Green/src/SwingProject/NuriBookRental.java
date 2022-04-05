package SwingProject;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuriBookRental extends JFrame {
	private JTextField txtIsbn;
	private JTextField txtBookName;
	private JTextField txtAuthor;
	private JTextField txtPublish;
	private JTextField txtCategory;
	private JTextField txtBookPosition;
	private JTextField txtRentalCheck;
	
	NuriDAO dao = new NuriDAO();
	
	public NuriBookRental(NuriBooksVO vo) {
		super("누리도서관 도서대여");
		getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		setSize(623, 682);
		setLocationRelativeTo(null);
		setResizable(false);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel pn3 = new JPanel();
		pn3.setLayout(null);
		pn3.setBackground(SystemColor.inactiveCaption);
		pn3.setBounds(92, 113, 424, 383);
		getContentPane().add(pn3);
		
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
		txtIsbn.setText((String) null);
		txtIsbn.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		txtIsbn.setEditable(false);
		txtIsbn.setColumns(10);
		txtIsbn.setBounds(109, 35, 304, 34);
		pn3.add(txtIsbn);
		
		txtBookName = new JTextField();
		txtBookName.setText((String) null);
		txtBookName.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		txtBookName.setEditable(false);
		txtBookName.setColumns(10);
		txtBookName.setBounds(109, 79, 304, 34);
		pn3.add(txtBookName);
		
		txtAuthor = new JTextField();
		txtAuthor.setText((String) null);
		txtAuthor.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		txtAuthor.setEditable(false);
		txtAuthor.setColumns(10);
		txtAuthor.setBounds(109, 123, 304, 34);
		pn3.add(txtAuthor);
		
		txtPublish = new JTextField();
		txtPublish.setText((String) null);
		txtPublish.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		txtPublish.setEditable(false);
		txtPublish.setColumns(10);
		txtPublish.setBounds(109, 167, 304, 34);
		pn3.add(txtPublish);
		
		txtCategory = new JTextField();
		txtCategory.setText((String) null);
		txtCategory.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		txtCategory.setEditable(false);
		txtCategory.setColumns(10);
		txtCategory.setBounds(109, 211, 304, 34);
		pn3.add(txtCategory);
		
		txtBookPosition = new JTextField();
		txtBookPosition.setText((String) null);
		txtBookPosition.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		txtBookPosition.setEditable(false);
		txtBookPosition.setColumns(10);
		txtBookPosition.setBounds(109, 255, 304, 34);
		pn3.add(txtBookPosition);
		
		txtRentalCheck = new JTextField();
		txtRentalCheck.setText("<dynamic>");
		txtRentalCheck.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		txtRentalCheck.setEditable(false);
		txtRentalCheck.setColumns(10);
		txtRentalCheck.setBounds(132, 299, 83, 34);
		pn3.add(txtRentalCheck);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(92, 23, 424, 72);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setLayout(null);
		pn1.setBackground(new Color(230, 230, 250));
		pn1.setBounds(80, 10, 264, 48);
		panel.add(pn1);
		
		JLabel lblNewLabel = new JLabel("도서 대여");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 27));
		lblNewLabel.setBounds(18, 2, 228, 43);
		pn1.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.setBounds(92, 506, 424, 97);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("해당 도서를 대여하시겠습니까?");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(0, 0, 424, 40);
		panel_1.add(lblNewLabel_2);
		
		JButton btnEnd = new JButton("취소");
		btnEnd.setBackground(SystemColor.inactiveCaption);
		btnEnd.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		btnEnd.setBounds(68, 42, 110, 31);
		panel_1.add(btnEnd);
		
		JButton btnRental = new JButton("대여하기");
		btnRental.setBackground(SystemColor.inactiveCaption);
		btnRental.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		btnRental.setBounds(246, 42, 110, 31);
		panel_1.add(btnRental);
		
		
		
		setVisible(true);
		
		/*메소드 영역입니다.*/
		
		//도서자료 띄우주기..!
		txtIsbn.setText(vo.getIsbn());
		txtBookName.setText(vo.getBookName());
		txtAuthor.setText(vo.getAuthor());
		txtPublish.setText(vo.getPublish());
		txtCategory.setText(vo.getCategory());
		txtBookPosition.setText(vo.getBookPosition());
		String rental;
		if(vo.getRentalCheck().equals("Y")) {
			rental = "불가능";
		}
		else {
			rental = "가능";
		}
		txtRentalCheck.setText(rental);
		
		//대여하기 버튼
		btnRental.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//대여하는 회원 idx 알아오기
				NuriCustomerVO cvo = dao.searchCustomer(NuriLogin.midRemember);
				//rental데이터베이스에 입력
				dao.rental(cvo.getcIdx());
				//데이터베이스 입력 확인
				NuriRentalVO rvo = dao.rentalCheck(cvo.getcIdx());
				if(rvo.getrIdx() != 0) {
					//rentalList데이터베이스에 입력
					dao.rentalList(rvo, vo.getIsbn());
					//rentalList데이터베이스 입력 확인
					NuriRentalListVO rLvo = dao.rentalListCheck(rvo);
					if(rLvo.getrLidx() != 0) {
						//도서데이터베이스에서 대여가능여부 변경
						dao.rentalUpdate(Integer.toString(vo.getbIdx()), "Y");
						JOptionPane.showMessageDialog(null, "대여가 완료되었습니다. \n 도서관에 방문하셔서 도서를 찾아가세요.");
						dispose();
					}
				}else {
					JOptionPane.showMessageDialog(null, "대여 오류.", "대여 오류", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		//취소 버튼
		btnEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
	}
	
	public static void main(String[] args) {
//		new NuriBookRental(null);
	}
}
