import java.util.Scanner;

public class studentsInfo extends Students {
   
   Scanner s = new Scanner(System.in);
   
   void start(){
      System.out.println("-----Choose Transaction-----");
      System.out.println("[1] Students ");
      System.out.println("[2] Faculty ");
      System.out.println("[3] Schedule ");
      System.out.print("Option:  ");
      option = s.nextInt();
      s.nextLine();

      if (option ==1){
         input();
         privateInfo();
      }

   }
   
   void newStudent(){
      input();
      privateInfo();
   }
   
   void printList(){
      System.out.println("List of Students");
   }
   
   void list(){
      System.out.println(lName + ", " +fName  + ", " + mName);
   }
   void input(){
      System.out.print("First Name: ");
      fName = s.nextLine();
      System.out.print("Middle Name: ");
      mName = s.nextLine();
      System.out.print("Last Name: ");
      lName = s.nextLine();
      System.out.print("Course: ");
      course = s.nextLine();
      System.out.print("Year Level: ");
      year = s.nextInt();
   }
   
   public void privateInfo(){
      System.out.print("Age: ");
      setAge(s.nextInt());
      s.nextLine();
      System.out.print("House Number: ");
      setHouseNum(s.nextInt());
      s.nextLine();
      System.out.print("Address: ");
      setAddress(s.nextLine());
      System.out.println("-----------------------------");
   
   }
   
   void print(){
      System.out.println("         INFORMATION         ");
      System.out.println("Full Name: " + lName + ", " + fName + ", " + mName);
      System.out.println("Course: " + course);
      System.out.println("Year Level: " + year);
   }
   
   void privatePrint(){
      System.out.println("Age: " + getAge());
      System.out.println("Address: " + getHouseNum() + " " + getAddress());  
   }
   
   void allInfo(){
      print();
      privatePrint();
   }
   
   void search(infoStudents[] students) {
    System.out.print("Search student (First Name): ");
    String hanap = s.nextLine();

    for (infoStudents st : students) {
        if (hanap.equalsIgnoreCase(st.fName)) {
            st.allInfo();   // ipakita lahat ng info ng student na nahanap
            found = true;
        }
    }

    if (!found) {
        System.out.println("Student not found.");
    }
}

}