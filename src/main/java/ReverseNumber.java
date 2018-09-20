
public class ReverseNumber {
    public static void main(String[] args) {
        int num= -120;

        StringBuilder reversed= new StringBuilder();
        reversed.append(num);
        Boolean negative= false;
        if(reversed.charAt(0)=='-') {
            reversed.delete(0, 1);
            negative= true;
        }
        if(reversed.charAt(reversed.length()-1)=='0') {
            reversed.delete(reversed.length()-1, reversed.length());
        }
        if(negative) {
            reversed.reverse().insert(0, '-');
        }
        else {
            reversed.reverse();
        }

        System.out.println(reversed.toString());
    }
}
