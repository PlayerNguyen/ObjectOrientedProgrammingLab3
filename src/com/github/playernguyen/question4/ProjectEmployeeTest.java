package com.github.playernguyen.question4;

import java.util.*;

public class ProjectEmployeeTest {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Project> projects = new ArrayList<Project>();

        System.out.println("Number of project: ");
        int projectAmount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < projectAmount; i++) {
            System.out.printf("-- Project number #%d \n", i);
            System.out.printf("---- Project #%d Id:  \n", i);
            String projectId = scanner.nextLine();
            System.out.printf("---- Project #%d start date (12:00:00 23/05/2022):  \n", i);
            String projectStartDateAsString = scanner.nextLine();

            System.out.printf("---- Project #%d end date (12:00:00 23/06/2022):  \n", i);
            String projectEndDateAsString = scanner.nextLine();

            Project project = new Project(projectId,
                    Project.parseDateFromString(projectStartDateAsString),
                    Project.parseDateFromString(projectEndDateAsString)
            );
            System.out.printf("--- Adding project: %s\n", project);


            System.out.println("--- Do you want to add employee now [Y/n] (Can be added later): ");
            String confirmation = scanner.nextLine();
            // Start to add employee
            if (confirmation.equalsIgnoreCase("Y")) {

                System.out.println("--- How many employee you want to add (number): ");

                int employeeNumber = scanner.nextInt();
                scanner.nextLine();
                for (int j = 0; j < employeeNumber; j++) {
                    System.out.println("--- Employee #" + j + " id: ");
                    String employeeId = scanner.nextLine();

                    System.out.println("--- Employee #" + j + " name: ");
                    String employeeName = scanner.nextLine();

                    System.out.println("--- Employee #" + j + " salary per hour: ");
                    int employeeSalaryPerHour = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("--- Employee #" + j + " number of leaving day: ");
                    int employeeLeavingDay = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("--- Employee #" + j + " number of travel day: ");
                    int employeeTravelDay = scanner.nextInt();
                    scanner.nextLine();

                    Employee employee = new
                            Employee(
                            employeeId,
                            employeeName,
                            employeeSalaryPerHour,
                            employeeLeavingDay,
                            employeeTravelDay
                    );

                    project.getListOfEmployees().add(employee);
                    System.out.println("---- Adding employee " + employee);
                }
                // Create
                projects.add(
                        project
                );
            }
        }

        // Program continue
        String mode = scanner.nextLine();
        if (mode.equalsIgnoreCase(".exit")) {

        }


    }


}
