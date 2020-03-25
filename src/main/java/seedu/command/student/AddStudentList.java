package seedu.command.student;

import seedu.StudentList;
import seedu.command.Command;
import seedu.ui.DisplayList;
import seedu.ui.UI;

import static seedu.duke.Duke.studentListCollection;

/**
 * Class representing a student related command to add a new studentList to studentListCollection.
 */
public class AddStudentList extends Command {

    protected UI ui;
    protected DisplayList displayList;
    protected StudentList newStudentList;

    public AddStudentList(StudentList newStudentList) {
        this.ui = new UI();
        this.newStudentList = newStudentList;
        this.displayList = new DisplayList();
    }

    /**
     * Adds student names to a new list.
     * Once studentList is created, it will be appended to studentListCollection.
     */
    protected void addToList() {
        String listName = ui.getListName();
        StudentList studentList = new StudentList(listName);
        ui.addStudent(studentList);
        displayList.printStudentList(studentList, listName);
        studentListCollection.add(studentList);
    }

    @Override
    public void execute() {
        addToList();
    }
}
