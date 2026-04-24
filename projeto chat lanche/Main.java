import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        // Criamos uma variável para controlar a repetição
        String continuar = "sim"; 

        // O bloco abaixo vai se repetir enquanto 'continuar' for igual a "sim"
        while (continuar.equalsIgnoreCase("sim")) {
            
            System.out.println("\n--- NOVO ATENDIMENTO ---");
            System.out.println("Qual e o nome do cliente?");
            String nome = leitor.next();

            System.out.println(nome + ", quanto dinheiro voce tem?");
            double meuDinheiro = leitor.nextDouble();

            System.out.println("Qual o preco do lanche?");
            double precoLanche = leitor.nextDouble();

            if (meuDinheiro >= precoLanche) {
                double troco = meuDinheiro - precoLanche;
                System.out.println("Lanche comprado! Troco: R$ " + troco);
            } else {
                double falta = precoLanche - meuDinheiro;
                System.out.println("Dinheiro insuficiente. Faltam: R$ " + falta);
            }

            // PERGUNTA CHAVE: Aqui decidimos se o loop continua ou para
            System.out.println("\nDeseja atender outro cliente? (sim/nao)");
            continuar = leitor.next();
        }

        System.out.println("Expediente encerrado. Ate logo!");
        leitor.close();
    }
}