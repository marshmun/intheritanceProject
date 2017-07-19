
/**
 * Created by marshallmunoz on 7/19/17.
 */
public class EmailNotification  extends Notification{


    private String recipient;
    private String smtpProvider;

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    public void setstatus(String status) {
        this.status = status;
    }

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
    }



    @Override
    public void transport() {
        System.out.println(recipient+ smtpProvider + getSubject() + getBody());
    }
}


