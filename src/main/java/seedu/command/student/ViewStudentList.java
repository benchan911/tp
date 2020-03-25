package seedu.command.student;

import seedu.command.Command;
import seedu.exception.DukeException;
import seedu.ui.DisplayList;

/**
 * Class representing a student related command to list all studentList in studentListCollection.
 */
public class ListStudent extends Command {

    protected DisplayList displayList = new DisplayList();

    @Override
    public void execute() throws DukeException {
        displayList.printStudentListCollection();
    }
}
