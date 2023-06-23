package figuras;

public class Circulo extends Figura{

    //Atributos 
    private Double radio;

    //Metodo constructor vacio
    public Circulo(){

    }

    //Metodo constructor con parametros 
    public Circulo(Double radio){
        super();
        this.radio=radio;
    }

    //Metodos accesores
    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    //Metodo para calcular area 
    @Override
    public Double calcularArea(){
        Double areaCirculo; 

        areaCirculo=3.1416 * Math.pow(radio,2);
        //Mostrar resultado 
        System.out.println("El area del circulo es: "+areaCirculo);

        return (areaCirculo); 
    }

    //Metodo para calculra perimetro 
    @Override
    public Double calcularPerimetro(){
        Double perimetroC;

        perimetroC=(2*radio)*3.1416;

        return perimetroC;
    }
    
}
