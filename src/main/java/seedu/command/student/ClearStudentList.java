package seedu.command.student;

import seedu.command.Command;
import seedu.exception.DukeException;

import static seedu.duke.Duke.studentListCollection;

public class ClearStudentList extends Command {
    @Override
    public void execute() throws DukeException {
        studentListCollection.clear();
    }
}
