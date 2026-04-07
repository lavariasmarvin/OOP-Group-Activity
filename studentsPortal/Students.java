public class Students extends Info{
   
   String fName;
   String lName;
   String mName;
   private int houseNum;
   private String address;
   int year;
   private int age;
   String course;
   String gender;
   int option;
   String hanap;
   boolean found = false;
   
   @Override
   public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }
    
    @Override
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getHouseNum() {
        return houseNum;
    }
    
    @Override
    public String getAddress() {
        return address;
    }
    
    @Override
    public int getAge() {
        return age;
    }
}