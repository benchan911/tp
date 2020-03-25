package seedu.command.student;

import seedu.command.Command;
import seedu.exception.DukeException;
import seedu.ui.DisplayList;

import static seedu.duke.Duke.studentListCollection;

/**
 * Class representing a student related command to delete an existing studentList from studentListCollection.
 */
public class DeleteStudentList extends Command {

    protected int index;
    protected DisplayList displayList = new DisplayList();

    public DeleteStudentList(int index) {
        this.index = index;
    }

    protected void deleteFromExisting() throws DukeException {
        try {
            studentListCollection.remove(index - 1);
        } catch (Exception e) {
            throw new DukeException("Deletion Failed");
        }
        displayList.printStudentListCollection();
    }

    @Override
    public void execute() throws DukeException {
        deleteFromExisting();
    }
}
