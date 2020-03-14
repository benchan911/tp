package seedu.command.performance;

import seedu.command.Command;
<<<<<<< HEAD:src/main/java/seedu/command/performance/ViewStudentResultCommand.java
import seedu.exception.PerformanceStudentListException;
import seedu.module.performance.Performance;
import seedu.module.performance.PerformanceList;
=======
import seedu.exception.DukeException;
import seedu.performance.Performance;
import seedu.performance.PerformanceList;
import seedu.storage.Storage;
import seedu.ui.UI;
>>>>>>> master:src/main/java/seedu/command/performance/ViewStudentResult.java

import java.util.List;

public class ViewStudentResultCommand extends Command {
    public static List<Performance> performances;
    private String name;

    /**
     * Constructor for ViewAssignmentResultCommand. Takes String userInput
     * and parse it to get the student result list to be showed.
     * @param userInput A String to be parsed.
     */
    public ViewStudentResultCommand(String userInput) {
        String[] instructions = userInput.split(" ", 2);
        name = instructions[1];
        performances = new PerformanceList().getPerformanceList();

    }

    /**
     * Selects specific results of the assignment input by user
     * from the Performance list, and print the list in the format of
     * [module][assignment]result.
     */
    public void printStudentPerformanceList() {
        int size = performances.size();
        if (size == 0) {
            System.out.println("empty");
        } else {
            int i = 1;
            for (Performance performance : performances) {
                if (performance.studentName.equals(name)) {
                    System.out.println(i + performance.formatForStudentList());
                    i++;
                }
            }
        }
    }
<<<<<<< HEAD:src/main/java/seedu/command/performance/ViewStudentResultCommand.java
=======

    @Override
    public void execute() {
        printStudentPerformanceList();
    }
>>>>>>> master:src/main/java/seedu/command/performance/ViewStudentResult.java
}
