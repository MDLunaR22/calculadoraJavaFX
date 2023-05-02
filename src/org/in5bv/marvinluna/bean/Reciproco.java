package org.in5bv.marvinluna.bean;

/**
 *
 * @author Marvin David Luna Ramirez
 * @date 1/04/2022
 * @time 10:27:46
 * Codigo Tecnico: IN5BV
 * Grupo: 2 (lunes)
 *
 */
public class Reciproco extends Operacion{
    
    @Override
    public float operar(){
        setResultado(getNumero2()/getNumero1());
        return getResultado();
    }
    
    @Override
    public float operar(float numero1 , float numero2){
        setNumero1(numero1);
        setNumero2(numero2);
        setResultado(getNumero2()/getNumero1());
        return getResultado();
    }
}
