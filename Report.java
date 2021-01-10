public class Report
{
    /**
     * Main method to print a report card
     * @param args not used
     */
    public static void main(String[] args)
    {
        // Parallel Array of courses taken and grades
        Course[] classes = {new Course("Math"), new Course("English"), new Course("Science"),
                                new Course("History"), new Course("Physical Education") };
        Grade[] grades = { new Grade("A"),new Grade("B"),new Grade("B"),new Grade("C"),
                             new Grade("A")};
        // Creates Student
        Student s1 = new Student("Neal Terrel");
        System.out.println(s1);
        double overallGPA = 0;
        int classCounter = 0;
        // Prints the course name and grade and calculate GPA
        for( int i = 0; i < classes.length; i ++)
        {
            System.out.println(classes[i].toString() + ": " + grades[i].toString());
            overallGPA += grades[i].getGradeLetterValue(grades[i].getGradeLetter());
            classCounter++;
        }
        System.out.println(overallGPA / classCounter);
    }
}
