package com.example.skbtsystem;

public class Student
{
    private String studentID, studentName, studentEmail, studentPass, studentPhone;

    public Student(String studentID, String studentName, String studentEmail, String studentPass, String studentPhone)
    {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentPass = studentPass;
        this.studentPhone = studentPhone;
    }

    public String getStudentID()
    {
        return studentID;
    }

    public void setStudentID(String studentID)
    {
        this.studentID = studentID;
    }

    public String getStudentName()
    {
        return studentName;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public String getStudentEmail()
    {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail)
    {
        this.studentEmail = studentEmail;
    }

    public String getStudentPass()
    {
        return studentPass;
    }

    public void setStudentPass(String studentPass)
    {
        this.studentPass = studentPass;
    }

    public String getStudentPhone()
    {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone)
    {
        this.studentPhone = studentPhone;
    }

}
