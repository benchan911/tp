package seedu.attendance;

import seedu.ui.UI;

import java.util.ArrayList;
import java.util.List;

public class AttendanceList {

    public static List<Attendance> attendanceList;
    public static int numberOfAttendee;

    public AttendanceList() {
        attendanceList = new ArrayList<>();
        numberOfAttendee = attendanceList.size();
    }

    public List<Attendance> getAttendanceList() {
        return attendanceList;
    }

    public int getSize() {
        return attendanceList.size();
    }

    public void addToList(Attendance attendance, String eventName) {
        attendanceList.add(attendance);
        UI.addAttendanceMessage(attendance.studentName, eventName);
    }

    public static void deleteAttendance(Attendance attendance) {
        boolean hasDeleted = false;
        if (numberOfAttendee > 0) {
            for (Attendance p : attendanceList) {
                if (p != null
                        && attendance.getDescription().equals(p.getDescription())
                        && attendance.getEvent().equals(p.getEvent())
                        && attendance.getStudent().equals(p.getStudent())) {
                    attendanceList.remove(p);
                    hasDeleted = true;
                }
            }
        }
        UI.deleteAttendanceMessage(attendance, hasDeleted);
    }

}
