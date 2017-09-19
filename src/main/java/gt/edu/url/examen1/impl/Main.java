package gt.edu.url.examen1.impl;

/**
 *
 * @author tuxtor
 */
public class Main {
    
    public static void main(String[] args) {
        FabricaRangerImpl fabrica = new FabricaRangerImpl();
        
        //Ingeniero su examen estaba monstruoso
        Monstruo m1 = fabrica.fabricar("FUEGO");
        m1.setNombre("Victor");
        m1.setEdad(29);
        m1.setColor("Tostado");
        
        fabrica.encolar(m1);
        fabrica.apilar(m1);
        
        
        
        System.out.println("Examen 2");
        ChudnovskyImpl chud = new ChudnovskyImpl();
        System.out.println(chud.calcularPi(3));
    }
    
}
