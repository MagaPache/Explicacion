package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestorProducto {
    public Connection conn;

    public GestorProducto() {
        try {
            conn = DriverManager.getConnection(AccesoDatos.stringConexion, AccesoDatos.user, AccesoDatos.pass);
        } catch (SQLException ex) {
            Logger.getLogger(GestorProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
