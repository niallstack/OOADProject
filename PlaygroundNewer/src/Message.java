/**
 * Created by t00166011 on 10/12/2015.
 */



public class Message {
    private String textMessage;
    private int likeCounter;
    private Student author;

    public Message(String textMessage, Student student) {
        this.textMessage = textMessage;
        this.author=student;
        this.likeCounter=0;
    }

    public void like() {
        this.likeCounter++;

    }

    //Getters and Setters
    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    public int getLikeCounter() {
        return likeCounter;
    }

    public void setLikeCounter(int likeCounter) {
        this.likeCounter = likeCounter;
    }

    public Student getAuthor() {
        return author;
    }

    public void setAuthor(Student author) {
        this.author = author;
    }


}
