import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import figuras.Pentagono;
import figuras.Rombo;
import figuras.Trapecio;
import figuras.Circulo;


public class Servlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Ingreso al servlet");

        //Capturar valor de control
        String control=req.getParameter("control");
        System.out.println(control);

        //Concicional para evaluar control
        switch(control){

            case "rombo":
                //Redireccionar a la vista
                req.getRequestDispatcher("View/areaRombo.jsp").forward(req, resp);
            break;

            case "trapecio":
                req.getRequestDispatcher("View/areaTrapecio.jsp").forward(req, resp);
            break;

            case "pentagono":
                req.getRequestDispatcher("View/areaPentagono.jsp").forward(req, resp);
            break;

            case "circulo":
                req.getRequestDispatcher("View/areaCirculo.jsp").forward(req, resp);
            break;

            case "rombo1":
                //Redireccionar a la vista
                req.getRequestDispatcher("View/perimetroRombo.jsp").forward(req, resp);
            break;

            case "trapecio1":
                //Redireccionar a la vista
                req.getRequestDispatcher("View/perimetroTrapecio.jsp").forward(req, resp);
            break;

            case "pentagono1":
                //Redireccionar a la vista
                req.getRequestDispatcher("View/perimetroPentagono.jsp").forward(req, resp);
            break;

            case "circulo1":
                //Redireccionar a la vista
                req.getRequestDispatcher("View/perimetroCirculo.jsp").forward(req, resp);


            case "index":
                req.getRequestDispatcher("index.jsp").forward(req, resp);


        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //Capturar valor de control
        String control=req.getParameter("control");
        System.out.println(control);

        switch(control){

            //Area del rombo
            case "calrombo":
                //Asignar valores parseados a variables
                Double mayor=Double.parseDouble(req.getParameter("mayor"));
                Double menor=Double.parseDouble(req.getParameter("menor"));

                //Instanciar clase Rombo 
                Rombo rombo=new Rombo(mayor, menor);

                //setAttribute, asignar valor de retorno 
                req.setAttribute("area", rombo.calcularArea());
                System.out.println("El area es "+rombo.calcularArea());

                //Redireccionar a la vista
                req.getRequestDispatcher("View/resultado.jsp").forward(req, resp);
            break;

            //Perimetro del rombo
            case "perombo":
                //Asignar valores parseados a variables
                Double mayor1=Double.parseDouble(req.getParameter("mayor"));
                Double menor1=Double.parseDouble(req.getParameter("menor"));

                //Instanciar clase Rombo 
                Rombo rom=new Rombo(mayor1, menor1);

                //setAttribute, asignar valor de retorno 
                req.setAttribute("perimetro", rom.calcularPerimetro());
                System.out.println("El perimetro es "+rom.calcularPerimetro());

                //Redireccionar a la vista
                req.getRequestDispatcher("View/solucion.jsp").forward(req, resp);
            break;

            //Area pentagono
            case "calpentagono":
                //Asignar valores parseados a variables 
                Double lado=Double.parseDouble(req.getParameter("ladosP"));
                Double apotema=Double.parseDouble(req.getParameter("apotema"));

                //Instanciar clase Pentagono 
                Pentagono pentagono=new Pentagono(lado, apotema);

                //Asignar valor de retorno 
                req.setAttribute("area", pentagono.calcularArea());
                System.out.println("El area es "+pentagono.calcularArea());

                //Redireccionar a la vista 
                req.getRequestDispatcher("View/resultado.jsp").forward(req, resp);
            break;

            //Perimetro del pentagono
            case "pepentagono":
                //Asignar valores parseados a variables 
                Double ladoP=Double.parseDouble(req.getParameter("ladosP"));
               // Double apotema1=Double.parseDouble(req.getParameter("apotema"));

                //Instanciar clase Pentagono 
                Pentagono pen=new Pentagono(ladoP, 0.0);

                //Asignar valor de retorno 
                req.setAttribute("perimetro", pen.calcularPerimetro());
                System.out.println("El perimetro es "+pen.calcularPerimetro());

                //Redireccionar a la vista 
                req.getRequestDispatcher("View/solucion.jsp").forward(req, resp);
            break;

            //Area trapecio
            case "caltrapecio": 
                //Asignar valores parseados a variables 
                Double lado1=Double.parseDouble(req.getParameter("lado1"));
                Double lado2=Double.parseDouble(req.getParameter("lado2"));
                Double altura=Double.parseDouble(req.getParameter("altura"));

                //Instanciar clase Pentagono 
                Trapecio trapecio=new Trapecio(lado1, lado2, altura);

                //Asignar valor de retorno 
                req.setAttribute("area", trapecio.calcularArea());
                System.out.println("El area es "+trapecio.calcularArea());

                //Redireccionar a la vista 
                req.getRequestDispatcher("View/resultado.jsp").forward(req, resp);
            break;


            //Perimetro trapecio
            case"petrapecio":
                //Asignar valores parseados a variables 
                Double lado11=Double.parseDouble(req.getParameter("lado1"));
                Double lado22=Double.parseDouble(req.getParameter("lado2"));
                Double altura1=Double.parseDouble(req.getParameter("altura"));

                //Instanciar clase Pentagono 
                Trapecio tra=new Trapecio(lado11, lado22, altura1);

                //Asignar valor de retorno 
                req.setAttribute("perimetro", tra.calcularPerimetro());
                System.out.println("El perimetro es "+tra.calcularPerimetro());

                //Redireccionar a la vista 
                req.getRequestDispatcher("View/solucion.jsp").forward(req, resp);
            break;

            //Area circulo
            case "calcirculo":
                //Asignar valores parseados a variables 
                Double radio=Double.parseDouble(req.getParameter("radio"));

                //Instanciar clase Circulo 
                Circulo circulo=new Circulo(radio);

                //Asignar valor de retorno 
                req.setAttribute("area", circulo.calcularArea());
                System.out.println("El area es "+circulo.calcularArea());

                //Redireccionar a la vista 
                req.getRequestDispatcher("View/resultado.jsp").forward(req, resp);
            break;

            //Perímetro círculo
            case "pecirculo":
                //Asignar valores parseados a variables 
                Double radio1=Double.parseDouble(req.getParameter("radio"));

                //Instanciar clase circulo
                Circulo cir=new Circulo(radio1);

                //Asignar valor de retorno 
                req.setAttribute("perimetro", cir.calcularPerimetro());
                System.out.println("El perimetro es "+cir.calcularPerimetro());

                //Redireccionar a la vista 
                req.getRequestDispatcher("View/solucion.jsp").forward(req, resp);

            




        }
        
    }
    

}
