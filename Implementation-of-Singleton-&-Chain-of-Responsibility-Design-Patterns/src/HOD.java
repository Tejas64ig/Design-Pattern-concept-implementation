
class HOD extends LeaveHandler {

    public void handleLeave(LeaveRequest request) {


        if (request.getLeaveDays() >= 0) {

            if (request.getLeaveDays() <= 2) {
                System.out.println("HOD approved " + request.getLeaveDays() +
                        " day(s) leave for " + request.getEmployeeName());
            } else if (nextHandler != null) {
                nextHandler.handleLeave(request);
            }
        }
        else {
            System.out.println( "leave req SHOULD be of POSITIVE DAYS "+ "" + request.getEmployeeName());
        }
    }
}
