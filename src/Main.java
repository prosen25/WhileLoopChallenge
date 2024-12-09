//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int startNumber = 5;
        int endNumber = 20;
        while (startNumber <= endNumber) {
            if (isEvenNumber(startNumber)){
                System.out.println(startNumber);
            }
            startNumber++;
        }
    }

    public static boolean isEvenNumber(int number) {

        if (number < 1) {
            return false;
        }
        return (number % 2 == 0);
    }
}