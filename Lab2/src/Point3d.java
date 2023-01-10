//Класс для трёхмерной точки
public class Point3d extends Point2d {
    //новый объект с 3мя значениями с плавающей точкой (double)
    private double zCoord;

    public Point3d(double x, double y, double z) {
        super(x,y);
        this.zCoord = z;
    }
    //Конструктор инициализации класса
    //объект со значениями (0.0,0.0,0.0)
    Point3d(){
        this(0.0, 0.0, 0.0);
    }
    //геттер
    public double getZ() {
        return zCoord;
    }
    //сеттер
    public void setZ(double z) {
        this.zCoord = z;
    }
    //сравнение объекта с другим объектом
    public boolean compare(Point3d point){
        return (this.getX() == point.getX() && this.getY() == point.getY() && this.zCoord == point.getZ());
    }
    // метод вычисляет и возвращает расстояние между двумя точками
    public double distanceTo(Point3d point){
        return Math.sqrt(Math.pow(this.getX() - point.getX(), 2) + Math.pow(this.getY() - point.getY(), 2) + Math.pow(this.zCoord - point.getZ(), 2));
    }
}
