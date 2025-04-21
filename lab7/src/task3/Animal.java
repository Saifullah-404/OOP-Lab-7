package task3;

class Animal{
    String name;
    int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    void displayInfo(String animal_type){
        System.out.println(animal_type + " Name: " + name + "\n" +animal_type + " Age: " + age);
    }
}

