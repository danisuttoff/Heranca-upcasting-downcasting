//https://github.com/acenelio/inheritance2-java
package entidades;

public class ContaDeNegocio extends Conta  {

    private Double limiteDeEmprestimo;

   public ContaDeNegocio(){
       super();
   }

    public ContaDeNegocio(Integer numeroConta, String titular, Double saldo, Double limiteDeEmprestimo){
            super(numeroConta, titular, saldo);
            this.limiteDeEmprestimo = limiteDeEmprestimo;

    }

    public Double getLimiteDeEmprestimo() {
        return limiteDeEmprestimo;
    }

    public void setLimiteDeEmprestimo(Double limiteDeEmprestimo) {
        this.limiteDeEmprestimo = limiteDeEmprestimo;
    }

    /*  public void emprestimo(Double valor){


      if(valor <= limiteDeEmprestimo){
                depositar(valor);
    }*/

    public void emprestimo(Double valorEmpres){
        if(valorEmpres <= limiteDeEmprestimo){
            //saldo += valorEmpres - 10.0;
            Double vt = getSaldo();
            vt += valorEmpres -10.0;

        }
    }

   }

