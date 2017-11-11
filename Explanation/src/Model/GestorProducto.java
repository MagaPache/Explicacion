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

public class GestorProducto {
    public Connection conn;

    public GestorProducto() {
        try {
            conn = DriverManager.getConnection(AccesoDatos.stringConexion, AccesoDatos.user, AccesoDatos.pass);
        } catch (SQLException ex) {
            Logger.getLogger(GestorProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void agregarProducto(Producto p) {
        
        try {
            PreparedStatement stmt = conn.prepareStatement("insert into Productos values (?, ?, ?, ?, ?)");
            stmt.setInt(1, p.getCodigoProducto());
            stmt.setString(2, p.getNombre());
            stmt.setDouble(3, p.getPrecio());
            stmt.setInt(4, p.getTipoProducto());
            stmt.setBoolean(5, p.isDevolucion());
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestorProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<vmProducto> obtenerProductos() {
        
        ArrayList<vmProducto> lista = new ArrayList<vmProducto>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select codigo, nombre, precio, tipo, devolucion from Productos p join Tipos t on p.codigoTipo = t.codigoTipo");
            while(rs.next()){
                vmProducto p = new vmProducto();
                p.setCodigoProducto(rs.getInt("codigo"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setTipoProducto(rs.getString("tipo"));
                p.setDevolucion(rs.getBoolean("devolucion"));
                lista.add(p);                
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(GestorProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
        
    }
    
    
}
