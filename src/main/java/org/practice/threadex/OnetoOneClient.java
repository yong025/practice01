package org.practice.threadex;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class OnetoOneClient {

    //bad code
    public static void main(String[] args) throws Exception {//예외 던지기

//-------------------------------- 변수 설정 코드 -------------------------------------------------------------

        Scanner keyScanner = new Scanner(System.in);
        Socket socket = new Socket("127.0.0.1", 9999);//접속할 ip와 포트번호 입력해 서버에 연결한다.
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());//소켓을 통해 보낼 데이터를 dos변수에 저장한다.
        DataInputStream din = new DataInputStream(socket.getInputStream());//소켓을 통해 받을 데이터를 din변수에 저장

//-------------------------------- 읽기 기능 코드 -------------------------------------------------------------

        new Thread(() -> {//한개의 스레드에서 while(보내기만 하는것/읽기만 하는것)동시실행 충돌로 한쪽에 새로운 스레드를 생성

            while (true) {//읽기만 하는 기능 반복실행

                String serverMsg;
                try {

                    serverMsg = din.readUTF();//
                    //서버로부터 온 메세지(din의 값)을 readUTF를 이용해 읽고, 그 값을 serverMsg 변수로 저장한다.
                    System.out.println("Server: " + serverMsg);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }//while end

        }).start();

//------------------------------- 메세지 전송 코드 -------------------------------------------------------------

        while (true) {//쓰기만 하는 기능 반복실행
            System.out.println("메세지를 입력하세요");
            String msg = keyScanner.nextLine();
            dos.writeUTF(msg); //msg에 입력한 문자열을 UTF형식으로 데이터전송 실시.
        }//while end

    }

}