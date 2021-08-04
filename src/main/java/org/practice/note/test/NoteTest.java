package org.practice.note.test;

import com.google.gson.Gson;
import org.practice.note.Command2;
import org.practice.note.NoteDTO1;


public class NoteTest {

    public static void main(String[] args) {

//        NoteDTO dto = NoteDTO.builder().no(1).who("A").whom("B").content("밥먹자").build();
//
//        Gson gson = new Gson();
//
//        String jsonstr = gson.toJson(dto);
//
//        System.out.println(jsonstr);
//
//        NoteDTO result = gson.fromJson(jsonstr, NoteDTO.class);
//
//        System.out.println(result);

            //add
            NoteDTO1 data = NoteDTO1.builder().who("A").whom("B").content("커피한잔 ?").build();

            Command2 command = Command2.builder().oper("ADD").noteDTO(data).build();
             System.out.println(command);

             Gson gson = new Gson();

        System.out.println(gson.toJson(command));
    }
}
