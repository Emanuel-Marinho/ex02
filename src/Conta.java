public class Conta {
    public String cpf;
    public int banco;
    public double saldo;
    public boolean correntistaEspecial;

    public double bonificarCorrentista() {
        if(correntistaEspecial) {
            return this.saldo + (this.saldo * 0.10);
        } else {
            return this.saldo + (this.saldo * 0.05);
        }
    }

    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
            System.out.println("Saque feito com sucesso!");
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito feito com sucesso!");
    }

    public void transferir(Conta outraConta, double valor) {
        if(valor > this.saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
            outraConta.saldo += valor;
            System.out.println("Transferência realizada com sucesso!");
        }
    }

    public void mostrarAtributos() {
        System.out.println("Cpf: " + this.cpf + "\nBanco: " + this.banco + "\nSaldo: "  + this.saldo);
    }
}
