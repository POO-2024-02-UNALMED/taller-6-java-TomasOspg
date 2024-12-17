package vehiculo;

public class Automovil extends Vehiculo {

    private int puestos;

    public Automovil(String placa, String nombre, double precio, double peso, Fabricante fabricante, int puestos) {
        super(placa, nombre, precio, peso, "FWD", fabricante); 
        this.puestos = puestos;
        setPuertas(4);
        setVelocidadMaxima(100);
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

}
