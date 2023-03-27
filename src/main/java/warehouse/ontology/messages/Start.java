package warehouse.ontology.messages;

import jade.content.Concept;
import warehouse.ontology.DigitalAgent;
import warehouse.ontology.PhysicalAgent;

public class Start implements Concept {
    private PhysicalAgent sender;
    private DigitalAgent receiver;
    private String message;

    public Start() {
        this.message = Message.START.toString();
    }

    public PhysicalAgent getSender() {
        return sender;
    }

    public void setSender(PhysicalAgent sender) {
        this.sender = sender;
    }

    public DigitalAgent getReceiver() {
        return receiver;
    }

    public void setReceiver(DigitalAgent receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage() {
        this.message = Message.START.toString();
    }
}
