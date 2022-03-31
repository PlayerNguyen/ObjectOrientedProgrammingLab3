package com.github.playernguyen.question4;

import java.util.Collections;

public class AppTest {

    public static void main(String[] args) {
        
        // Create new project
        Project project = new Project("project number 1",
                Project.parseDateFromString("00:00:00 27/03/2022"),
                Project.parseDateFromString("00:00:00 27/04/2022")

        );

        project.getListOfEmployees().add(new Employee(
                "1",
                "John",
                12,
                3,
                4
        ));

        project.getListOfEmployees().add(new Employee(
                "2",
                "Ivern",
                5,
                7,
                9
        ));
        project.getListOfEmployees().add(new Employee(
                "3",
                "Kois",
                4,
                9,
                2
        ));

        System.out.println(project);
        Collections.sort(project.getListOfEmployees());
        System.out.println(project.getListOfEmployees());
    }
}
