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
        int respuestaEscaner = 0;

        System.out.println("Inserte el nombre del programa: ");
        programa = input.next();
        nombrePrograma = programa + ".java";
        File fichero = new File(nombrePrograma);

        if (fichero.exists()){
            System.out.println("El programa ya existe. Compruébalo o cambia de nombre.");
            System.exit(0);
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(nombrePrograma));

        while(respuestaEscaner != 1 && respuestaEscaner !=2){
            System.out.println("Vas a utilizar el escaner?");
            System.out.println("1. Sí");
            System.out.println("2. No");
            respuestaEscaner = input.nextInt();
        }

        if(respuestaEscaner == 1){
            bw.write("import java.util.Scanner; \n" + "public class " + programa + "{ \n" + "public static void main(String[] args){ \n" + "Scanner input = new Scanner(System.in); \n" + "} \n" + "}" );
            bw.close();
        }else if(respuestaEscaner == 2){
            bw.write("public class " + programa + "{ \n public static void main(String[] args){ \n } \n }" );
            bw.close();
        }
    }
}