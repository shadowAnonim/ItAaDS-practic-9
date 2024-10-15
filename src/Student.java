public class Student implements Comparable<Student>{
    private int idNumber;

    public Student(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(idNumber, other.idNumber);
    }

    @Override
    public String toString() {
        return "Student: " + idNumber;
    }
}
