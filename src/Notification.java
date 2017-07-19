import java.time.LocalDateTime;

/**
 * Created by marshallmunoz on 7/19/17.
 */
public class Notification {
    private LocalDateTime creatAt;
    private String subject;
    private String body;
    protected String status;

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
        status = "I love Monster energy drinks!";
        textDisplay();
    }

    public void transport()  {
        throw new NoTransportException();

    }
    public void showStatus(){
        System.out.println(status);
    }
    protected void textDisplay(){
        System.out.println("HEY IM WALKIN HERE");
    }
}
