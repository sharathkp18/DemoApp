package com.example.demoapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class DBConnection {
         static String connectionURL;
        static Connection connection;
        static Statement statement;
        static String classs ;
        static ResultSet resultSet;
        static int resultInt;
        static  boolean isUser;
        static String query;
    public DBConnection(){
            try {
                classs = "net.sourceforge.jtds.jdbc.Driver";
                Class.forName(classs);
                connectionURL = "jdbc:jtds:sqlserver://192.168.43.35;databaseName=logindb;user=sharath;password=sharath123;";
                connection = DriverManager.getConnection(connectionURL);
                statement = connection.createStatement();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
    }
        public boolean checkUser(String tableName,String userName,String password){
        try {
            query = "select * from "+tableName+" where name='"+userName+"'"+"password='"+password+"'";
            resultSet = statement.executeQuery(query); //to select
            if (resultSet.next()){
                isUser=true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return isUser;
        }

    /*public int insertUpdateDeleteOperation(String tableName,String operationName);
       try{
            switch (operationName){
                case "update":
                    query = operationName+" set name='qwerty' from "+tableName+" where id=2";
                    resultInt=statement.executeUpdate(query); //to update
                    break;
                case "insertinto":
                    query = operationName+" "+tableName+" values('sharath','sharath123')";
                    resultInt=statement.executeUpdate(query); //to insert
                    break;
                case "delete":
                    query = operationName+" from "+tableName+" where id=2";
                    resultInt=statement.executeUpdate(query); //to delete
                    break;
                default:
                    System.out.println("Given operation is not specified");
                    break;
            }

    }catch (Exception e){
        e.printStackTrace();
    }
            return resultInt;
    }*/
    }
