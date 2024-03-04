package view;

import model.Casa;
import model.Pessoa;
import model.Porta;

public class Main {
    public static void main(String[] args) {
    	System.out.println("Programa 01 ------------------------------------------");
        
    	Pessoa pessoa = new Pessoa("Amanda", 20);
        pessoa.mostra();

        pessoa.setNome("Lucca");
        pessoa.setIdade(15);
        pessoa.fazAniversario();
        pessoa.mostra();

        pessoa.setNome("Liz");
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.mostra();
        System.out.println("");
        
        System.out.println("Programa 02 ------------------------------------------");
        Porta porta = new Porta(false, "branca", 0.8, 2.1, 0.04);

        porta.abre();
        System.out.println("A porta está aberta? " + porta.estaAberta());

        porta.fecha();
        System.out.println("A porta está aberta? " + porta.estaAberta());

        porta.pinta("verde");
        System.out.println("A cor da porta agora é " + porta.getCor());

        porta.setDimensaoX(0.9);
        porta.setDimensaoY(2.0);
        porta.setDimensaoZ(0.05);
        System.out.println("As dimensões da porta agora são: " + porta.getDimensaoX() + " x " + porta.getDimensaoY() + " x " + porta.getDimensaoZ());
        System.out.println("");
        
        System.out.println("Programa 03 ------------------------------------------");
        Porta porta1 = new Porta(true, "azul", 1.0, 2.0, 0.05);
        Porta porta2 = new Porta(false, "verde", 0.8, 1.9, 0.03);
        Porta porta3 = new Porta(true, "amarela", 1.2, 2.1, 0.07);
        
        Casa minhaCasa = new Casa("branca", porta1, porta2, porta3);
        System.out.println("Quantidade de portas abertas: " + minhaCasa.quantasPortasEstaoAbertas());
        
        porta1.fecha();
        porta3.fecha();
        System.out.println("Quantidade de portas abertas: " + minhaCasa.quantasPortasEstaoAbertas());
        
        minhaCasa.pinta("cinza");
        porta2.abre();
        System.out.println("Quantidade de portas abertas: " + minhaCasa.quantasPortasEstaoAbertas());
    }
}
