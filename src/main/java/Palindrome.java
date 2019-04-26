import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class Palindrome {
    public static void main(String[] args) {
        //String Builder solution
        String value= "dixita";
        StringBuilder reversed = new StringBuilder();
        reversed.append(value);

        if(value.equals(reversed.reverse().toString())) {
            System.out.println("String " + value + " is palindrome");
        }

        //characters solution
        String reveredString="";
        for(int i=value.length()-1; i >= 0; i--) {
            reveredString= reveredString + value.charAt(i);
        }

        if(value.equals(reveredString)) {
            System.out.println("String " + value + " is palindrome");
        }

    }


}
