package utility;

import Gorod.City;
import Gorod.Human;

import java.time.ZonedDateTime;

import static java.lang.System.out;
import static utility.readline.readLine;

public class command_filter_less_than_governor {
    public static void execute() {
        out.print("Governor name: ");
        String t = readLine();
        if (!t.equals("")) {
            Human governor = new Human(t);
            out.print("Governor birthday: ");
            t = readLine();
            if (!t.equals("")) {
                governor.setBirthday(ZonedDateTime.parse(t));
            }
            for (long keys : HashMap_controller.ID_set()) {
                City city = HashMap_controller.get_by_ID(keys);
                if (city.getGovernor().compareTo(governor)>0){
                    out.println(city);
                    out.println();
                }
            }
        }
        else out.println("governor must have a name");
    }
}
