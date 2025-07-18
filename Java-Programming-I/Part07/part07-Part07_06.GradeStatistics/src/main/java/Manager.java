/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
import java.util.ArrayList;

public class Manager {
    private ArrayList<Integer> notes;

    public Manager(ArrayList<Integer> notes) {
        this.notes = notes;
    }
    
    public double calculateAverageAll() {
        double average = 0;
        
        for (int note : notes) {
            average += (double) note / notes.size();
        }
        
        return average;
    }
    
    public double calculateAveragePassing() {
        int sum = 0;
        int count = 0;
        
        for (int note : notes) {
            if (note >= 50) {
                sum += note;
                count++;
            }
        }
        
        return (double) sum / count;
    }
    
    public double calculatePassPercentage() {
        int count = 0;
        
        for (int note : notes) {
            if (note >= 50) {
                count += 1;
            }
        }
        
        return 100.0 * count / notes.size();
    }
    
    public String gradeDistribution() {
        String zero = "", one = "", two = "", three = "", four = "", five = "";
        
        for (int note : notes) {
            if (note >= 90) {
                five += "*";
            } else if (note >= 80) {
                four += "*";
            } else if (note >= 70) {
                three += "*";
            } else if (note >= 60) {
                two += "*";
            } else if (note >= 50) {
                one += "*";
            } else {
                zero += "*";
            }
        }
        
        return "5: " + five + "\n" +
                "4: " + four + "\n" +
                "3: " + three + "\n" +
                "2: " + two + "\n" +
                "1: " + one + "\n" +
                "0: " + zero + "\n";
    }
    
    public String toString() {
        return "Point average (all): " + calculateAverageAll() + "\n" +
                "Point average (passing): " + calculateAveragePassing() + "\n" +
                "Pass percentage: " + calculatePassPercentage() + "\n" +
                gradeDistribution();
    }
}