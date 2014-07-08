/*
 *  This software is designed for Unit Electric
 *  Contact seckin.celik@unitelektrik.com.tr
 * 
 */

package TradeX;

/**
 *
 * @author seckin.celik
 */
import java.io.*;  
import javax.swing.*;  
public class fileChoose {  
    public File targetFile;  
    public File newFile(String file) {  
        targetFile = new File(file);  
        return targetFile;  
    }  
    public File chooseTargetFile() {  
        JFileChooser chooser = new JFileChooser();  
        if (targetFile != null) {  
            chooser.setSelectedFile(targetFile);  
        } else {  
            chooser.setSelectedFile(newFile("default.xls"));  
        }  
        int option = chooser.showSaveDialog(null);  
        if (option == JFileChooser.APPROVE_OPTION) {  
            targetFile = chooser.getSelectedFile();
            return (targetFile);
        }  
        else {
            return null;
        }
    }  
    
}  
