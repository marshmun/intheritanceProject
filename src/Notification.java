import java.time.LocalDateTime;

/**
 * Created by marshallmunoz on 7/19/17.
 */
public class Notification {
    private LocalDateTime creatAt;
    private String subject;
    private String body;

    public LocalDateTime getCreatAt() {
        return creatAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }



    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        creatAt = LocalDateTime.now();
    }

    public void transport()  {
        throw new NoTransportException();

    }
}
