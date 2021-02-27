package aao_object_equals;

public class Person {

        int age;
        String name;

      public  Person(int a, String b){
            this.age = a;
            this.name = b;
      }

      //object中定义的equals()和==运算符的作用是相同的。
     //像String、Date、file、包装类等都重写了object中的equals()方法，他们就不是用==做比较了，而是比较他们的内容是否相同。
     //我们怎么让自己的类也可以像String，Date等类一样可以比较内容是否相同，而不是比较地址呢？那我们就重写equals方法。
    public boolean equals(Person p){
          if(p instanceof Person){    //首先判断待比较的形参p是否也是person类，若不是直接返回false。
              Person pp = (Person)p;  //若是的话，要强转一下。因为若a instanceof b，如果是true，那么把b改成b的父类，返回的也是true。
              //为什么父类返回的也是true？本质原因是发生了多态，多态就是父类引用指向了子类的对象，所以才会也返回true。
              // 若不发生多态，父类对象不会返回true的。
              if(pp.age==this.age&& pp.name.equals(this.name)){  //这里的equals是调用string的equals，string也重写了equals。
                  return true;     // 类也相同，属性的值也相同，那么就是相等的。
              }
              else{
                  return false;
              }
          }
          return false;

      }

}
