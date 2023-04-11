public class Principal {
    
    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(1713);
        conta.setTitular("Renan Costa Leão");
        conta.setSaldo(100);

        System.out.println("Saldo atual: "+conta.getSaldo());

        conta.depositarValor(500);

        System.out.print("Saldo atual: "+conta.getSaldo());

        conta.sacarValor(700);
        System.out.print("Saldo atual: "+conta.getSaldo());
    }
}
