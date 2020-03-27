package seedu.command.student;

import seedu.StudentList;
import seedu.command.Command;
import seedu.exception.DukeException;
import seedu.ui.DisplayList;
import seedu.ui.UI;

import java.util.ArrayList;

import static seedu.duke.Duke.studentListCollection;

public class FindStudentList extends Command {

    private String name;
    protected ArrayList<StudentList> searchResults = new ArrayList<>();
    protected DisplayList displayList = new DisplayList();
    protected UI ui = new UI();

    protected void find() throws DukeException {
        ui.readUserInput();
        name = ui.getUserInput();
        for (int i = 0; i < studentListCollection.size(); i++) {
            if (studentListCollection.get(i).getListName().contains(name)) {
                searchResults.add(studentListCollection.get(i));
            }
        }
        displayList.printSearchResults(searchResults);
    }


    @Override
    public void execute() throws DukeException {
        find();
    }
}
