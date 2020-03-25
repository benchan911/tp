package seedu.command.attendance;

import seedu.attendance.Attendance;
import seedu.attendance.AttendanceList;
import seedu.command.Command;
import seedu.exception.DukeException;
import seedu.parser.AttendanceParser;
import seedu.ui.DisplayList;
import seedu.ui.UI;

import java.util.ArrayList;

import static seedu.duke.Duke.studentListCollection;

public class AddAttendance extends Command {

    static UI ui = new UI();
    AttendanceList attendances;
    boolean isByNameList;
    String eventName;
    DisplayList displayList;

    public AddAttendance(AttendanceList attendances, String eventName) {
        this.isByNameList = false;
        this.attendances = attendances;
        this.eventName = eventName;
        this.displayList = new DisplayList();
    }

    /**
     * Executes this command on the given task list and user interface.
     */
    public void addToList() throws DukeException {
        System.out.println("Would you like to import an existing student list? "
                + "If yes, input 'yes'. Else, input anything.");
        if (isByNameList()) {
            displayList.printStudentListCollection();
            ArrayList<String> studentNameList = fetchAttendanceList();
            if (studentNameList.isEmpty()) {
                throw new DukeException("There is no existing student list.");
            }
            for (String studentName: studentNameList) {
                attendances.addToList(new Attendance(studentName,
                    ui.getAttendanceStatusOfStudent(studentName)), eventName);
            }
        } else {
            int studentNumber = 0;
            String parameter = ui.getAttendancePerimeter();
            do {
                attendances.addToList(getAttendance(parameter), eventName);
                parameter = ui.getStringInput();
                studentNumber++;
            } while (!parameter.equals("done"));
            System.out.println("You have successfully added "
                    + studentNumber + " to the attendance list.");
        }
    }

    private boolean isByNameList() {
        String reply = ui.getStringInput();
        if (reply.contains("yes")) {
            return true;
        } else {
            return false;
        }
    }

    private ArrayList<String> fetchAttendanceList() throws DukeException {
        ui.readIndexPrompt();
        ui.readUserInput();
        try{
            int index = Integer.parseInt(ui.getUserInput());
            return studentListCollection.get(index-1).getStudentList();
        } catch (Exception e) {
            throw new DukeException("Invalid Format");
        }

    }

    private Attendance getAttendance(String parameter) throws DukeException {
        return new AttendanceParser().parseAttendance(parameter);
    }

    @Override
    public void execute() throws DukeException {
        addToList();
    }
}