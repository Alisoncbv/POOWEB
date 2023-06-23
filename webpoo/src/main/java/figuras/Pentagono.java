package figuras;

public class Pentagono extends Figura{

    //Atributos 
    private Double apotema;
    private Double ladoP; 

    //Metodo constructor vacio 
    public Pentagono(){

    }
    
    //Metodo constructor con parametros 
    public Pentagono(Double ladoP, Double apotema){
        super();
        this.apotema=apotema;
        this.ladoP=ladoP;
    }

   
    //Metodo para calcular area 
    @Override
    public Double calcularArea(){

        Double areaPentagono; 
        Double perimetroP;

        perimetroP=ladoP*5;

        areaPentagono=((perimetroP*apotema)/2);

        //Mostrar resultado 
        System.out.println("El area del pentagono es: "+areaPentagono);

        return(areaPentagono);
    }
    @Override
    public Double calcularPerimetro(){
        Double perimetro;

        perimetro=ladoP*5;

        return perimetro;

    }
}
