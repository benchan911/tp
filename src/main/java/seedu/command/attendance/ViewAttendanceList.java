package seedu.command.attendance;

import seedu.attendance.AttendanceList;
import seedu.command.Command;
import seedu.exception.PacException;

/**
 * Class representing an attendance related command to List an attendanceList of a specific event.
 */
public class ViewAttendanceList extends Command {

    protected AttendanceList attendanceList;

    public ViewAttendanceList(AttendanceList attendances) {
        this.attendanceList = attendances;
    }

    /**
     * To view the existing attendanceList.
     * If the attendanceList is empty, it will display a message to inform that the attendanceList is empty.
     * @throws PacException If AttendanceList is empty or AttendanceList fail to view.
     */
    private void view() throws PacException {
        if (attendanceList.isEmpty()) {
            throw new PacException("Attendance List is empty");
        } else {
            attendanceList.displayAttendanceList();
        }
    }

    @Override
    public void execute() throws PacException {
        view();
    }
}
