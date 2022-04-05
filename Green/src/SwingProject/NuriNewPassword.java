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

public class NuriNewPassword extends JFrame{
	
	NuriDAO dao = new NuriDAO(); 
	private JPasswordField txtPwd2;
	private JPasswordField txtPwd1;
	
	int pwdCheak = 0;
	
	public NuriNewPassword(NuriManageVO vo) {
		super("비밀번호 새로 입력");
		getContentPane().setBackground(new Color(255, 255, 255));
		setBounds(100, 100, 475, 297);
		setLocationRelativeTo(null);
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호 재설정");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(132, 29, 197, 38);
		getContentPane().add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(34, 77, 392, 104);
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("비밀번호");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel.setBounds(41, 20, 80, 32);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("비밀번호 재입력");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_2.setBounds(12, 62, 123, 32);
		panel.add(lblNewLabel_2);
		
		txtPwd2 = new JPasswordField();
		txtPwd2.setBounds(133, 62, 169, 27);
		panel.add(txtPwd2);
		
		txtPwd1 = new JPasswordField();
		txtPwd1.setBounds(133, 20, 169, 27);
		panel.add(txtPwd1);
		
		JButton btnPwdCheck = new JButton("확인");
		btnPwdCheck.setBackground(SystemColor.menu);
		btnPwdCheck.setBounds(307, 62, 73, 27);
		panel.add(btnPwdCheck);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setLayout(null);
		panel_1.setBounds(34, 191, 394, 50);
		getContentPane().add(panel_1);
		
		JButton btnReCreate = new JButton("재설정");
		btnReCreate.setFont(new Font("굴림", Font.BOLD, 17));
		btnReCreate.setBackground(Color.WHITE);
		btnReCreate.setBounds(225, 10, 91, 29);
		panel_1.add(btnReCreate);
		
		JButton btnDispose = new JButton("취소");
		btnDispose.setFont(new Font("굴림", Font.BOLD, 17));
		btnDispose.setBackground(Color.WHITE);
		btnDispose.setBounds(67, 10, 91, 29);
		panel_1.add(btnDispose);
		
		
		
		
		setVisible(true);
		
		//비밀번호 일치 확인 버튼
		btnPwdCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mPwd = txtPwd1.getText();
				String mPwd2 = txtPwd2.getText();
				if(mPwd.equals(mPwd2)) {
					 JOptionPane.showMessageDialog(null, "비밀번호가 일치합니다.", "비밀번호 일치", JOptionPane.INFORMATION_MESSAGE);
					 pwdCheak = 1;
				 }
				 else {
					 JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.", "비밀번호 불일치", JOptionPane.ERROR_MESSAGE);
					 txtPwd2.setText("");
					 txtPwd2.requestFocus();
				 }
			}
		});
		
		//재설정 버튼
		btnReCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mMid = vo.getmMid();
				String mPwd = txtPwd1.getText();
				if(pwdCheak == 1) {
					dao.newPassword(mMid, mPwd);
					//재설정 잘되었는지 확인하고 메세지 띄우기
					NuriManageVO vo = dao.newPasswordCheck(mMid, mPwd);
					if(vo.getmIdx() == 0) {
						JOptionPane.showMessageDialog(null, "비밀번호 재설정 오류. \n다시 시도해주세요.", "비밀번호 재설정 오류", JOptionPane.ERROR_MESSAGE);
					}else {
						int result = JOptionPane.showConfirmDialog(null, "비밀번호 재설정 완료. \n로그인 창으로 돌아가시겠습니까?", "비밀번호 재설정 완료", JOptionPane.YES_NO_OPTION);
							if(result == JOptionPane.YES_OPTION) {
								dispose();
								new NuriManageApp();
							}
					}
				}else {
					JOptionPane.showMessageDialog(null, "비밀번호 확인이 필요합니다.", "비밀번호 미확인", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		//취소 버튼
		btnDispose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "비밀번호 재설정을 취소하시겠습니까?", "비밀번호 재설정 취소", JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_OPTION) {
					dispose();
				}
			}
		});
	}
	
	public static void main(String[] args) {
//		new NuriNewPassword();
	}
}
