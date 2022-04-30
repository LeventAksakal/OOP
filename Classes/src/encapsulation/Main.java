/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author leven
 */
public class Main 
{
    public static void main(String[] args)
    {
        //Objeler oluşturulurken yapıcı bloklar çağrılır, içindeki kodlar çalışır.
        Student student = new Student();
        Student studentPreInitilazed = new Student("Levent", 1, 2.5, 0, "S028338" );
        student.setId("Levent");
        student.setAbsence(5);
        student.setTerm(1);
        student.setGno(3.7);
        System.out.println(student.getId());
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(studentPreInitilazed);
        studentManager.addStudent(student);
        
        
    }   
}
