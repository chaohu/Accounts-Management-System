import java.awt.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
enum {boolean x = true;}
public  class Main {
	static JFrame jfrm = new JFrame("财务管理系统");
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	ImageIcon bgpic = new ImageIcon("image/background.jpg");
	JLabel bglab = new JLabel(bgpic);
	Container cp = jfrm.getContentPane();
	JLabel lb = new JLabel("财 务 管 理 系 统   ", JLabel.CENTER);
	Image im = (new ImageIcon("image/icon.png")).getImage();
	GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	GraphicsDevice gd = ge.getDefaultScreenDevice();
	public static void main(String[] args) {
		Main Profes = new Main();
		login log = new login();
		if (log.login()) {
			new Main();
		}
		jfrm.setVisible(true);
	}
	public Main() {
		try {
			jfrm.getLayeredPane().add(bglab, new Integer(Integer.MIN_VALUE));
			bgpic.setImage(bgpic.getImage().getScaledInstance(screenSize.width, screenSize.height, Image.SCALE_DEFAULT));
			bglab.setBounds(0, 0, screenSize.width, screenSize.height);
			cp.setLayout(null);
			((JPanel)cp).setOpaque(false);
			jfrm.setIconImage(im);
			gd.setFullScreenWindow(jfrm);

			//定义主题标签
			JPanel jpan1 = new JPanel();
			jpan1.setSize(screenSize.width, 150);
			jpan1.setLocation(0, 80);
			jpan1.setOpaque(false);
			lb.setLayout(null);
			lb.setLocation(0, 0);
			lb.setFont(new Font("Dialog", 1, 100));
			jpan1.add(lb);

			//定义入库按钮
			ImageIcon soradd = new ImageIcon("image/soradd.png");
			JButton buni = new JButton( "入库", soradd);
			buni.setSize(300, soradd.getIconHeight() + 10);
			buni.setFont(new Font("Dialog", 1, 30));
			buni.setContentAreaFilled(false);
			buni.setBorderPainted(false);
			buni.setLocation(100, 400);
			buni.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ProStorage prostorage = new ProStorage();
					prostorage.ProStorage();
				}
			});

			//定义出库按钮
			ImageIcon proout = new ImageIcon("image/proout.png");
			JButton buno = new JButton( "出库", proout);
			buno.setSize(300, proout.getIconHeight() + 10);
			buno.setFont(new Font("Dialog", 1, 30));
			buno.setContentAreaFilled(false);
			buno.setBorderPainted(false);
			buno.setLocation(520, 400);

			//定义退出按钮
			ImageIcon exit = new ImageIcon("image/exit.png");
			JButton bune = new JButton( "退出", exit);
			bune.setSize(300, exit.getIconHeight() + 10);
			bune.setFont(new Font("Dialog", 1, 30));
			bune.setContentAreaFilled(false);
			bune.setBorderPainted(false);
			bune.setLocation(940, 400);
			bune.setMnemonic(KeyEvent.VK_X);
			bune.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int n = JOptionPane.showConfirmDialog(null, "确认退出？", "确认对话框", JOptionPane.YES_NO_OPTION);
					if (n == JOptionPane.YES_OPTION) {
						System.exit(0);
					}
				}
			});

			cp.add(buno);
			cp.add(buni);
			cp.add(bune);
			cp.add(jpan1);
			jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jfrm.setVisible(true);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		if (x == true) {
			cp.removeAll();
			x = false;
		}
	}
}