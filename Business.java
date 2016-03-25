public  class Business {
	private static final String DRIVER = "com.mysql.jdbc.Driver";   //驱动固定代码
	private static final String URL = "jdbc:mysql://localhost:3306/cs";	//URL
	private static final String user = "root";	//用户名
	private static final String pass = "root";	//密码
	public static Connection getConnection() {	//连接数据库
		Connection conn = null;
		try {
			Class.forName(DRIVER);		//加载驱动
			conn = DriverManager.getConnection(URL, user, pass);	//建立连接
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;		//连接对象返回
	}
}