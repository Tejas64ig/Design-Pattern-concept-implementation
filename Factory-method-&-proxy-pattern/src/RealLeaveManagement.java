class RealLeaveManagement implements LeaveManagement {

    public void submitLeave(LeaveRequest leave) {

        leave.applyLeave();

        System.out.println("Leave Submitted Successfully.");

    }

}