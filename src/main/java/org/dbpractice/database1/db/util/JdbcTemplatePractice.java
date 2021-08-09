package org.dbpractice.database1.db.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class JdbcTemplatePractice {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected Connection connection;
    protected PreparedStatement preparedStatement;
    protected ResultSet resultSet;

    public void makeAll(){
        try {

            makeConnection();
            execute();
            finish();
            System.out.println("END");
        }catch (Exception e){

        }finally {

        }
    }

    protected abstract void execute() throws Exception;

    private void makeConnection() throws Exception {
        System.out.println("연결체크");
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bit08db?serverTimezone=Asia/Seoul","myuser","myuser");
    }

    private void finish() {
        System.out.println("-------------finish--------------");
        System.out.println("Template ResultSet: " + resultSet);
        System.out.println("Template PreparedStatement: " + preparedStatement);
        System.out.println(connection);

        if(resultSet != null){
            try {
                resultSet.close();
                System.out.println("resultSet닫았다!");
            }catch (Exception e) { }
        }
        if(preparedStatement != null){
            try {
                preparedStatement.close();
                System.out.println("prepareStatement닫았다!");
            }catch (Exception e) { }
        }
        if(connection != null){
            try {
                connection.close();
                System.out.println("connection닫았다!");
            }catch (Exception e) { }
        }
    }

}
