/**
*
* @author Muhammed Erdinç(muhammed.erdinc@ogr.sakarya.edu.tr) Caner Sabitoğulları(caner.sabitogullari2@ogr.sakarya.edu.tr)
* @since 9.05.18
* <p>
* Bu sınıfta Mainden parametre olarak gönderilmiş biginteger sayılar paralel olarak hesaplanmıştır.
* </p>
*/
package pdpodev4;


import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParalelHesaplama {

    BigInteger ThreadSonuc1 = new BigInteger("0");
    BigInteger ThreadSonuc2 = new BigInteger("0");
   

    public ParalelHesaplama(BigInteger sayi1, BigInteger sayi2) {
        long TimerStart = System.nanoTime();

        String sayi2_str = sayi2.toString();
      char[] rakam = sayi2_str.toCharArray();

        Thread Thread1 = new Thread() {
            @Override
            public void run() {
                long basamak;
                BigInteger carpimIslemininSonucu1 = new BigInteger("0");
                BigInteger toplamaIslemininSonucu1 = new BigInteger("0");
                for (int k = 0; k < rakam.length / 2; k++) {
                    basamak = Long.valueOf(String.valueOf(rakam[k]));
                    carpimIslemininSonucu1 = sayi1.multiply(BigInteger.valueOf(basamak));
                    toplamaIslemininSonucu1 = toplamaIslemininSonucu1.add(carpimIslemininSonucu1);

                }
                ThreadSonuc1 = ThreadSonuc1.add(toplamaIslemininSonucu1);
            }

        };

        Thread Thread2 = new Thread() {
            @Override
            public void run() {
                long basamak;
                BigInteger carpimIslemininSonucu2 = new BigInteger("0");
                BigInteger toplamaIslemininSonucu2 = new BigInteger("0");
                for (int k = rakam.length / 2; k < rakam.length; k++) {
                    basamak = Long.valueOf(String.valueOf(rakam[k]));
                    carpimIslemininSonucu2 = sayi1.multiply(BigInteger.valueOf(basamak));
                    toplamaIslemininSonucu2 = toplamaIslemininSonucu2.add(carpimIslemininSonucu2);
                }
                ThreadSonuc2 = ThreadSonuc2.add(toplamaIslemininSonucu2);
            }
        };
       
           Thread1.start();
        Thread2.start();
        long TimerFinish = System.nanoTime();

       try {
            Thread1.join();
            Thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ParalelHesaplama.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Paralel Hesaplama Süresi:" + (TimerFinish - TimerStart) / 1000000.0);

     
        System.out.println("Sonuç Metin Belgesine Kayıt Edildi.");
        
    }
    
 
    
        
   

}
   