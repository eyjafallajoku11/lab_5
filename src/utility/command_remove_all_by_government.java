package utility;

import Gorod.City;
import Gorod.Government;


import java.util.Iterator;
import java.util.Objects;

public class command_remove_all_by_government {
    public static void execute(String data) {
        Government government;
        switch (data){
            case "ITMOCRACY":
                government=Government.ITMOCRACY;
                break;
            case "KLEPTOCRACY":
                government = Government.KLEPTOCRACY;
                break;
            case "MERITOCRACY":
                government = Government.MERITOCRACY;
                break;
            case "MONARCHY":
                government = Government.MONARCHY;
                break;
            case "TELLUROCRACY":
                government = Government.TELLUROCRACY;
                break;
            default:
                government=null;
        }
        if (!Objects.isNull(government)) {
            Iterator<Long> it = HashMap_controller.getMap().keySet().iterator();
            while (it.hasNext()) {
                long key = it.next();
                if (HashMap_controller.get_by_ID(key).getGovernment().equals(government)) {
                    it.remove();
                }
            }
        }
    }
}
