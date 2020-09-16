package sandy;

import java.util.Scanner;
/**
 *
 * @author DLSAS
 */
public class opera {
    
 Scanner entrada = new Scanner (System.in);
 String nombrep;
 double  precioinicial;
 double  iva =0.16 ;
    
    
 public void mostrar(){
 //imprimimos en consola lo de pedir datos  
 System.out.println("Numeros con punto decimal es necesario ponerlos con coma");       
 System.out.println("Ingrese el Nombre  del producto");  
 nombrep=entrada.nextLine();
 System.out.println("Ingrese el Precio inicial");
 precioinicial=entrada.nextDouble();

 
 }


 public void multipliacion(){
      
      preciofinal= precioinicial + iva;
   
      
       System.out.println("El nombre del producto es :" + nombrep);
      System.out.println("El precio final del producto :" + preciofinal);
    
   System.out.println("Sin  el  IVA :" + precioinicial);
   
  }

      
  public double preciofinal;
  public double preciofinall;
   
   
}
