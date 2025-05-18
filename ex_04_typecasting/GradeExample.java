package ex_04_typecasting;

public class GradeExample {
    
    public static void main(String[] args){
        
        int Score = 58;

        String grade = (Score >= 90) ? "A" : (Score >= 80) ? "B" : (Score >= 70) ? "C" : (Score >= 60) ? "D" : "F";

        System.out.println(grade);
    }
}
