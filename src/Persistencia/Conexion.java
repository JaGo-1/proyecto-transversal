
package Persistencia;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
    private static final  String URL="jdbc:mariadb://localhost/";
    private static  final String USUARIO= "Root";
    private static final String PASSWORD="";
    private static final String DB = "g11_universidad.sql";
    private static Connection connection ;

    public Conexion(){}
    

    
    public Connection buscarconexion(){
        
        if ( connection == null){
            
            try{
          Class.forName("org.mariadb.jdbc.Driver");
          
            connection= (Connection) DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
        }catch (SQLException | ClassNotFoundException ex){
                System.out.println("no se puede conectar " + ex.getMessage());
            
            
        } 
        }
            return connection;
            
    }
}
    
    
    
    
    
    
    
    
    
    
    
    


