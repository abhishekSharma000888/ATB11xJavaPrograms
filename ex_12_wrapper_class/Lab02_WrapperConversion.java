package ex_12_wrapper_class;

public class Lab02_WrapperConversion {

    public static void main(String[] args) {
        String a = "10";
        int aaa = 10;

        // String -> Wrapper -> parseX()  ,   Integer.parseInt(num);Double.parseDouble()
        Integer b = Integer.parseInt(a);
        System.out.println(b);
        Integer bb = Integer.valueOf(a);
        System.out.println(bb);

        // String to Primitive
        int ss = Integer.parseInt(a);

        // Wrapper to String (toString method)
        System.out.println(bb.toString());

        // Primitive to String
        int age = 90;
        Integer dd = age;
        System.out.println(dd.toString());

    }
}
