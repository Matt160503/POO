import java.util.List;

public class Venta {
    private int id;
    private List<Producto> productos;
    private double monto;
    private String archivo_ventas;

    public Venta(int id,List<Producto> productos){
        this.id = id;
        this.productos = productos;
        this.monto = monto;
        this.archivo_ventas = archivo_ventas;
    }

    public double calcularMonto(){
        for (Producto p : productos){
            Producto.getPrecio()
            monto = monto ++ p;
        }
    }
}
