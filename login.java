import javax.swing.*;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;

public class login extends JDialog {
	boolean judge = true;
	JPanel panel1 = new JPanel();
	JTextField jTextField1 = new JTextField();
	JLabel jLabel1 = new JLabel();
	JLabel jLabel2 = new JLabel();
	JLabel jLabel3 = new JLabel();
	JButton jButton1 = new JButton();
	JButton jButton2 = new JButton();
	JPasswordField jPasswordField1 = new JPasswordField();
	public boolean login() {
		try {
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			jBinit();
			Main main = new Main();
			main.cp.removeAll();
			main.cp.add(panel1);
			main.cp.add(main.lb);
			jButton2.addActionListener(new ActionListener()  {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
		if (judge == true) {
			return false;
		} else {
			return true;
		}
	}
	private void jBinit() {
		try {
			panel1.setLayout(null);
			//设置显示区域
			jLabel1.setText("用户名");
			jLabel1.setBounds(new Rectangle(78, 87, 49, 25));
			jTextField1.setBounds(new Rectangle(158, 87, 101, 25));
			jLabel2.setText("密码");
			jLabel2.setBounds(new Rectangle(76, 124, 49, 25));
			jPasswordField1.setBounds(new Rectangle(158, 125, 101, 25));
			Font font3 = new Font("宋体", Font.PLAIN, 20);
			jLabel3.setFont(font3);
			jLabel3.setText("管理员登陆");
			jLabel3.setBounds(new Rectangle(145, 30, 113, 27));
			jButton1.setBounds(new Rectangle(75, 206, 83, 25));
			jButton1.setText("登陆");

			//注册监听器

			jButton2.setBounds(new Rectangle(210, 206, 83, 25));
			jButton2.setText("取消");
			//注册监听器

			panel1.add(jLabel3);
			panel1.add(jLabel1);
			panel1.add(jTextField1);
			panel1.add(jLabel2);
			panel1.add(jButton1);
			panel1.add(jButton2);
			panel1.add(jPasswordField1);
			panel1.setBounds(new Rectangle(400, 300, 400, 300));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}