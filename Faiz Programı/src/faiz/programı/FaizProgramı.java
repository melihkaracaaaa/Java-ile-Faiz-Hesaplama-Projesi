
package faiz.programi;

import java.util.Scanner;

public class FaizProgrami {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamiza Hosgeldiniz... (Faiz oranimiz %6) ");
        
        int anapara,vade;
         
        System.out.print("Yatirmak İstediginiz Tutar :");
        anapara = scanner.nextInt();
        System.out.print("Kac Yil Vade İstiyorsunuz :");
        vade = scanner.nextInt();
        double toplampara =anapara;
        double faizoranı = 0.06 ;
        
        for (int i = 1 ; i <= vade ; i++) {
            
            toplampara = (anapara * faizoranı) + toplampara;
            System.out.println(i + ".Yilin Sonunda : " + "$   " + toplampara  );
            
        }
        
    }
    
}
