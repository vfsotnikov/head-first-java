package chapter4;

class Dog{
    private int size;
    private String name;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bark (){
        if (size>60){
            System.out.println("Гав Гав Гав!");
        } else if (size>14){
            System.out.println("Вуф Вуф!");
        } else {
            System.out.println("Тяф Тяф!");
        }
    }
}

public class DogTestDrive {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.setSize(70);
        Dog two = new Dog();
        two.setSize(8);
        Dog three = new Dog();
        three.setSize(35);

        one.bark();
        two.bark();
        three.bark();
    }
}
