package org.practice.note;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NoteService3 {

    private Map<String, ArrayList<NoteDTO1>> noteMap = new HashMap<>();//쪽지함 noteMap
    private Integer idx = 0;

    public int add(NoteDTO1 noteDTO) {

        noteDTO.setNo(++idx);
        String owner = noteDTO.getWhom(); // 누구의 쪽지//// 쪽지 받은 주인owner whom

        ArrayList<NoteDTO1> noteDTOS = noteMap.get(owner); //onwer의 쪽지함(noteMap)을 불러오는데 그 이름을 noteDTOS로 저장.

        if (noteDTOS == null) { // 쪽지함이 존재하지 않으면 쪽지함을 새로 만들어라.
            ArrayList<NoteDTO1> noteList = new ArrayList<>();
            noteList.add(noteDTO);//notelist라는 구조 만들어서 키값(onwer ex.둘리)에 내용을 넣어준다.
            noteMap.put(owner, noteList);//쪽지함에 추가
        } else {
            noteDTOS.add(noteDTO);
        }

        return idx;
    }


    public ArrayList<NoteDTO1> getList(String owner) {

        return noteMap.get(owner);//onwer의 쪽지함을 가져와서 반환한다.
    }
}


//    public static void main(String[] args) {
//        NoteService3 service = new NoteService3();
//
//        NoteDTO1 noteDTO = NoteDTO1.builder().who("user2").whom("user1").content("이해가 안가").build();
//        service.add(noteDTO);
//
//        NoteDTO1 noteDTO2 = NoteDTO1.builder().who("user3").whom("user2").content("나도 이해가 안가").build();
//        service.add(noteDTO2);
//
//        NoteDTO1 noteDTO3 = NoteDTO1.builder().who("user3").whom("user2").content("나나 이해가 안가").build();
//        service.add(noteDTO3);
//
//        System.out.println(service.noteMap);
//
//
//    }
//}
