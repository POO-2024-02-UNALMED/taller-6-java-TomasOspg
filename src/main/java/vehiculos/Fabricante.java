package vehiculos;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private int ventas;

    private static Fabricante fabricaMayorVentas;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void registrarVenta() {
        ventas++;
        pais.registrarVenta();

        if (fabricaMayorVentas == null || ventas > fabricaMayorVentas.ventas) {
            fabricaMayorVentas = this;
        }
    }

    public static Fabricante fabricaMayorVentas() {
        return fabricaMayorVentas;
    }
}
