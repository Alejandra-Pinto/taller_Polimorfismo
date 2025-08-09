package co.unicauca.figures;

import co.unicauca.figures.domain.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandra Pinto y María Juliana Sánchez
 */
public class Figures {

    public static void main(String[] args) {
        Figure fig1 = new Circle(1);
        Figure fig2 = new Circle(2.3);
        Figure fig3 = new Square(10);
        Figure fig4 = new Square(2.1);
        Figure fig5 = new Triangle(3, 4, 5);
        Figure fig6 = new Triangle(8, 15, 8);
        
        List<Figure> figures = new ArrayList<>();
        figures.add(fig1);
        figures.add(fig2);
        figures.add(fig3);
        figures.add(fig4);
        figures.add(fig5);
        figures.add(fig6);
        
        for(Figure fig : figures){
            System.out.println("**************************************************");
            if (fig instanceof Circle) {
                System.out.println("Figura: Circulo");
            } else if (fig instanceof Square) {
                System.out.println("Figura: Cuadrado");
            } else if (fig instanceof Triangle) {
                System.out.println("Figura: Triangulo");
            }
            
            System.out.println("El area es: " + fig.calculateArea());
            System.out.println("El perimetro es: " + fig.calculatePerimeter());
        }        
    }
}
