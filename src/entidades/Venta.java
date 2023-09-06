package entidades;

public class Venta {
    //
    int id;    
    double preciototal;
    String remitente;
    String cliente;        
    //
    public Venta() {
    }
    //
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(double preciototal) {
        this.preciototal = preciototal;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    //
    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", preciototal=" + preciototal + ", remitente=" + remitente + ", cliente=" + cliente + '}';
    }        
}
