package Ejercicio;

public class Coche {

    private String matricula;
    private String marca;
    private String modelo;
    private int km;

    public Coche(String nombreMatricula, String cocheMarca, String nombreModelo, int longitudKm) {

        matricula = nombreMatricula;
        marca = cocheMarca;
        modelo = nombreModelo;
        km = longitudKm;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        // Remplazas el valor antiguo por el nuevo
        this.matricula = matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
