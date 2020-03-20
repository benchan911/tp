package seedu.command.student;

import seedu.StudentList;
import seedu.command.Command;
import seedu.duke.Duke;
import seedu.exception.DukeException;
import seedu.ui.UI;

import java.util.ArrayList;

import static seedu.duke.Duke.studentListCollection;

public class AddStudent extends Command {

    static UI ui = new UI();
    StudentList newStudentList;
    private String studentName;
    private String listName;
    private StudentList studentList;

    public AddStudent(StudentList newStudentList) {
        this.newStudentList = newStudentList;
    }

    @Override
    public void execute() throws DukeException {
        //todo make more OOP
        System.out.println("What is the name of your list?");
        ui.readUserInput();
        listName = ui.getUserInput();
        studentList = new StudentList(listName);
        try {
            do {
                System.out.println("Please enter a student Name. If you are finished, enter done");
                ui.readUserInput();
                studentName = ui.getUserInput();
                if (studentName.contains("done")) {
                    break;
                }
                studentList.addToList(studentName);
            } while (!studentName.equals("done"));
        } catch (Exception e) {
            throw new DukeException(e.getMessage());
        }
        System.out.println("Student List created, named -- " + listName);
        studentList.showList();
        studentListCollection.add(studentList);
    }
}
