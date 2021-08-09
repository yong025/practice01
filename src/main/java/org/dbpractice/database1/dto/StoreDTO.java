package org.dbpractice.database1.dto;


import lombok.*;

import java.sql.Timestamp;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class StoreDTO { //Store변수 선언

    private Long sno;
    private String name;
    private String area;
    private String menus;
    private String link;
    private Timestamp regDate;
    private Timestamp modDate;

}
