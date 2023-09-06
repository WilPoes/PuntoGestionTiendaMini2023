package entidades;

import java.util.ArrayList;

public class DetalleVenta extends DetalleMovimiento{
    //
    private String codproducto;
    private int cantidad;
    private double precio;
    private int id_venta;    
    private ArrayList<DetalleVenta> listaDetalle = new ArrayList();
    //
    public DetalleVenta() {
    }
    //
    public String getCodproducto() {
        return codproducto;
    }

    public void setCodproducto(String codproducto) {
        this.codproducto = codproducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }
    //
    public void Agregar(DetalleVenta obj){       
        listaDetalle.add(obj);
    }
    //
    public void Eliminar(int pos){
        listaDetalle.remove(pos);     
    }
    public ArrayList MostrarProductos(){
        return listaDetalle;
    }
    //
    @Override
    public String toString() {
        return "DetalleVenta{" + "codproducto=" + codproducto + ", cantidad=" + cantidad + ", precio=" + precio + ", id_venta=" + id_venta + '}';
    }
    
    
}
