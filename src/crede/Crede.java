import java.io.*;
import java.net.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

/**
 * Example program to list links from a URL.
 */
public class Crede {
    public static void main(String[] args) throws IOException {
        
        List <String> Web = new ArrayList <String>();

        String url = "http://www.crede.com.tr/Pages/default.aspx";

        Document doc = Jsoup.connect(url).get();
        Elements imports = doc.select("a[href$=.aspx]");

        for (Element link : imports) {
            String n= link.attr("abs:href");
            Web.add(n);
        }
            
            for (int i = 0; i < Web.size(); i++) {
                String a = Web.get(i).toString();
                URL crede_url = new URL(a);
                BufferedReader br = new BufferedReader(new InputStreamReader(crede_url.openStream()));
                String text = "";
                String ara="risk";
                Boolean bulundu;
               
                while (null != (text = br.readLine())) {
                    
                    if (bulundu=text.contains(ara))
        {
            try {
                    String filename= "CredeFile.txt";
                    FileWriter fw = new FileWriter(filename,true); 
                    fw.write(a+" adresinde '"+ara+"' kelimesi bulunmaktadır \r\n");
                    fw.close();
        }
            catch(IOException ioe)
        {
                    System.err.println("IOException: " + ioe.getMessage());
        }
       
    }}}
    
                 JOptionPane.showMessageDialog(null, "Proğram Çalışmayı Sonlandırdı", "Proğram Çalışmayı Sonlandırdı", JOptionPane.ERROR_MESSAGE);    
    }

}
