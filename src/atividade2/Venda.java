package atividade2;

public class Venda {
    String nome;
    String formaPagamento;
    
    public Venda(String nome, String formaPagamento){
        this.nome = nome;
        this.formaPagamento = formaPagamento; 
    }
    
    public void descreveVenda(){
        System.out.println("Nome do cliente: "+nome);
        System.out.println("Forma de pagamento: "+formaPagamento);
    }
    
    public float converteReal (float num1, float num2){
        return num1*num2;
    }
    
    public float totalReal (float num1, float num2){
        return num1*num2;
    }
    
 
}
