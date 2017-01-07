/**
 * Created by joaquin on 06/11/2016.
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConstructorJava {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        String programa, nombrePrograma;
        int respuestaEscaner = 0, respuestaFunciones = 0, numeroFunciones;
        String funciones [];

        System.out.println("########################");
        System.out.println("# Developed by Juaki97 #");
        System.out.println("# All rights  reserved #");
        System.out.println("########################");

        System.out.println("Inserte el nombre del programa: ");
        programa = input.next();
        nombrePrograma = programa + ".java";
        File fichero = new File(nombrePrograma);

        if (fichero.exists()){
            System.out.println("El programa ya existe. Compruébalo o cambia de nombre.");
        }else {

            BufferedWriter bw = new BufferedWriter(new FileWriter(nombrePrograma));

            while (respuestaEscaner != 1 && respuestaEscaner != 2) {
                System.out.println("Vas a utilizar el escaner?");
                System.out.println("1. Sí");
                System.out.println("2. No");
                respuestaEscaner = input.nextInt();
            }

            while (respuestaFunciones != 1 && respuestaFunciones != 2) {
                System.out.println("Vas a usar funciones?");
                System.out.println("1. Sí");
                System.out.println("2. No");
                respuestaFunciones = input.nextInt();
            }

            if(respuestaFunciones == 1){
                System.out.println("¿Cuántas?");
                numeroFunciones = input.nextInt();

                funciones = new String[numeroFunciones];

                for (int i = 0; i < funciones.length; i++) {
                    System.out.println("Introduzca nombre de la función: ");
                    funciones[i] = input.next();
                }

                if (respuestaEscaner == 1) {
                    bw.write("import java.util.Scanner; \npublic class " + programa + "{ \n    public static void main(String[] args){ \n       Scanner input = new Scanner(System.in);\n     }\n");
                } else if (respuestaEscaner == 2) {
                    bw.write("public class " + programa + "{ \n    public static void main(String[] args){ \n    } \n");
                }

                if (respuestaFunciones == 1){
                    for (int i = 0; i < numeroFunciones; i++) {
                        bw.write("    static void " + funciones[i] + "{ /*Insert your code here*/ } \n");
                    }
                    bw.write("\n}");
                    bw.close();
                }
            }else{
                if (respuestaEscaner == 1) {
                    bw.write("import java.util.Scanner; \npublic class " + programa + "{ \n    public static void main(String[] args){ \n       Scanner input = new Scanner(System.in);\n     }\n");
                    bw.write("\n}");
                    bw.close();
                } else if (respuestaEscaner == 2) {
                    bw.write("public class " + programa + "{ \n    public static void main(String[] args){ \n    } \n");
                    bw.write("\n}");
                    bw.close();
                }
            }
        }
    }
}