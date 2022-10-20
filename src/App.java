import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class App {
    public static void main(String[] args) throws Exception {
        ConexionDB();
    }

//Metodo que contiene la conexion a la db
    public static void ConexionDB(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:hr.db");
            if (conn != null) {
                System.out.println("Conexion exitosa");
                //Creación objeto para el consumo de la DB 
                Statement st = conn.createStatement();
                querySelecEmployeeAll(st);
                insertJob(conn);
                selectAllJobs(st);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());}
        finally{
            try {
                if (conn != null) {
                    conn.close();
                    System.out.println("Conexion cerrada");}  
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }    

    public static void querySelecEmployeeAll(Statement st)throws SQLException{
        // // //Consumo de la base de datos
        ResultSet result = st.executeQuery("SELECT * FROM employees");
        String info = "";
        while(result.next()){
            String nombre = result.getString("first_name");
            String apellido = result.getString("last_name");
            int id = result.getInt("employee_id");
            info += "----------------\n";
            info += "Id : " + id;
            info += "\nNombre: " + nombre;
            info += "\nApellido: " + apellido;
            info += "\n----------------\n";
        }
        System.out.println(info);
    }

    public static void insertJob(Connection conn) throws SQLException{
        //Preparar una consulta SQL
        String query = "INSERT INTO jobs(job_title, min_salary, max_salary) VALUES(?,?,?)";
        PreparedStatement pst = conn.prepareStatement(query);

        //Setear - anexar los valores
        pst.setString(1, "Developer1");
        pst.setInt(2, 2000);
        pst.setInt(3, 16000);

        //Ejecutar consulta
        pst.executeUpdate();
        System.out.println("Se incerto conrrectamente");
    }

    public static void selectAllJobs(Statement st)throws SQLException{
        // // //Consumo de la base de datos
        ResultSet result = st.executeQuery("SELECT * FROM jobs");
        while(result.next()){
            System.out.println("\n----------------");
            System.out.println("Job: "+ result.getString("job_title"));
            System.out.println("----------------");
        }
    }
}

