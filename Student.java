public class Student {
    private int id;
    private String name;
    private int[] marks;
    private double average;
    private char grade;

    public Student(int id, String name, int[] marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        calculateAverageAndGrade();
    }

    private void calculateAverageAndGrade() {
        int total = 0;
        for (int mark : marks) total += mark;
        this.average = (double) total / marks.length;

        if (average >= 90) grade = 'A';
        else if (average >= 75) grade = 'B';
        else if (average >= 60) grade = 'C';
        else if (average >= 40) grade = 'D';
        else grade = 'F';
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getAverage() { return average; }
    public char getGrade() { return grade; }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name +
               " | Average: " + String.format("%.2f", average) +
               " | Grade: " + grade;
    }
}
