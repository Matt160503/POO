import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Venta {
    private int id;
    private List<Producto> productos;
    private double monto;
    private String archivo_ventas = "Ventas";
    private List<Integer> cantidad;

    //Constructor
    public Venta(int id,List<Producto> productos,List<Integer> cantidad){
        this.id = id;
        this.productos = productos;
        this.monto = calcularMonto();
        this.cantidad = cantidad;
    }

    //Funcion para generar el monto total de la venta
    public double calcularMonto(){
        double montoFinal = 0;
        for (int i = 0; i<productos.size(); i++){
            montoFinal += productos.get(i).getPrecio() * cantidad.get(i);
        }
        return montoFinal;
    }

    //Creacion de documento para la persistencia de datos
    public void registrarVentaCSV(){
        try(FileWriter writer = new FileWriter(archivo_ventas, true)) {
            StringBuilder linea = new StringBuilder();
            linea.append(id).append(", ");
            //Guardado de cada producto con su respectiva cantidad
            for (int i = 0; i<productos.size(); i++){
                linea.append(productos.get(i).getNombre()).append(": ").append(cantidad.get(i));
            }
            linea.append(", ").append(monto).append("\n");
            writer.write(linea.toString());
            System.out.println("Venta ingresada a: "+ archivo_ventas);
        }

        //Codigo en caso de que haya algun error al registrar la venta del producto
        catch (IOException error){
            System.err.println("No se pudo registrar la venta");
        }
    }

    //Getters
    public double getMonto() {
        return monto;
    }

    //Setters
    public void setMonto(double monto) {
        this.monto = monto;
    }
}
