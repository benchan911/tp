package seedu.command.attendance;

import seedu.attendance.AttendanceList;
import seedu.command.Command;
import seedu.exception.PacException;
import seedu.ui.UI;

public class EditAttendance extends Command {

    protected UI ui;
    protected AttendanceList attendanceList;
    protected String eventName;


    public EditAttendance(AttendanceList attendances) {
        this.attendanceList = attendances;
        this.ui = new UI();
    }

    private void edit() {
        attendanceList.displayAttendanceList();
        UI.display("Please state the index of the student you wish to edit");

        int index;
        ui.readUserInput();
        index = Integer.parseInt(ui.getUserInput()) - 1;
        UI.display(attendanceList.getAttendanceList().get(index).toString());
        UI.display("Do you wish to change the name or change the status");
        ui.readUserInput();
        String input;
        input = ui.getUserInput();
        if (input.equals("name")) {
            UI.display("What do you want to change the name to?");
            ui.readUserInput();
            input = ui.getUserInput();
            attendanceList.getAttendanceList().get(index).setName(input);
        } else {
            UI.display("What do you want to change the status to?");
            ui.readUserInput();
            input = ui.getUserInput();
            attendanceList.getAttendanceList().get(index).setStatus(input);
        }
        attendanceList.displayAttendanceList();
    }

    @Override
    public void execute() throws PacException {
        edit();
    }

}
