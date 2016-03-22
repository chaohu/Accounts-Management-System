import java.awt.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
public  class ProStorage {
	JFrame jfrm = new JFrame("财务管理系统");
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public void ProStorage() {
		ImageIcon bgpic = new ImageIcon("image/background.jpg");
		JLabel bglab = new JLabel(bgpic);
		jfrm.getLayeredPane().add(bglab, new Integer(Integer.MIN_VALUE));
		bgpic.setImage(bgpic.getImage().getScaledInstance(screenSize.width, screenSize.height, Image.SCALE_DEFAULT));
		bglab.setBounds(0, 0, screenSize.width, screenSize.height);
		Container cp = jfrm.getContentPane();
		cp.setLayout(null);
		((JPanel)cp).setOpaque(false);
		Image im = (new ImageIcon("image/icon.png")).getImage();
		jfrm.setIconImage(im);
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice gd = ge.getDefaultScreenDevice();
		gd.setFullScreenWindow(jfrm);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setVisible(true);
	}
}