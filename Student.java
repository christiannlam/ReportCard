public class Student
{
    /**
     * @author Christian Lam christian.lam@student.csulb.edu
     */
    /** name of the student */
    private String name;
    /** Default constructor of Student */
    public Student()
    {
        name = "";
    }
    /** Constructor of Student */
    public Student ( String name)
    {
        this.name = name;
    }

    /**
     * A method that get the name of the student
     * @return name of the student
     */
    public String getName()
    {
        return name;
    }

    /**
     * A method that sets the name of the student
     * @param name of current student
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * A toString method to return the Student's Name
     * @return Name of student in a string format
     */
    public String toString()
    {
        return "Name: " + name;
    }
}
