package vehiculos;

public class Camion extends Vehiculo{
    private int ejes;

    public Camion(String placa, String nombre, double precio, double peso, Fabricante fabricante, int ejes) {
        super(placa, nombre, precio, peso, "4X2", fabricante);  
        this.ejes = ejes;
        setPuertas(2);  
        setVelocidadMaxima(80); 
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

}
