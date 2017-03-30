package com.example.deepanshu.reportcard;

/**
 * Created by deepanshu on 30/3/17.
 */

class ReportCard {

    private String subjectName;
    private int subjectMarks;
    private String subjectGrade;
    private int subjectIcon;

    ReportCard(int icon, String name, int mark, String grade) {
        this.subjectIcon = icon;
        this.subjectName = name;
        this.subjectMarks = mark;
        this.subjectGrade = grade;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getSubjectMarks() {
        return subjectMarks;
    }

    public String getSubjectGrade() {
        return subjectGrade;
    }

    public int getSubjectIcon() {
        return subjectIcon;
    }

    public String toString() {
        return "You Child got \n" + subjectGrade+ " Grade in "+ subjectName ;
    }
}
