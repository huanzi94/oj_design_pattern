package statemodel;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();

        ToBeCalledState toBeCalledState = new ToBeCalledState();
        toBeCalledState.action(context);
        context.process();

        CalledState calledState = new CalledState();
        calledState.action(context);
        context.process();

        EndCalledState endCalledState = new EndCalledState();
        endCalledState.action(context);
        context.process();
    }
}
