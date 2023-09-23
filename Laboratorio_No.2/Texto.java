import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Texto {

    private BufferedReader lector;
    private String linea;
    private String partes[] = null;

    public void leerArchivos(String nombreArchivo) {
        try {
            lector = new BufferedReader(new FileReader(nombreArchivo));
            while ((linea = lector.readLine()) != null) {
                partes = linea.split(",");
                imprimirLinea();
                System.out.println("");

            }
            lector.close();
            linea = null;
            partes = null;

        } catch (Exception e) {
            System.out.println("No se ha encontrado el archivo!!" + " " + e);
        }
    }

    public void imprimirLinea() {
        System.out.println(partes[1]);
    }
}
