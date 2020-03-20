package seedu.command.student;

import seedu.StudentList;
import seedu.command.Command;
import seedu.exception.DukeException;

import static seedu.duke.Duke.studentListCollection;

public class ListStudent extends Command {

    @Override
    public void execute() throws DukeException {
        int index = 1;
        try {
            for (StudentList studentList : studentListCollection) {
                System.out.print("[" + index + "]");
                studentList.showList();
                System.out.println("-----");
                index++;
            }
        } catch (Exception e) {
            throw new DukeException(e.getMessage());
        }

    }
}
