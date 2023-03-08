/*
 * Activity 4.9.7
 */ 
public class Main
{ 
  public static void main(String args[]) 
  { 
    Student s = new Student("TestName", "0", 5); 
    Student t = new Student("Testname", "0", 5);
    Student r = new Student("New Name", "1", 0);

    System.out.println(s);

    // Below two statements are equivalent 
    System.out.println(s.equals(t)); 
    System.out.println(s.equals(r)); 
  } 
} 