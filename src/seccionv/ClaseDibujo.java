package seccionv;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ClaseDibujo {
    public static void main(String[] args) {
        //Preguntar al usuario
        String entrada = JOptionPane.showInputDialog("Escriba una 1 para dibujar rectangulos\n Escriba 2 para ovalos");
        int opcionUsuario = Integer.parseInt(entrada);
        ClaseFigura objFigura = new ClaseFigura(opcionUsuario);
        //Objeto Frame VENTANA
        JFrame ventana = new JFrame();
        ventana.add(objFigura);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 300);
        ventana.setVisible(true);
    }
}
