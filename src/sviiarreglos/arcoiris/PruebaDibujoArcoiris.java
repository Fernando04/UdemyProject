package sviiarreglos.arcoiris;

import javax.swing.JFrame;

public class PruebaDibujoArcoiris extends JFrame {
    public static void main(String[] args) {
        DibujoArcoiris panel  = new DibujoArcoiris();
        JFrame aplicacion = new JFrame();
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(400,205);
        aplicacion.setVisible(true);


    }


}
