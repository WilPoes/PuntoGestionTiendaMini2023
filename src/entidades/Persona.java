package entidades;

public class Persona {
    //
    int id;
    int dni;
    String estado;
    String nombre;
    int telefono;
    String direccion;
    String razon;
    //
    public Persona() {
    }
    //
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String isEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }
    //
    @Override
    public String toString() {
        return "Persona:" + "id=" + id + ", dni=" + dni + ", estado=" + estado + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", razon=" + razon;        
    }
}
