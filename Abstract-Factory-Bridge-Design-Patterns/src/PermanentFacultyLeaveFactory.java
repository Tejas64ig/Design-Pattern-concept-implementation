public class PermanentFacultyLeaveFactory extends FacultyLeaveFactory {

    @Override
    protected LeaveRequest createLeave(String leaveType, String facultyName, int days) {
        if (leaveType.equalsIgnoreCase("casual")) {
            return new PermanentCasualLeave(facultyName, days);
        } else if (leaveType.equalsIgnoreCase("medical")) {
            return new PermanentMedicalLeave(facultyName, days);
        } else if (leaveType.equalsIgnoreCase("onduty")) {
            return new PermanentOnDutyLeave(facultyName, days);
        }

        throw new IllegalArgumentException("Invalid leave type: " + leaveType);
    }
}
