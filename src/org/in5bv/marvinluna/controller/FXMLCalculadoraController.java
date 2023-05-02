package org.in5bv.marvinluna.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.in5bv.marvinluna.bean.Suma;
import org.in5bv.marvinluna.bean.Resta;
import org.in5bv.marvinluna.bean.Multiplicacion;
import org.in5bv.marvinluna.bean.Division;
import org.in5bv.marvinluna.bean.Inverso;
import org.in5bv.marvinluna.bean.Operacion;
import org.in5bv.marvinluna.bean.Porcentaje;
import org.in5bv.marvinluna.bean.Potencia;
import org.in5bv.marvinluna.bean.Raiz;
import org.in5bv.marvinluna.bean.Reciproco;

/**
 * FXML Controller class
 *
 * @author Marvin David Luna Ramirez
 */
public class FXMLCalculadoraController implements Initializable {

    Operacion calc = null;
    private float resultado;
    private float numero;
    private int contadorOperadores;
    private String operadorActual;
    private String registro;
    private String operadorAnterior;
    private boolean ingresoNuevo = false;
    private boolean ejecutar = false;
    

    @FXML
    private Label lblPantalla;

    @FXML
    private Label lblPantalla2;

    @FXML
    private Button btnUno;

    @FXML
    private Button btnDos;

    @FXML
    private Button btnTres;

    @FXML
    private Button btnCuatro;

    @FXML
    private Button btnCinco;

    @FXML
    private Button btnSeis;

    @FXML
    private Button btnSiete;

    @FXML
    private Button btnOcho;

    @FXML
    private Button btnNueve;

    @FXML
    private Button btnCero;

    @FXML
    private Button btnSuma;

    @FXML
    private Button btnResta;

    @FXML
    private Button btnMultiplicacion;

    @FXML
    private Button btnDivision;

    @FXML
    private Button btnIgual;

    @FXML
    private Button btnAc;

    @FXML
    private Button btnDel;

    @FXML
    private Button btnPorcentaje;

    @FXML
    private Button btnPotencia;

    @FXML
    private Button btnReciproco;

    @FXML
    private Button btnInverso;

    @FXML
    private Button btnRaiz;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void clicNumeros(ActionEvent event) {

        if (event.getSource().equals(btnUno)) {
            actualizarPantalla("1");
        } else if (event.getSource().equals(btnDos)) {
            actualizarPantalla("2");
        } else if (event.getSource().equals(btnTres)) {
            actualizarPantalla("3");
        } else if (event.getSource().equals(btnCuatro)) {
            actualizarPantalla("4");
        } else if (event.getSource().equals(btnCinco)) {
            actualizarPantalla("5");
        } else if (event.getSource().equals(btnSeis)) {
            actualizarPantalla("6");
        } else if (event.getSource().equals(btnSiete)) {
            actualizarPantalla("7");
        } else if (event.getSource().equals(btnOcho)) {
            actualizarPantalla("8");
        } else if (event.getSource().equals(btnNueve)) {
            actualizarPantalla("9");
        } else if (event.getSource().equals(btnCero)) {
            actualizarPantalla("0");
        }
    }

    public void clicOperadores(ActionEvent event) {
        if (event.getSource().equals(btnSuma)) {
            
            operadorActual = "+";
            calcular("+");
            lblPantalla2.setText("");

        } else if (event.getSource().equals(btnResta)) {
            
            operadorActual = "-";
            calcular("-");
            lblPantalla2.setText("");

        } else if (event.getSource().equals(btnMultiplicacion)) {
            
            operadorActual = "*";
            calcular("*");
            lblPantalla2.setText("");

        } else if (event.getSource().equals(btnDivision)) {
            
            operadorActual = "/";
            lblPantalla2.setText("");
            calcular("/");

        } else if (event.getSource().equals(btnPorcentaje)) {
            
            operadorActual = "%";
            calcular("%");
            lblPantalla2.setText("");

        } else if (event.getSource().equals(btnInverso)) {

            operadorActual = "-x";
            operadorAnterior = "-x";
            contadorOperadores++;
            lblPantalla2.setText("");
            calcular("-x");

        } else if (event.getSource().equals(btnPotencia)) {

            operadorActual = "^";
            operadorAnterior = "^";
            contadorOperadores++;
            lblPantalla2.setText("");
            calcular("^");

        } else if(event.getSource().equals(btnRaiz)){
            
            operadorActual = "√";
            operadorAnterior = "√";
            contadorOperadores++;
            lblPantalla2.setText("");
            calcular("√");
        } else if(event.getSource().equals(btnReciproco)){
            
            operadorActual = "1/x";
            operadorAnterior = "1/x";
            contadorOperadores++;
            lblPantalla2.setText("");
            calcular("x");
        }
    }

    public void clicLimpiar(ActionEvent event) {

        int limpieza;
        String limpiar;

        if (event.getSource().equals(btnAc)) {
            resultado = 0;
            numero = 0;
            contadorOperadores = 0;
            operadorAnterior = "";
            limpiarPantalla();
            lblPantalla2.setText("");
        } else if (event.getSource().equals(btnDel)) {

            limpieza = (lblPantalla.getText().length()) - 1;

            if (limpieza == 0) {
                limpiarPantalla();
            } else {
                limpiar = lblPantalla.getText().substring(0, limpieza);
                lblPantalla.setText(limpiar);
            }

            ingresoNuevo = false;

        }
    }

    public void limpiarPantalla() {
        lblPantalla.setText("0");
    }

    public void clicPunto() {

        if (lblPantalla.getText().contains(".")) {
            if(Float.parseFloat(lblPantalla.getText())==resultado){
                lblPantalla.setText("0.");
                ingresoNuevo = false;
            }
        } else {
            colocarPunto();
        }
    }

    public void colocarPunto() {

        lblPantalla.setText(lblPantalla.getText() + ".");

    }

    
    private void actualizarPantalla(String digito) {
        
        if(lblPantalla.getText().length()>12){
            lblPantalla2.setText("Maximo de caracteres");
            ingresoNuevo = true;
        }else{
            if (ingresoNuevo) {
                lblPantalla.setText("0");
            } else {

            }
            if (Float.parseFloat(lblPantalla.getText()) == 0) {

                if (lblPantalla.getText().indexOf(".") == 1) {
                    lblPantalla.setText(lblPantalla.getText().concat(digito));
                } else {
                    lblPantalla.setText(digito);
                }
            } else {
                lblPantalla.setText(lblPantalla.getText() + digito);
            }
            ingresoNuevo = false;
        }
    }
    

    public void registroEvento(String evento) {
        
        registro = evento;
        
    }

    public void clicIgual() {
        
        if(!(contadorOperadores==1)){
            ejecutar = true;
        }
        calcular(operadorActual);
        lblPantalla.setText(String.valueOf(resultado));
        ingresoNuevo = true;
        ejecutar = false;
        
    }

    private void calcular(String operador) {

        contadorOperadores = contadorOperadores + 1;
        //System.out.println("\nContador: " + contadorOperadores);

        if (contadorOperadores == 1) {
            resultado = Float.parseFloat(lblPantalla.getText());
            
            /*System.out.println("Numero 1: " + resultado);
            System.out.println("Numero 2: " + numero);
            System.out.println("Operador actual: " + operadorActual);
            System.out.println("Operador anterior: " + operadorAnterior);*/

        } else if (contadorOperadores >= 2) {
            
            if(ejecutar == true){
                if(Float.parseFloat(lblPantalla.getText())==resultado){
                
                }else{
                    numero = Float.parseFloat(lblPantalla.getText());
                }
            }else{
                numero = Float.parseFloat(lblPantalla.getText());
            }
            
            
            /*System.out.println("Numero 1: " + resultado);
            System.out.println("Numero 2: " + numero);
            System.out.println("Operador actual: " + operadorActual);
            System.out.println("Operador anterior: " + operadorAnterior);*/

            switch (operadorAnterior) {
                case "+":

                    calc = new Suma();
                    resultado = calc.operar(resultado, numero);

                    //System.out.println(("Resultado: " + calc.operar()) + "\n");
                    lblPantalla.setText(String.valueOf(resultado));

                    break;
                case "-":

                    calc = new Resta();
                    resultado = calc.operar(resultado, numero);

                    //System.out.println("Resultado: " + calc.getResultado() + "\n");
                    lblPantalla.setText(String.valueOf(resultado));

                    break;
                case "*":

                    calc = new Multiplicacion();
                    resultado = calc.operar(resultado, numero);
                    //System.out.println("Resultado: " + calc.getResultado() + "\n");
                    lblPantalla.setText(String.valueOf(resultado));

                    break;
                case "/":

                    calc = new Division();
                    if (numero == 0) {
                        lblPantalla2.setText("ERROR: No se puede dividir entre cero");
                        
                    } else if (numero != 0) {
                        resultado = calc.operar(resultado, numero);
                        //System.out.println("Resultado: " + calc.getResultado() + "\n");
                    }
                    lblPantalla.setText(String.valueOf(resultado));

                    break;
                case "%":

                    calc = new Porcentaje();
                    resultado = calc.operar(resultado, numero);
                    lblPantalla.setText(String.valueOf(resultado));
                    //System.out.println("Resultado: " + calc.getResultado() + "\n");

                    break;
                case "-x":

                    calc = new Inverso();
                    numero = calc.operar(numero, -1);
                    lblPantalla.setText(String.valueOf(numero));
                    //System.out.println("Resultado: " + calc.getResultado() + "\n");

                    break;
                case "^":

                    calc = new Potencia();
                    numero = calc.operar(numero, 2);
                    resultado = numero;
                    lblPantalla.setText(String.valueOf(numero));
                    //System.out.println("Resultado: " + calc.getResultado() + "\n");

                    break;
                case "√":
                    
                    calc = new Raiz();
                    if(numero >=0){
                        numero = calc.operar(numero, 0);
                    
                        lblPantalla.setText(String.valueOf(numero));
                        //System.out.println("Resultado: " + calc.getResultado() + "\n");
                    }else{
                        lblPantalla2.setText("No se puede sacar raiz cuadrada a un negativo");
                        resultado = numero;
                    }
                    
                    break;
                case "1/x":
                    
                    calc = new Reciproco();
                    numero = calc.operar(numero, 1);
                    lblPantalla.setText(String.valueOf(numero));
                    //System.out.println("Resultado: "+numero);
                    
                    break;
                default:

                    break;
            }
        }
        ingresoNuevo = true;
        operadorAnterior = operador;
        registroEvento(String.valueOf(numero));
        //System.out.println("Registro del evento: " + registro);
    }
}
