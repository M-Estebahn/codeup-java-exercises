package grades;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();

    }

    public String getName(){
        return name;
    }
    public void addGrade(Integer grade){
        grades.add(grade);
    }
    public double getGradeAverage(){
       double totalGrade=0;

        for (int i =0;i< this.grades.size();++i){
            totalGrade+=this.grades.get(i);

        }
        return  totalGrade/ this.grades.size();
    }

    public static void main(String[] args) {
        DecimalFormat twod=new DecimalFormat(".##");
        Student student1=new Student("First Guy");
        Student student2=new Student("Second Guy");
        Student student3=new Student("Third Guy");
        student1.addGrade(47);
        student1.addGrade(87);
        student1.addGrade(90);
        student1.addGrade(79);
        student1.addGrade(90);
        student2.addGrade(78);
        student2.addGrade(70);
        student2.addGrade(90);
        student2.addGrade(80);
        student2.addGrade(82);
        student3.addGrade(45);
        student3.addGrade(37);
        student3.addGrade(59);
        student3.addGrade(90);
        student3.addGrade(26);
        System.out.println(student1.grades);
        System.out.println(student2.grades);
        System.out.println(student3.grades);
        System.out.println(student1.name);
        System.out.println(student2.name);
        System.out.println(student3.name);
        System.out.println(twod.format(student1.getGradeAverage()));
        System.out.println(twod.format(student2.getGradeAverage()));
        System.out.println(twod.format(student3.getGradeAverage()));



    }

}
