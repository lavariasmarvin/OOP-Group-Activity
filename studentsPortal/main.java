public class Main {
   public static void main(String []args){
      
      
      infoStudents[] students = new infoStudents[3];
      
      
      for (int i = 0; i < students.length; i++) {
         students[i] = new infoStudents();
      }

      students[0].start();

      for (int i = 1; i < students.length; i++) {
         students[i].newStudent();
      }

      students[0].printList();

      for (int i = 0; i < students.length; i++) {
         students[i].list();
      }

      students[0].search(students);
   }
}