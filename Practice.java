import java.awt.*;
import java.awt.Color;
import java.awt.Image;
import javax.swing.*;
import javax.swing.border.TitledBorder;
public  class Practice {
	public static void main(String[] args) {
		FisWindow x;
		x = new FisWindow();
		x.Fissss();
	}
}
class FisWindow {
	static JFrame jfrm = new JFrame("财务管理系统");
	public void Fissss() {
		FlowLayout flow = new FlowLayout(FlowLayout.CENTER, 5, 10);
		ImageIcon bgpic = new ImageIcon("image/background.jpg");
		JLabel bglab = new JLabel(bgpic);
		jfrm.getLayeredPane().add(bglab, new Integer(Integer.MIN_VALUE));
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		bgpic.setImage(bgpic.getImage().getScaledInstance(screenSize.width, screenSize.height, Image.SCALE_DEFAULT));
		bglab.setBounds(0, 0, screenSize.width, screenSize.height);
		Container cp = jfrm.getContentPane();
		cp.setLayout(new BorderLayout());
		((JPanel)cp).setOpaque(false);
		Image im = (new ImageIcon("image/icon.png")).getImage();
		cp.setLayout(flow);
		jfrm.setIconImage(im);
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice gd = ge.getDefaultScreenDevice();
		gd.setFullScreenWindow(jfrm);
		cp.add(setjpan1());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setVisible(true);
	}
	JPanel setjpan1() {
		JPanel jpan1 = new JPanel();
		jpan1.setSize(100, 100);
		jpan1.setLocation(0, 500);
		JLabel lb = new JLabel("财务管理系统");
		lb.setFont(new Font("Dialog", 1, 30));
		jpan1.add(lb);
		return jpan1;
	}
	JButton setbun() {
		JButton bun = new JButton("确认");
		bun.setSize(80, 20);
		bun.setLocation(100, 600);
		return bun;
	}
}