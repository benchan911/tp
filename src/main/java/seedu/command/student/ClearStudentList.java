package seedu.command.student;

import seedu.command.Command;
import seedu.exception.DukeException;
import seedu.ui.UI;

import static seedu.duke.Duke.studentListCollection;

public class ClearStudentList extends Command {

    private UI ui = new UI();

    @Override
    public void execute() throws DukeException {
        studentListCollection.clear();
        ui.clearMessage();
    }
}
