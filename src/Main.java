public class Main {
    public static void main(String[] args) {
        String assign;
        boolean odd;
        int number = 4;

        if(5%2 == 0)
            odd = false;
        else
            odd = true;

        if(odd)
            assign = "odd";
        else
            assign = "even";
        System.out.print("Your number is " + number + " and is "+ assign + ".");
    }
}