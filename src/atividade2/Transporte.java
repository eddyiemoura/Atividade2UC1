
package atividade2;

public class Transporte {
    String tipo;
    int valor;

public Transporte(String tipo, int valor){
        this.tipo = tipo;
        this.valor = valor;
    }

    public void descreveTrans(){
        System.out.println("Tipo de transporte: "+tipo);
        System.out.println("Valor do transporte: "+valor);
        System.out.println("\n");
       }
}
