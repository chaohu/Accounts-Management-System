import java.awt.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
public  class ProStorage {
	Font font = new Font("宋体", Font.PLAIN, 20);
	JMenuBar jMenuBar1 = new JMenuBar();			//定义菜单栏
	JMenuItem GrainIn = new JMenuItem("物料入库");		//谷物入库
	JMenuItem RiceIn = new JMenuItem("大米入库");			//大米入库
	JMenuItem Variety = new JMenuItem("品种管理");			//品种管理
	JMenuItem Return = new JMenuItem("返回");			//返回
	JTree jTree1 = new JTree();				//定义树形
	JLabel statusBar = new JLabel();				//表格展示区域
	JScrollPane jScrollPane2 = new JScrollPane();		//带滚动条的区域
	Object[][] cellData = {{"胡超", "胡娣"}, {"胡明杰", "胡四华"}};
	String[] columnNames = {"col1", "col2"};
	JTable jTable1 = new JTable(cellData, columnNames);				//表格
	TitledBorder titledborder1 = new TitledBorder("");
	JScrollPane jScrollPane1 = new JScrollPane();		//带滚动条的区域
	public void ProStorage() {
		try {
			Main main = new Main();
			main.cp.removeAll();
			main.jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			main.jfrm.setJMenuBar(jMenuBar1);
			main.cp.add(statusBar);
			jbInit();					//自定义窗口初始化函数
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	public void jbInit() {
		setjTable();			//设置表格
		setstatus();			//设置表格展示区域
		UIManager.put("MenuItem.font", font);
		jMenuBar1.add(GrainIn);	//将父菜单加入菜单栏
		GrainIn. setSelected(true);
		GrainIn.updateUI();
		jMenuBar1.add(RiceIn);
		RiceIn.updateUI();
		jMenuBar1.add(Variety);
		Variety.updateUI();
		jMenuBar1.add(Return);
		Return.updateUI();
		statusBar.add(jTable1);
		Return.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main main =  new Main();
				main.cp.remove(statusBar);
				main.jfrm.setJMenuBar(null);
			}
		});
	}
	public void setstatus() {
		statusBar.setSize(300, 300);
		statusBar.setLocation(0, 10);
	}
	public void setjTable() {
		jTable1.setSize(100, 100);
	}
}