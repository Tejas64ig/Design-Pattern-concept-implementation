class Director extends LeaveHandler {

    public void handleLeave(LeaveRequest request) {

        System.out.println("Director approvedddddd " + request.getLeaveDays() +
                " day leave for " + request.getEmployeeName());
    }
}
