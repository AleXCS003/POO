public class OperacionesMatematicas {

    public int x;
    public int y;
    public int z;

    public  void  suma(int x,int y){
        int suma;
        suma=x+y;
        System.out.println("Metodo 1");
        System.out.println("resultado:"+suma);

    }
    public void suma (double x,double y,double z){
        double suma2;
        suma2=x+y+5;
        System.out.println("Metodo 2 ");
        System.out.println("resultado"+suma2);
    }
    public  void suma(double x,double y){
        double suma3;
        suma3=x+y+2;
        System.out.println("Metodo 3");
        System.out.println("resultado:"+suma3);

    }
    public static  void  main (String[]args){
    OperacionesMatematicas objeto1= new OperacionesMatematicas();
    objeto1.suma(1,2);
    objeto1.suma(1,2,3);
    objeto1.suma(4.5,4.8);
    }
}
