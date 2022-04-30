/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author leven
 */
public class StudentManager 
{
    Student student = new Student();
    
    public void addStudent(Student student)
    {
        this.student = student;
        System.out.println("Student " + student.getName() + " added to the list.");
    }
}
