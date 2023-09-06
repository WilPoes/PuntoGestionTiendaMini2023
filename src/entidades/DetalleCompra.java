package entidades;

import java.util.ArrayList;
import java.util.List;

public class DetalleCompra extends DetalleMovimiento{
    //id,precio
    private String codproducto;
    private int cantidad;
    private double precio;
    private int id_compra;    
    //
    public DetalleCompra() {
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

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }   
    //
    @Override
    public String toString() {
        return "{" + "COD.=" + codproducto + ", #" + cantidad + ", S/.(und.)=" + precio + ", ID_COMPRA=" + id_compra + '}';
    }    
}
