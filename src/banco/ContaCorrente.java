
package banco;


public class ContaCorrente extends Conta{
    
    double chequeespecial;

    public ContaCorrente(String nome, int agencia, int conta) {
        super(nome, agencia, conta);
        this.chequeespecial = 100;
    }

    public double getChequeespecial() {
        return chequeespecial;
    }

    public void setChequeespecial(double chequeespecial) {
        this.chequeespecial = chequeespecial;
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
        return this.saldo = saldo + getChequeespecial();
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
                
}
