package structural.decorator;
/*
       Bir obyektin structorunu deyismeden ona elave funksionalliqlar
       elave etmek ucun istifade olunan dizayn patterndir.
 */
public class DecoratorDesignPattern {
    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification();
        emailNotification = new SmsNotification(emailNotification);
        emailNotification = new WhatsappNotification(emailNotification);
        emailNotification.send("Salam");
    }
}

interface Notification{
    void send(String text);
}

class EmailNotification implements Notification{
    @Override
    public void send(String text) {
        System.out.println("Email sent: " + text);
    }
}

class NotificationDecorator implements Notification{

    private Notification notification;

    public NotificationDecorator(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send(String text) {
        notification.send(text);
    }
}

class SmsNotification extends NotificationDecorator{

    public SmsNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String text) {
        super.send(text);
        System.out.println("SMS sent : " + text );
    }
}

class WhatsappNotification extends NotificationDecorator{

    public WhatsappNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String text) {
        super.send(text);
        System.out.println("Whatsapp sent : " + text );
    }
}