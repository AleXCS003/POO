class Aviones{
    String modelo;
    String aerolinea;

    public void despegar() {
        System.out.println("el avion esta despegando");
    }
    public void aterrizar(){
        System.out.println("el avion esta aterrizando ");

    }
    
}
public class Main{
   public static void main(String[]args){
       Aviones avion1=new Aviones();
       avion1.modelo="boeing 777";
       avion1.aerolinea="FLY EMIRATES";
   }
}