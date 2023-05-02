package org.in5bv.marvinluna.bean;

/**
 *
 * @author Marvin David Luna Ramirez
 * @date 20/03/2022
 * 
 * carne: 2021312
 * codigo tecnico: in5v
 * grupo: 2
 * dia: lunes
 * 
 */

public class Division extends Operacion{
    
    @Override 
    public float operar(){
        setOperador('/');
        setResultado(getNumero1()/getNumero2());
        
        return getResultado();
    }
    
    @Override
    public float operar(float numero1, float numero2){
        setNumero1(numero1);
        setNumero2(numero2);
        setOperador('/');
        setResultado(getNumero1()/getNumero2());
        
        return getResultado();
    }
}
