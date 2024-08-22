//package org.example;
//
//import org.example.Entity.Student;
//import org.example.config.FactoryConfiguration;
//import org.example.template.FullName;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//
//public class Main {
//    public static void main(String[] args) {
//        Session session= FactoryConfiguration.getInstance().getSession();
//        FullName fullName=new FullName("ABC","BCD");
//        Student student=new Student();
//        student.setId(2);
//        student.setName(fullName);
//        student.setAddress("Maggona");
//        //open transaction
//        Transaction transaction=session.beginTransaction();
//        // session.save(student);
//        /session.delete("1", student);/
//        Student student1 = (Student) session.get(Student.class, 1);
//        if (student1 != null) {
//            System.out.println("Student ID: " + student.getId());
//            System.out.println("Student Name: " + student.getName().getFirstName() + " "+student.getName().getLastName() );
//            System.out.println("Student Address: " + student.getAddress());
//        } else {
//            System.out.println("Student not found!");
//        }
//
//
//        System.out.println(student1);
//        transaction.commit();
//        session.close();
//
//
//    }
//}