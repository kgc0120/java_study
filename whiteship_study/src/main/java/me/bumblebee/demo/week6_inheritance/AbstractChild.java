package me.bumblebee.demo.week6_inheritance;

public class AbstractChild extends AbstractParent{

    int num1;
    int num2;

    @Override
    public void add() {
        System.out.println(this.num1 + this.num2 );
    }


    public static void main(String[] args) {
        AbstractChild child = new AbstractChild();
//        AbstractParent parent = new AbstractParent(); // 인스턴스를 생성 할 수 없다.
        child.num1 = 10;
        child.num2 = 20;
        child.add();
    }
}
