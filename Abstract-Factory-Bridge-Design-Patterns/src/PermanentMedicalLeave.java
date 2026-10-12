public class PermanentMedicalLeave extends LeaveRequest {

    private static final int MAX_DAYS = 15; // yearly quota for permanent faculty

    public PermanentMedicalLeave(String facultyName, int days) {
        super(facultyName, days);
    }

    @Override
    public void showDetails() {
        System.out.println("[Permanent Faculty | Medical Leave] " + facultyName
                + " applied for " + days + " day(s). (Quota: " + MAX_DAYS + " days/year)");
        System.out.println("   -> " + (isApproved() ? "APPROVED" : "REJECTED - exceeds quota"));
    }

    public boolean isApproved() {
        return days <= MAX_DAYS;
    }
}
