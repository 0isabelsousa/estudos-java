import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String continuar = "sim";
        double totalVendidoNoDia = 0; // Nossa variável acumuladora

        while (continuar.equalsIgnoreCase("sim")) {
            System.out.println("\n--- CARDÁPIO DA LANCHONETE ---");
            System.out.println("1 - Coxinha (R$ 5.00)");
            System.out.println("2 - Pastel (R$ 7.00)");
            System.out.println("3 - Refrigerante (R$ 4.50)");
            System.out.print("Escolha o número do item: ");
            
            int escolha = leitor.nextInt();
            double precoItem = 0;

            // O switch é como um cardápio inteligente
            switch (escolha) {
                case 1: precoItem = 5.00; break;
                case 2: precoItem = 7.00; break;
                case 3: precoItem = 4.50; break;
                default: 
                    System.out.println("Opção inválida! Vamos considerar R$ 0.00");
            }

            System.out.println("Preço do item: R$ " + precoItem);
            System.out.print("Quanto dinheiro o cliente entregou? ");
            double meuDinheiro = leitor.nextDouble();

            if (meuDinheiro >= precoItem) {
                double troco = meuDinheiro - precoItem;
                System.out.println("Venda realizada! Troco: R$ " + troco);
                totalVendidoNoDia += precoItem; // Soma o valor ao total do dia
            } else {
                System.out.println("Dinheiro insuficiente! Venda cancelada.");
            }

            System.out.println("\nDeseja atender outro cliente? (sim/nao)");
            continuar = leitor.next();
        }

        // Quando sair do loop, mostramos o faturamento total
        System.out.println("\n--- RELATÓRIO FINAL ---");
        System.out.println("Total faturado hoje: R$ " + totalVendidoNoDia);
        System.out.println("Expediente encerrado. Ate logo!");
        leitor.close();
    }
}