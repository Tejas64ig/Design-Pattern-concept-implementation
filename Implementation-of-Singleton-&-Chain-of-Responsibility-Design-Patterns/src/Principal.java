class Principal extends LeaveHandler {

    public void handleLeave(LeaveRequest request) {

        if (request.getLeaveDays() <= 7) {
            System.out.println("Principal approved " + request.getLeaveDays() +
                    " day(s) leave for " + request.getEmployeeName());
        } else if (nextHandler != null) {
            nextHandler.handleLeave(request);
        }
    }
}
