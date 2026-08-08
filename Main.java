import java.util.Scanner;

import model.Employee;
import service.EmployeeService;
import util.Menu;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeService service =
                new EmployeeService();

        int choice;

        do {

            Menu.display();

            System.out.print("Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("ID : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name : ");
                    String name = sc.nextLine();

                    System.out.print("Department : ");
                    String dept = sc.nextLine();

                    System.out.print("Salary : ");
                    double salary = sc.nextDouble();

                    Employee emp =
                            new Employee(id, name,
                                    dept, salary);

                    service.addEmployee(emp);
                    break;

                case 2:

                    for (Employee e :
                            service.getAllEmployees()) {

                        System.out.println(
                                e.getId() + " "
                                        + e.getName());
                    }
                    break;

                case 3:

                    System.out.print("Enter ID : ");
                    int searchId = sc.nextInt();

                    Employee e =
                            service.searchEmployee(searchId);

                    if (e != null) {
                        System.out.println(e.getName());
                    } else {
                        System.out.println("Not Found");
                    }

                    break;

                case 4:

                    System.out.print("ID : ");
                    int removeId = sc.nextInt();

                    service.removeEmployee(removeId);

                    break;

            }

        } while (choice != 5);

    }
}