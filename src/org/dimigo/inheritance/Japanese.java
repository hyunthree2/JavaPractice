package org.dimigo.inheritance;

public class Japanese extends Person {

    public Japanese(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("오하이요");
    }

    @Override
    public void sayBye() {
        System.out.println("사요나라");
    }

    @Override
    public String toString() {
        return ("저는 일본사람 " + super.getName() + "입니다.");
    }
}
