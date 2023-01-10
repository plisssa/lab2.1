//Класс, для 2d точки
public class Point2d {
    //координата х
    private double xCoord;

    private double yCoord;

    public Point2d(double x, double y){
        xCoord = x;
        yCoord = y;
    }
    //конструктор по умолчанию
    public Point2d(){// Вызов конструктора с 2 параметрами и определение источника

        this(0.0, 0.0);
    }
    //возвращение х
    public double getX(){
        return xCoord;
    }
    //возвращение у
    public double getY(){
        return yCoord;
    }
    //установка значения координаты х
    public void setX(double x){
        xCoord = x;
    }
    //установка значения координаты у
    public void setY(double y) {
        yCoord = y;
    }
}
