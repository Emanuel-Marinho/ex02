public class Main {
    public static void main(String[] args) throws Exception {
        Conta conta1 = new Conta();
        conta1.cpf = "123";
        conta1.banco = 1;
        conta1.saldo = 1000.0;
        conta1.sacar(2000.0);
        conta1.depositar(1000.0);
        conta1.mostrarAtributos();
        System.out.println(conta1.bonificarCorrentista());
        System.out.println("\n\n\n");
        Conta conta2 = new Conta();
        conta2.cpf = "234";
        conta2.banco = 2;
        conta2.saldo = 1000.0;
        conta2.correntistaEspecial = true;

        System.out.println(conta2.bonificarCorrentista());
        System.out.println("\n\n\n");
        System.out.println(conta1.saldo);
        System.out.println(conta2.saldo);
        conta1.transferir(conta2, 1000.0);
        System.out.println(conta1.saldo);
        System.out.println(conta2.saldo);

    }
}
