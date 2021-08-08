package org.practice.web2.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString

public class StoreDTO { // StoreDTO 변수 선언

    private String name;
    private  String area;
    private String desc;
    private String link;

}
