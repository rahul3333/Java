
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author I524937
 */
public class DataBaseConnection {
    public static void Main()
    {
        try {
                Class.forName("java.sql.DriverManager");
                com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/rms", "root", "");
                com.mysql.jdbc.Statement stmt = (com.mysql.jdbc.Statement) con.createStatement();
            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                System.out.println("DataBaseConnection Erro");
            }
    }
    
}
