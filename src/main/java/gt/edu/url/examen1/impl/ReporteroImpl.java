package gt.edu.url.examen1.impl;

import gt.edu.url.examen1.api.Reportero;
import gt.edu.url.examen1.ds.ArrayList;

/**
 *
 * @author tuxtor
 */
public class ReporteroImpl implements Reportero{
    
    ArrayList<ResultadoJuego> resultados = new ArrayList<>();

    @Override
    public String calcularGanador(int a, int b) {
        if(a > 7 || b > 7)
            return "Resultado invalido";
        
        //Validacion por inclusion
        if( (a == 7 || b == 7) && Math.abs(a-b) > 2){
            return "Resultado invalido";
        }else if(a == 7){
            resultados.add(0, new ResultadoJuego(a, b));
            return "A";
        }else if(b == 7){
            resultados.add(0, new ResultadoJuego(a, b));
            return "B";
        }
        
        //Validacion por exclusion
        if (a-b >= 2 && a == 6){
            resultados.add(0, new ResultadoJuego(a, b));
            return "A";
        }else if(b-a >= 2 && b == 6){
            resultados.add(0, new ResultadoJuego(a, b));
            return "B";
        }else{
            return "Resultado invalido";
        }
    }

    @Override
    public String calcularCampeon() {
        int juegosa=0, juegosb=0;
        for(int i = 0; i < resultados.size() ; i ++){
            ResultadoJuego res = resultados.get(i);
            if(res != null){
                if(res.getA() > res.getB()){
                    juegosa++;
                }else{
                    juegosb++;
                }
            }
        }
        if(juegosa > juegosb){
            return "A";
        }else if(juegosa < juegosb){
            return "B";
        }else{
            return "Empate";
        }
    }

    @Override
    public String recordarGanador(int juego) {
        ResultadoJuego res = resultados.get(juego);
        if(res != null){
            return res.toString();
        }else{
            return "Juego invalido";
        }
    }
    
    
    
}
