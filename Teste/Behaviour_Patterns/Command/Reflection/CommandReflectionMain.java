package Command.Reflection;

public class CommandReflectionMain {
    public static void main(String[] args) {
        CommandReflect[] objs = { new CommandReflect(1), new CommandReflect(2), new CommandReflect(3) };

        // create an array of commands
        CommandReflect.Command[] cmds = {
            new CommandReflect.Command(objs[0], "addOne", 4),
            new CommandReflect.Command(objs[1], "addTwo", 5, 6),
            new CommandReflect.Command(objs[2], "addThree", 7, 8, 9)
        };

        // execute the commands
        System.out.println("\nReflection Results:");
        for(CommandReflect.Command cmd : cmds) {
            System.out.println(cmd.execute() + "    ");
        }
        System.out.println();

        // Output:
        // Reflection Results:
        // 5
        // 13
        // 27
    }
}
