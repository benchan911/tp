package seedu.command.performance;

import seedu.command.Command;
<<<<<<< HEAD:src/main/java/seedu/command/performance/ViewAssignmentResultCommand.java
import seedu.module.performance.Performance;
import seedu.module.performance.PerformanceList;
=======
import seedu.performance.Performance;
import seedu.performance.PerformanceList;
import seedu.ui.UI;
>>>>>>> master:src/main/java/seedu/command/performance/ViewAssignmentResult.java

import java.util.List;

public class ViewAssignmentResultCommand extends Command {
    public static List<Performance> performances;
    private String assignment;

    /**
     * Constructor for ViewAssignmentResultCommand. Takes String userInput
     * and parse it to get the assignment result list to be showed.
     * @param userInput A String to be parsed.
     */
    public ViewAssignmentResultCommand(String userInput) {
        String[] instructions = userInput.split(" ", 2);
        assignment = instructions[1];
        performances = new PerformanceList().getPerformanceList();

    }

    /**
     * Selects specific results of the assignment input by user
     * from the Performance list, and print the list in the format of
     * [module][student]result.
     */
    public void printAssignmentPerformanceList() {
        int size = performances.size();
        if (size == 0) {
            UI.display("The list is empty.");
        } else {
            int i = 1;
            UI.printListHeader("Index", "Module", "Assignment", "Result");
            for (Performance performance : performances) {
                if (performance.assignment.equals(assignment)) {
                    UI.printListBody(i, performance.eventName, performance.assignment, performance.getResult());
                    i++;
                }
            }
        }
    }
<<<<<<< HEAD:src/main/java/seedu/command/performance/ViewAssignmentResultCommand.java
=======

    @Override
    public void execute() {
        printAssignmentPerformanceList();
    }
>>>>>>> master:src/main/java/seedu/command/performance/ViewAssignmentResult.java
}