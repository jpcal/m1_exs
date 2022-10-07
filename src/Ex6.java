import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args)
    {
        Scanner ler = new Scanner (System.in);
        int numero=0,i=0;
        boolean primo = true;
        System.out.println("Digite um numero maior do que 1: ");
        numero = ler.nextInt();
        for (i = 2; i < numero; i++)
        {
            if (numero % i == 0)
            {
                primo = false;
            }
        }
        if(primo)
        {
            System.out.println("O numero é primo!");
        }
        else
        {
            System.out.println("O numero não é primo!");
        }

    }
}
