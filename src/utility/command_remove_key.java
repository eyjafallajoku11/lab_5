package utility;

public class command_remove_key{
    public static void execute (String data) {
        HashMap_controller.remove_from_map_by_ID(Long.parseLong(data));
        System.out.println("канселим город с ID=" + data);
    }
}
