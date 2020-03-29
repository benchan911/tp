package seedu.parser;

import seedu.StudentList;

import java.util.ArrayList;

import static seedu.duke.Duke.studentListCollection;

public class StudentListStorageParser {

    public void loadFromStorage() {
        // todo: Loading from storage
        // need the read function
    }

    public String toStorage() {
        String data = "";
        for (StudentList studentList: studentListCollection) {
            data = data.concat(studentList.getListName());
            ArrayList<String> nameList = studentList.getStudentList();
            for (String studentName : nameList) {
                data = data.concat("|" + studentName);
            }
            data = data.concat("\n");
        }
        return data;
    }
}
