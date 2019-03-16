//https://github.com/acenelio/inheritance2-java

//velocinautas
// dilatação temporal
package aplicacao;

import entidades.Conta;
import entidades.ContaEmpresarial;
import entidades.ContaPoupanca;

public class App {
    public static void main(String[]args){

        Conta c = new Conta(1001, "Alex", 0.0);
        ContaEmpresarial cn = new ContaEmpresarial(1002, "Maria", 0.0, 500.0);

        //UPCASTING ( casting da subclasse pra superclasse)
        Conta c1 = cn;
        Conta c2 = new ContaEmpresarial(1003, "Bob", 0.0, 200.0);
        Conta  c3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);

        //DOWNCASTING (casting da superclasse pra subclasse)
        ContaEmpresarial c4 = (ContaEmpresarial)c2;
        c4.depositar(100.0);

        // ContaEmpresarial c5 = (ContaEmpresarial)c3; não pode criar uma contaPoupanca a partir de uma contaDeNegocio
        // obs: só da erro quando compila
        //resolve isso com istanceof

        if(c3 instanceof ContaEmpresarial){
            ContaEmpresarial c5 = (ContaEmpresarial) c3;
            c5.emprestimo(200.0);
            System.out.println("Emrestimo realizado!");
        }
        if(c3 instanceof ContaPoupanca){
            ContaPoupanca c5 = (ContaPoupanca) c3;
            c5.AtualizarSaldo();
            System.out.println("Saldo atualizado!");
        }

        Conta conta1 = new Conta(01, "Alex Junior", 1000.0);
        conta1.sacar(200.0);
        System.out.println(conta1.getSaldo());

        Conta conta2 = new ContaPoupanca(01, "Maria Mariaa",  1000.0, 0.01);
        conta2.sacar(200.0);
        System.out.println(conta2.getSaldo());

    }
}
