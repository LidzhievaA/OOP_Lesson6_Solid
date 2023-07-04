package solid;

import solid.srp.Square;
import solid.srp.SquareDraw;

public class Main {
    public static void main(String[] args) {
        int side = 5;
        Square square = new Square(side);
        SquareDraw squareDraw = new SquareDraw(side);
        squareDraw.draw();
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        
        square.zoom(1.5f);
        System.out.printf("\nПлощадь фигуры: %d \n", square.getArea());
        squareDraw.draw();
    }
}
