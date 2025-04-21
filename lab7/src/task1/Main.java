package task1;

public class Main {
    public static void main(String[] args) {
        SMS texts = new SMS("Hello World!","123456789");
        Email emails = new Email("Hello Darshan!", "Saif Ullah", "Darshan", "Do you want to code?");

        System.out.println(texts.toString());
        System.out.println();
        System.out.println(emails.toString());
    }
}
