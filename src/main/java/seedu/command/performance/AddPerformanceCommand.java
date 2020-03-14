package seedu.command.performance;

import seedu.command.Command;
import seedu.parser.PerformanceParser;
import seedu.performance.Performance;
import seedu.performance.PerformanceList;
import seedu.ui.UI;

import java.util.List;

public class AddPerformanceCommand extends Command {
    Performance performance;
    public String commandParameters;

    /**
     * Constructor for AddPerformanceCommand. Takes String userInput
     * and parse it to get the Performance to be added.
     * @param commandParameters A String to be parsed.
     */
<<<<<<< HEAD:src/main/java/seedu/command/performance/AddPerformanceCommand.java
    public AddPerformanceCommand(String userInput) {
        this.userInput = userInput;
        performance = new PerformanceDataParser(userInput).getPerformance();
        addToList();
=======
    public AddPerformance(String commandParameters) {
        this.commandParameters = commandParameters;
        performance = new PerformanceParser().parsePerformance(commandParameters);
>>>>>>> master:src/main/java/seedu/command/performance/AddPerformance.java
    }

    /**
     * Add the performance to performance list.
     */
    public void addToList() {
        String eventName = performance.getEvent();
        PerformanceList performanceList = new PerformanceList();
        //TODO: change this list to the performance list under event input
        performanceList.addToList(performance, eventName);
    }
<<<<<<< HEAD:src/main/java/seedu/command/performance/AddPerformanceCommand.java
=======

    public void execute() {
        addToList();
    }
>>>>>>> master:src/main/java/seedu/command/performance/AddPerformance.java
}