package TASK_4;
import java.util.ArrayList;

public class ShapeBuilder {
    private ArrayList<Shape> shapes;

    public ShapeBuilder() {
        this.shapes = new ArrayList<>();

    }
    public void addShape (Shape shapes) {
       this.shapes.add(shapes);
    }

    public double getTotalArea() {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();

        }
return totalArea;
    }
}
