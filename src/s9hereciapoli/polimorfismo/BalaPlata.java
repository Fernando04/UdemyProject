package s9hereciapoli.polimorfismo;

public class BalaPlata  extends  ObjetoGrafico {

    String nombre;

    public BalaPlata (String nom){
        nombre = nom;
    }

    @Override
    public void mover(){
        System.out.println("Movimiento de BalaPlata Yo me llamo" + nombre);
    }
}
