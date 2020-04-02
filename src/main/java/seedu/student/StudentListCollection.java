package seedu.student;

import java.util.ArrayList;

public class StudentListCollection extends ArrayList<StudentList> {

    public boolean isExistedListName(String name) {
        for (int i = 0; i < this.size(); ++i) {
            if (this.get(i).getListName().toLowerCase().equals(name.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder data = new StringBuilder();
        for (int i = 0; i < this.size(); ++i) {
            data.append(this.get(i).toString() + System.lineSeparator());
        }
        return data.toString();
    }
}
