package atividade2;

public class Pacote {
    String destino;
    int quantDias;
    
    public Pacote (String destino, int quantDias){
    this.destino = destino;
    this.quantDias = quantDias;
    }
    
    public void descrevePac(){
        System.out.println("Destino: "+destino);
        System.out.println("Quantidade de dias: "+quantDias);
    }
    
    public int calcularTotal (int num1, int num2){
        return num1 * num2;
    }
    
    public int calcPorcentagem (int num){
        return num/100;
    }
    
    public int calcLucro (int num1, int num){
        return num1+num;
    }
    
    public int calcPacote (int num1, int num2, int num3, int num4){
        return num1 + num2 + num3 + num4;
    }
    
}
