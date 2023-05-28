import java.util.Scanner;

public class RetoI {
    public static void main(String[] args) {

        //Declarar variables 
        int nota;
        double promedio=0, suma=0;

        //Instanciar la clase scanner para capturar el número de notas a evaluar 
        Scanner captura = new Scanner(System.in);

        //Solicitar número de notas a ingresar 
        System.out.println("Bienvenido\n¿Cuántas notas va a ingresar?");
        nota=captura.nextInt();

        //Declarar el array para almacenar el valor de cada nota
        int notaFinal [] = new int [nota];

        //Solicitamos el valor de cada nota 
        for(int i=0; i<notaFinal.length; i++){
            System.out.println("Ingrese la nota #"+(i+1));
            notaFinal[i]=captura.nextInt();

            //Sumamos las notas 
            suma=suma+notaFinal[i];
        }

        //Calculamos el promedio dividiendo la suma de las notas con el número de notas ingresadas
        promedio=suma/nota;

        //Evaluamos el promedio
        if(promedio<3){
            System.out.println("Su promedio fue: "+promedio+" Reprobaste");
        }else if((promedio>=3) && (promedio<=4)){
            System.out.println("Su promedio fue: "+promedio+" Pasaste raspando");
        }else{
            System.out.println("Su promedio fue: "+promedio+" Aprobaste con buenos resultados");
        }
    }
    
}
