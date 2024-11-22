package Message;

public class Decipherer {

    public static String decipherMessage(String message) {

        int key = message.length() / 2;

        int start = 5;
        int end = start + key;
        String subString  = message.substring(start, end);

        String modifiedString  = subString .replace("@#?", " ");

        String reversedString  = new StringBuffer(modifiedString ).reverse().toString();

        return reversedString;
    }

    public static void main(String[] args) {
        // Messages à décoder
        String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
        String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
        String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";

        // Appel de la méthode decipherMessage sur chaque message
        System.out.println("Message 1 décodé : " + decipherMessage(message1));
        System.out.println("Message 2 décodé : " + decipherMessage(message2));
        System.out.println("Message 3 décodé : " + decipherMessage(message3));
    }
}
