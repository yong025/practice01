package org.practice.note;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListTest {

    public static void main(String[] args) {

        ArrayList<NoteDTO1> list = new ArrayList<>(); // noteDTO만 들어갈 수 있는 배열ArrayList 생성
        //내부적으로 index번호를 가지고 있어서 맘대로 추가해도 됨

        list.add(NoteDTO1.builder().no(1).who("A").whom("B").build());//list에는 NoteDTO타입만 들어갈 수 있음. 다만 상속된 같은 타입 정보는 추가로 들어 갈 수 있음
        list.add(NoteDTO1.builder().no(2).who("A").whom("B").build());
        list.add(NoteDTO1.builder().no(4).who("A").whom("A").build());
        list.add(NoteDTO1.builder().no(5).who("A").whom("A").build());
        list.add(NoteDTO1.builder().no(7).who("A").whom("B").build());//noteService 기능 대체

        System.out.println(list.size());

        System.out.println(list); //배열로 들어가있는 5개의 내용물을 출력해준다.

        List<NoteDTO1> blist= //람다식 이용 filter안에 코드의 로직을 넣어준다.
                list.stream().filter(noteDTO1 -> noteDTO1.getWhom().equals("B")).collect(Collectors.toList());//noteDTO의 whom"b"에게 온 쪽지를 필터링해줘라
                //list의 정보를 참조해 필터링한다(noteDTO안의 whom값이 "B"와 같으면 모아둔다.)
        System.out.println(blist);//B에게 온 쪽지만 보여줌

//         list.remove(2);//실제로는 3번째(0,1,2순) list의 3번째 애를 리무브

        //람다식 이용 removeIf 안에 코드의 로직을 넣어준다.
        //만약 식안에 { }괄호를 넣으면 return을 꼭 넣어줘야한다. 기본괄호는 기본적으로 return을 실행한다.

        list.removeIf( noteDTO1 -> noteDTO1.getNo() == 5); //noteDTO의 no를 가져와 그값이 5와 같다면 삭제한다.

        System.out.println(list);//배열은 빈자리를 비워두지만 arraylist는 앞쪽으로 매꿔준다

        System.out.println(list.size());//사이즈가 하나 줄었음 5 >4


    }
}
