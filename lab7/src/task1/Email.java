package task1;

class Email extends Message {
    String sender;
    String receiver;
    String subject;

    Email(String text, String sender, String receiver, String subject){
        super(text);
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Sender: " + sender + "\nReceiver: " + receiver + "\nSubject: " + subject + "\nText: " + text;
    }
}

