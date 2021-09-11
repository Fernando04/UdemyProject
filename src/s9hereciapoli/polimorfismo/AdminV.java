package s9hereciapoli.polimorfismo;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class AdminV {
    private ArrayList<ObjetoGrafico> listaFiguras;

    public AdminV(){
        listaFiguras = new ArrayList<ObjetoGrafico>();
        listaFiguras.add(new BalaPlata("BalaPlata 1"));
        listaFiguras.add(new BalaPlata("BalaPlata 2"));
        listaFiguras.add(new BalaPlata("BalaPlata 3"));
        listaFiguras.add(new BalaPlata("BalaVerde 1"));
        listaFiguras.add(new Zombie("Zombie 1"));
        listaFiguras.add(new Zombie("Zombie 2"));
        listaFiguras.add(new Zombie("Zombie 3"));
        listaFiguras.add(new BalaPlata("BalaVerde 1"));

        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                moverFiguras();
            }
        };
        Timer t = new Timer();
        t.schedule(tt,0,5000);
    }
    public void moverFiguras(){
        for (ObjetoGrafico og: listaFiguras ) {
            og.mover();
        }
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        AdminV admin = new AdminV();
    }
}
