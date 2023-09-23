public class Clase {
    public static void main(String[] args) {

        int [][][] calendario = new int[1][6][4];

        

        System.out.println("=== Lectura de primer archivo ===");
        Lectura salones = new Lectura();
        salones.leerArchivos("salones.csv");

        System.out.println("=== Lectura de segundo archivo ===");
        Lectura cursos = new Lectura();
        cursos.leerArchivos("cursos.csv");


        calendario[0][0][0] = 7;

        
        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario[i].length; j++) {
                for (int k = 0; k < calendario[i][j].length; k++) {
                    if (calendario[i][j][k] != 0) {
                        calendario[i][j][k] = 0;
                    }
                    
                    System.out.print(calendario[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }
}
