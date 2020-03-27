package seedu.command.interpreter;

import seedu.StudentList;
import seedu.command.Command;
import seedu.command.student.SortStudentListByName;
import seedu.command.student.ClearStudentList;
import seedu.command.student.FindStudentList;
import seedu.command.student.AddStudentList;
import seedu.command.student.DeleteStudentList;
import seedu.command.student.SortStudentList;
import seedu.command.student.ViewStudentList;
import seedu.event.EventList;
import seedu.exception.DukeException;
import seedu.ui.UI;

public class StudentCommandInterpreter extends CommandInterpreter {
    StudentList studentList;
    UI ui;

    public StudentCommandInterpreter(EventList eventList) {
        super(eventList);
        this.ui = new UI();
    }

    public Command decideCommand(String commandDescription) throws DukeException {
        String commandType = getFirstWord(commandDescription);
        String commandParameters = getSubsequentWords(commandDescription);
        switch (commandType) {
        case "add":
            return new AddStudentList(studentList);
        case "list":
            return new ViewStudentList();
        case "delete":
            try {
                return new DeleteStudentList(Integer.parseInt(commandParameters));
            } catch (Exception e) {
                throw new DukeException("Student Command Delete failed");
            }
        case "sort":
            try {
                return new SortStudentList();
            } catch (Exception e) {
                throw new DukeException("student sort failed");
            }
        case "sort/":
            try {
                return new SortStudentListByName();
            } catch (Exception e) {
                throw new DukeException("student sort by name failed");
            }
        case "find":
            try {
                return new FindStudentList();
            } catch (Exception e) {
                throw new DukeException("student find by name failed");
            }
        case "clear":
            try {
                return new ClearStudentList();
            } catch (Exception e) {
                throw new DukeException("student clear failed");
            }
        default:
            throw new DukeException("Student: Unknown command.");
        }
    }


}
