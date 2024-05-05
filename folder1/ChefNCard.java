package Codechef;

import java.util.Scanner;

public class ChefNCard {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t= s.nextInt();
        int cpow, mpow;
        for (int i=0 ; i<t ; i++){
            int c=0, m=0;
            int n= s.nextInt();
            while(n > 0){
                int chef= s.nextInt();
                int morty= s.nextInt();


                if(chef < 0 ){
                    cpow= chef;
                }else{
                    cpow= power(chef);
                }

                if(morty < 0){
                    mpow= morty;
                }else{
                    mpow= power(morty);
                }

                if(cpow > mpow){
                    c++;
                }else{
                    m++;
                }

                n--;
            }

            if(c == m){
                //draw
                System.out.println("2 " + a);
            }else if(c > m){
                System.out.println("0 " + a);
            }else{
                System.out.println("1 " + b);
            }
        }
    }

    public static int power(int m){
        int n, sum = 0;
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        return sum;
    }
}
