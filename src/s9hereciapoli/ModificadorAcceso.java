package s9hereciapoli;

public class ModificadorAcceso {

    private String name ="";
    public int num =0;
    protected int valor;//Solo pueden acceder de los miembros que extienden de esta clase

}
//no puede haber otra clase con public
class a extends ModificadorAcceso {

 }