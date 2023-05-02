package org.in5bv.marvinluna.bean;

/**
 *
 * @author Marvin David Luna Ramirez
 * @date 1/04/2022
 * @time 10:27:35
 * Codigo Tecnico: IN5BV
 * Grupo: 2 (lunes)
 *
 */
public class Inverso extends Operacion{
    
    @Override
    public float operar(){
        
        setOperador('i');
        setResultado(getNumero1()*getNumero2());
        return getResultado();
        
    }
    
    @Override
    public float operar(float numero1, float numero2){
        
        setOperador('i');
        setNumero1(numero1);
        setNumero2(numero2);
        setResultado(getNumero1()*getNumero2());
        return getResultado();
        
    }
}
