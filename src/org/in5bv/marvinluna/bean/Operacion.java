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

public abstract class Operacion {
    
    // ATRIBUTOS O VARIABLES DE INSTANCIA
    private float numero1;
    private float numero2;
    private float resultado;
    private char operador;
    
    // CONSTRUCTORES
    
    public Operacion(){
    }
    
    public Operacion(float numero1, float numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    // METODOS GETTER AND SETTER
    
    public float getNumero1(){
        return this.numero1;
    }
    
    public void setNumero1(float numero1){
        this.numero1 = numero1;
    }
    
    public float getNumero2(){
        return numero2;
    }
    public void setNumero2(float numero2){
        this.numero2 = numero2;
    }
    
    public float getResultado(){
        return resultado;
    }
    
    protected void setResultado(float resultado){
        this.resultado = resultado;
    }
    
    public char getOperador(){
        return operador;
    }
    
    public void setOperador(char operador){
        this.operador = operador;
    }
    
    // METODOS
    
    public abstract float operar();
    
    public abstract float operar(float numero1, float numero2);
    
}
