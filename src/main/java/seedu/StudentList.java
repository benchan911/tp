package seedu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Class representing a studentList.
 */
public class StudentList {

    public ArrayList<String> studentList;
    public String listName;
    public String studentName;

    public StudentList(String listName) {
        this.listName = listName;
        studentList = new ArrayList<String>();
    }

    /**
     * Adds a new student name to studentList.
     * @param studentName The name of the student.
     */
    public void addToList(String studentName) {
        studentList.add(studentName);
    }

    /**
     * Retrieves the existing studentList.
     * @return studentList
     */
    public ArrayList<String> getStudentList() {
        return studentList;
    }

    /**
     * Retrieves the listName.
     * @return listName
     */
    public String getListName() {
        return listName;
    }

    public void sortAscending() {
        Collections.sort(studentList);
    }

    /**
     * Display the existing student names in the studentList.
     */
    public void showList() {
        System.out.println(listName);
        int index = 1;
        for (String name : studentList) {
            System.out.print(index + ". ");
            System.out.println(name);
            index++;
        }
    }

    public static Comparator<StudentList> listNameComparator = new Comparator<StudentList>() {
        public int compare(StudentList s1, StudentList s2) {
            String listName1 = s1.getListName().toUpperCase();
            String listName2 = s2.getListName().toUpperCase();
            return listName1.compareTo(listName2);
        }
    };
}
