//https://github.com/acenelio/inheritance2-java
package entidades;

public class ContaPoupanca extends Conta {
    private Double taxaDeJuros;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(Integer numeroConta, String titular, Double saldo, Double taxaDeJuros) {
        super(numeroConta, titular, saldo);
        this.taxaDeJuros = taxaDeJuros;

    }

    public Double getTaxaDeJuros() {

        return taxaDeJuros;
    }

    public void setTaxaDeJuros(Double taxaDeJuros) {

        this.taxaDeJuros = taxaDeJuros;
    }

    public void AtualizarSaldo(){
        saldo += saldo * taxaDeJuros;

    }
    @Override
    public void sacar(Double valor){
         saldo = saldo - valor;
    }
}
