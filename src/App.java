/**
 * Given:
 * A pre-written method called processScore and a main method for testing.
 *
 * Note:
 * You will modify processScore() over the course of this quiz. Completing task 2 may cause task 1
 * to not work any longer. That's OK! Similarly, completing task 3 might cause task 2 to no longer work.
 ##############################################################################################
 * TASK 1:
 * Modify processScore() so it will PRINT a fixed score of 100.
 *
 * We can run this like:
 * processScore()
 *
 * STOP HERE FOR: 'B-'
 ##############################################################################################
 * TASK 2:
 * Modify processScore() so that:
 *
 * 1. It accepts one value as a parameter (int x).
 * 2. PRINTS x + 3.
 *
 * We can run this like:
 * processScore(7)
 * with a print output of: 10
 *
 * STOP HERE FOR: 'B'
 ##############################################################################################
 * TASK 3:
 * Modify processScore() from task 2 so that:
 *
 * 1. Instead of printing, it RETURNS x + 3 (as an int).
 *
 * STOP HERE FOR: 'B+'
 ##############################################################################################
 * TASK 4:
 * Modify processScore() from task 3 so that:
 *
 * 1. If x < 0 or x > 100, RETURN -1
 * 2. Otherwise, RETURN x + 3
 *
 * STOP HERE FOR: 'A'
 ##############################################################################################
 * TASK 5:
 * Modify processScore() from task 4 so that:
 * 1. It accepts a second parameter which is a String describing a mode.
 * 2. If mode is "bonus", RETURN x * 2 (with the same validation as task 4).
 * 3. If mode is "curve", RETURN x + 3 (with the same validation as task 4).
 * 4. Otherwise, RETURN -1.
 * STOP HERE FOR: 'A+'
 */
public class App {
    // You will MODIFY THIS ONE METHOD across tasks 1–5. Do not create new methods.
    public static int processScore(int x) {
     return x+3;
    } 

    public static void main(String[] args) {
        processScore(15); 
        
        // B- range
        // System.out.println("Task 1:");
        // processScore(); // should PRINT 100

        // B range
        // System.out.println("Task 2:");
        // processScore(7);   // should PRINT 10
        // processScore(15);  // should PRINT 18

        // B+ range
        // System.out.println("Task 3:");
     // int s1 = processScore(7);   // expect 10          
     // int s2 = processScore(15);  // expect 18
     //  System.out.println(s1);
     // System.out.println(s2);

        // A range
        System.out.println("Task 4:");
        System.out.println(processScore(-5));   // -1 (invalid)
        System.out.println(processScore(120));  // -1 (invalid)
        System.out.println(processScore(50));   // 53

        // A+ range
        // System.out.println("Task 5:");
        // System.out.println(processScore("bonus", 10)); // 20
        // System.out.println(processScore("curve", 10)); // 13
        // System.out.println(processScore("none", 10));  // -1 (unknown)
        // System.out.println(processScore("bonus", -1)); // -1 (invalid)
    }
}
