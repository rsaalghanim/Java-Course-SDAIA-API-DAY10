package HW3;

public class Person extends PersonRecord {
    private String name;
    private int age;
    private String address;
 public Person (){

 }
    public Person(String name, int age, String address) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)  {
      if (age <0 || age >150 ){
              throw new IllegalArgumentException("invalid age: "+ age + ", is out of bound");

      }else this.age=age;


    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public  void personDetails( ) {
     try {
if (age >=0 && age <=150){
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("address: "+ address);
}
     } catch (IllegalArgumentException e) {
         System.out.println("wroonngg");
     }

    }

    @Override
    public String getDetail() {
        return   "Person{" +
                "name= " + name +
                ", age= " + age +
                ", address= " + address + '\'' +

                '}';
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
