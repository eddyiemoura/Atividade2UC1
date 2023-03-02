package atividade2;

public class Hospedagem {
    String descricao;
    int valorDiaria;
    
    public Hospedagem (String descricao, int valorDiaria){
        this.descricao = descricao;
        this.valorDiaria = valorDiaria;
    }
    
    public void descreveHosp(){
        System.out.println("Descrição do quarto: "+descricao);
        System.out.println("Valor da diária: "+valorDiaria);
        System.out.println("\n");
    }
}
