package org.in5bv.marvinluna.system;

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

import org.in5bv.marvinluna.bean.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application{
    public static void main(String[] args) {
        
        
        launch(args); 
        // Operacion op = new Operacion();
        
        
        /*
        Suma s = new Suma();
        Resta r = new Resta();
        Multiplicacion m = new Multiplicacion();
        Division d = new Division();
        
        s.setNumero1(5);
        s.setNumero2(3);
        
        r.setNumero1(15);
        r.setNumero2(3);
        
        m.setNumero1(5);
        m.setNumero2(4);
        
        d.setNumero1(8);
        d.setNumero2(2);
        
        System.out.println(s.operar());
        System.out.println(r.operar());
        System.out.println(m.operar());
        System.out.println(d.operar());
        
        */
    }

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../view/FXMLCalculadoraView.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}







