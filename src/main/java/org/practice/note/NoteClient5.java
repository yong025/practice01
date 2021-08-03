package org.practice.note;

import com.google.gson.Gson;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class NoteClient5 {

    public static void main(String[] args) throws Exception {
        Scanner keyScanner = new Scanner(System.in);
        String operlogig = keyScanner.nextLine();


        NoteDTO1 data = NoteDTO1.builder().who("A").whom("B").content("커피한잔 ?").build();
        Command2 command = Command2.builder().oper(operlogig).noteDTO(data).build();

        Gson gson = new Gson();

        String str = gson.toJson(command);

        Socket socket = new Socket("127.0.0.1", 9999);
//      OutputStream out = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

        dataOutputStream.writeUTF(str);

    }
}
