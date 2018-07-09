public class CommandWords{
    private static final String[] validCommands ={
        "check","new", "withdraw", "deposit"
    };

    public CommandWords(){}

    public boolean isCommand(String input) {
        for(int i = 0; i < validCommands.length; i++){
            if(validCommands[i].equals(input)){
                return true;
            }
        }
        return false; //If we get here, string was not found in command
    }

    public void showAll(){
        for(String command : validCommands){
            System.out.println(command + " ");
        }
        System.out.println();
    }
}