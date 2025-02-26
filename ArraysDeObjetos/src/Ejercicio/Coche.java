package Ejercicio;

public class Coche {

    // Atributos privados
    private String matricula;
    private String marca;
    private String modelo;
    private int km;


    // Constructor con parámetros escogidos anteriormente
    public Coche(String nombreMatricula, String cocheMarca, String nombreModelo, int longitudKm) {

        // matricula es el atributo de la clase Coche.
        // nombreMatricula es el parámetro que recibimos al crear el objeto.
        // Entonces, el valor que se pasa al constructor en nombreMatricula se guarda en el atributo matricula del objeto.
        matricula = nombreMatricula;
        marca = cocheMarca;
        modelo = nombreModelo;
        km = longitudKm;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;  // Se asigna el valor al atributo de la clase
    }


    // Devolvemos el valor de marca
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

    public void setKm(int km) {
        this.km = km;
    }

    public static void main(String[] args) {
        // Le pasamos la clase Coche como una array
        Coche [] Coches = new Coche[4];

    }
}


