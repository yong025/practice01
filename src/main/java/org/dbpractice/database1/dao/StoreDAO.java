package org.dbpractice.database1.dao;

import org.dbpractice.database1.db.util.JdbcTemplate;
import org.dbpractice.database1.dto.StoreDTO;

public class StoreDAO {

    public void insert(final StoreDTO storeDTO) {
    String sql = "insert into tbl_store (name, area, menus, link) values (?,?,?,?)";

    new JdbcTemplate(){//jdbctemplate에 있는 추상메소드 execute를 재정의 해야함.

        @Override
        protected void execute() throws Exception {
        preparedStatement = connection.prepareStatement(sql);//connection(socket역할)을 통해 sql문을 날린다.
        preparedStatement.setString(1, storeDTO.getName());//storeDTO에서 받은 순서와 값을 쿼리에 넣는다.
        preparedStatement.setString(2, storeDTO.getArea());
        preparedStatement.setString(3, storeDTO.getMenus());
        preparedStatement.setString(4, storeDTO.getLink());

        preparedStatement.executeUpdate();
        //1. 수행결과로 Int 타입의 값을 반환합니다.
            // 2. SELECT 구문을 제외한 다른 구문을 수행할 때 사용되는 함수입니다.
            //executeUpdate 함수를 사용하는 방법입니다.
            // -> INSERT / DELETE / UPDATE 관련 구문에서는 반영된 레코드의 건수를 반환합니다.
        }
    }.makeAll();



    }
}
