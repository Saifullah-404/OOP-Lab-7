package task1;

class SMS extends Message {
    String recipientContactNo;

    SMS(String text, String recipientContactNo){
        super(text);
        this.recipientContactNo = recipientContactNo;
    }

    @Override
    public String toString() {
        return "Recipient Contact No: " + recipientContactNo + "\nText: " + text;
    }
}
