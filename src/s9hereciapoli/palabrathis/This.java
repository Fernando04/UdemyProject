package s9hereciapoli.palabrathis;

public class This extends ThisDos{
    int variable = 5;
    ClaseDos obj2 = new ClaseDos();

    public void metodo(int variable){
        // mediante la palabra this se imprime el valor de la variable de instancia
        System.out.println("El valor con la pablabra reservada es: " + this.variable);
        // sin la palabra this imprime el valor que se le pasa como parametro
        System.out.println("El valor es sin la palabra reservada: " + variable);
    }
    public void metodo2(){
        obj2.metodo(111);
        this.metodo(1);
    }
    //Se puede recibir un objeto de la super clases ThisDos
    public void metodo3(ThisDos obj){

    }
    //En este metodo se le dice que el objeto a utilizar no será el objeto
    //obtenido en el metodo3  si no el objeto de la clase  "obj"
    public void metodo4(){
        this.metodo3(this);
    }

    public This(){
        this("Fernando");
        System.out.println("Constructor sin parametro\n");
    }

    public This(String nombre){
        System.out.println("El nombre es :" + nombre);
    }


    public static void main(String[] args) {
        This obj = new This();
        obj.metodo(20);
        obj.metodo2();


    }
}
