package com.mycompany.taller2;
import java.util.Scanner;

public class Taller2 {

Scanner leer = new Scanner (System.in);
double c1,c2,hipo =0;
    
    public void leer(){
    System.out.println("Digite el primer cateto: ");
    c1 = leer.nextDouble();
    System.out.println("Digite el segundo cateto: ");
    c2= leer.nextDouble();
}
    
    public void hipotenusa (){
     System.out.println("La hipotenusa del triangulo es: "+ Math.hypot(c1, c2));
}
    
    
    public static void main(String[] args) {
        
        Taller2 llamar = new Taller2();
        
        llamar.leer();
        llamar.hipotenusa();
        
    }
}
