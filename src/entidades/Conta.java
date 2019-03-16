
//https://github.com/acenelio/inheritance2-java
package entidades;

public class Conta {

    private Integer numeroConta;
    private String titular;
    protected double saldo;

    public Conta(){}

    public Conta(Integer numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(Double valor){
        saldo -= valor +5 ;
    }

    public void depositar(Double valor){
        saldo += valor;
    }

}
