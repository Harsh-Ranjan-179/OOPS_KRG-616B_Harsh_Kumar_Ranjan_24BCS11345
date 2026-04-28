package demo1;

public class Main {

	public static void main(String[] args) {
        Student s = new Student();

        s.setName("Harsh");
        s.setRollNo(101);
        s.setMarks(88.5);

        System.out.println("Name: " + s.getName());
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Marks: " + s.getMarks());
    }

}
