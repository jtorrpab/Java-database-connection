import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class App {

    public static void main(String[] args) throws Exception {
    
    //     ConexionDB();
    // }

    // public static void ConexionDB(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:hr.db");
            if (conn != null) {
                System.out.println("Conexion exitosa");
                Statement st = conn.createStatement();

                //Consumo de la base de datos
                ResultSet res = st.executeQuery("SELECT * FROM employees");
                while(res.next()){
                    System.out.println("Nombre "+res.getString("first_name"));
                }
                //System.out.println(res);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
