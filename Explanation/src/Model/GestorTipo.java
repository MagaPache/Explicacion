package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestorTipo {

    private Connection conn;

    public GestorTipo() {

        try {
            conn = DriverManager.getConnection(AccesoDatos.stringConexion, AccesoDatos.user, AccesoDatos.pass);
        } catch (SQLException ex) {
            Logger.getLogger(GestorTipo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<TipoProducto> obtenerTodosTipos() {
        
        ArrayList<TipoProducto> lista = new ArrayList<TipoProducto>();

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Tipos");
            while(rs.next()){
                TipoProducto tp = new TipoProducto();
                tp.setCodigoTipo(rs.getInt("codigoTipo")); //es mejor poner el nombre x si cambia mi DB en el futuro
                tp.setTipo(rs.getString("tipo"));
                lista.add(tp);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestorTipo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    

}
