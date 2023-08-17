public class Empleado {
    String nombre;
    String codigo;
    String contraseña;
    String puestoEmpleado;
    float ventaDiaS=0,ventaDiaR=0,ventaDiaD=0;
    int contador = 0;
//contructores
    public void EmpleadoGerencia(String nombre, String codigo,String puestoEmpleado) {
        this.contador = contador++;
    }

    public void EmpleadoVentas(String nombre, String codigo, String puestoEmpleado) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.contraseña = contraseña;
        this.puestoEmpleado = puestoEmpleado;


    }
    //metodos de acceso


    public float getVentaDiaS() {
        return ventaDiaS;
    }

    public void setVentaDiaS(float ventaDiaS) {
        this.ventaDiaS = ventaDiaS;
    }

    public float getVentaDiaR() {
        return ventaDiaR;
    }

    public void setVentaDiaR(float ventaDiaR) {
        this.ventaDiaR = ventaDiaR;
    }

    public float getVentaDiaD() {
        return ventaDiaD;
    }

    public void setVentaDiaD(float ventaDiaD) {
        this.ventaDiaD = ventaDiaD;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getPuestoEmpleado() {
        return puestoEmpleado;
    }

    public void setPuestoEmpleado(String puestoEmpleado) {
        this.puestoEmpleado = puestoEmpleado;
    }


    public void totalVentaS(float sup){
this.ventaDiaS= sup ;
    }
    public void totalVentaR(float reg){
        this.ventaDiaR = reg ;
    }
    public void totalVentaD(float die){
        this.ventaDiaD = die;
    }
    public void cierreTurnoVentas(){
        System.out.println(".::VOUCHER CIERRE DE TURNO::.");
        System.out.println("Empleado: "+this.getNombre());
        System.out.println("PUESTO: "+this.getPuestoEmpleado());
        System.out.println("CODIGO: "+this.getCodigo());
        System.out.println("VENTA DEL DIA GASOLINA SUPER Q. "+this.getVentaDiaS());
        System.out.println("VENTA DEL DIA GASOLINA REGULAR Q. "+this.getVentaDiaR());
        System.out.println("VENTA DEL DIA GASOLINA DIESEL Q. "+this.getVentaDiaD());
    }
    public void registroGerencia(){
        contador++;
        System.out.println("NOMBRE: "+this.getNombre());
        System.out.println("PUESTO: "+this.getPuestoEmpleado());
        System.out.println("CODIGO: "+this.getCodigo());
        System.out.println("REGISTRO DE ENTRADA AL SISTEMA: "+contador);
    }
}
