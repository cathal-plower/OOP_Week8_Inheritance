package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {

        Ticket standard = new Ticket("Summer Concert", "Alice", 80.0);
        StudentTicket student = new StudentTicket("Summer Concert", "Bob", 80.0, "S12345");
        VIPTicket vip = new VIPTicket("Summer Concert", "Charlie", 80.0);

        System.out.println("Event: " + standard.getEventName());

        System.out.printf("Standard Ticket - %s: €%.2f%n",
                standard.getHolderName(),
                standard.calculatePrice());

        System.out.printf("Student Ticket  - %s: €%.2f%n",
                student.getHolderName(),
                student.calculatePrice());

        System.out.printf("VIP Ticket      - %s: €%.2f%n",
                vip.getHolderName(),
                vip.calculatePrice());

        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Benefits: " + vip.getBenefits());
    }
}