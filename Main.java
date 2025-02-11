package student_Management_system;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        System.out.println("Welcome to student Management system: ");

        Scanner sc = new Scanner(System.in);


        while(true){

            System.out.println("Press 1 for Add student: ");
            System.out.println("Press 2  for show students : ");
            System.out.println("press 3 for Update students: ");
            System.out.println("Press 4 for delete student: ");
            System.out.println("Press 5 for Exit app: ");

            int choice = sc.nextInt();

            if(choice == 1){
                // add student
                System.out.println("enter student name: ");
                String name = sc.next();
                System.out.println("enter student phone: ");
                String phone = sc.next();
                System.out.println("enter student city: ");
                String city = sc.next();

                student st = new student (name,phone,city);

                boolean ans = student_Dao.insert(st);

                if(ans){
                    System.out.println("student added successfully: ");
                }

                else System.out.println("Something went wrong in your code please check...");
            }

            else if(choice == 2){
                // show students...

                student_Dao.showStudent();

            }

            else if (choice == 3) {
                // update students....

                System.out.println("Enter student id for update: ");
                int id = sc.nextInt();

                System.out.println("Enter student  new Name: ");
                String name = sc.next();

                System.out.println("Enter student phone number for update: ");
                String phone = sc.next();

                System.out.println("Enter student city for update: ");
                String city = sc.next();


                boolean res = student_Dao.updateStudent(id,name,phone,city);
                if(res) {
                    System.out.println("Student updated successfully: ");
                }
                else {
                    System.out.println("Something went wrong in your code...");
                }

            }

            else if (choice == 4) {
                // delete students..
                System.out.println("Enter student id for delete: ");
                int id = sc.nextInt();
                boolean res = student_Dao.deleteStudent(id);
                if(res) {
                    System.out.println("deleted successfully :");
                }else {
                    System.out.println("something went wrong: ");
                }

            }

            else if (choice == 5) {
                // Exit:
                break;
            }

            else{
                System.out.println("Thank you for using my application: ");
            }
        }
    }
}