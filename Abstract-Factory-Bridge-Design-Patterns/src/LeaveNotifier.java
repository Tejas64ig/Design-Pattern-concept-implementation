public abstract class LeaveNotifier {

    protected NotificationChannel channel;

    public LeaveNotifier(NotificationChannel channel) {
        this.channel = channel;
    }

    /** Lets a client swap the delivery channel on an existing notifier. */
    public void setChannel(NotificationChannel channel) {
        this.channel = channel;
    }

    public abstract void notify(LeaveRequest request);
}
