public class EmailNotification implements NotificationChannel {

    @Override
    public void sendNotification(String recipient, String message) {
        System.out.println("   [EMAIL -> " + recipient + "] " + message);
    }
}
