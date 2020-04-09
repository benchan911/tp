package seedu.command.attendance;

import seedu.attendance.AttendanceList;
import seedu.command.Command;
import seedu.exception.PacException;
import seedu.ui.UI;

public class FindAttendance extends Command {

    protected AttendanceList attendanceList;
    protected UI ui;

    public FindAttendance(AttendanceList attendances) {
        this.attendanceList = attendances;
        this.ui = new UI();
    }

    private void find() {
        if (!attendanceList.isEmpty()) {
            UI.display("Please type the name of the student you are looking for.");
            ui.readUserInput();
            String keyword = ui.getUserInput().trim().toLowerCase();
            attendanceList.findAttendance(keyword);
        } else {
            UI.display("Attendance List is empty");
        }
    }

    @Override
    public void execute() throws PacException {
        find();
    }
}

