import java.awt.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
public  class ProStorage {
	JFrame jfrm2 = new JFrame("财务管理系统");
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public void ProStorage() {
		ImageIcon bgpic = new ImageIcon("image/background.jpg");
		JLabel bglab = new JLabel(bgpic);
		jfrm2.getLayeredPane().add(bglab, new Integer(Integer.MIN_VALUE));
		bgpic.setImage(bgpic.getImage().getScaledInstance(screenSize.width, screenSize.height, Image.SCALE_DEFAULT));
		bglab.setBounds(0, 0, screenSize.width, screenSize.height);
		Container cp2 = jfrm2.getContentPane();
		cp2.setLayout(null);
		((JPanel)cp2).setOpaque(false);
		Image im = (new ImageIcon("image/icon.png")).getImage();
		jfrm2.setIconImage(im);
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice gd = ge.getDefaultScreenDevice();
		gd.setFullScreenWindow(jfrm2);
		jfrm2.add(setjpan1());
		jfrm2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm2.setVisible(true);
	}
	JPanel setjpan1() {
		JPanel jpan1 = new JPanel();
		jpan1.setSize(screenSize.width, 150);
		jpan1.setLocation(0, 80);
		jpan1.setOpaque(false);
		JLabel lb = new JLabel("财 务 管 理 系 统   ", JLabel.CENTER);
		lb.setLayout(null);
		lb.setLocation(0, 0);
		lb.setFont(new Font("Dialog", 1, 100));
		jpan1.add(lb);
		return jpan1;
	}
}