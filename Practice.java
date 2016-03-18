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
	static JFrame jfrm = new JFrame("账单管理系统");
	public void Fissss() {
		Image im = (new ImageIcon("image/icon.png")).getImage();
		jfrm.setIconImage(im);
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice gd = ge.getDefaultScreenDevice();
		gd.setFullScreenWindow(jfrm);
		jfrm.add(setjpan1());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setVisible(true);
	}
	JPanel setjpan1() {
		JPanel jpan1 = new JPanel();
		jpan1.setSize(100, 100);
		jpan1.setLocation(0, 0);
		JLabel lb = new JLabel();
		Icon pic;
		pic = new ImageIcon("image/t1.jpg");
		lb.setIcon(pic);
		jpan1.add(lb);
		return jpan1;
	}
	JButton setbun() {
		JButton bun = new JButton("确认");
		bun.setSize(80, 20);
		bun.setLocation(20, 200);
		return bun;
	}
}