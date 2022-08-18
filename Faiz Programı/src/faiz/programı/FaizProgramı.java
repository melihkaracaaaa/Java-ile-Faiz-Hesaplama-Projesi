
package faiz.programı;

import java.util.Scanner;

public class FaizProgramı {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza Hoşgeldiniz... (Faiz oranımız %6) ");
        
        int anapara,vade;
         
        System.out.print("Yatırmak İstediğiniz Tutar :");
        anapara = scanner.nextInt();
        System.out.print("Kaç Yıl Vade İstiyorsunuz :");
        vade = scanner.nextInt();
        double toplampara =anapara;
        double faizoranı = 0.06 ;
        
        for (int i = 1 ; i <= vade ; i++) {
            
            toplampara = (anapara * faizoranı) + toplampara;
            System.out.println(i + ".Yılın Sonunda : " + "$   " + toplampara  );
            
        }
        
    }
    
}
