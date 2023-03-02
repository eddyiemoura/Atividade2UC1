package atividade2;

import java.util.Scanner;
public class Atividade2 {

    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        System.out.print("Digite o tipo de transporte: ");
        String tipo = leia.next();
        
        System.out.print("Digite o valor do transporte: ");
        int valorTransporte = leia.nextInt();
        leia.nextLine();
        
        System.out.print("Descreva o quarto: ");
        String descricao = leia.nextLine();
        
        System.out.print("Digite o valor da diária: ");
        int valorDiaria = leia.nextInt();
        leia.nextLine();
        
        System.out.print("Digite o destino da viagem: ");
        String destino = leia.nextLine();
        
        System.out.print("Digite a quantidade de dias que irá ficar: ");
        int quantDias = leia.nextInt();
        leia.nextLine();
        
        System.out.print("Digite o nome do hóspede: ");
        String nome = leia.nextLine();
        
        System.out.print("Digite a forma de pagamento: ");
        String formaPagamento = leia.nextLine();
        
        System.out.print("Digite a margem de lucro: ");
        int porcentagem = leia.nextInt();
        
        System.out.print("Digite as taxas adicionais: ");
        int taxas = leia.nextInt();
                
        System.out.print("Quanto vale o dólar? ");
        int dolar = leia.nextInt();
        
        System.out.println("\n");
        
        Transporte transporte = new Transporte(tipo, valorTransporte);
        Hospedagem hospedagem = new Hospedagem(descricao, valorDiaria);
        Pacote pacote = new Pacote(destino, quantDias);
        Venda venda = new Venda(nome, formaPagamento);
        
        transporte.descreveTrans();
        hospedagem.descreveHosp();
        pacote.descrevePac();
        venda.descreveVenda();
        
        System.out.println("Valor total da hospedagem: "+pacote.calcularTotal(quantDias, valorDiaria));
        int totalHospedagem = pacote.calcularTotal(quantDias, valorDiaria);
        
        int porc = pacote.calcPorcentagem(porcentagem);
        
        System.out.println("Valor do lucro: "+pacote.calcLucro(totalHospedagem, porc));

        
        System.out.println("Total de hospedagem convertido de reais para dólar: "+venda.converteReal(totalHospedagem, dolar));
        System.out.println("Pacote de viagens em dólar: "+pacote.calcPacote(valorTransporte, totalHospedagem, porcentagem, taxas));
        int totalPacote = pacote.calcPacote(valorTransporte, totalHospedagem, porcentagem, taxas);
        System.out.println("Pacote de viagens em reais: "+venda.totalReal(totalPacote, dolar));
        
    }
    
}
