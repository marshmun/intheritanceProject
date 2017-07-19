
/**
 * Created by marshallmunoz on 7/19/17.
 */
public class EmailNotification  extends Notification{


    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
    }





    @Override
    public void transport() {
        super.transport();
    }
}


