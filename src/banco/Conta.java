
package banco;


public abstract class Conta {
    String nome;
    int agencia;
    int conta;
    double saldo;

    public Conta(String nome, int agencia, int conta) {
        this.nome = nome;
        this.agencia = agencia;
        this.conta = conta;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    public int getConta(){
        return conta;
    }
    
    public void setConta(int conta){
        this.conta = conta;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void sacar(double valor){
        saldo -= valor;
    }
    
    public void depositar(double deposito){
        saldo += deposito;
    }
    
   }
