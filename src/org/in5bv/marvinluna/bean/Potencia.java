package org.in5bv.marvinluna.bean;

/**
 *
 * @author Marvin David Luna Ramirez
 * @date 29/03/2022
 * @time 14:19:19
 * Codigo Tecnico: IN5BV
 * Grupo: 2 (lunes)
 *
 */

public class Potencia extends Operacion{
    
    
    @Override
    public float operar(){
        setOperador('p');
        setResultado((float) Math.pow(getNumero1(),2));
        return getResultado();
    }
    
    @Override
    public float operar(float numero1, float numero2){
        setOperador('p');
        setNumero1(numero1);
        setNumero2(numero2);
        setResultado( (float) Math.pow(getNumero1(), getNumero2()));
        return getResultado();
    }
}
