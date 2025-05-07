import java.util.TreeSet;
class Student implements Comparable<Student>
{
    int rollno;
    String name;
    public Student(int rollno, String name)
    {
        this.rollno = rollno;
        this.name = name;
    }
    @Override
    public int compareTo(Student s)
    {
        return Integer.compare(this.rollno, s.rollno);
    }0059
    public String toString()
    {
        return this.rollno + " " + this.name;
    }
}
