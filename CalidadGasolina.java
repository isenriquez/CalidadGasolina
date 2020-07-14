/*
 * Diseñe e implemente un algoroitmo que mor medio de la comparación de datos
se obtenga la calidad de la gasolina Extra o Super
 */
package calidadgasolina;

import java.util.Scanner;

/**
 *
 * @author Enriquez Israel
 */
class CalidadGasolina1 {

        //Atributos
    private String calidad,tipoG,color;
    private int codigo,octanaje,cantidad_agua,volumen,tebullicion,tarranqueM;
        //Constructor

    public CalidadGasolina1(String eCalidad,int eCodigo,String eTipoG,String eColor,
                             int eOctanaje,int eCantidad_agua, int eVolumen,int eTebullicion,int eTarranqueM){

        calidad=eCalidad;
        codigo=eCodigo;
        tipoG=eTipoG;
        color=eColor;
        octanaje=eOctanaje;
        cantidad_agua=eCantidad_agua;
        volumen=eVolumen;
        tebullicion=eTebullicion;
        tarranqueM=eTarranqueM;
    }
        //Metodos
    public String getCalidad(){
        return calidad;
    }
    public void setCalidad(String calidad){
        this.calidad=calidad; //this invoca el atributo
    }
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public String getTipoG(){
        return tipoG;
    }
    public void setTipoG(String tipoG){
        this.tipoG=tipoG;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public int getOctanaje(){
        return octanaje;
    }
    public void setOctanaje(int octanaje){
        this.octanaje=octanaje;
    }
    public int getCantidad_agua(){
        return cantidad_agua;
    }
     public void setCantidad_agua(int cantidad_agua){
        this.cantidad_agua=cantidad_agua;
    }
    public int getVolumen(){
        return volumen;
    }
    public void setVolumen(int volumen){
        this.volumen=volumen;
    }
    public int getTebullicion(){
        return tebullicion;
    }
    public void setTebullicion(int tebullicion){
        this.tebullicion=tebullicion;
    }
    public int getTarranqueM(){
        return tarranqueM;
    }
    public void setTarranqueM(int tarranqueM){
        this.tarranqueM=tarranqueM;
    }
    @Override
    public String toString(){
        return "La gasolina"+tipoG+" con Octanaje: "+octanaje+"--"
               + " presenta un codigo "+codigo+ " Cambia de estado a los: "
               +tebullicion+"º la misma que nos garantizara un arranque optimo a "+tarranqueM+
                "º presenta en "+volumen+" litro un "+cantidad_agua+"%";

    }
}

public class CalidadGasolina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        //Leer el primero
        System.out.println("Ingrese el tipo de gasolina ");
        String tipoG1= sc.next();
        String tipoG2 = sc.next() ;


        //Mostrar en pantalla
        System.out.println("Ha ingresado los siguientes tipos de gasolina " +tipoG1+ " y " + tipoG2 );
         // objetos

    CalidadGasolina1 calidad1=new CalidadGasolina1("Premium ",20201 ,"Super ","Verdoso translúcido ", 92 , 2 ,1 , -45 , 0 );
    CalidadGasolina1 calidad2=new CalidadGasolina1("Premium ",20202 ,"Extra ","Amarillo verdoso translúcido ", 84 , 5 ,1 , -35 , 0 );

    //Mostramos su estado
    System.out.println(calidad1.toString());
    System.out.println(calidad2.toString());

    //Modificamos la cantidad de agua
    calidad1.setCantidad_agua(2);

    //comparamos que gasolina es de mejor calidad
    if(calidad1.getCantidad_agua()<calidad2.getCantidad_agua()){
        System.out.println(calidad1.getTipoG()+ " Tiene mejores propiedades");
    }else {
            System.out.println(calidad2.getTipoG()+ " Puede ocacionar averias en un tiempo prolongado");
    }
    }
}
