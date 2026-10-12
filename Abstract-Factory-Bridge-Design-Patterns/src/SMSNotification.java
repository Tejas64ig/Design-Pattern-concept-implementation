public class SMSNotification implements NotificationChannel {

    @Override
    public void sendNotification(String recipient, String message) {
        System.out.println("   [SMS -> " + recipient + "] " + message);
    }
}
