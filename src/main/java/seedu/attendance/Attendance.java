package seedu.attendance;

/**
 * Class representing attendance of a student.
 */
public class Attendance {

    protected String studentName;
    protected String isPresent;

    public Attendance(String studentName, String isPresent) {
        this.studentName = studentName;
        this.isPresent = isPresent;
    }

    /**
     * Retrieves the name of the student.
     * @return studentName the name of the student.
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * Retrieves the attendance status of the student.
     * @return isPresent the attendance status of the student.
     */
    public String getAttendanceStatus() {
        return isPresent;
    }

    @Override
    public String toString() {
        return studentName + " " + isPresent;
    }

}
