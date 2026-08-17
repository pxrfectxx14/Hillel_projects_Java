package HW_13;

public class ConsolePrinter implements Printer<ConsolePrinter.Message> {

    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }

    private interface EmptyMessageHandler {
        void process();
    }

    @Override
    public void print(Message message) {
        boolean textIsEmpty = message.getText() == null || message.getText().trim().isEmpty();
        boolean senderIsEmpty = message.getSender() == null || message.getSender().trim().isEmpty();

        if (textIsEmpty && senderIsEmpty) {

            EmptyMessageHandler handler = new EmptyMessageHandler() {
                @Override
                public void process() {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            handler.process();
        } else if (senderIsEmpty) {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
        } else {
            System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());
        }
    }

    public static void main(String[] args) {
        ConsolePrinter printer = new ConsolePrinter();

        Message msg1 = new Message("Привіт!", "Користувач_01");
        Message msg2 = new Message("Привіт, друже!", "");
        Message msg3 = new Message("", "");

        printer.print(msg1);
        printer.print(msg2);
        printer.print(msg3);
    }
}