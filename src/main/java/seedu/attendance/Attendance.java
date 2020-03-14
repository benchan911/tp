package seedu.attendance;

/**
 * Class representing attendance of a student.
 */
public class Attendance {
    public String eventName;
    public String studentName;
    public String description;
    public boolean hasAttended;

    /**
     * The class that handles the attendance.
     * Contains hasAttended input.
     *
     * @param eventName The name of the module.
     * @param studentName The name of the student.
     * @param description The description of the lesson.
     * @param hasAttended The status of the attendance.
     */
<<<<<<< HEAD:src/main/java/seedu/module/attendance/Attendance.java
    public Attendance(String moduleName, String studentName, String description, boolean hasAttended) {
        super(moduleName);
=======
    public Attendance(String eventName, String studentName, String description, String hasAttended) {
        this.eventName = eventName;
>>>>>>> master:src/main/java/seedu/attendance/Attendance.java
        this.studentName = studentName;
        this.description = description;
        this.hasAttended = hasAttended;
    }

    /**
     * The class that handles the attendance.
     * Does not contain hasAttended input.
     *
     * @param studentName The name of the student.
     * @param description The description of the lesson.
     *
     */

    public Attendance(String eventName, String studentName, String description) {
        this.eventName = eventName;
        this.studentName = studentName;
        this.description = description;
        this.hasAttended = false;
    }

    /**
     * To retrieve the name of the module.
     *
     * @return The name of the module.
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * To retrieve the name of student.
     *
     * @return The name of student.
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * To retrieve the description of the lesson.
     *
     * @return The description of the lesson.
     */
    public String getDescription() {
        return description;
    }

    /**
     * To retrieve the status of the attendance.
     *
     * @return The status of the attendance.
     */
    public boolean getAttendance() {
        return hasAttended;
    }

    @Override
    public String toString() {
        return eventName + " " + studentName + " " + description + " " + hasAttended;
    }

}
