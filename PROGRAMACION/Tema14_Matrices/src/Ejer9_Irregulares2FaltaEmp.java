import java.util.Scanner;

public class Ejer9_Irregulares2FaltaEmp {
   static private Scanner teclado;
   static private String[] nombres;
   static private int[][] dias;
	
    public static void cargar() {
        teclado=new Scanner(System.in);
        nombres=new String[3];
        dias=new int[3][];
        for(int f=0;f<nombres.length;f++) {
            System.out.print("Ingrese el nombre del empleado:");
            nombres[f]=teclado.next();
            System.out.print("Cuantas días faltó el empleado:");
            int faltas=teclado.nextInt();
            dias[f]=new int[faltas];            
            for(int c=0;c<dias[f].length;c++) {
                System.out.print("Ingrese nro de día:");
                dias[f][c]=teclado.nextInt();
            }
        }
    }
    
    public static void inasistencias() {
        for(int f=0;f<nombres.length;f++) {
            System.out.println(nombres[f] + " faltó " + dias[f].length + " días");
        }
    }
    
    public static void empleadoMensosFaltas() {
        int faltas=dias[0].length;
        String nom=nombres[0];
        for(int f=1;f<dias.length;f++) {
            if (dias[f].length<faltas) {
                faltas=dias[f].length;
                nom=nombres[f];
            }
        }
        System.out.println("El empleado que faltó menos es "+nom+" con "+faltas+" faltas.");
    }
    
    public static void main(String[] ar) {
        cargar();
        inasistencias();
        empleadoMensosFaltas();
    } 

}
