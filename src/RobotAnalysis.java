import javax.swing.*;
import java.awt.*;

public class RobotAnalysis {
    static Robot robot;

    public static void main(String[] args) {
        robot = new Robot();

        /**
         * Calls method 'finalOutput'
         */
        finalOutput();

    }


    /**
     * User-input questions that sign and create the attributes of the robots
     */
    public static void finalOutput()
    {
        /**
         * User-input question to determine how many robots does the user wants to create
         */
        String robotsToCreateAsString = JOptionPane.showInputDialog("Please enter the amount of robots that you wish to create: ");
        int robotsToCreateAsInt = Integer.parseInt(robotsToCreateAsString);

        /**
         * Creates an array with a name 'robotTeam'
         */
        Robot [] robotTeam = new Robot[robotsToCreateAsInt];

        /**
         * User-input questions that sign and create the name, number of motors and power duration of the robots
         */

        for(int i = 0; i < robotTeam.length; i++)
        {
            robotTeam[i] = new Robot();
            robotTeam[i].setName(JOptionPane.showInputDialog("Please enter the name of the robot: "));
            robotTeam[i].setNumMotors(Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of motors that the robot has: ")));
            robotTeam[i].setPwrDuration(Double.parseDouble(JOptionPane.showInputDialog("Please enter the power duration that the robot has: ")));
            /**
             * Sets the value of 'NumbeOfRobots' as 'robotsToCreateAsInt'
             */
            robot.setNumberOfRobots(robotsToCreateAsInt);

        }

        /**
         * Displays robots via 'display' method by using the array 'robotTeam'
         */
        display(robotTeam);
        /**
         * Shows how many robots were created in total
         */
        JOptionPane.showMessageDialog(null,"Number of Robots: " + robot.getNumberOfRobots());

    }

    /**
     * The method used to create and display all of the robots
     * @param array
     */
    public static void display(Robot [] array)
    {
        /**
         * Creates an JTextArea object called 'text'
         */
        JTextArea text = new JTextArea();

        String displayText = "Team:";

        /**
         * A for loop that helps to display all of the information about the robots using
         * 'array[i].get' methods from the class 'Robot.java'
         */
        for(int i = 0; i < array.length; i++)
        {
            displayText += "\nName:   " + array[i].getName() + "\nNumber of Motors:   " + array[i].getNumMotors() +
                    "\nPower Duration: " + array[i].getPwrDuration() + " hrs. \n";
        }

        text.setText(displayText);

        /**
         * Displays the message using the 'JOptionPane'
         */
        JOptionPane.showMessageDialog(null,text,"Message",JOptionPane.INFORMATION_MESSAGE);
    }


}
