package tugas.pkg3;
import java.util.Scanner;
/**
 *
 * @author Rifki
 */
public class Tugas3 {

   static boolean data (String data, String cari){
        boolean datat1=false;
        if (data.equalsIgnoreCase(cari)){
            datat1 = true;
        }else if(data.equalsIgnoreCase(cari)){
            datat1 = true;
        }
        return datat1;
    }
     public static void main(String[] args) {
   {
        Scanner input = new Scanner  (System.in);
        String cari;
        String []data=new String [2];
        data[0] = "bisection";
        data[1] = "secant";
        
        System.out.print("Masukan (bisection/secant) : ");
        cari = input.next();
        
        for (int i=0; i<=1; i++){
            if (data(data[i], cari) == true){
                System.out.println("\nData DITEMUKAN");
                System.out.println("kata : "+cari);
                i+=5;
            }else if(i==1){
                System.out.println("\nData TIDAK ditemukan");
                System.out.println("kata : "+cari);
              
            }
        }
        
            
            
    }
} }
    

