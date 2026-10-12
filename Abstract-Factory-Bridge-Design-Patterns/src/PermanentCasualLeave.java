public class PermanentCasualLeave extends LeaveRequest {

    private static final int MAX_DAYS = 12; // yearly quota for permanent faculty

    public PermanentCasualLeave(String facultyName, int days) {
        super(facultyName, days);
    }

    @Override
    public void showDetails() {
        System.out.println("[Permanent Faculty | Casual Leave] " + facultyName
                + " applied for " + days + " day(s). (Quota: " + MAX_DAYS + " days/year)");
        System.out.println("   -> " + (isApproved() ? "APPROVED" : "REJECTED - exceeds quota"));
    }

    public boolean isApproved() {
        return days <= MAX_DAYS;
    }
}
