/**
*
* @author Muhammed Erdinç(muhammed.erdinc@ogr.sakarya.edu.tr) Caner Sabitoğulları(caner.sabitogullari2@ogr.sakarya.edu.tr)
* @since 9.05.18
* <p>
* Bu sınıfta Mainden parametre olarak gönderilmiş biginteger sayılar seri olarak hesaplanmıştır.
* </p>
*/
package pdpodev4;

import java.io.IOException;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SeriHesaplama {

    public SeriHesaplama(BigInteger sayi1, BigInteger sayi2) {
        long TimerStart = System.nanoTime();
        long basamak = 0;
        BigInteger carpimIslemininSonucu1 = new BigInteger("0");
        BigInteger toplamaIslemininSonucu1 = new BigInteger("0");
        String sayi2_str = sayi2.toString();
        char[] karakter = sayi2_str.toCharArray();
        for (int i = 0; i < karakter.length; i++) {
            basamak = Long.valueOf(String.valueOf(karakter[i]));
            carpimIslemininSonucu1 = sayi1.multiply(BigInteger.valueOf(basamak));
            toplamaIslemininSonucu1 = toplamaIslemininSonucu1.add(carpimIslemininSonucu1);

        }
        long TimerFinish = System.nanoTime();
        System.out.println("Seri Hesaplama Süresi :" + (TimerFinish - TimerStart) / 1000000.0);
       
        try {
            MetinBelgesineKayit.Kayit(toplamaIslemininSonucu1);
        } catch (IOException ex) {
            Logger.getLogger(SeriHesaplama.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}
