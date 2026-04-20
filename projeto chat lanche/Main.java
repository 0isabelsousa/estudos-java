import java.util.Scanner;

public class Main { 
    public static void main (String [] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.println ("Olá, qual e o seu nome?");
        String nome = leitor.next();
        
        System.out.println ("Prazer em te conhecer, " + nome + "!");
        
        System.out.println("Quanto dinheiro voce tem?");
        double meuDinheiro = leitor.nextDouble();
        
        
        System.out.println ("Qual o preço do lanche?");
        double precoLanche = leitor.nextDouble();
        
        if (meuDinheiro >= precoLanche) {
            double troco = meuDinheiro - precoLanche;
            System.out.println ("muito bem," + nome + "! Lanche comprado.");
            System.out.println ("Seu troco é:" + troco);
        }else{
            double falta = precoLanche - meuDinheiro;
            System.out.println("poxa," + nome + ", o dinheiro não deu");
            System.out.println("Faltam R$" + falta + "para completar");
        }
        leitor.close();
        
        
    }
}