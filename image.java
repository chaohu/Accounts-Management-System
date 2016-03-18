import javax.swing.*;
public  class image extends JFrame {
	JTabbedPane jtab = new JTabbedPane(JTabbedPane.TOP);
	public image() {
		JLabel[] lab = new JLabel[6];
		Icon pic;
		String title;
		for (int i = 1; i <= 5; i++) {
			pic = new ImageIcon("image/t" + i + ".jpg");
			lab[i] = new JLabel();
			lab[i].setIcon(pic);
			title = "第" + i + "页";
			jtab.add(title, lab[i]);
		}
		this.add(jtab);
	}
	public static  void main(String[] args) {
		image frm = new image();
		frm.setTitle("选项卡的应用");
		frm.setSize(300, 300);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
}