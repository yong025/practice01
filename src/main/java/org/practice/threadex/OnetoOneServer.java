package org.practice.threadex;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class OnetoOneServer {

    //bad code
    public static void main(String[] args) throws Exception {

//-------------------------------- 변수 설정 코드 -------------------------------------------------------------

        Scanner keyScanner = new Scanner(System.in);//답장을 보낼 스캐너 생성
        ServerSocket socket = new ServerSocket(9999);//중간다리 서버소켓 생성 및 포트번호 설정
        System.out.println("Ready !");

        Socket client = socket.accept();//소켓을 통해 client의 연결을 기다린다.

        DataInputStream din = new DataInputStream(client.getInputStream());
        //client소켓을 통해 넘어온 데이터를 받을 준비를 한다.
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        //client소켓을 통해 데이터를 전송할 준비를 한다.

//------------------------------- 답장 기능 코드 -------------------------------------------------------------

        new Thread(() -> {//한개의 스레드에서 while(보내기만 하는것/읽기만 하는것)동시실행 충돌로 한쪽에 새로운 스레드를 생성
            while (true){//계속 보내는 기능 반복
                String serverMsg = keyScanner.nextLine();

                try {
                    System.out.println("메세지를 입력하세요");
                    dos.writeUTF(serverMsg);//serverMsg를 UTF화하여 dos를 통해 전송
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }//while end
        }).start();

//------------------------------ 읽기 기능 코드 -------------------------------------------------------------

        while (true){//계속 읽는 기능 반복

            String clientMsg = din.readUTF();
            //클라이언트로부터 온 메세지(din의 값)을 readUTF를 이용해 읽고, 그 값을 clientMsg 변수로 저장한다.
            System.out.println("Client: " + clientMsg);

        }//while end


    }//main end
}
