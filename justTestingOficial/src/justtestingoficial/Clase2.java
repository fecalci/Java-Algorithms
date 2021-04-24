package justtestingoficial;
import java.util.Scanner;


public class Clase2{
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int contador;
        int total;
        int seguir;     
        do{
            System.out.println("Ingrese un número");
            int num = lector.nextInt();
            System.out.println("Ingrese 1 para realizar un do-while, 2 para for o 3 para while");
            int opcion = lector.nextInt();   
           
            switch(opcion){
                case 1:
                    contador = 0;
                    do{
                        total = 0;
                        contador = contador + 1;
                        total = num * contador;
                        System.out.println(num + "x" + contador + "= " + total);
                    }
                    while(contador !=10);
                    break;

                case 2: 
                    for(int i = 1; i!=11;i++){
                        total = 0;
                        total = num * i;
                        System.out.println(num + "x" + i + "= " + total);                  
                    }
                    break;

                case 3:
                    contador = 0;
                    while(contador != 10){
                        total = 0;
                        contador = contador + 1;
                        total = num * contador;
                        System.out.println(num + "x" + contador + "= " + total);                       
                    }
                    break;
                default:
                    System.out.println("El número ingresado es incorrecto");
                    break;
            }
            
            System.out.println("Presione 1 para continuar, 0 para salir");
            seguir = lector.nextInt();
        
        }
        
        while(seguir == 1);
        System.out.println("Gracias por usar el sistema, hasta luego!");
            
    }
}
    

