public class Robot {

    private String name;
    private int numMotors;
    private double pwrDuration;
    public int numberOfRobots;

    /**
     * sets the robots name variable to be equal to its attribute
     * @param name
     */
    public void setName(String name){this.name = name;};

    /**
     * gets the name of the robot and returns it to its variable
     * @return
     */
    public String getName(){return name;};


    public void setNumMotors(int numMotors){this.numMotors = numMotors;};
    public int getNumMotors(){return numMotors;};

    public void setPwrDuration(double pwrDuration){this.pwrDuration = pwrDuration;};
    public double getPwrDuration(){return pwrDuration;};

    /**
     * Sets the variable 'numberOfRobots' to increase whenever a new robot is created
     * @param numberOfRobots
     */
    public void setNumberOfRobots(int numberOfRobots){this.numberOfRobots = numberOfRobots; numberOfRobots++;};

    public int getNumberOfRobots(){return numberOfRobots;};

    /**
     * sets the defaults values for the variables
     */
    public Robot()
    {
        this.name = "This robot has no name";
        this.numMotors = 0;
        this.pwrDuration = 0.0;
    }

    /**
     * sets the accessor methods to the correct variables
     * @param name
     * @param numMotors
     * @param pwrDuration
     */
    public Robot(String name, int numMotors, double pwrDuration)
    {
        setName(name);
        setNumMotors(numMotors);
        setPwrDuration(pwrDuration);
    }

    /**
     * a method that displays all of the attributes
     * @return
     */
    public String toString()
    {
        return "Name: " + getName() + "\nNumber of Motors: " + getNumMotors() + "\nPower Duration: " +getPwrDuration();
    }
}
