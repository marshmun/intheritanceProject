/**
 * Created by marshallmunoz on 7/19/17.
 */
public class TextNotification extends Notification {
    
    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
    }

}
