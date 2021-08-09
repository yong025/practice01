package org.dbpractice.database1.dto;


import lombok.*;

import java.sql.Timestamp;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class CaffeDTO {

    private Long sno;
    private String name;
    private String area;
    private String menus;
    private String link;
    private Timestamp regDate;
    private Timestamp modDate;

}
