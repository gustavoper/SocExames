/**
 * Conector default (MYSQL) para as classes
 * 
 * @author Gustavo Pereira <gustavoper@gmail.com>
 * @since 2019-08-25
 */
package org.soc.exames.action;


import java.sql.Connection;
import java.sql.DriverManager;


public class ConnDb {

	
	/**
	 * Define a conexão
	 * 
	 * @return
	 * @throws Exception
	 */
	public static Connection getConnection() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/websparrow", 
					"root", 
					""
			);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
}
