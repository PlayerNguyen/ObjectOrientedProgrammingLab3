package com.github.playernguyen.question4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Project {

    private final String projectId;
    private Date startDate;
    private Date endDate;
    private final ArrayList<Employee> listOfEmployees = new ArrayList<>();

    public Project(String projectId, Date startDate, Date endDate) {
        this.projectId = projectId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getProjectId() {
        return projectId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Employee> getListOfEmployees() {
        return listOfEmployees;
    }

    public long estimateBudget() {
        long durationAsMilliseconds = endDate.getTime() - startDate.getTime();
        long durationAsHours = durationAsMilliseconds / 3600000;
        long totalBudget = 0;
        for (Employee employee : getListOfEmployees()) {
            totalBudget += (employee.getSalaryPerHour() * durationAsHours);
        }
        return totalBudget;
    }

    public static Date parseDateFromString(String input) {
        String[] segment = input.split(" ");
        if (segment.length != 2) throw new IllegalStateException("Invalid Date");
//        System.out.println(Arrays.toString(segment));
        String[] hourSegments = segment[0].split(":");
//        System.out.println(Arrays.asList(hourSegments));
        if (hourSegments.length != 3) throw new IllegalStateException("Invalid hour parts");
        String[] dateSegments = segment[1].split("/");
        if (dateSegments.length < 3) throw new IllegalStateException("Invalid ate parts");

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(hourSegments[0]));
        calendar.set(Calendar.MINUTE, Integer.parseInt(hourSegments[1]));
        calendar.set(Calendar.SECOND, Integer.parseInt(hourSegments[2]));

        calendar.set(Calendar.DATE, Integer.parseInt(dateSegments[0]));
        calendar.set(Calendar.MONTH, Integer.parseInt(dateSegments[1]) - 1);
        calendar.set(Calendar.YEAR, Integer.parseInt(dateSegments[2]));

        return new Date(calendar.getTimeInMillis());
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId='" + projectId + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", listOfEmployees=" + listOfEmployees +
                '}';
    }
}
