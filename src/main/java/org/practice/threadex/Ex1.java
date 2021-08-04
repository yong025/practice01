package org.practice.threadex;

public class Ex1 {

    public static void main(String[] args) {

//        new Thread().start(); 스레드를 새로 생성하는 기본 문법
//        new Thread(() - >{ 내용 }).start(); 람다식을 추가해 스레드를 새로 만들어 내용 코드를 동작시킨다.

        new Thread(() -> {

            for(int i=0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "A" + i);
                //Thered.currentThread().getName()를 쓰면 A,B의 쓰레드가 어디서 실행되는지 확인 가능
                try {//Thread.sleep는 try catch로 예외처리해줘야 실행 가능
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }//메인쓰레드가 지나가면서 익명의 쓰레드를 실행.

        }).start();

        for(int j=0; j < 100; j++){
            System.out.println(Thread.currentThread().getName() +"B" + j);

            try {
                Thread.sleep(100);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
