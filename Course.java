public class Course
{
    /**
     * Course name taken by student
     */
    private String classSubject;

    /**
     * Default Constructor of Course
     */
    public Course()
    {
        classSubject = "";
    }

    /**
     * Constructor for Course
     * @param subject taken by student
     */
    public Course(String subject)
    {
        classSubject = subject;
    }

    /**
     * Method that obtains the course taken
     * @return the course name
     */
    public String getClassSubject()
    {
        return classSubject;
    }

    /**
     * Method that sets the course name given
     * @param subject the student is taking
     */
    public void setClassSubject( String subject)
    {
        classSubject = subject;
    }

    /**
     * Method that returns the course name
     * @return course name
     */
    public String toString()
    {
        return getClassSubject();
    }
}
