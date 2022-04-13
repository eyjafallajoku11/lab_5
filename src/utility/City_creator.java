package utility;

import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;
import java.util.Objects;

import Gorod.City;
import Gorod.Coordinates;
import Gorod.Human;
public class City_creator {
    private String[] data;
    public City_creator(){
        data=new String[14];
    }
    public void clear_data(){
        this.data=new String[14];
    }
    public void set_data(int index,String data){
        this.data[index]=data;
    }
    public String get_data(int index){
        return this.data[index];
    }
    public void create_city() {
        if (!Objects.isNull(data[0]) && !Objects.isNull(data[1]) && !Objects.isNull(data[2]) && !Objects.isNull(data[3]) && !Objects.isNull(data[4])
                && !Objects.isNull(data[5]) && !Objects.isNull(data[8]) && (Objects.isNull(data[13])==Objects.isNull(data[10]))) {
            double x = Double.parseDouble(data[0]);      //[x,y,name,creation date,area,population,metersAboveSeaLevel,climate,government,standardOfLiving,govName,birthday]
            double y = Double.parseDouble(data[1]);
            if (x > -251 && y > -310) {
                City city = new City();
                city.setCoordinates(new Coordinates(x, y));
                city.setName(data[2]);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                city.setCreationDate(java.time.LocalDate.parse(data[3], formatter));
                city.setArea(Integer.parseInt(data[4]));
                city.setPopulation(Integer.parseInt(data[5]));
                city.setGovernment(data[8]);
//              дальше проверяем на null
                if (!Objects.isNull(data[6])) city.setMetersAboveSeaLevel(Double.parseDouble(data[6]));
                if (!Objects.isNull(data[7])) city.setClimate(data[7]);
                if (!Objects.isNull(data[9])) city.setStandardOfLiving(data[9]);
                if (!Objects.isNull(data[10])) {
                    Human hum = new Human(data[10]);
                    if (!Objects.isNull(data[11])) hum.setBirthday(ZonedDateTime.parse(data[11]));
                        city.setGovernor(hum);
                }
                if ( !Objects.isNull(data[12]) && !HashMap_controller.contains_ID(Long.parseLong(data[12]))) city.setId(Long.parseLong(data[12]));
                else {
                    city.setId(city.hashCode());
                }
                HashMap_controller.add_to_map(city);
                }
            }
        }
    }

