public class Estudiantes2 {

    private String nombre;
    private int edad;



    public Estudiantes2 (String nombre,int edad) {
        //asignacion de la variablr a traves de  los parametros
        this.nombre = nombre;
        this.edad = edad;
    }
    public void saludar() {
        System.out.println("nombre:" + nombre);
        System.out.println("Edad:" + edad);
    }
    public static void main(String[]args){
        Estudiantes estudiantes_desarrollo=new Estudiantes("Alex",15);
        estudiantes_desarrollo.saludar();
    }

}


