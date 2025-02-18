public class Producto {
    private String nombre;
    private int stock;
    private double precio;
    private int stockMinimo;
    private int stockMaximo;
    private int edadMinima;

    //Constructor
    public Producto(String nombre, int stock, double precio, int stockMinimo, int stockMaximo, int edadMinima){
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.stockMinimo = stockMinimo;
        this.stockMaximo = stockMaximo;
        this.edadMinima = edadMinima;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public int getStockMaximo() {
        return stockMaximo;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public void setStockMaximo(int stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    //Funciones del producto
    public boolean haySuficienteStock(int cantidad){
        if (stock >= cantidad){
            return true;
        }
        else{
            return false;
        }
    }

    public void reducirStock(int cantidad){
        stock = cantidad;
    }

}
