package Command.Reflection;

// class that implements a command pattern using reflection

import java.lang.reflect.*;

public class CommandReflect {
    private int state;
    public CommandReflect(int in) {
        state = in;
    }

    public int addOne(Integer one) {
        return state + one;
    }

    public int addTwo(Integer one, Integer two) {
        return state + one + two;
    }

    public int addThree(Integer one, Integer two, Integer three) {
        return state + one + two + three;
    }

    static public class Command {
        private Object receiver;
        private Method action;
        private Object[] args;

        public Command(Object obj, String methodName, Object... arguments) {
                receiver = obj;
                args = arguments;
                Class<?> cls = obj.getClass(); // get the object's class
                Class<?>[] argTypes = new Class[args.length];
                for (int i = 0; i < args.length; i++) {
                    argTypes[i] = args[i].getClass(); // get the class of each argument
                }
                try { action = cls.getMethod(methodName, argTypes); }
                catch (NoSuchMethodException e) { e.printStackTrace(); }
        }

        public Object execute() {
            try { return action.invoke(receiver, args); }
            catch (IllegalAccessException e) { e.printStackTrace(); }
            catch (InvocationTargetException e) { e.printStackTrace(); }
            return null;
        }
    }
}

