
public class FacultyLeaveFactory {

    public LeaveRequest getLeave(String facultyType, String leaveType,
                                 String facultyName, int days) {

        FacultyLeaveFactory familyFactory;

        if (facultyType.equalsIgnoreCase("Permanent")) {
            familyFactory = new PermanentFacultyLeaveFactory();
        } else if (facultyType.equalsIgnoreCase("Contract")) {
            familyFactory = new ContractFacultyLeaveFactory();
        } else {
            throw new IllegalArgumentException("Invalid faculty type: " + facultyType);
        }

        return familyFactory.createLeave(leaveType, facultyName, days);
    }

    protected LeaveRequest createLeave(String leaveType, String facultyName, int days) {
        throw new UnsupportedOperationException("Use a concrete faculty factory");
    }
}
