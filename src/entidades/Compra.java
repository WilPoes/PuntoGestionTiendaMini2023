package entidades;

public class Compra {
    int id;
    Double preciototal;
    String remitente;
    String proveedor;
    String movil;
    double preciomovil;
    //
    public Compra() {
    }
    //
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(Double preciototal) {
        this.preciototal = preciototal;
    }   

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public double getPreciomovil() {
        return preciomovil;
    }

    public void setPreciomovil(double preciomovil) {
        this.preciomovil = preciomovil;
    }   
}
