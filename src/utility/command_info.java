package utility;
import java.time.LocalDateTime;

public class command_info {
    private static LocalDateTime Initialisation;
    public static void initialise(){
        Initialisation = LocalDateTime.now();
    }
    public static void execute(){
        System.out.println("тип коллекции HashMap\nэлементы типа <Long, City>\nкол-во элементов="+HashMap_controller.map_size()+"\nвремя инициализации: "+Initialisation.toString());
    }
}
