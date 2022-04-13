package utility;

public class command_update {
    public static void execute(String data) {
        command_remove_key.execute(data);
        command_insert.execute(data);
    }
}
