public class LeaveApplicationNotifier extends LeaveNotifier {

    public LeaveApplicationNotifier(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void notify(LeaveRequest request) {
        String message = "Dear " + request.getFacultyName() + ", your "
                + request.getClass().getSimpleName() + " request for " + request.getDays()
                + " day(s) has been submitted successfully and is under review.";
        channel.sendNotification(request.getFacultyName(), message);
    }
}
