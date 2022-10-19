import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) throws Exception {
    
        ConexionDB();
    }

    public static void ConexionDB(){
        try {
            String url = "jdbc:sqlite:hr.db";
            Connection conn = DriverManager.getConnection(url);
            if(conn != null){
                System.out.println("Conexión exitosa");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
