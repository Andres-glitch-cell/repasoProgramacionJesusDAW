package ArraysPolimorfico;

// La superclase Vehículo:
class Vehiculo {
    protected String marca;
    protected int año;

    public Vehiculo(String marca, int año) {
        this.marca = marca;
        this.año = año;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Año: " + año);
    }
}