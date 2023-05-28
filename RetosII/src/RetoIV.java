import java.util.Scanner;

public class RetoIV {
    public static void main(String[] args) {
        
        //Instanciar la clase scanner para capturar el nombre y precio de los productos 
        Scanner captura = new Scanner(System.in);

        //Declarar matriz 4x4 para almacenar 16 productos
        String producto [][] = new String [4][4];

        //Solicitar y capturar dentro de la matriz 
        for(int f=0; f<4; f++){
            for(int c=0; c<4; c++){
                System.out.println("Ingrese el nombre y precio del producto en la posición "+f +" "+c);
                producto[f][c]=captura.next();
            }
        }

        for(int f=0; f<4; f++){
            for(int c=0; c<4; c++){
                System.out.print(f+""+c +":"+producto[f][c]+"\t \t");
            }
            System.out.println();
        }
    }

    
}
