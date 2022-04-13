package Gorod;

import java.time.LocalDate;

import static java.lang.Math.sqrt;

public class City implements Comparable <City>{
    private long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private double area; //Значение поля должно быть больше 0
    private Integer population; //Значение поля должно быть больше 0, Поле не может быть null
    private Double metersAboveSeaLevel;
    private Climate climate; //Поле может быть null
    private Government government; //Поле не может быть null
    private StandardOfLiving standardOfLiving; //Поле может быть null
    private Human governor; //Поле может быть null

    public City(){}

    public long getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public Integer getPopulation(){return population;}

    public Human getGovernor() {
        return governor;
    }

    public Government getGovernment() {
        return government;
    }

    @Override
    public String toString(){
        return  name+"\n"+
                "ID="+id+"\n"+
                "coords: " +coordinates.toString()+"\n"+
                metersAboveSeaLevel.toString()+"meters above sea level\n"+
                "creation date: "+creationDate.toString()+"\n"+
                "area="+area+"\n"+
                "population="+population.toString()+"\n"+
                "climate: "+climate+"\n"+
                "government: "+government+"\n"+
                "standard of living: "+standardOfLiving+"\n"+
                "governor: "+governor.toString();
    }

    public void setId(long id){this.id=id;}

    public void setCoordinates(Coordinates coord){this.coordinates=coord;}

    public void setArea(double area) {this.area = area;}

    public void setClimate(String climate) {
        switch (climate){
            case "HUMIDSUBTROPICAL":
                this.climate = Climate.HUMIDSUBTROPICAL;
                break;
            case "OCEANIC":
                this.climate = Climate.OCEANIC;
                break;
            case "POLAR_ICECAP":
                this.climate = Climate.POLAR_ICECAP;
                break;
            case "RAIN_FOREST":
                this.climate = Climate.RAIN_FOREST;
                break;
            case "SUBARCTIC":
                this.climate = Climate.SUBARCTIC;
                break;
        }
    }

    public void setCreationDate(LocalDate creationDate) {this.creationDate = creationDate;}

    public void setGovernment(String government) {
        switch (government){
            case "ITMOCRACY":
                this.government = Government.ITMOCRACY;
                break;
            case "KLEPTOCRACY":
                this.government = Government.KLEPTOCRACY;
                break;
            case "MERITOCRACY":
                this.government = Government.MERITOCRACY;
                break;
            case "MONARCHY":
                this.government = Government.MONARCHY;
                break;
            case "TELLUROCRACY":
                this.government = Government.TELLUROCRACY;
                break;
        }
    }

    public void setGovernor(Human governor) {this.governor = governor;}

    public void setName(String name) {this.name = name;}

    public void setMetersAboveSeaLevel(Double metersAboveSeaLevel) {this.metersAboveSeaLevel = metersAboveSeaLevel;}

    public void setPopulation(Integer population) {this.population = population;}

    public void setStandardOfLiving(String standardOfLiving) {
        switch (standardOfLiving){
            case "LOW":
                this.standardOfLiving=StandardOfLiving.LOW;
                break;
            case "VERY_HIGH":
                this.standardOfLiving=StandardOfLiving.VERY_HIGH;
                break;
            case "VERY_LOW":
                this.standardOfLiving=StandardOfLiving.VERY_LOW;
                break;
            default:
                this.standardOfLiving=null;
        }
    }

    @Override
    public int compareTo(City other) {
        return (int) (sqrt(this.getArea())-sqrt(other.getArea())+this.getPopulation()-other.getPopulation());
    }
}