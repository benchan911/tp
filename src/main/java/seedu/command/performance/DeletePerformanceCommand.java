package seedu.command.performance;

import seedu.command.Command;
<<<<<<< HEAD:src/main/java/seedu/command/performance/DeletePerformanceCommand.java
import seedu.module.performance.Performance;
import seedu.module.performance.PerformanceList;
import seedu.parser.PerformanceDataParser;

import java.util.List;
=======
import seedu.performance.Performance;
import seedu.performance.PerformanceList;
import seedu.parser.PerformanceParser;
>>>>>>> master:src/main/java/seedu/command/performance/DeletePerformance.java

public class DeletePerformanceCommand extends Command {
    Performance performance;
    public String userInput;

    /**
     * Constructor for DeletePerformanceCommand. Takes String userInput
     * and parse it to get the Performance to be deleted.
     * @param commandParameters A String to be parsed.
     */
<<<<<<< HEAD:src/main/java/seedu/command/performance/DeletePerformanceCommand.java
    public DeletePerformanceCommand(String userInput) {
        this.userInput = userInput;
        performance = new PerformanceDataParser(userInput).getPerformance();
        PerformanceList.deletePerformance(performance);
    }
=======
    public DeletePerformance(String commandParameters) {
        this.userInput = commandParameters;
        performance = new PerformanceParser().parsePerformance(commandParameters);

    }

    @Override
    public void execute() {
        PerformanceList.deletePerformance(performance);
    }

>>>>>>> master:src/main/java/seedu/command/performance/DeletePerformance.java
}