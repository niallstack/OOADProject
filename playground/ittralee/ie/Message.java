package playground.ittralee.ie;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author t00166011
 */
public class Message {
    private String textMessage;
    private int like;
    private Student author;
    
    public Message(String textMessage, Student author) {
        this.textMessage = textMessage;
        this.author=author;
        this.like=0;
    }
    
    public void like(){
        this.like++;
    }
    
    
    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }
    
    
                
    
}
