package org.pratice.database1.dao;


import org.dbpractice.database1.dao.CaffeDAO;
import org.dbpractice.database1.dto.CaffeDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CaffeDAOTest {

    private CaffeDAO caffeDAO;

    @BeforeEach
    public void ready(){
        caffeDAO = new CaffeDAO();
        System.out.println("시작합니다.");
        System.out.println(caffeDAO);
    }

    @Test
    public void testInsert(){

        CaffeDTO caffeDTO = CaffeDTO.builder()
                .name("할리스")
                .area("홍대")
                .menus("바닐라라떼")
                .build();

        caffeDAO.insert(caffeDTO);
    }
}
