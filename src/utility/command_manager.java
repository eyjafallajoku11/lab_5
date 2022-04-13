package utility;

import static java.lang.System.out;

public class command_manager {
    public static void execute(String[] input){
        command_history.add_to_history(input[0]);
        switch (input[0]) {
            case "test":
                command_open_file.execute("/Users/artem/Documents/прога/laba5/src/aboba.xml");
                break;
            case "help":
                command_help.execute();
                break;
            case "open":
                command_open_file.execute(input[1]);
                break;
            case "exit":
                command_exit.execute();
                break;
            case "remove_key":
                command_remove_key.execute(input[1]);
                break;
            case "insert":
                command_insert.execute(input[1]);
                break;
            case "update":
                command_update.execute(input[1]);
                break;
            case "replace_if_grater":
                command_replace_if_greater.execute(input[1]);
                break;
            case "show":
                command_show.execute();
                break;
            case "filter_less_than_governor":
                command_filter_less_than_governor.execute();
                break;
            case "remove_all_by_government":
                command_remove_all_by_government.execute(input[1]);
                break;
            case "remove_lower":
                command_remove_lower.execute();
                break;
            case "clear":
                command_clear.execute();
                break;
            case "history":
                command_history.execute();
                break;
            case "info":
                command_info.execute();
                break;
            default:
                out.println("ты написал какой-то бред, попробуй команду help");
        }

    }
}
