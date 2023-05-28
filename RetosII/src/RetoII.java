import java.util.Scanner;

public class RetoII {

    public static void main(String[] args) {
        //Declarar variables 
        int compe;

        //Instanciar la clase scanner para capturar el número de jugadores
        Scanner captura = new Scanner(System.in);

        //Solicitar el número de jugadores
        System.out.println("Bienvenido. Ingrese el número de jugadores que participaron en la competencia");
        compe=captura.nextInt();

        //Declarar arrays para tiempo y nombres de los jugadores 
        double tiempoJ []= new double[compe];
        String nombreJ [] = new String[compe];
        
        //Solicitar el nombre y tiempo de cada jugador 
        for(int i=0; i<compe; i++){
            System.out.println("Ingrese el nombre del jugador #"+(i+1));
            nombreJ[i]=captura.next();
            System.out.println("Ingrese el tiempo del jugador #"+(i+1));
            tiempoJ[i]=captura.nextDouble();
        }

        System.out.println("nombre    |    tiempo");
        for(int i=0; i<compe; i++){
            System.out.println(nombreJ[i]+"\t \t"+tiempoJ[i]);

        }

        //Se organiza el tiempo de manor a mayor para hallar el ganador
        for(int i = 0; i < compe - 1; i++){//num-1 para asegurarse que no se evalue la variable i con una posición que se encuentra fuera del límite del array
            for(int j = 0; j < compe - i - 1; j++){
                if(tiempoJ[j] > tiempoJ[j+1]){//Si el tiempo que esta en la posición j es mayor al tiempo que esta en la posición j+1
                    double gana = tiempoJ[j];//En la variable gana se guarda el tiempo que esta en la posición j
                    tiempoJ[j] = tiempoJ[j+1];//A la posición j se le asigna el tiempo que esta en la posición j+1
                    tiempoJ[j+1] = gana;//A la posición j+1 se le asigna el valor que se guardo en la variable gana
                }
            }
        }
        
        //Mostrar ganador 
        System.out.println("El ganador es el jugador que tuvo el menor tiempo: "+tiempoJ[0]);
       

       
    }
    
}
