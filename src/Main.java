import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner leer = new Scanner(System.in);
        BombasDeGasolina gas = new BombasDeGasolina();
        Empleado empleado = new Empleado();
        int op;
        int contador = 0;
        int salir;
        do {
            System.out.println("............::BIENVENIDO AL SISTEMA::.......................");
            System.out.println("DIGITE SU PUESTO: ");
            System.out.println("1. Ventas");
            System.out.println("2. Gerente");
            System.out.println("0. Salir");
            int opc = leer.nextInt();

            switch (opc) {
                case 1:
                    leer.nextLine();
                    System.out.println("DIGITE SU NOMBRE: ");
                    String nombre = leer.nextLine();
                    System.out.println("DIGITE SU CODIGO: ");
                    String codigo = leer.nextLine();
                    String puesto = "ventas";
                    empleado.EmpleadoVentas(nombre, codigo, puesto);
                    float sumaSuper=0,sumaRgular=0,sumaDiesel=0;
                    do {

                        gas.Menu();
                        op = leer.nextInt();
                        switch (op) {
                            case 1:
                                System.out.println("DIGITE LA CANTIDAD DE COMBUSTIBLE EN QUETZALES");
                                System.out.println("Utilice una ( , ) para los decimales");
                                float s = leer.nextFloat();
                                gas.BombaSuper(s);
                            sumaSuper = sumaSuper+s;

                                System.out.println("GRACIAS POR PREFERIRNOS");
                                break;
                            case 2:
                                System.out.println("DIGITE LA CANTIDAD DE COMBUSTIBLE EN QUETZALES");
                                System.out.println("Utilice una ( , ) para los decimales");
                                float r = leer.nextFloat();
                                gas.BombaRegular(r);
                                sumaRgular= sumaRgular+r;
                                System.out.println("GRACIAS POR PREFERIRNOS");
                                break;
                            case 3:
                                System.out.println("DIGITE LA CANTIDAD DE COMBUSTIBLE EN QUETZALES");
                                System.out.println("Utilice una ( , ) para los decimales");
                               float d = leer.nextFloat();
                                gas.BombaDiesel(d);
                                sumaDiesel = sumaDiesel+d;
                                System.out.println("GRACIAS POR PREFERIRNOS");
                                break;
                            case 4:

                            default:
                                System.out.println("OPCION INVALIDA INTENTE OTRA VEZ");
                        }

                        empleado.totalVentaS(sumaSuper);
                        empleado.totalVentaR(sumaRgular);
                        empleado.totalVentaD(sumaDiesel);

                    } while (op != 0);
                    break;

                case 2:
                    System.out.println("DIGITE SU NOMBRE: ");
                    nombre = leer.nextLine();
                    leer.nextLine();
                    System.out.println("DIGITE SU CODIGO: ");
                    codigo = leer.nextLine();
                    puesto = "gerente";
                    empleado.EmpleadoGerencia(nombre, codigo , puesto);
                    System.out.println("Elija la opcion a modificar");
                    do {
                        System.out.println("Precios Actuales");
                        gas.Menu();
                        System.out.println("1. Super");
                        System.out.println("2. Regular");
                        System.out.println("3. Diesel");
                        System.out.println("0.SALIR");
                        op = leer.nextInt();
                        //ciclo para setear los nuevos precios individualmente
                        switch (op) {
                            case 1:
                                System.out.println("Digite el nuevo valor del galon de SUPER");
                                System.out.println("Utilice una ( , ) para los decimales");
                                float nuevoPrecioGalonS = leer.nextFloat();
                                gas.modificarPreciosSuper(nuevoPrecioGalonS);



                                break;
                            case 2:
                                System.out.println("Digite el nuevo valor del galon de Regular");
                                System.out.println("Utilice una ( , ) para los decimales");
                                float nuevoPrecioGalonR = leer.nextFloat();
                                gas.setGasRegular(nuevoPrecioGalonR);
                                gas.Menu();
                                break;
                            case 3:
                                System.out.println("Digite el nuevo valor del galon de Diesel");
                                System.out.println("Utilice una ( , ) para los decimales");
                                float nuevoPrecioGalonD = leer.nextFloat();
                                gas.setDiesel(nuevoPrecioGalonD
                                );
                                break;
                            default:
                             break;

                        }
                        gas.Menu();
                    } while (op != 0);
                    break;
                default:

            }


            System.out.println("DESEA SALIR MARQUE 0 y 1 para volver a inicio");
            salir =leer.nextInt();
            if (salir ==0 ){
                float totalGalones =0;
                for (int i = 50; i >= 0; i-- ){
                    System.out.print("\rCERRANDO SESION...::" +i+"::....");
                    System.out.print(" ");
                    Thread.sleep(50);
                    System.out.print("\r");

                }

                empleado.cierreTurnoVentas();
            }
        } while (salir != 0);

    }
}