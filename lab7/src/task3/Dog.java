package task3;

class Dog extends Animal{
    Dog(String name, int age){
        super(name,age);
    }

    String getName(){
        return super.name;
    }

    int getAge(){
        return super.age;
    }
}
