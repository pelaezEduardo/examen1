package gt.edu.url.examen1.impl;

/**
 * Clase wrapper destinada a almacenar los resultados en cada juego
 * @author tuxtor
 */
public class ResultadoJuego {
    private int a;
    private int b;

    public ResultadoJuego(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "A: " + this.a + " B: " + this.b;
    }
    
    
    
}
