import java.text.DecimalFormat;

public class BombasDeGasolina {
    //atributos
    private float gasSuper = 45.75F ;
    private float gasRegular = 40.75F;
    private  float diesel = 39.75F;
    private  float total=0;
    private  float totalGalones =0;
    DecimalFormat df = new DecimalFormat("#.00");
//constructores
    public BombasDeGasolina() {

    }


    //metodos de acceso


    public float getGasSuper() {
        return gasSuper;
    }

    public void setGasSuper(float gasSuper) {
        this.gasSuper = gasSuper;
    }

    public float getGasRegular() {
        return gasRegular;
    }

    public void setGasRegular(float gasRegular) {
        this.gasRegular = gasRegular;
    }

    public float getDiesel() {
        return diesel;
    }

    public void setDiesel(float diesel) {
        this.diesel = diesel;
    }
//metodos  contador de bomba
    public void BombaSuper(float cantidad) throws InterruptedException {
        System.out.println("------------------------------------");
        System.out.println("....::SUPER::.....");
        float total =0;
        float totalGalones =0;
        for (int i = 0; i <= cantidad; i++) {
            System.out.print("\rCantidad en | Q." + i+" |Galones:"+ i/this.gasSuper);
            System.out.print(" ");
            Thread.sleep(50);
            System.out.print("\r");
            total = i;
            totalGalones= i/this.gasSuper;
        }

        Thread.sleep(3000);
        System.out.println(".::CONSUMIO::.");
        System.out.println("QUETZALES: "+total);
        System.out.println("GALONES: "+df.format(totalGalones));
        Thread.sleep(3000);
    }
        public void BombaRegular(float cantidad) throws InterruptedException {
            System.out.println("------------------------------------");
            System.out.println("....::REGULAR::.....");
            float totalGalones =0;
            for (int i=0;i<=cantidad;i++){
                System.out.print("\rCantidad en | Q." + i+" |Galones:"+ i/this.gasRegular);
                System.out.print(" ");
                Thread.sleep(50);
                System.out.print("\r");
                total = i;
                totalGalones= i/this.gasRegular;
            }
            Thread.sleep(3000);
            System.out.println(".::CONSUMIO::.");
            System.out.println("QUETZALES: "+total);
            System.out.println("GALONES: "+df.format(totalGalones));
            Thread.sleep(3000);
    }
            public void BombaDiesel(float cantidad) throws InterruptedException {
                System.out.println("------------------------------------");
                System.out.println("....::DIESEL::.....");
                for (int i=0;i<=cantidad;i++){
                    System.out.print("\rCantidad | Q." + i+" |Galones:"+ i/this.diesel);
                    System.out.print(" ");
                    Thread.sleep(50);
                    System.out.print("\r");
                    total = i;
                    totalGalones= i/this.diesel;
                }
                Thread.sleep(3000);
                System.out.println(".::CONSUMIO::.");
                System.out.println("QUETZALES: "+total);
                System.out.println("GALONES: "+df.format(totalGalones));
                Thread.sleep(3000);
    }
//metodos para modificar los precios de la gasolina
    public void modificarPreciosSuper(float precioN){
        this.gasSuper = precioN;
        System.out.println("Se actualizo el precio: "+precioN);
    }
    public void modificarPreciosRegular(float precioN){
        this.gasRegular = precioN;
        System.out.println("Se actualizo el precio: "+precioN);
    }
    public void modificarPreciosDiesel(float precioN){
        this.diesel = precioN;
        System.out.println("Se actualizo el precio: "+precioN);
    }
    //metodod para desplegare el menu
    public void Menu( ){

        System.out.println("-------------------------------------------------");
        System.out.println("----------------TEXACO---------------------------");
        System.out.println("1. SUPER   Q."+this.gasSuper+"                        .");
        System.out.println("2. REGULAR Q."+this.gasRegular+"                        .");
        System.out.println("3. DIESEL  Q."+this.diesel+"                        .");
        System.out.println("0. SALIR                                        .");
        System.out.println("-------------------------------------------------");
    }
}

