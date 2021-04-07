
/** * Elaborar un algoritmo que lea la cantidad de dólares que se va a 
 * comprar y el tipo de cambio en pesos(costo de dólar en pesos).
 * Calcular e imprimir la cantidad que se debe pagar en pesos por la
 * cantidad de dólares indicada.
 */
import java.util.Scanner;

public class Ejercicio12 {
   // #region Variables
   public static double tipoCambio;
   public static double dollar;
   public static double pesos;
   public static double cDolares;

   public static Scanner input = new Scanner(System.in);
   // #endregion
   /** Método para calcular el costo.
    * 
    * @param cambio       Equivalente de pesos al dólar.
    * @param cantDollares Cantidad de dolares que se desean adquirir.
    * 
    */
   public static double CalculaDolares( double cantDollares, double cambio) throws Exception {
      tipoCambio = cambio; // set tipo de cambio ingresado.
      pesos = tipoCambio * cantDollares;
      return pesos;
   }
   public static void main(String[] args) {
      Boolean bandera = false;
      String sBandera ="";//Esta variable se usa para la entrada de texto. 
      do {
        System.out.printf("\n.-Calculo terminado:|:<<¿Desea salir? (Si/No)>>:");
         sBandera = input.nextLine();
         
         if(sBandera.equals("SI") || sBandera.equals("si") || sBandera.equals("Si") || sBandera.equals("sI") || sBandera.equals("s") || sBandera.equals("S")){
           bandera=true;
         }
         if(sBandera.equals("NO") || sBandera.equals("no") || sBandera.equals("No") || sBandera.equals("nO") || sBandera.equals("n") || sBandera.equals("N")){
            System.out.println(" \n");
            System.out.println(":v");
         }
      } while (bandera==false);

     /*
      try{
            System.out.printf("\n _-***** Conversion de dolares a pesos *****-_ \n");
            System.out.print("\n .-# Ingrese el tipo de cambio del día: ");
            tipoCambio = input.nextDouble();
            System.out.println("\n --- Tipo de cambio: $" + tipoCambio +" ---");
            System.out.print("\nIngrese la cantidad de dolares a adquirir: ");
            cDolares = input.nextDouble();
            System.out.println("Cantidad de dolares: $" + cDolares+ " dolares a cambiar.");
            pesos = CalculaDolares(cDolares, tipoCambio);
            System.out.println("\n Total a pagar en mxn es de : $" + pesos + " pesos.");
      }catch(Exception ex){
         System.out.println("Error: " +  ex.getMessage());
      } 
      input.close();
      */
   } 
}
