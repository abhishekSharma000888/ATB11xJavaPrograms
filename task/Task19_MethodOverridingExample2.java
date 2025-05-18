package task;

public class Task19_MethodOverridingExample2 extends Task18_MethodOverridingExample1{




        @Override
        void sound() {
            System.out.println("dog barks!!!!");
        }

        @Override
        void legs() {
            System.out.println("The dogs have four legs!");
        }

        public static void main(String[] args){

            Task19_MethodOverridingExample2 dog = new Task19_MethodOverridingExample2();

            dog.sound();
            dog.legs();
        }
    }

