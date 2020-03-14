package seedu.duke;

<<<<<<< HEAD
import java.util.Scanner;

public class Duke {
    /**
     * Main entry-point for the java.duke.Duke application.
     */
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";

        System.out.println("Hello from\n" + logo);
        System.out.println("What is your name?");

        Scanner in = new Scanner(System.in);
        System.out.println("Hello " + in.nextLine());
=======
import seedu.command.Bye;
import seedu.command.CommandInterpreter;
import seedu.command.Command;
import seedu.event.EventList;
import seedu.ui.UI;
import seedu.exception.DukeException;

public class Duke {
    protected UI ui;
    protected CommandInterpreter interpreter;
    protected EventList eventList;

    public Duke() {
        ui = new UI();
        eventList = new EventList();  //TODO: new Storage().load()
        interpreter = new CommandInterpreter(eventList);
    }

    public void run() {
        UI.setUserName();
        Command command = null;

        do {
            UI.readUserInput();
            try {
                command = interpreter.decideCommand(ui.getUserInput());
                command.execute();
            } catch (DukeException m) {
                System.out.println(m);
            }
        } while (isNotBye(command));
    }

    private boolean isNotBye(Command command) {
        return !(command instanceof Bye);
    }

    /**
     * Main entry-point for the java.duke.Duke application.
     */
    public static void main(String[] args) {
        new Duke().run();
>>>>>>> master
    }
}
