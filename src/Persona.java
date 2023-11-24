import java.awt.*;

public class Persona {
    public int cedula;
    public String nombre;
    public int edad;


    public Persona (int cedula,String nombre,int edad){

        this.cedula =cedula;
        this.nombre=nombre;
        this.edad=edad;
    }
    public void saludar (){
        System.out.println("saludando a:"+nombre);
    }
    public static void main (String[] args){

        Persona persona1= new Persona(87,"alex",99);
        System.out.printf("el nombre es  = %s\n",persona1.nombre);
        Persona persona2= new Persona(85,"alexis",98);
        Persona persona3= new Persona(83,"lenin",97);
        Persona persona4= new Persona(82,"dostin",91);
        System.out.printf("el nombre es  = %s\n",persona2.nombre);
        System.out.printf("el nombre es  = %s\n",persona3.nombre);
        System.out.printf("el nombre es  = %s\n",persona4.nombre);
        persona1.saludar();
        persona2.saludar();
        persona3.saludar();
    }
}
