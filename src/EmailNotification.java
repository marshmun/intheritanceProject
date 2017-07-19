
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

    @Override
    public void textDisplay() {
        System.out.println("I'm Public everyone can see me!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailNotification that = (EmailNotification) o;

        if (recipient != null ? !recipient.equals(that.recipient) : that.recipient != null) return false;
        return smtpProvider != null ? smtpProvider.equals(that.smtpProvider) : that.smtpProvider == null;
    }

    @Override
    public int hashCode() {
        int result = recipient != null ? recipient.hashCode() : 0;
        result = 31 * result + (smtpProvider != null ? smtpProvider.hashCode() : 0);
        return result;
    }
    @Override
    public Object clone(){
            return new EmailNotification(getSubject(), getBody(), getRecipient(), getSmtpProvider());
    }
}


