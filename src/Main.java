public class Main {
    public static void main(String[] args) {

        int i = 0 ,fatorial = 1, fib=0, fibo=1, ant = 0;
        //Ex. 1
        for(i=100;i<=200;i++)
        {
            System.out.println("Num: " + i);
        }
        //Ex.2
        for(i=1;i<=1000;i++)
        {
            if(i % 2 == 0)
            {
                System.out.println("Num par: " + i);
            }
        }
        //Ex. 3
        for(i=1;i<=100;i++)
        {
            if (i % 5 == 0)
            {
                System.out.println("Num div por 5: " + i);
            }
        }
        //Ex. 4
        for(i=1;i<=6;i++)
        {
            fatorial*=i;
            System.out.println("Fatorial de " + i + " : " + fatorial);
        }
        //Ex. 5
        while(fib < 50)
        {
            fib = fibo + ant;
            System.out.println(fib);
            ant = fibo;
            fibo = fib;
        }
    }
}