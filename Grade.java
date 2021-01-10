public class Grade
{
    /**
     * grade letter of the course
     */
    private String gradeLetter;

    /**
     *  Default Constructor for Grade
     */
    public Grade()
    {
        gradeLetter = "";
    }

    /**
     * A Constructor of Grade
     * @param gradeLetter of the course
     */
    public Grade(String gradeLetter)
    {
        this.gradeLetter = gradeLetter;
    }

    /**
     * Method that obtains the grade letter in the course
     * @return the grade letter of the course
     */
    public String getGradeLetter()
    {
        return gradeLetter;
    }

    /**
     *  Method that sets the grade letter of course
     * @param gradeLetter of the course
     */
    public void setGradeLetter(String gradeLetter)
    {
        this.gradeLetter = gradeLetter;
    }

    /**
     * Method that returns the value of the grade letter received
     * @param grade letter received
     * @return value of grade letter
     */
    public double getGradeLetterValue(String grade)
    {
        double gradeValue = 0;
        if (grade.equalsIgnoreCase("A")) {
            gradeValue = 4.0;
        }
        if (grade.equalsIgnoreCase("B")) {
            gradeValue = 3.0;
        }
        if (grade.equalsIgnoreCase("C")) {
            gradeValue = 2.0;
        }
        if (grade.equalsIgnoreCase("D")) {
            gradeValue = 1.0;
        }
        return gradeValue;
    }

    /**
     * Method to return grade letter of course
     * @return grade letter
     */
    public String toString()
    {
        return getGradeLetter();
    }
}
