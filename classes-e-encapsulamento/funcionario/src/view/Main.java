package view;

import model.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Amanda", "Design", 3500, "01/06/2024", "123456789", true);
        
        f1.mostra();
    }
}