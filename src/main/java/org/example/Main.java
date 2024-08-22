package org.example;

import org.example.config.FactoryConfiguration;
import org.example.embed.FullName;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        FullName fullName = new FullName("Soc","ben");

        Session session = FactoryConfiguration.getInstance().getSession();
        Student student = new Student();
        student.setId(2);
        student.setName(fullName);
        student.setAddress("kalutara");

//        aluth table ekak danawa nm ekata adala entity ekaka hadgann one.

        Transaction transaction = session.beginTransaction();

        session.delete("1",student); //save update change karala wens kargnn puluwn
        transaction.commit();
        session.close();
    }
}