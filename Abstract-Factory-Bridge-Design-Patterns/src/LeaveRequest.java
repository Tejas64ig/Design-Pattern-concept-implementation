public abstract class LeaveRequest {

    protected String facultyName;
    protected int days;

    public LeaveRequest(String facultyName, int days) {
        this.facultyName = facultyName;
        this.days = days;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public int getDays() {
        return days;
    }

    public abstract void showDetails();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{facultyName='" + facultyName
                + "', days=" + days + "}";
    }
}
