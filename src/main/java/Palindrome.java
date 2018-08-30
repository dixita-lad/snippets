import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class Palindrome {
    public static void main(String[] args) {
        String value= "dixid";
        StringBuilder reversed = new StringBuilder();
        reversed.append(value);

        if(value.equals(reversed.reverse().toString())) {
            System.out.println("String " + value + "is palindrome");
        }
    }


}
