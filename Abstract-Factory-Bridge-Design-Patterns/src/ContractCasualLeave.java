public class ContractCasualLeave extends LeaveRequest {

    private static final int MAX_DAYS = 6; // yearly quota for contract faculty

    public ContractCasualLeave(String facultyName, int days) {
        super(facultyName, days);
    }

    @Override
    public void showDetails() {
        System.out.println("[Contract Faculty | Casual Leave] " + facultyName
                + " applied for " + days + " day(s). (Quota: " + MAX_DAYS + " days/year)");
        System.out.println("   -> " + (isApproved() ? "APPROVED" : "REJECTED - exceeds quota"));
    }

    public boolean isApproved() {
        return days <= MAX_DAYS;
    }
}
