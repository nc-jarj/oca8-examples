package ch1;

import java.util.Date;

public class ClassA {

    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.processDates(new Date(), new java.sql.Date(System.currentTimeMillis()));
        System.out.println("Class A, done");
    }

    private void processDates(Date date, java.sql.Date dateSql){
        // do something
        System.out.println("date:" + date);
        System.out.println("dateSql:" + dateSql);
        System.out.println("example method done");
    }
}