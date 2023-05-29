
package fitocontrol.ui;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import view.Menu;

public class FitoControlUI {

      public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
         Menu frame = new Menu();
         frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Datos Windar\\ProyectoFitoControl\\FitoControl\\fitoControl.UI\\src\\Imagen\\viñas.jpg")))));
         frame.setVisible(true);
         frame.setTitle("Fito Control...");
           
    }
    
}
