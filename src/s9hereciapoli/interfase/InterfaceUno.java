package s9hereciapoli.interfase;

public interface InterfaceUno {
    int valor = 10;
    public void suma();
    public void resta();
}
//Esta interfase no puede heredar de una clase concreta
//en este caso no podria hacerlo de "MiClase"
interface InterfaseDos {
    public void resta();
    public void multiplicacion();
}
interface InterfaseTres extends InterfaseDos, InterfaceUno{
    public void divison();
}
class MiClase implements  InterfaseTres {

    @Override
    public void suma() {
        System.out.println("El valor es:" + valor);
    }

    @Override
    public void resta() {
    }
    @Override
    public void multiplicacion() {
    }
    @Override
    public void divison() {
    }
}
