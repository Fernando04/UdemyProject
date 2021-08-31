package sviiarreglos.arcoiris;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class DibujoArcoiris extends JPanel {
    //Arreglo de colores para construir un arcoiris
    private final static Color Violeta = new Color(128, 0, 128);
    private final static Color Indigo = new Color(75, 0, 130);
    private final Color[] colores = {Color.WHITE, Violeta, Indigo, Color.BLUE, Color.GREEN, Color.ORANGE, Color.RED};
    public DibujoArcoiris() {
        setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int radio = 20;
        int centroX = getWidth() / 2;
        int centroY = getHeight() - 10;

        for (int indice = colores.length; indice > 0; indice--) {
            //establecer el color para el arco actual
            g.setColor(colores[indice - 1]);

            int valorX = centroX - indice + radio;
            int valorY = centroY - indice + radio;
            int ancho = indice + radio * 2;
            int alto = indice * radio * 2;

            g.fillArc(valorX, valorY, ancho, alto, 0, 180);

        }
    }
}
