package coding;

public class AtLeastTenChar {
    //trebuie sa aiba minum 10 caractere, contine doar cifre si numere, contine minim doua numere.
    public static void main(String[] args) {
        String passward = "danaa12345";
        atLeastTenChar(passward);
        System.out.println(atLeastTenChar(passward));

    }

    private static boolean atLeastTenChar(String test12345) {
        boolean b = false && true;
        int x = 10;
        if (test12345.length() == x){
        b =  true;
        }
        return b;
    }

}


