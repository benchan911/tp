package seedu.command;


import seedu.command.performance.AddPerformanceCommand;
import seedu.command.performance.DeletePerformanceCommand;
import seedu.command.performance.ViewAssignmentResultCommand;
import seedu.command.performance.ViewStudentResultCommand;
import seedu.exception.DukeException;

import static seedu.parser.Parser.getCommandWord;

public class CommandInterpreter {

    /**
     * Decide the command from userInput.
     *
     * @param userInput The userInput from the Ui.
     * @return The command object.
     * @throws DukeException If the command is undefined.
     */
<<<<<<< HEAD
    public static Command executeCommand(String userInput) throws DukeException {
        String commandWord = getCommandWord(userInput);
        switch (commandWord) {
        //case "addEvent":
        //  create new EventObject
        case "addPerformance":
            return new AddPerformanceCommand(userInput);
        case "deletePerformance":
            return new DeletePerformanceCommand(userInput);
        case "view_student_result":
            return new ViewStudentResultCommand(userInput);
        case "view_assignment_result":
            return new ViewAssignmentResultCommand(userInput);
        default:
            throw new DukeException("UNKNOWN COMMAND");
=======
    public Command decideCommand(String userInput) throws DukeException {
        Command command = null;

        String commandCategory = getFirstWord(userInput);
        String commandDescription = "";
        // only look for 2nd to last words if commandCategory requires.
        if (!commandCategory.equals("bye")) {
            commandDescription = getSubsequentWords(userInput);
        }

        switch (commandCategory) {
        case "bye":
            command = new Bye();
            break;
        case "event":
            EventCommandInterpreter eci = new EventCommandInterpreter(eventList);
            command = eci.decideCommand(commandDescription);
            break;
        case "attendance":
            //TODO AttendanceCommandInterpreter
            break;
        case "performance":
            PerformanceCommandInterpreter pci = new PerformanceCommandInterpreter(eventList);
            command = pci.decideCommand(commandDescription);
            break;
        default:
            throw new DukeException("Unknown command type.");
        }

        if (command == null) {
            throw new DukeException("Duke is null.");
>>>>>>> master
        }
    }
}

