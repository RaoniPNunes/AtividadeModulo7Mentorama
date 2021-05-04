
package banco;

import java.util.Date;


public class ContaPoupanca extends Conta{
    
    public double taxadejuros;
    public int dataAniversario;
    public int data;

    public ContaPoupanca(int dataAniversario, String nome, int agencia, int conta) {
        super(nome, agencia, conta);
        this.taxadejuros = 0.05;
        this.dataAniversario = dataAniversario;
    }

    

    public double getTaxadejuros() {
        return taxadejuros;
    }

    public void setTaxadejuros(double taxadejuros) {
        this.taxadejuros = taxadejuros;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getAgencia() {
        return agencia;
    }

    @Override
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    @Override
    public int getConta() {
        return conta;
    }

    @Override
    public void setConta(int conta) {
        this.conta = conta;
    }     

    @Override
    public double getSaldo() {
    
        if(this.data >= this.dataAniversario ){
           saldo += this.saldo*this.taxadejuros;
       }
       else{
           saldo = this.saldo; 
       }
       return saldo;    }
        
    
}
