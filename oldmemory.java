public class oldmemory {
    public static void main(String[] args) {

        String s = "hi my name is sam";
        String word = "";

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ') {
                word = word + s.charAt(i);
            } else {
                System.out.println(word);
                word = "";
            }
        }

        System.out.println(word);   // last word
    }
}