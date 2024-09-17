import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        /*Process p = Runtime.getRuntime().exec("cmd /c DIR");

        System.out.println(p.pid());
        System.out.println(p.isAlive());

        Thread.sleep(200);
        p.destroy();
//hay que recoger el proceso simepre en la clase Process

        ProcessBuilder pw = new ProcessBuilder("Notepad.exe");
        Process nuevo = pw.start();
        System.out.println(nuevo.pid());*/


        // ejercicio 1

        //lanzar bloc
        /*try {
            Process process = Runtime.getRuntime().exec("Acrobat.exe");

            System.out.println("proceso lanzado con PID: " + process.pid());
            //espero a que termine el proceso
            process.waitFor();

            System.out.println("Procesi terminado con valor de retorno: " + process.exitValue());

            process.destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        //ejercicio 2


        /*try {
            Process p = Runtime.getRuntime().exec("cmd /c dir");

            //leer la salida de comando
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            PrintWriter writer = new PrintWriter(new FileWriter("output.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.println(line);//mostra en consola
                writer.println(line);//guardqat en archivo
            }

            reader.close();
            writer.close();

            p.waitFor();

        } catch (Exception e) {
            e.printStackTrace();

        }*/
        //ejercicio 3

       /* try {
            //con el process builder ejecuto el comando dir
            ProcessBuilder pb = new ProcessBuilder();

            //muestro el directorio de trabajo por defecto
            // (pasra comparar con el siguiente depsues el resultado)
            System.out.println("Directorio de trabaajo (por defecto ): " + pb.directory());

            //con esto obtengo la capeta temporal del sistema operativo
            String tempDir = System.getProperty("java.io.tmpdir");
            File tempDirectory = new File(tempDir);

            //cambio el direcotiro de trabajo al directorio temporal del sistema
            pb.directory(tempDirectory);

            //muestro ekl directorio una vez cambiado
            //(pasra comparar con el anterior depsues el resultado)
            System.out.println("Directorio (despues de cabiar): " + pb.directory());

            //configurar el comando a ejecutar (cmd con el argumento c/ dir)
            pb.command("cmd.exe", "/c", "dir");

            //inicio el proceso
            Process process = pb.start();

            process.waitFor();  // Esperar a que el proceso termine
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }*/

        //ejercicio 4

        try {
            // Definir el archivo de salida donde se guardará la salida del comando tree
            File outputFile = new File("tree_output.txt");

            // Crear el proceso para ejecutar PowerShell y redirigir la salida del comando "tree" al archivo
            ProcessBuilder pb = new ProcessBuilder("powershell.exe", "/c", "tree > " + outputFile.getAbsolutePath());

            // Iniciar el proceso
            Process process = pb.start();
            process.waitFor(); // Esperar a que el proceso termine

            // Abrir el archivo resultante en el Bloc de Notas
            ProcessBuilder notepad = new ProcessBuilder("notepad.exe", outputFile.getAbsolutePath());
            notepad.start();

            System.out.println("Se ha ejecutado el comando 'tree' y se ha abierto el Bloc de Notas con el resultado.");

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}