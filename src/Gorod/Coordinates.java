package Gorod;

public class Coordinates {
    private double x; //Значение поля должно быть больше -251
    private Double y; //Значение поля должно быть больше -310, Поле не может быть null
    public Coordinates(double iks, Double igr) {
        this.x = iks;
        this.y = igr;
    }
    @Override
    public String toString(){
        return "("+x+","+ y +")";
    }
}
