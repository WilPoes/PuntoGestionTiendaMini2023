package entidades;

public class DetalleMovimiento {
    //
    private int id;    
    private double precio;
    // 
    public DetalleMovimiento() {
    }    
    //
    public DetalleMovimiento(int id, double precio) {
        this.id = id;
        this.precio = precio;
    }    
    //
    public int getId() {
        return id;
    }
    //
    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //
    @Override
    public String toString() {
        return "Detalle[ " + "id=" + id  + ", precio=S/." + precio + "] ";
    }    
}
