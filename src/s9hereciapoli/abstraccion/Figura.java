package s9hereciapoli.abstraccion;

public abstract class Figura {

    public abstract void dibujar();

}
// jerarquia de clases abstractas
abstract  class FiguraBidimensional extends Figura{

}
//Clase triangulo debe implementar el metodo de la clase abstracta
class Triangulo extends Figura{
   @Override
   public void dibujar(){
       System.out.println("Este seria un triangulo");
   }

    public static void main(String[] args) {
        Triangulo t = new Triangulo();
        t.dibujar();
    }
}