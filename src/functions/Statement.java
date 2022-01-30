package functions;
import java.sql.*;

public class Statement {
    private String url = "jdbc:mysql://192.168.1.114:3306/misurazioni";
    private String username = "admin";
    private String password = "7907";
    private java.sql.Statement stmt;

    public java.sql.Statement getStatement(){
        try{
            Connection con = DriverManager.getConnection(url, username, password);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM misure");
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3));
            }
        }
        catch(java.sql.SQLException e){
            System.out.println(e);
        }
        return stmt;
    }

}
