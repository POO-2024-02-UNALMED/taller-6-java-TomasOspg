package vehiculos;

public class Vehiculo {
    protected String placa;
    protected int puertas;
    protected int velocidadMaxima;
    protected String nombre;
    protected double precio;
    protected double peso;
    protected String traccion;
    protected Fabricante fabricante;

    private static int cantidadVehiculos;

    protected static int automoviles = 0;
    protected static int camionetas = 0;
    protected static int camiones = 0;

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, double precio,
                    double peso, String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;

        cantidadVehiculos++;
        fabricante.registrarVenta();
    }

    public static int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public static void setCantidadVehiculos(int cantidad) {
        cantidadVehiculos = cantidad;
    }

    public String getPlaca() {
        return placa;
    }

    public int getPuertas() {
        return puertas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPeso() {
        return peso;
    }

    public String getTraccion() {
        return traccion;
    }

    public static String vehiculosPorTipo() {
        return "Automoviles: " + automoviles + "\n" +
               "Camionetas: " + camionetas + "\n" +
               "Camiones: " + camiones;
    }
}