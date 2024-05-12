package ComparablevsComparator;

public class Student implements Comparable<Student>{
    public int id;
    public String name;
    public float psp;
    public double salary;
    public Student(int id,String name,float psp,double salary)
    {
        this.id=id;
        this.name=name;
        this.psp=psp;
        this.salary=salary;
    }

    @Override
    public int compareTo(Student o) {
        if(this.salary==o.salary)
        {
            return 0;
        }
        else if(this.salary<o.salary){
            return -1;
        }
        return 1;
    }
}
