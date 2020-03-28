package seedu.command.student;

import seedu.StudentList;
import seedu.command.Command;
import seedu.exception.DukeException;
import seedu.ui.DisplayList;
import seedu.ui.DisplayTable;
import seedu.ui.UI;

import static seedu.duke.Duke.studentListCollection;

/**
 * Class representing a student related command to view all existing studentList in studentListCollection.
 */
public class ViewStudentList extends Command {

    protected UI ui = new UI();

    /**
     * Method to display all existing student list.
     * @throws DukeException If studentListCollection is empty.
     */
    private void displayStudentList() throws DukeException {
        ui.printStudentListCollection();
    }

    @Override
    public void execute() throws DukeException {
        displayStudentList();
    }
}
