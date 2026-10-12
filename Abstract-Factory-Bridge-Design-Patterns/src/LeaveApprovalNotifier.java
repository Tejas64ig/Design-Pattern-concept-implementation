public class LeaveApprovalNotifier extends LeaveNotifier {

    public LeaveApprovalNotifier(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void notify(LeaveRequest request) {
        String message = "Dear " + request.getFacultyName() + ", the decision on your "
                + request.getClass().getSimpleName() + " request (" + request.getDays()
                + " day(s)) is now available. Please check the leave portal for the outcome.";
        channel.sendNotification(request.getFacultyName(), message);
    }
}
