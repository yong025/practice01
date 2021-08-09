package org.dbpractice.database1.db.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class JdbcTemplate {


    static {//1. 드라이버 클래스로딩 (클래스가 로딩될 때 1순위로 static블럭을 로딩함.)
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//버전에 따라 경로 다르지만 현재 정석적인 경로.
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

        protected Connection connection;
        protected PreparedStatement preparedStatement;
        protected ResultSet resultSet;

        public void makeAll(){
        try{
            makeConnection();
            execute();
            finish();
            System.out.println("end");
        }catch (Exception e){

        }finally {

        }
        }

        protected abstract void execute() throws Exception;

        private void makeConnection() throws Exception {//2.DB URL연결 Connection(Socket역할)
            System.out.println("실행확인");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bit08db?serverTimezone=Asia/Seoul", "myuser", "myuser");
        }

        private void finish(){
            System.out.println("--------------finish----------------");
            System.out.println("Template ResultSet: "+ resultSet);//in - read - request - resultset
            System.out.println("Template PreparedStatement: "+preparedStatement);//out - write - response - statement
            System.out.println(connection);

            if(resultSet != null){
                try{
                    resultSet.close();
                }catch (Exception e){ }
            }

            if(preparedStatement != null){
                try{
                    preparedStatement.close();
                }catch (Exception e){ }
            }

            if(connection != null){
                try{
                    connection.close();
                }catch (Exception e){ }
            }

        }






}
