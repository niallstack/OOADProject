import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    public void printMessages(String color) {
        Collections.sort(messages, new Comparator<Message>(){
            public int compare(Message m1,Message m2){
                return   m2.getLikeCounter()-m1.getLikeCounter();
            }});

        for (Message m : messages) {
           m.showMessage(color);
        }
    }


    public List<Message> getMessages() {
        return messages;
    }

}
