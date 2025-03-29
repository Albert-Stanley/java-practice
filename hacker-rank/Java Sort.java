import java.util.*;

class Student {
    int ID;
    String firstName;
    double CGPA;
    
    public Student (int ID, String firstName, double CGPA){
        this.ID = ID;
        this.firstName = firstName;
        this.CGPA = CGPA;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine();
        
        List<Student> students = new ArrayList<>();
        
        for (int i = 0; i < n; i++){
            int ID = scanner.nextInt();
            String firstName = scanner.next();
            double CGPA = scanner.nextDouble();
            scanner.nextLine();
            
            students.add(new Student(ID, firstName, CGPA));
        }
        
        Collections.sort(students, new Comparator<Student>(){
            @Override 
            public int compare(Student s1, Student s2){
                if (Double.compare(s2.CGPA, s1.CGPA) != 0) {
                    return Double.compare(s2.CGPA, s1.CGPA); // 
                }
                
            
                if (!s1.firstName.equals(s2.firstName)) {
                    return s1.firstName.compareTo(s2.firstName); // 
                }
    
                return Integer.compare(s1.ID, s2.ID); 
            }
        });
        
        for (Student student : students) {
            System.out.println(student.firstName);
        }
        
        scanner.close();    
    }
}
