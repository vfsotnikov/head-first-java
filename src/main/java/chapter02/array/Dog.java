package chapter02.array;

public class Dog {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bark (){
        System.out.println(name + " сказал Гав!");
    }

    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.bark();
        dog1.setName("Барт");

        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = new Dog();

        myDogs[0].setName("Фрэд");
        myDogs[1].setName("Джордж");
        myDogs[2]=dog1;

        System.out.println("Имя последней собаки "+myDogs[2].getName());

        for (Dog dog:myDogs) {
            dog.bark();
        }


    }
}
