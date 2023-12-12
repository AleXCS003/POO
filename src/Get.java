public class Get{
    public String nombre;
    public int edad;

    public void saludar() {
        System.out.println("saludando a:" + this.nombre);
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public static void main(String[] args) {
        Get persona1 =new Get();
    System.out.println("persona:"+persona1.getNombre());
    }
}

