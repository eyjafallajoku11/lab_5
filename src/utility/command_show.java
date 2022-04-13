package utility;

public class command_show{
    public static void execute(){
        for (long keys : HashMap_controller.ID_set())
        {
            System.out.println(HashMap_controller.get_by_ID(keys).toString());
            System.out.println();
        }
    }
}
