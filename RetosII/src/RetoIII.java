import java.util.Scanner;

public class RetoIII {

    public static void main(String[] args) {

        // Declarar variables
        int letra, intento;
        String l, pAdivinar = ""; //Variable palabra adivinar para almacenar las letras que el usuario adivine y comparar con la palabra

        // instanciar la clase scanner para capturar la palabra y los intentos
        Scanner captura = new Scanner(System.in);

        // Solicitar la palabra
        System.out.println("¿Cuántas letras tiene la palabra?");
        letra = captura.nextInt();

        // Declarar array para almacenar la palabra
        String palabra[] = new String[letra];

        // Llenar array con la palabra
        for (int i = 0; i < letra; i++) {
            System.out.println("Ingrese la letra #" + (i + 1));
            palabra[i] = captura.next();
        }

        // Solicitar número de intentos que tiene para adivinar la palabra
        System.out.println("Ingrese el número de intentos que tiene el usuario para adivinar la palabra");
        intento = captura.nextInt();

     

        // Inicializar palabra Adivinar con guiones bajos, para despues actualizar con la letra adivinada
        for (int i = 0; i < palabra.length; i++) {
            pAdivinar = pAdivinar+ "_";
        }
        
        // Instanciar la clase String Builder para construir el array en cadena
        StringBuilder construir = new StringBuilder();
        for (String p : palabra) {
            construir.append(p); //método append de la clase String Builder para agregar cada letra
        }
        String cadena = construir.toString();//método toString de la clase String Builer para convertir en cadena la letras ingresadas 
        
        // Evaluamos que el usuario tenga intentos disponibles 
        while (intento > 0) {
            //Solicitar al usuario una letra 
            System.out.println("Ingrese una letra");
            l = captura.next().toLowerCase();
        
            boolean lEncontrada = false;
        
            // Recorre el array y compara cada letra con la ingresada
            for (int i = 0; i < palabra.length; i++) {
                if (palabra[i].contains(l)) {
                    lEncontrada = true;
                    // Actualiza pAdivinar en la posición correspondiente
                    pAdivinar = pAdivinar.substring(0, i) + palabra[i] + pAdivinar.substring(i + 1);// se actualiza y se va contruyendo pAdivinar con las letras adivinadas y raya al piso
                    //substring método que devuelve una subcadena de la cadena principal 
                    //pAdivinar(0,1) lo que esta antes de la posición i
                    //palabra[i] letra que se encuentra en la posición i del array palabra
                    //pAdivinar(i+1) lo que esta después de la posición i
                }
            }
        
            //Evaluar y mostrar mensaje según adivine o no la letra
            if (lEncontrada==true) {
                System.out.println("La letra ingresada está presente en la palabra.");
            } else {
                System.out.println("La letra ingresada no está presente en la palabra.");
                //Si no adivina la letra se decrementan los intentos 
                intento--;
            }
        
            // Muestra las letras que ha adivinado
            System.out.println("Has adivinado: " + pAdivinar);
        
            // Valida si la palabra ya se ha adivinado completamente
            if (pAdivinar.equals(cadena)) {
                System.out.println("¡ADIVINASTE LA PALABRA!");
                return;
            }
        
            // Muestra cuántos intentos quedan
            System.out.println("Te quedan " + intento + " intentos");
        }

        if(intento==0){
            System.out.println("Lo siento perdiste");
        }

    }

}
