import shape.Shape;
import shape.Rectangle;
import shape.Triangle;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */
public class ShapeDriver {
    public static void main(String [] args)
    {
        Shape shape  = new Shape();
        Shape tri = new Triangle();
        Shape rec = new Rectangle();
        
        ArrayList<Shape> shapes = new ArrayList<Shape>();      
        
        shapes.add(shape);
        shapes.add(tri);
        shapes.add(rec);
        
        for(Shape sh :shapes){
            sh.nameShape();
        }
        
        
    }
}
