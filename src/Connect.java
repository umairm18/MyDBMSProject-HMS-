import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    Connection con;
    public static Connection Connectdb()
    { 
        try 
        {
            String url = "jdbc:mysql://localhost:3306/hospital";
            String name = "root";
            String password = "Smackthat123@@";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,name,password);
            System.out.println("Database Connected");
            return con;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Database Not Connected");
            return null;
        } 
    }  
}