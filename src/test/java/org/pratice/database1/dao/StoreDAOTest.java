package org.pratice.database1.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.dbpractice.database1.dao.StoreDAO;
import org.dbpractice.database1.dto.StoreDTO;

import java.util.Scanner;

public class StoreDAOTest {

    private StoreDAO storeDAO;

    //@BeforeEach
    //본 어노테이션을 붙인 메서드는 테스트 메서드 실행 이전에 수행된다.
    @BeforeEach
    public void ready(){
        storeDAO = new StoreDAO();
        System.out.println(storeDAO);
    }

    @Test
    public void testInsert(){


        StoreDTO storeDTO = StoreDTO.builder()
                .name("얌샘깁밥")
                .area("종각")
                .menus("분식")
                .build();

        storeDAO.insert(storeDTO);
    }
}
