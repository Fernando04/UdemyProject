package seccionv;

import javax.swing.*;
import java.awt.*;

public class ClaseFigura extends JPanel {
    private int opcion;
    //Contructor de la clase figura
    public ClaseFigura (int opcionUsuario){
    opcion = opcionUsuario;
    }

    public void paintComponet(Graphics g){
        super.paintComponent(g);

        for (int i = 0; i< 10; i++){

            switch (opcion){
                case 1:
                    int xRec = 10 + i * 10;
                    int yRec = 10 + i * 10;
                    int anchoRec = 50 + i *10;
                    int altoRec = 50 + i *10;
                    g.drawRect(xRec,yRec,anchoRec,altoRec);
                    break;
                case 2:
                    //ovalos
                    int xOva = 10 + i * 10;
                    int yOva = 10 + i * 10;
                    int anchoOva = 50 + i *10;
                    int altoOva = 50 + i *10;
                    g.drawOval(xOva,yOva,anchoOva,altoOva);
                    break;
            }
        }
    }
}
