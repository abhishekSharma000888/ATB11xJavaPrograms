package ex_09_oopsConcepts;

 class Lab_Cat {

    public static void main(String[] args){

        Animal animal = new Animal();

        animal.Eats();
    }

}

  class Animal{

    void Name(){

        System.out.println("The name of the animal:");
    }

    void Eats(){

        System.out.println("Animal eats");
    }


}
