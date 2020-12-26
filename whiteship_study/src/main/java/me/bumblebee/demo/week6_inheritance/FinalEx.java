package me.bumblebee.demo.week6_inheritance;

public final class FinalEx {

    final int num = 100;

    public final void add() {

    }

    public static void main(String[] args) {
        FinalEx finalEx = new FinalEx();
        finalEx.num = 200;
    }
}

class FinalChild extends FinalEx{

    @Override
    public void add() {
    }

}
