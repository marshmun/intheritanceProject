/**
 * Created by marshallmunoz on 7/19/17.
 */
public class main {
    public static void main(String[] args) {

    EmailNotification emailNotification = new EmailNotification("love", "I'm so happy","google", "happieness");
    TextNotification textNotification = new TextNotification("happiness","is","worth", "it");



    textNotification.transport();
    emailNotification.transport();


    }

}
