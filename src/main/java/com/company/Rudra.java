package com.company;
import java.util.Scanner;
public class Rudra {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Action [] obj=new Action[2];
        for(int i=0;i<obj.length;i++) {
            String name = sc.nextLine();
            int age = sc.nextInt();sc.nextLine();
            float salary = sc.nextFloat();sc.nextLine();
            String department = sc.nextLine();
            int Empid = sc.nextInt();sc.nextLine();
            obj[i] = new Action(name, age, salary, department, Empid);
        }
//        Action obj = new Action("sidharth",23,50000,"it",23456);



        String inputname=sc.nextLine();
        int inputempId =sc.nextInt();
        int res1=getNameByInput(obj,inputname);
        if(res1==1){
            System.out.println("name present in list");
        }
        else{
            System.out.println("name not present");
        }
        int res2=getEmpidByInput(obj,inputempId);
        if(res2==1){
            System.out.println(" empid present in list");
        }
        else{
            System.out.println("empid not present");
        }


    }
    public static int getNameByInput(Action[] obj,String inputname){
        int count=0;
        for(int i=0;i<obj.length;i++){
            if(obj[i].getName().equalsIgnoreCase(inputname)){
                count=1;
                break;
            }
        }


        return count;
    }
    public static int getEmpidByInput(Action[] obj,int inputempId){
        int count =0;
        for(int i=0;i<obj.length;i++){
            if(obj[i].getEmpid()==(inputempId)){
                count=1;
                break;
            }
        }
        return count;

    }
}
class Action{
    private String name;
    private int age;
    private float salary;
    private String department;
    private int Empid;

    public Action(String name, int age, float salary, String department, int empid) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
        Empid = empid;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public int getEmpid() {
        return Empid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmpid(int empid) {
        Empid = empid;
    }
}
