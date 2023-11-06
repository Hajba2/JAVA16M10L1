import java.util.regex.Pattern;

public class RegExp {

    public static void main(String[] args) {
        String n = "888-999-8977\n";
        String regExp = "[0-9]{3}-[0-9]{3}-[0-9]{4}\\n";

        System.out.println("regExp = " + regExp);

        System.out.println("n.matches(\"[0-9]{3}-[0-9]{3}-[0-9]{4}\\\\n\") = " +
                n.matches(regExp));
    }
}
