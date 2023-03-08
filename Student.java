/*
 * Activity 4.9.7
 */ 
public class Student 
{ 
  private String name = "";  
  private String id = "";
  public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public int getYear() {
    return year;
}

public void setYear(int year) {
    this.year = year;
}

private int year = 0;

  // Constructor 
  Student(String name, String id, int year) 
  { 
    this.name = name;
    this.id = id;
    this.year = year;
  } 

  @Override
  public String toString() {
    return String.format("Name: %s, ID: %s, year: %d", name, id, year);
  }

  public boolean equals(Student other) {
    return this.id.equals(other.getId());
  }

} 
