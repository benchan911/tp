package seedu.command.performance;

import seedu.command.Command;
import seedu.exception.PacException;
import seedu.performance.Performance;
import seedu.performance.PerformanceList;
import seedu.ui.UI;

public class EditPerformanceList extends Command {
    PerformanceList performanceList;
    String eventName;
    UI ui;

    public EditPerformanceList(PerformanceList performanceList, String eventName) {
        this.ui = new UI();
        this.performanceList = performanceList;
        this.eventName = eventName;
    }

    private Performance getPerformance() throws PacException {
        String studentName = ui.getStudentName("edit his/her performance");
        return performanceList.getPerformance(studentName);
    }

    private void editPerformance() throws PacException {
        Performance performance = getPerformance();
        String editType = ui.getPerformanceParameter();
        if (editType.toLowerCase().trim().equals("name")) { // edit name
            performanceList.editPerformance(performance, "name");
        } else if (editType.toLowerCase().trim().equals("result")) { // edit result
            performanceList.editPerformance(performance, "result");
        }
    }

    @Override
    public void execute() throws PacException {
        editPerformance();
    }
}