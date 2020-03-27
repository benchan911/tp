package seedu.command.student;

import seedu.StudentList;
import seedu.command.Command;
import seedu.duke.Duke;
import seedu.exception.DukeException;
import seedu.ui.UI;

import java.util.Collections;

import static seedu.StudentList.listNameComparator;

/**
 * Class representing a student related command to sort all studentLists
 * within studentListCollection by alphabetical order.
 */
public class SortStudentListByName extends Command {

    protected StudentList studentList;
    private UI ui = new UI();

    private void sort() {
        Collections.sort(Duke.studentListCollection, listNameComparator);
    }

    @Override
    public void execute() throws DukeException {
        sort();
        ui.displayStudentMessage("SortStudent List by name");
    }
}