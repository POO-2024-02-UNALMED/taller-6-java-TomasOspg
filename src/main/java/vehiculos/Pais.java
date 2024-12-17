package vehiculos;

public class Pais {
    private String nombre;
    private int ventas;

    private static Pais paisMasVendedor;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void registrarVenta() {
        ventas++;
        if (paisMasVendedor == null || ventas > paisMasVendedor.ventas) {
            paisMasVendedor = this;
        }
    }

    public static Pais paisMasVendedor() {
        return paisMasVendedor;
    }
}
