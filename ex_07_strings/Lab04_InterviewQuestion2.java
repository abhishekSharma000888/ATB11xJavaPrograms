package ex_07_strings;

public class Lab04_InterviewQuestion2 {

    public static void main(String[] args){

        String s1 = "Mega";

        String s2 = "Mega";

        // string constant pool will only hold one value instead of multiple same entries.


        String s3 = new String("new");

        String s4 = new String("new");

        // every time a new string is created using the keyword new, new entries will be stored in
        // String pool despite being equal or similar.
    }
}
