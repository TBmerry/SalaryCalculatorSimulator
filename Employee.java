public class Employee {
    String name; // Employee's Name
    double salary; // Employee's Salary
    int workHours; // Weekly Working Hours
    int hireYear; // Year of Employment

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

     double tax(){ //It will calculate the tax applied to the salary.
        if (this.salary < 1000){
            return 0;
        }else {
            return this.salary*0.3;
        }
     }

     double bonus(){ //If the employee has worked more than 40 hours a week, he will calculate bonus wages of 30 TL per hour of extra work.
        if (this.workHours > 40){
            return (this.workHours-40)*30;
        }else {
            return 0;
        }
     }

     double raiseSalary(){ //It will calculate the salary increase based on the employee's starting year. Take the current year as 2021.
        if ((2021 - this.hireYear) < 10){
            return (this.salary) * 5 / 100;
        }
        if ((2021 - this.hireYear) > 9 && (2021 - this.hireYear) < 20){
            return (this.salary) * 10 / 100;
        }
        if ((2021 - this.hireYear) > 19){
            return (this.salary) * 15 / 100;
        }
        else{
            return 0;
        }
     }

     void toString(Employee Employee){ //It will print the employee's information on the screen.
         double total = this.salary - tax() + bonus() + raiseSalary();
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Working Hours : " + this.workHours);
        System.out.println("Starting Year : " + this.hireYear);
        System.out.println("Tax : " + this.tax());
        System.out.println("Bonus : " + this.bonus());
        System.out.println("Salary Increase : " + this.raiseSalary());
        System.out.println("Salary with Taxes and Bonuses : " + total);
     }
}
