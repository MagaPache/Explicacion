package Model;

public class Producto {
    
    private int codigoProducto;
    private String nombre;
    private double precio;
    private int tipoProducto;
    private boolean devolucion;

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(int tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public boolean isDevolucion() {
        return devolucion;
    }

    public void setDevolucion(boolean devolucion) {
        this.devolucion = devolucion;
    }

    public Producto() {
    }

    public Producto(int codigoProducto, String nombre, double precio, int tipoProducto, boolean devolucion) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.tipoProducto = tipoProducto;
        this.devolucion = devolucion;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigoProducto=" + codigoProducto + ", nombre=" + nombre + ", precio=" + precio + ", tipoProducto=" + tipoProducto + ", devolucion=" + devolucion + '}';
    }
    
    
}
