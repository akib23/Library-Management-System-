package library.management.system.pkg2.pkg3project;
import java.sql.*;
import javax.swing.JOptionPane;
public class Connect {
    
    Connection conn;
    
    public static Connection ConnecrDb(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:F:\\Doc\\Library Management System(2-3project)\\Library.sqlite");
                    return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
