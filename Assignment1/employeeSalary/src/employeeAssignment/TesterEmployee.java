package employeeAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TesterEmployee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Employee[] arr;

        System.out.print("Enter the no. of employees you want to create: ");
        int noOfEmployees = sc.nextInt();

        arr = new Employee[noOfEmployees];

        for(int i=0;i<noOfEmployees;i++){
            System.out.print("Enter employee id: ");
            int employeeId = sc.nextInt();

            System.out.print("Enter employee name: ");
            String employeeName = sc.next();

            System.out.print("Enter employee salary: ");
            int employeeSalary = sc.nextInt();

            System.out.println();

            Employee e = new Employee(employeeId, employeeName, employeeSalary);
            arr[i] = e;
        }


        List<Employee> employeesList = Arrays.asList(arr);

        System.out.println("The tripled salaries of employees are: ");
        List<Integer> result = employeesList.stream().map(e -> e.employeeSalary*3).collect(Collectors.toList());
        System.out.println(result);
    }
}
