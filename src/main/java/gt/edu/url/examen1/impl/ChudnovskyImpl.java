package gt.edu.url.examen1.impl;

import gt.edu.url.examen1.api.Chudnovsky;

/**
 * Implementacion del algoritmo de chudnovsky
 * 
 * La deducción algebraica fue tomada de https://www.craig-wood.com/nick/articles/pi-chudnovsky/
 * @author tuxtor
 */
public class ChudnovskyImpl implements Chudnovsky{

    
    /**
     * Calcula una aproximación de Pi utilizando una implementacion recursiva
     * @param k de aproximación
     * @return aproximación de Pi
     */
    public double calcularPi(int k){
        return (426880 * Math.sqrt(10005))/
                (13591409*calcularA(k)+545140134*calcularB(k));
        
    }
    

    private double calcularA(int k) {
        if(k == 0){
            return hacerDivisionFactorialA(k);
        }else{
            return hacerDivisionFactorialA(k) + calcularA(k-1);
        }

    }
    
    private double hacerDivisionFactorialA(int k){
        return (Math.pow(-1,k) * factorial(6*k))/
                (factorial(3*k)*Math.pow(factorial(k),3)*Math.pow(640320,3*k));

    }
    
    private double calcularB(int k) {
        if(k == 0){
            return hacerDivisionFactorialB(k);
        }else{
            return hacerDivisionFactorialB(k) + calcularB(k-1);
        }

    }
    
    private double hacerDivisionFactorialB(int k){
        return (Math.pow(-1,k) * factorial(6*k) * k)/
                (factorial(3*k)*Math.pow(factorial(k),3)*Math.pow(640320,3*k));

    }
    
    /**
     * Calcula el factorial del i-esimo termino utilizando recursividad
     * @param i factorial deseado
     * @return calculo del factorial
     */
    public int factorial(int i){
        if(i == 0){
            return 1;
        }else{
            return i * factorial(i-1);
        }
    }
    
    
}
