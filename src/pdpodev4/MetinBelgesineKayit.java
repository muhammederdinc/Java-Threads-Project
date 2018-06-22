/**
*
* @author Muhammed Erdinç(muhammed.erdinc@ogr.sakarya.edu.tr) Caner Sabitoğulları(caner.sabitogullari2@ogr.sakarya.edu.tr)
* @since 9.05.18
* <p>
* Bu sınıfta MEtin belgesine kayıt işlemi  gerçekleştirilmiştir. 
* </p>
*/
package pdpodev4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

/**
 *
 * @author MuhammedErdinc
 */
public class MetinBelgesineKayit {
    
   public static void Kayit(BigInteger deger) throws IOException {
    
        
        String str = deger.toString();

        File file = new File("Sonuc.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.write(str);
        bWriter.newLine();
        bWriter.close();
        
        
    }
    
    
}
