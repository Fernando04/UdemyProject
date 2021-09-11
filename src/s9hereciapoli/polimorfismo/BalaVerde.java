package s9hereciapoli.polimorfismo;

public class BalaVerde extends ObjetoGrafico {

    String nombre;

    public BalaVerde (String nom){
        nombre = nom;
    }

    @Override
    public void mover(){
        System.out.println("Movimiento de BalaVerde Yo me llamo" + nombre);
    }
}
