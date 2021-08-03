package org.practice.note;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Command2 {

    private String oper;

    private NoteDTO1 noteDTO; // 객체 안에 객체 넣기


}
