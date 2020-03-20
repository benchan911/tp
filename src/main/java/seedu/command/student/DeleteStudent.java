package seedu.command.student;

import seedu.command.Command;
import seedu.exception.DukeException;

import static seedu.duke.Duke.studentListCollection;

public class DeleteStudent extends Command {

    protected int index;

    public DeleteStudent(int index) {
        this.index = index;
    }

    @Override
    public void execute() throws DukeException {
        try {
            studentListCollection.remove(index);
        } catch (Exception e) {
            throw new DukeException(e.getMessage());
        }
    }
}
