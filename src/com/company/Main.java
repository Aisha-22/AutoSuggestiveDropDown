package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //Create a driver Object to drive the SuggestiveDropDown Class
        SuggestiveDropDown sdd = new SuggestiveDropDown();
        //Object to access methods from separate class
        sdd.selectSuggestiveDropDown();


        AssignmentCorrection assignmentCorrection = new AssignmentCorrection();
        assignmentCorrection.CorrectAssignemt();
    }
}
