package gt.edu.url.examen1.impl;

import gt.edu.url.examen1.api.Reportero;

/**
 *
 * @author tuxtor
 */
public class ReporteroImpl implements Reportero{

    @Override
    public String calcularGanador(int a, int b) {
        if(a > 7 || b > 7)
            return "Resultado invalido";
        
        if( (a == 7 || b == 7) && Math.abs(a-b) > 2){
            return "Resultado invalido";
        }else if(a == 7){
            return "A";
        }else if(b == 7){
            return "B";
        }
        
        if (a-b >= 2 && a == 6){
            return "A";
        }else if(b-a >= 2 && b == 6){
            return "B";
        }else{
            return "Resultado invalido";
        }
        
        //Save in queue
    }

    @Override
    public String calcularCampeon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String recordarGanador(int juego) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
