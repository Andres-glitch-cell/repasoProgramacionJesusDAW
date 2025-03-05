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

    public static void main(String[] args) {
        // Le pasamos la clase Coche como una array
        Coche[] CochesArray = new Coche[4];

        // Creamos el objeto Coche de la clase Coche
        // Esta línea no es necesaria si no la usas
        Coche cocheObjeto = new Coche("1308 TBH", "Audi", "A4", 10000);

        CochesArray[0] = new Coche("1209 IDK", "Volkswagen", "Quattro", 25000);
        CochesArray[1] = new Coche("9078 NSE", "Volkswagen", "IBZ Model 2003", 120000);
        CochesArray[2] = new Coche("1524 BDS", "Ford", "Noseque", 9000);
        CochesArray[3] = new Coche("9234 OPQ", "Audi", "Q3", 12902);

        // Bucle para recorrer la array de Objeto coche
        for (int i = 0; i < CochesArray.length; i++) {
            System.out.println("\nCoche: " + (i + 1) + (":"));
            System.out.println("Matrícula: " + CochesArray[i].getMatricula());
            System.out.println("Marca del coche: " + CochesArray[i].getMarca());
            System.out.println("Modelo del coche: " + CochesArray[i].getModelo());
            System.out.println("Cantidad de km's: " + CochesArray[i].getKm());
        }
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

    public int getKm() {
        return this.km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}