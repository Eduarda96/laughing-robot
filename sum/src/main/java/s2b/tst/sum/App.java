package s2b.tst.sum;

/**
 * Hello world!
 *
 */
import java.util.Scanner;


public class App{ 

    public static void main( String[] args ){
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Informe dois valores:");
    double a = entrada.nextDouble();
    double b = entrada.nextDouble();
    entrada.close();
    
    double r = Sum.sum(a, b);
    
    System.out.println("Total soma:"+r);
    	
    }
}
