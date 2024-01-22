public class FactoryPatternDemo{
    public static void main(String[] args)
{
    ShapeFactory ShapeFactory=new ShapeFactory();
    Shape shape1=ShapeFactory.getShape("CIRCLE");shape1.draw();
    Shape shape2=ShapeFactory.getShape("Rectangle");shape2.draw();

}
}