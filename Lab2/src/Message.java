//Question 2
public class Message {

    private String sender,recipient,message;

    public Message(String sender,String recipient)
    {
        setSender(sender);
        setRecipient(recipient);
    }

    public String getSender(){
        return sender;
    }

    public String getRecipient(){
        return recipient;
    }

    public void setSender(String sender){
        this.sender = sender;
    }

    public void setRecipient(String recipient){
        this.recipient = recipient;
    }
}
