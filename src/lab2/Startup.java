/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author wboyer
 */
public class Startup {
    public static void main(String[] args) {
    WebAndSoftwareDeveloperManager course1 = new IntroToProgrammingCourse("Intro to Programming", "152-107", "None");
    WebAndSoftwareDeveloperManager course2 = new IntroJavaCourse("Intro to Java", "152-134", "Intro to Programming");
    WebAndSoftwareDeveloperManager course3 = new AdvancedJavaCourse("Advanced Java", "152-135", "Java Programming");
    
        System.out.println(course1.getCourseName());
        System.out.println(course2.getCourseNumber());
        course3.setPrerequisites("Intro to Java");
        System.out.println(course3.getPrerequisites());
    }
}
