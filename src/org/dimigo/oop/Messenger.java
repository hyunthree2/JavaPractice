package org.dimigo.oop;

public class Messenger {

    private String name;
    private long phoneNumber;
    private String text;
    private String friendName;
    private String company;

    public void sendText(String friend) {
        System.out.println(friend+"(이)에게 메시지를 보냅니다!!");
    }

    public void receiveText(String friend) {
        System.out.println(friend+"(이)로부터 메시지가 도착했습니다!!");
    }

    public void copy() {
        System.out.println("복사!!");
    }

    public void call(String friend) {
        System.out.println(friend+"(이)에게 전화를 겁니다!!");
    }

    public void sendLocation(int loc) {
        System.out.println("현재 위치 좌표는"+loc+"입니다!!");
    }

}