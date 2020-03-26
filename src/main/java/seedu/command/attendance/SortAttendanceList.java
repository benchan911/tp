package seedu.command.attendance;

import seedu.attendance.AttendanceList;
import seedu.command.Command;
import seedu.exception.DukeException;
import seedu.ui.UI;

public class SortAttendanceList extends Command {

    protected UI ui;
    protected AttendanceList attendances;

    public SortAttendanceList(AttendanceList attendances) {
        this.attendances = attendances;
        this.ui = new UI();
    }

    @Override
    public void execute() throws DukeException {
        attendances.sort();
        System.out.println("sorted");
    }
}
