package Model;

public class TipoProducto {
    
    private int codigoTipo;
    private String tipo;

    public int getCodigoTipo() {
        return codigoTipo;
    }

    public void setCodigoTipo(int codigoTipo) {
        this.codigoTipo = codigoTipo;
    }

    public String getTipo() {
        return tipo;
    }    

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public TipoProducto() {
    }

    public TipoProducto(int codigoTipo, String tipo) {
        this.codigoTipo = codigoTipo;
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return tipo;
    }    
    
    
}
