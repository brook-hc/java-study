package aak_inherit;

public class Father {
    int a = 1;
    int b = 2;
    private int d = 3;

    public int add() {
        return this.a + this.b;
    }
    public void show(){
        System.out.println(d);
    }
}
