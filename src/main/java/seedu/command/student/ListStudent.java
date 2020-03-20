package seedu.command.student;

import seedu.StudentList;
import seedu.command.Command;
import seedu.exception.DukeException;

import static seedu.duke.Duke.studentListCollection;

public class ListStudent extends Command {

    @Override
    public void execute() throws DukeException {
        try {
            for (StudentList studentList : studentListCollection) {
                studentList.showList();
                System.out.print("-----");
            }
        } catch (Exception e) {
            throw new DukeException(e.getMessage());
        }

    }
}
