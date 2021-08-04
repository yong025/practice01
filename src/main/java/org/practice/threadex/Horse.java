package org.practice.threadex;

public class Horse extends Thread {//1객체 1 스레드가 필요할 때 사용한다.

    private String name;
    private int pos;

    public Horse(String name){//Horse의 생성자
        this.name = name; //String파라미터를 받아 전역변수 name에 저장
        this.pos = 0;
    }

    public void run() {//extends Thread를 할 때 중요 메서드 2개 - run(), start()
        this.gallop();
    }

    public void gallop(){

        for(int i=0; i < 100; i++){

            int range = (int)(Math.random() * 10) + 1;

            this.pos += range;

            //synchrnoized ( 내용 ) { }
            //여러 스레드가 하나의 리소스(공동자원)을 share할 수 있도록 도와주는 기능
            //한 스레드가 System.out을 쓰는 동안 다른 스레드는 쓰지 못하게 한다.
            synchronized (System.out) {
                int count = this.pos / 10;
                for (int j = 0; j < count; j++) {
                    System.out.print("."); //현재 4개의 스레드가 "."이라는 공동자원에 몰림
                }

                System.out.println(this.name + ": " + this.pos);
            }//Synchronized end

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }//for end
    }

    public static void main(String[] args) {

        Horse h1 = new Horse("1번마");
        Horse h2 = new Horse("2번마");
        Horse h3 = new Horse("3번마");
        Horse h4 = new Horse("4번마");

        h1.start();//extends Thread 후에 start메서드 사용가능 (스레드 실행)
        h2.start();
        h3.start();
        h4.start();
    }

}
