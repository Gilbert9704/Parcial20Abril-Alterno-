/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioCifrado;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class Principal {

    private static boolean isNumeric(String mensaje) {
        
	try {
		Integer.parseInt(mensaje);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}        
        
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String palabra = "";
        String mensajeLeer;
        
        try {
            File datos = new File("datos.txt");
            PrintStream info = new PrintStream("informacion.txt");
            Scanner sc = new Scanner(datos);
            sc.useDelimiter(",");
            
            while(sc.hasNext()){
                mensajeLeer = sc.next();
                try{ 
                    if (isNumeric(mensajeLeer)){
                        System.out.println(mensajeLeer);
                        info.println(mensajeLeer);
                    }
                    else{ 
                        for (int x = 0; x < mensajeLeer.length(); x++){ 
                            for (int y = 25; y > 0; y--){ 
                                if (mensajeLeer.charAt(x) == alfabeto.charAt(y)){ 
                                    if ((y - 3) < 0){ //cuando y = 2, 1, 0     
                                        int resta = y - 3;
                                        int a = 26;
                                        a += resta;
                                        palabra += alfabeto.charAt(a); 
                                    }
                                    else{
                                        palabra += alfabeto.charAt((y - 3) % 26);
                                    }
                                }
                            }
                        }
                    }
                    if (!"".equals(palabra)){
                        System.out.println();
                        info.println();
                        System.out.println(palabra);
                        info.println(palabra);
                        palabra = "";
                    }
                }
                catch(Exception e){
                    System.out.println("Hay un error");
                }
            }   
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ShareAsset.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}
