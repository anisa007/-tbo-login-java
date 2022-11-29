
package tugas_proyek_tbo;

/**
 *
 * @author anisa
 */
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class KoneksiDatabase {
    public static Connection con;
    public static Statement stm;
        public static Connection GetConnection()throws SQLException{
            try {
             String url ="jdbc:mysql://localhost/proyektbo";
             String user="root";
             String pass="";
             Class.forName("com.mysql.jdbc.Driver");
             con =DriverManager.getConnection(url,user,pass);
             stm = con.createStatement();
             System.out.println("koneksi berhasil;");
            } catch (Exception e) {
             System.err.println("koneksi gagal" +e.getMessage());
            }
            return con;
        }
    
    
}

