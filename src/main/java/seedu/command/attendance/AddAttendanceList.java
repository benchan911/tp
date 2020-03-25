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

public class AddAttendanceList extends Command {

    static UI ui = new UI();
    AttendanceList attendances;
    boolean isByNameList;
    String eventName;
    DisplayList displayList;

    public AddAttendanceList(AttendanceList attendances, String eventName) {
        this.isByNameList = false;
        this.attendances = attendances;
        this.eventName = eventName;
        this.displayList = new DisplayList();
    }

    public void addToList() throws DukeException {
        System.out.println("Would you like to import an existing student list? "
                + "If yes, input 'yes'. Else, input anything.");
        if (isByNameList()) {
            displayList.printStudentListCollection();
            ArrayList<String> studentNameList = fetchAttendanceList();
            if (studentNameList.isEmpty()) {
                throw new DukeException("There is no existing student list.");
            }
            appendWithExistingList(studentNameList);
        } else {
            createNewList();
        }
    }

    private void createNewList() throws DukeException {
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

    private void appendWithExistingList(ArrayList<String> studentNameList) {
        studentNameList.add("done");
        for (String studentName: studentNameList) {
            if (studentName.contains("done")) {
                System.out.println("AttendanceList added");
                break;
            }
            attendances.addToList(new Attendance(studentName,
                    ui.getAttendanceStatusOfStudent(studentName)), eventName);
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
        try {
            int index = Integer.parseInt(ui.getUserInput());
            return studentListCollection.get(index - 1).getStudentList();
        } catch (Exception e) {
            throw new DukeException("Invalid Format");
        }
    }

    private Attendance getAttendance(String parameter) throws DukeException {
        return new AttendanceParser().parseAttendance(parameter);
    }

    @Override
    public void execute() throws DukeException {
        try {
            addToList();
        } catch (Exception e) {
            throw new DukeException("Attendance List fail to add");
        }

    }
}