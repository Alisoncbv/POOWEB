package figuras;

public class Trapecio extends Figura {

    //Atributos 
    private Double base1;
    private Double base2; 
    private Double altura; 

    //Metodo contructor vacio 
    public Trapecio(){

    }
    
    //Metodo contructor con parametros 
    public Trapecio(Double base1, Double base2, Double altura){
        super();
        this.base1=base1;
        this.base2=base2;
        this.altura=altura;
    }

    //Metodo para calcular el area 
    @Override
    public Double calcularArea(){

        Double areaTrapecio; 

        areaTrapecio=(((base1+base2)*altura)/2);

        //Mostrar resultado
        System.out.println("El area del trapecio es: "+areaTrapecio);

        return(areaTrapecio);
    }

    @Override
    public Double calcularPerimetro(){

        Double baseT=(base2-base1)/2;

        Double perimetroT=Math.pow(altura, 2)+Math.pow(baseT, 2);

        perimetroT = Math.sqrt(perimetroT);

        double resultado = base1 + base2 + perimetroT*2;

        resultado = Math.round(resultado);

        return resultado; 

    }
}
