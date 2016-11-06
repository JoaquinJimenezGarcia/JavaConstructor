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

        System.out.println("Inserte el nombre del programa: ");
        programa = input.next();
        nombrePrograma = programa + ".java";
        File fichero = new File(nombrePrograma);

        if (fichero.exists()){
            System.out.println("El programa ya existe.");
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(nombrePrograma));

        bw.write("public class " + programa + "{ \n public static void main(String[] args){ \n } \n }" );
        bw.close();
    }
}