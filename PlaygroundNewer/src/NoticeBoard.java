import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by t00166011 on 10/12/2015.
 */
public class NoticeBoard {
    private List<Message> messages;

    public NoticeBoard()
    {
        this.messages = new ArrayList<>();
    }

    public void addMessage(Message message) {
        this.messages.add(message);
    }

    public void printMessages() {
        for (Message m : messages) {
            System.out.println(m.getTextMessage());
        }
    }
    public void printMostRecentMessages(){
        Collections.reverse(messages);
    }

}
