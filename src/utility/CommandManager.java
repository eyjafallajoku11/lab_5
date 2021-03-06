package utility;

import gorod.Human;
import utility.bareCommand.BareCommand;
import utility.bareCommand.BareCommandHistory;
import utility.creatorCommand.CreatorCommand;
import utility.dataCommand.DataCommand;
import utility.humanCommand.HumanCommand;

import java.util.HashMap;

public class CommandManager {
    private static final HashMap <String, DataCommand> dataCommandMap = new HashMap<String, DataCommand>();
    private static final HashMap <String, CreatorCommand> creatorCommandMap = new HashMap<String, CreatorCommand>();
    private static final HashMap <String, HumanCommand> humanCommandMap = new HashMap<String, HumanCommand>();
    private static final HashMap <String, BareCommand> bareCommandMap = new HashMap<String, BareCommand>();

    public static void bareRegister(String name, BareCommand cmd){
        bareCommandMap.put(name, cmd);
    }

    public static void dataRegister(String name, DataCommand cmd){
        dataCommandMap.put(name, cmd);
    }

    public static void creatorRegister(String name, CreatorCommand cmd){
        creatorCommandMap.put(name, cmd);
    }

    public static void humanRegister(String name, HumanCommand cmd){
        humanCommandMap.put(name, cmd);
    }

    public static void execute(String input1, String input2){
        BareCommandHistory.add_to_history(input1);
        if (creatorCommandMap.containsKey(input1)){
            creatorCommandMap.get(input1).execute(CollectingDataForCityCreator.execute(input2));
        }
        if (humanCommandMap.containsKey(input1)){
            humanCommandMap.get(input1).execute(CollectingDataForGovernor.execute());
        }
        if (dataCommandMap.containsKey(input1)){
            dataCommandMap.get(input1).execute(input2);
        }
        if (bareCommandMap.containsKey(input1)){
            bareCommandMap.get(input1).execute();
        }
    }
//    public static void execute(String[] input){
//        CommandHistory.add_to_history(input[0]);
//        switch (input[0]) {
//            case "help":
//                CommandHelp.execute();
//                break;
//            case "open":
//                CommandOpenFile.execute(input[1]);
//                break;
//            case "exit":
//                CommandExit.execute();
//                break;
//            case "remove_key":
//                CommandRemoveKey.execute(input[1]);
//                break;
//            case "insert":
//                CommandInsert.execute(CollectingDataForCityCreator.execute(input[1]));
//                break;
//            case "update":
//                CommandUpdate.execute(CollectingDataForCityCreator.execute(input[1]));
//                break;
//            case "replace_if_greater":
//                CommandReplaceIfGreater.execute(CollectingDataForCityCreator.execute(input[1]));
//                break;
//            case "show":
//                CommandShow.execute();
//                break;
//            case "filter_less_than_governor":
//                out.print("Governor name: ");
//                String t = readLine(new BufferedInputStream(in));
//                if (!t.equals("")) {
//                    Human governor = new Human(t);
//                    out.print("Governor birthday(dd-MM-yyyy HH:mm:ss): ");
//                    t = readLine(new BufferedInputStream(in));
//                    if (!t.equals("")) {
//                        try {
//                            String pattern = "dd-MM-yyyy HH:mm:ss";
//                            DateTimeFormatter Parser = DateTimeFormatter.ofPattern(pattern).withZone(ZoneId.systemDefault());
//                            governor.setBirthday(ZonedDateTime.parse(t, Parser));
//                        } catch (Exception e) {
//                            out.println("???????? ??????????");
//                        }
//                    }
//                    HumanCommandFilterLessThanGovernor.execute(governor);
//                }
//                break;
//            case "remove_all_by_government":
//                CommandRemoveAllByGovernment.execute(input[1]);
//                break;
//            case "remove_lower":
//                CommandRemoveLower.execute(CollectingDataForCityCreator.execute());
//                break;
//            case "clear":
//                CommandClear.execute();
//                break;
//            case "save":
//                CommandSave.execute(input[1]);
//                break;
//            case "print_descending":
//                CommandPrintDescending.execute();
//                break;
//            case "execute_script":
//                CommandExecuteScript.execute(input[1]);
//                break;
//            case "history":
//                CommandHistory.execute();
//                break;
//            case "info":
//                CommandInfo.execute();
//                break;
//            case "":
//                break;
//            default:
//                out.println("???? ?????????????? ??????????-???? ????????, ???????????????? ?????????????? help");
//        }
//
//    }
    public static void execute(String input, CityCreator creator){
        BareCommandHistory.add_to_history(input);
        if (creatorCommandMap.containsKey(input)){
            creatorCommandMap.get(input).execute(creator);
        }
    }
    public static void execute(String input, Human governor){
        BareCommandHistory.add_to_history(input);
        if (humanCommandMap.containsKey(input)){
            humanCommandMap.get(input).execute(governor);
        }
    }
}
