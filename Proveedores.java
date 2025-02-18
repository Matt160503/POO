public class Proveedores {
    private int id;
    private String nombre;
    private String tipo;

    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
