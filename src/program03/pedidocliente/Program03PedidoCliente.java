/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program03.pedidocliente;

/**
 *
 * @author Yair
 */
public class Program03PedidoCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Convertir de string a numero");
        String numeroString = "1";
        int numeroEntero = Integer.parseInt(numeroString);
        System.out.println(numeroEntero);
        
        System.out.println("Convertir de numero a string");
        numeroString = String.valueOf(numeroEntero);
        System.out.println(numeroString);
        System.out.println(numeroString.getClass().getSimpleName());
        
    }
    
}
