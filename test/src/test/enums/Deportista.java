package test.enums;
 
public class Deportista {
//Atributos
    enum ClaseDeDeporte {
          FUTBOL,
          BALONCESTO,
          JUDO,
          BALONMANO
        }
    private int edad;
    private int peso;
    private int estatura;
    private ClaseDeDeporte clasededeporte;
//Constructor
    public Deportista(int edad, int peso,int estatura, ClaseDeDeporte deporte) {
        this.edad=edad;
        this.peso=peso;
        this.estatura=estatura;
        this.clasededeporte=deporte;
        
    }
//Métodos    
}