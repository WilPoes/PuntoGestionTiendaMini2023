package entidades;

import java.util.ArrayList;
import java.util.List;

public class Producto {
    //
    private int id;
    private String codigo;
    private String nombre;
    private String proveedor;
    private int stock;
    private double precio;
    private int id_compra;
    //
    private ArrayList<Producto> listaProductos = new ArrayList();
    //
    public Producto() {
    }
    //
    public Producto(int id, String codigo, String nombre, String proveedor, int stock, double precio, int id_compra) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.stock = stock;
        this.precio = precio;
        this.id_compra = id_compra;
    }
   
    //
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
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
    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    //
    @Override
    public String toString() {
        return "[COD=" + codigo + " Nombre="+nombre + ", CANT.=" + stock + ", S/." + precio +"]";
    }
    //
    public void Agregar(Producto obj){       
        listaProductos.add(obj);
    }
    public void Eliminar(int pos){
        listaProductos.remove(pos);     
    }
    public ArrayList MostrarProductos(){
        return listaProductos;
    }
    //
    public Producto BuscarProducto(String codigo){
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getCodigo().equals(codigo)) {
                return listaProductos.get(i);
            }
        }
        return null;
    }
    //  
}
