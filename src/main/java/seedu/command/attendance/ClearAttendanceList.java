package seedu.command.attendance;

import seedu.attendance.AttendanceList;
import seedu.command.Command;
import seedu.exception.DukeException;
import seedu.ui.UI;

public class ClearAttendanceList extends Command {

    protected UI ui;
    protected AttendanceList attendances;
    protected String eventName;

    public ClearAttendanceList(AttendanceList attendances, String eventName) {
        this.attendances = attendances;
        this.ui = new UI();
        this.eventName = eventName;
    }

    @Override
    public void execute() throws DukeException {
        try {
            attendances.clearList();
            ui.clearAttendanceMessage(eventName);
        } catch (Exception e) {
            throw new DukeException("Attendance List fail to clear");
        }
    }
}
