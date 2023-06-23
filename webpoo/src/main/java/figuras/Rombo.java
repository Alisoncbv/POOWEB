package figuras;

public class Rombo extends Figura{
    
    //Atributos 
    private Double mayorD;
    private Double menorD;

    //Metodo constructor vacio
    public Rombo(){

    } 

    //Metodo constructor con parametros
    public Rombo(Double mayorD, Double menorD){
        super();
        this.mayorD=mayorD;
        this.menorD=menorD;
    }

    //Metodo para calcular area 
    @Override
    public Double calcularArea(){

        Double areaRombo;

        areaRombo=((mayorD*menorD)/2);

        //Mostrar resultado 
        System.out.println("El area del rombo es: "+areaRombo);

        return(areaRombo);

    }

    //Metodo para calcular perimetro
    @Override
    public Double calcularPerimetro(){

        Double perimetroR;
        Double dMa;
        Double dMe;
        Double resultado;

        dMa=mayorD/2;
        dMe=menorD/2;

        perimetroR=Math.pow(dMa, 2)+Math.pow(dMe, 2);
        resultado= Math.sqrt(perimetroR);
        
        //Mostrar resultado 
        System.out.println("El area del rombo es: "+perimetroR);

        return(perimetroR);

    }
}
