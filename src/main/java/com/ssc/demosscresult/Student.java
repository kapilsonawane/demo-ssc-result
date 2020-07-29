package com.ssc.demosscresult;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "regno='" + regno + '\'' +
                ", mothersName='" + mothersName + '\'' +
                ", studentName='" + studentName + '\'' +
                ", enCode='" + enCode + '\'' +
                ", enSubjectName='" + enSubjectName + '\'' +
                ", enMarksObtained='" + enMarksObtained + '\'' +
                ", mrCode='" + mrCode + '\'' +
                ", mrSubjectName='" + mrSubjectName + '\'' +
                ", mrMarksObtained='" + mrMarksObtained + '\'' +
                ", hnCode='" + hnCode + '\'' +
                ", hnSubjectName='" + hnSubjectName + '\'' +
                ", hnMarksObtained='" + hnMarksObtained + '\'' +
                ", mathCode='" + mathCode + '\'' +
                ", mathSubjectName='" + mathSubjectName + '\'' +
                ", mathMarksObtained='" + mathMarksObtained + '\'' +
                ", sciCode='" + sciCode + '\'' +
                ", sciSubjectName='" + sciSubjectName + '\'' +
                ", sciMarksObtained='" + sciMarksObtained + '\'' +
                ", ssCode='" + ssCode + '\'' +
                ", ssSubjectName='" + ssSubjectName + '\'' +
                ", ssMarksObtained='" + ssMarksObtained + '\'' +
                ", totalMarks='" + totalMarks + '\'' +
                ", marksObtined='" + marksObtined + '\'' +
                ", result='" + result + '\'' +
                ", percentage='" + percentage + '\'' +
                '}';
    }

    @Id
    @GeneratedValue
    Integer sid;

    @Column(name= "Registration_no")
    String regno;
    @Column(name="MothersName")
    String mothersName;
    @Column(name="StudentName")
    String studentName;

    String enCode;
    @Column(name="Subject_Name_en")
    String enSubjectName;
    @Column(name="Subject_Marks_en")
    String enMarksObtained;

    String mrCode;
    @Column(name="Subject_Name_mr")
    String mrSubjectName;
    @Column(name="Subject_Marks_mr")
    String mrMarksObtained;

    String hnCode;
    @Column(name="Subject_Name_hn")
    String hnSubjectName;
    @Column(name="Subject_Marks_hn")
    String hnMarksObtained;

    String mathCode;
    @Column(name="Subject_Name_math")
    String mathSubjectName;
    @Column(name="Subject_Marks_Math")
    String mathMarksObtained;

    String sciCode;
    @Column(name="Subject_Name_Sci")
    String sciSubjectName;
    @Column(name="Subject_Marks_Sci")
    String sciMarksObtained;

    String ssCode;
    @Column(name="Subject_Name_ss")
    String ssSubjectName;
    @Column(name="Subject_Marks_ss")
    String ssMarksObtained;

    String totalMarks;
    @Column(name="Marks_Obtained")
    String marksObtined;
    @Column(name="Result")
    String result;
    @Column(name="Percentage")
    String percentage;

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEnCode() {
        return enCode;
    }

    public void setEnCode(String enCode) {
        this.enCode = enCode;
    }

    public String getEnSubjectName() {
        return enSubjectName;
    }

    public void setEnSubjectName(String enSubjectName) {
        this.enSubjectName = enSubjectName;
    }

    public String getEnMarksObtained() {
        return enMarksObtained;
    }

    public void setEnMarksObtained(String enMarksObtained) {
        this.enMarksObtained = enMarksObtained;
    }

    public String getMrCode() {
        return mrCode;
    }

    public void setMrCode(String mrCode) {
        this.mrCode = mrCode;
    }

    public String getMrSubjectName() {
        return mrSubjectName;
    }

    public void setMrSubjectName(String mrSubjectName) {
        this.mrSubjectName = mrSubjectName;
    }

    public String getMrMarksObtained() {
        return mrMarksObtained;
    }

    public void setMrMarksObtained(String mrMarksObtained) {
        this.mrMarksObtained = mrMarksObtained;
    }

    public String getHnCode() {
        return hnCode;
    }

    public void setHnCode(String hnCode) {
        this.hnCode = hnCode;
    }

    public String getHnSubjectName() {
        return hnSubjectName;
    }

    public void setHnSubjectName(String hnSubjectName) {
        this.hnSubjectName = hnSubjectName;
    }

    public String getHnMarksObtained() {
        return hnMarksObtained;
    }

    public void setHnMarksObtained(String hnMarksObtained) {
        this.hnMarksObtained = hnMarksObtained;
    }

    public String getMathCode() {
        return mathCode;
    }

    public void setMathCode(String mathCode) {
        this.mathCode = mathCode;
    }

    public String getMathSubjectName() {
        return mathSubjectName;
    }

    public void setMathSubjectName(String mathSubjectName) {
        this.mathSubjectName = mathSubjectName;
    }

    public String getMathMarksObtained() {
        return mathMarksObtained;
    }

    public void setMathMarksObtained(String mathMarksObtained) {
        this.mathMarksObtained = mathMarksObtained;
    }

    public String getSciCode() {
        return sciCode;
    }

    public void setSciCode(String sciCode) {
        this.sciCode = sciCode;
    }

    public String getSciSubjectName() {
        return sciSubjectName;
    }

    public void setSciSubjectName(String sciSubjectName) {
        this.sciSubjectName = sciSubjectName;
    }

    public String getSciMarksObtained() {
        return sciMarksObtained;
    }

    public void setSciMarksObtained(String sciMarksObtained) {
        this.sciMarksObtained = sciMarksObtained;
    }

    public String getSsCode() {
        return ssCode;
    }

    public void setSsCode(String ssCode) {
        this.ssCode = ssCode;
    }

    public String getSsSubjectName() {
        return ssSubjectName;
    }

    public void setSsSubjectName(String ssSubjectName) {
        this.ssSubjectName = ssSubjectName;
    }

    public String getSsMarksObtained() {
        return ssMarksObtained;
    }

    public void setSsMarksObtained(String ssMarksObtained) {
        this.ssMarksObtained = ssMarksObtained;
    }

    public String getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(String totalMarks) {
        this.totalMarks = totalMarks;
    }

    public String getMarksObtined() {
        return marksObtined;
    }

    public void setMarksObtined(String marksObtined) {
        this.marksObtined = marksObtined;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }





}
