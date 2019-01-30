package coding;

public class StringReturnNoOfWords {

    private static String testString;

    public static void main(String[] args) {
        String newString = "Ana are mere si pere";
        numberOfWords(newString);
        System.out.println(numberOfWords(newString));
    }

    private static int numberOfWords(String testString){
        int count = 1;

        for (int i = 0; i < testString.length(); i++ ) {

            if ( ' ' == testString.charAt(i)) {
                count++;
            }
        }

        return count;



    }

}
