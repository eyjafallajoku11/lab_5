package utility;

import static java.lang.System.out;
import static utility.readline.readLine;

public class command_insert {
    public static void execute(String data){
        if (!HashMap_controller.contains_ID(Long.parseLong(data))){
            City_creator creator = new City_creator();
            creator.set_data(12,data);
            out.println("* - обязательные переменные");
            out.print("Сity name*: ");
            creator.set_data(2,readLine());
            out.print("creation date*: ");
            creator.set_data(3,readLine());
            out.print("area*: ");
            creator.set_data(4,readLine());
            out.print("population*: ");
            creator.set_data(5,readLine());
            out.print("coord x*: ");
            creator.set_data(0,readLine());
            out.print("coord y*: ");
            creator.set_data(1,readLine());
            out.print("meters above sea level: ");
            creator.set_data(6,readLine());
            out.print("climate: ");
            creator.set_data(7,readLine());
            out.print("government*: ");
            creator.set_data(8,readLine());
            out.print("standard of living: ");
            creator.set_data(9,readLine());
            out.print("Governor name: ");
            String t=readLine();
            if (t.equals("")){
                creator.set_data(13, "0");
            }
            else {
                creator.set_data(13, "1");
                creator.set_data(10,t);
                out.print("Governor birthday: ");
                creator.set_data(11,readLine());
            }
            creator.create_city();
            //[x,y,name,creation date,area,population,metersAboveSeaLevel,climate,government,standardOfLiving,govName,birthday,id,boolean Governor]
        }
        else{
            out.println("этот ключ уже занят");
        }
    }
}
