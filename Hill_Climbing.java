/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hill_climbing;

/**
 *
 * @author DELL
 */
public class Hill_Climbing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estado estado_a = new Estado("A", 10);
        Estado estado_b= new Estado("B", 12);
        Estado estado_c = new Estado("C", 19);
        Estado estado_d = new Estado("D", 7);
        Estado estado_e = new Estado("E", 6);
        
        //adicionar estados vizinhos do estado a
        estado_a.addVizinho(estado_b);
        estado_a.addVizinho(estado_c);
        
        //adicionar estados vizinhos do estado c
        estado_c.addVizinho(estado_d);
        estado_c.addVizinho(estado_e);
        
        Algoritmo hill_climbing = new Algoritmo();
        Estado resultado = hill_climbing.hill(estado_a);
        
        System.out.println("Resultado da execução " + resultado.getNome() + resultado.getValor());
      
    }
    
}
