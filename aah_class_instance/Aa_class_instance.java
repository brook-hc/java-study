package aah_class_instance;

class person {
    String name;
    int age;
    String gender;
    String language;

    public void eat() {
        System.out.println(name + "很会吃饭~！");
    }

    public void sleep() {
        System.out.println(age + "岁的人，每天要睡9小时~！");
    }

    public void talk() {
        System.out.println(name + "很会说" + language + "，还是个" + gender + "的~！");
    }
}

    public class Aa_class_instance {
    public static void main(String[] args) {
        person p = new person();
        p.name = "李大钊";
        p.gender= "男";
        p.age = 32;
        p.language = "俄语";
        p.eat();
        p.sleep();
        p.talk();

        person p1 = p;    //这相当于把p的地址给了p1,故他们指的是同一个对象。
        p1.talk();
    }
}



