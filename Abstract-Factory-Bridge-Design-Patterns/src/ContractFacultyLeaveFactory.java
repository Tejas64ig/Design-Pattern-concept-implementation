
public class ContractFacultyLeaveFactory extends FacultyLeaveFactory {

    @Override
    protected LeaveRequest createLeave(String leaveType, String facultyName, int days) {
        if (leaveType.equalsIgnoreCase("casual")) {
            return new ContractCasualLeave(facultyName, days);
        } else if (leaveType.equalsIgnoreCase("medical")) {
            return new ContractMedicalLeave(facultyName, days);
        } else if (leaveType.equalsIgnoreCase("onduty")) {
            return new ContractOnDutyLeave(facultyName, days);
        }

        throw new IllegalArgumentException("Invalid leave type: " + leaveType);
    }
}
