import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {

        //String name = "Sunil";
      //  String lstring=name.toLowerCase(); //lowercase
       // String sr = name.toUpperCase(); // uppercase
       // System.out.println(sr);
        //String nonTrimmedString ="     Sunil     ";
        //String TrimmedString=nonTrimmedString.trim();
        //System.out.println(nonTrimmedString);
        //System.out.println(name.substring(3));
        //System.out.println(name.replace("i","s"));//'replace
        //System.out.println(name.startsWith("su"));
        //System.out.println(name.indexOf("s"));
        //System.out.println(name.endsWith("il"));
        //Sys8
        // 8tem.out.println(name.charAt(2));
        //System.out.println(name.replace('s','j'));

        //Convert a String to lowercase

        String name= "suNil";
        name = name.toLowerCase();
        System.out.println(name);

        //Replace space

        String text="To Lower Case";
        text=text.replace(" ", " _");
        System.out.println(text);

        //replce
        String letter ="Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>","sunil");
        System.out.println(letter);

        //escape sequance
        String myLetter ="Dear Harry,\n This is java course is nice.\n\tThanks";
        System.out.println(myLetter);

    }



}
