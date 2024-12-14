package com.example.padmaoilcompany;

public class Notification {

    private String notificationId, recipient, massage;

    public Notification() {
    }

    public Notification(String notificationId, String recipient, String massage) {
        this.notificationId = notificationId;
        this.recipient = recipient;
        this.massage = massage;
    }

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "notificationId='" + notificationId + '\'' +
                ", recipient='" + recipient + '\'' +
                ", massage='" + massage + '\'' +
                '}';
    }
}
