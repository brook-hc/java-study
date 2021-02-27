package aan_why_use_polymorphism;

public class Animaltest{
    public static void main(String[] args) {
        Animaltest test = new Animaltest();
        test.show(new Dog());
        test.show(new Cat());
    }
    public void show(Animal animal){
        animal.eat();
        animal.sound();

    }
}

class Animal {      // 只要不加public，在同一个文件中可以定义多个类。
    public void eat(){
        System.out.println("吃东西~！");
    }
    public void sound(){
        System.out.println("动物叫声~！");
    }
}

class Dog extends Animal{    // 只要不加public，在同一个文件中可以定义多个类。
    public void eat(){
        System.out.println("狗吃骨头~！");
    }
    public void sound(){
        System.out.println("汪汪汪~！");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("大脸猫爱吃鱼~！");
    }
    public void sound(){
        System.out.println("喵喵喵~！");
    }
}