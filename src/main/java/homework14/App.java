package main.java.homework14;

public class App implements Printer {

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

        public String getSender() {
            return sender;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

    }

    @Override
    public void print(Message message){

        String text = message.getText();
        String sender = message.getSender();

        if ((text == null || text.isEmpty()) && (sender == null || sender.isEmpty())) {

            Printer annonPrinter = new Printer() {

                @Override
                public void print(Message msg){

                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };

            annonPrinter.print(message);

        }

        else if (sender == null || sender.isEmpty()) {

            System.out.println("Анонімний користувач відправив повідомлення: " + text);

        }

        else {

            System.out.println("Користувач " + sender + " відправив повідомлення: " + text);

        }
    }

}
