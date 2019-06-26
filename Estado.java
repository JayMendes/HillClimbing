package hill_climbing;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
public class Estado {

    private String nome;
    private List<Estado> vizinhos = new ArrayList<Estado>();
    private int valor;
    private int getValor;

    //construtor
    public Estado(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
        this.vizinhos = new ArrayList<>();
    }
     
    
    //geters e seters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Estado> getVizinhos() {
        return vizinhos;
    }

  //  public void setVizinhos(List<Estado> vizinhos) {
  //      this.vizinhos = vizinhos;
  //  }

      public void setVizinhos(Estado vizinhos) {
        this.vizinhos.add(vizinhos);
    }

    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    //metodos
    
    //metodo que retorna o maior vizinho
    public Estado maiorVizinho() {
        int tmp;//armazena o valor armazenado no indice tal
        int indice_maior = 0;//armazena indice com maior valor
        int maior_valor = 0;

        for (int i = 0; i < vizinhos.size(); i++) {
            tmp = vizinhos.get(i).getValor;

            if (tmp > maior_valor) {
                maior_valor = tmp;
                indice_maior = i;
            }
        }
        return vizinhos.get(indice_maior);
    }

   public void addVizinho(Estado estado) {
        
       this.vizinhos.add(estado);
    }

    
    }

