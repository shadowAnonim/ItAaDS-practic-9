import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Student[] students = new Student[10];
        for (int i = 0; i < 10; i++) {
            students[i] = new Student(r.nextInt(1, 1000));
            System.out.print(students[i] + " ");
        }
        System.out.println();

        int i, j;
        Student temp;

        for (i = 1; i < students.length; i++) {
            temp = students[i];
            for (j = i - 1; j >= 0; j--) {
                if (students[j].compareTo(temp) < 0) {
                    break;
                }
                students[j + 1] = students[j];
                students[j] = temp;
            }
        }

        for (i = 0; i < 10; i++)
            System.out.print(students[i] + " ");
    }
}