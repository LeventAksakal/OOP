/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author leven
 */
public class Student 
{
       
    private String name;
    private int term;
    private double gno;
    private int absence;
    private String id;

    
    public Student()
    {
        System.out.println("Initilazing the constructor(default)");
    }
    public Student(String name, int term, double gno, int absence, String id)
    {
        System.out.println("Initilazing the constructor(with parameters)");
        this.name = name;
        this.term = term;
        this.absence = absence;
        this.gno = gno;
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the term
     */
    public int getTerm() {
        return term;
    }

    /**
     * @param term the term to set
     */
    public void setTerm(int term) {
        this.term = term;
    }

    /**
     * @return the gno
     */
    public double getGno() {
        return gno;
    }

    /**
     * @param gno the gno to set
     */
    public void setGno(double gno) {
        this.gno = gno;
    }

    /**
     * @return the absence
     */
    public int getAbsence() {
        return absence;
    }

    /**
     * @param absence the absence to set
     */
    public void setAbsence(int absence) {
        this.absence = absence;
    }
 
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
}

