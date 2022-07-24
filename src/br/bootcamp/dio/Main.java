package br.bootcamp.dio;

public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9,1.8);
        Calculadora.divisao(7,8);
        Calculadora.multiplicacao(5,2.5);

        //Mensagem
        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(18);

        //Empréstimo
        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);


    }
}
