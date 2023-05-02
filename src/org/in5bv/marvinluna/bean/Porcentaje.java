package org.in5bv.marvinluna.bean;

/**
 *
 * @author Marvin David Luna Ramirez
 * @date 1/04/2022
 * @time 10:28:17
 * Codigo Tecnico: IN5BV
 * Grupo: 2 (lunes)
 *
 */
public class Porcentaje extends Operacion{

    public Porcentaje() {
    }
    
    @Override
    public float operar(){
        
        setOperador('x');
        setResultado(getNumero1()*(getNumero2()/100));
        return getResultado();
        
    }
    
    @Override
    public float operar(float numero1, float numero2){
        
        setNumero1(numero1);
        setNumero2(numero2);
        setOperador('x');
        setResultado(getNumero1()*(getNumero2()/100));
        return getResultado();
        
    }
}
