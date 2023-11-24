public class Futbolista {
    public String nombre;
    public String nacionalidad;
    public int edad;
    public String club;

    public Futbolista(String nombre, String nacionalidad, int edad, String club) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.club = club;
    }


    public void darPase() {
        System.out.print(this.nombre + " le da un pase a ");
    }
    public void patear(){
        System.out.println(this.nombre + " patea");
    }
    public static void main(String[] args){
        Futbolista futbolista1=new Futbolista("cr7","portuges",39,"Al-nassar");
        Futbolista futbolista2=new Futbolista("la pulga","Argentino",36,"Inter Miami");
        Futbolista futbolista3=new Futbolista("donatelo","Frances",25,"PSG");
        futbolista1.darPase();System.out.print(futbolista2.nombre+"\n");
        futbolista2.darPase();System.out.print(futbolista3.nombre+"\n");
        futbolista3.patear();
    }
}
