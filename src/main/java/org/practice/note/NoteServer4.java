package org.practice.note;

import com.google.gson.Gson;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class NoteServer4 {

    //bad code
    public static void main(String[] args) throws Exception {

        NoteService3 service = new NoteService3();

        //serversocket
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("ready...");
        //loop
        while(true){

            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream =
                    new DataInputStream(socket.getInputStream());
            String msg = dataInputStream.readUTF();

            Gson gson = new Gson();
            //JSON은 문자열을 데이터로 바꿔준다.
            //JSON으로 바꾼 데이터를 JAVA Object로 읽을 수 있도록 변환해준다.

            Command2 command = gson.fromJson(msg, Command2.class);

            System.out.println(command);

            String oper = command.getOper();

            if (oper.equalsIgnoreCase("ADD")){
                service.add(command.getNoteDTO());
            }else if(oper.equalsIgnoreCase("READ")){
                String owner = command.getNoteDTO().getWhom();
                System.out.println(service.getList(owner));
            }


        }

        //socket

        //DataInputStream readUTF() => 문자열

        //Gson => 문자열을 Command 객체

        //Command객체의 oper 값이 ADD 면 service.add( )

    }
}