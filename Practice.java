package Accounts - Management - System;

import java.awt.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.*;
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
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public void Fissss() {
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
		cp.add(setjpan1());
		cp.add(setbunO());
		cp.add(setbunI());
		cp.add(setbunE());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setVisible(true);
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
	JButton setbunE() {
		ImageIcon exit = new ImageIcon("image/exit.png");
		JButton bune = new JButton( "退出系统", exit);
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
		return bune;
	}
	JButton setbunO() {
		ImageIcon proout = new ImageIcon("image/proout.png");
		JButton buno = new JButton( "产品出库", proout);
		buno.setSize(300, proout.getIconHeight() + 10);
		buno.setFont(new Font("Dialog", 1, 30));
		buno.setContentAreaFilled(false);
		buno.setBorderPainted(false);
		buno.setLocation(520, 400);
		return buno;
	}
	JButton setbunI() {
		ImageIcon soradd = new ImageIcon("image/soradd.png");
		JButton buni = new JButton( "原料入库", soradd);
		buni.setSize(300, soradd.getIconHeight() + 10);
		buni.setFont(new Font("Dialog", 1, 30));
		buni.setContentAreaFilled(false);
		buni.setBorderPainted(false);
		buni.setLocation(100, 400);
		buni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jfrm.setVisible(false);
				ProStorage prostorage = new ProStorage();
				prostorage.ProStorage();
			}
		});
		return buni;
	}
}