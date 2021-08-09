package org.dbpractice.database1.dao;

import org.dbpractice.database1.db.util.JdbcTemplatePractice;
import org.dbpractice.database1.dto.CaffeDTO;


public class CaffeDAO {

    public void insert(CaffeDTO caffeDTO){

        String sql = "insert into tbl_caffe (name, area, menus, link) values ( ?,?,?,?)";

        new JdbcTemplatePractice(){

            @Override
            protected void execute() throws Exception {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1,caffeDTO.getName());
                preparedStatement.setString(2,caffeDTO.getArea());
                preparedStatement.setString(3,caffeDTO.getMenus());
                preparedStatement.setString(4,caffeDTO.getLink());

                preparedStatement.executeUpdate();
            }
        }.makeAll();
    }
}
