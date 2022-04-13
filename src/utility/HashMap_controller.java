package utility;

import Gorod.City;
import java.util.HashMap;
import java.util.Set;

public class HashMap_controller {
    private static final HashMap<Long, City> map = new HashMap<>();

    public static void add_to_map(City entity){
        map.put(entity.getId(),entity);
    }

    public static void remove_from_map_by_ID(long id){
        map.remove(id);
    }

    public static HashMap<Long, City> getMap(){
        return map;
    }

    public static boolean contains_ID(long id){
        return map.containsKey(id);
    }

    public static Set<Long> ID_set(){
        return map.keySet();
    }

    public static City get_by_ID(long id){
        return map.get(id);
    }

    public static void clear(){
            map.clear();
    }

    public static int map_size(){
        return map.size();
    }
}
