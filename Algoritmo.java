
package hill_climbing;

public class Algoritmo {

    Estado estado_actual = new Estado("A", 10);
    Estado estado_inicial = new Estado("A", 10);
    
    public Estado hill(Estado estado_actual) {
    
        
        while(true)
        {
            Estado vizinho = estado_actual.maiorVizinho();
            if(vizinho.getValor() < estado_actual.getValor())
                return estado_actual;
            else
                estado_actual = vizinho;
        }
    }

}
