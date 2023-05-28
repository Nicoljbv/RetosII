import java.util.Scanner;

public class RetoV {
    public static void main(String[] args) {

        // Declarar variables para almacenar las posiciones que quiere descubrir el
        // usuario y para almacenar la respuesta
        int fila1U, col1U, fila2U, col2U;
        String respuesta;

        // Declarar matriz para almacenar los simbolos
        int concentrate[][] = new int[4][4];

        // Instanciar la clase scanner para capturar los simbolos
        Scanner leer = new Scanner(System.in);

        // Llenar la matriz (algunas posiciones con simbolos iguales)
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.println("Ingrese un simbolo en la posición " + f + "" + c);
                concentrate[f][c] = leer.nextInt();
            }
        }

        // Iniciar ciclo do-while
        do {

            // Solicitar al usuario la posición que quiere adivinar y capturar
            System.out.println("¿Qué posiciones quiere descubrir?");
            System.out.println("Ingrese la primera posición: \nFila:");
            fila1U = leer.nextInt();
            System.out.println("Columna:");
            col1U = leer.nextInt();

            System.out.println("Ingrese la segunda posición: \nFila:");
            fila2U = leer.nextInt();
            System.out.println("Columna:");
            col2U = leer.nextInt();

            // Evaluar si el simbolo de las posiciones ingresadas por el usuario son iguales
            if (concentrate[fila1U][col1U] == concentrate[fila2U][col2U]) {
                System.out.println("Felicidades, las posiciones tienen el mismo simbolo");
            } else {
                System.out.println("Lo siento, las posiciones tienen simbolos diferentes");
            }

            // Recorrer y mostrar matriz
            for (int f = 0; f < 4; f++) {
                for (int c = 0; c < 4; c++) {

                    // Evaluar si el simbolo de las posiciones ingresadas por el usuario son iguales
                    if (concentrate[fila1U][col1U] == concentrate[fila2U][col2U]) {
                        // Si la posición f-c es igual a la posición que el usuario ingreso se imprime
                        // el simbolo que corresponde
                        if ((f == fila1U) && (c == col1U)) {
                            System.out.print(concentrate[f][c] + "\t");
                        } else if ((f == fila2U) && (c == col2U)) {
                            System.out.print(concentrate[f][c] + "\t");
                            // si no es igual se remplazan los simbolos por guiones
                        } else {
                            System.out.print("- \t");
                        }
                    } else {
                        System.out.print("- \t");
                    }
                }
                System.out.println();
            }

            // Preguntar al usuario si quiere volver a jugar
            System.out.println("Desea jugar de nuevo");
            respuesta = leer.next();

            // Evaluar respuesta del usuario
        } while (respuesta.equals("si"));
    }

}
