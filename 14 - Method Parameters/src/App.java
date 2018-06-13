class Person {
    private String name;
    private int age;
     
    public void setName(String name) {
        this.name = name;
    }
     
    public void setAge(int age) {
        this.age = age;
    }
     
    public String getName() {
        return name;
    }
     
    public int getAge() {
        return age;
    }
     
    public void setInfo(String name, int age) {
        setName(name);
        setAge(age);
    }
}
 
public class App {
 
    public static void main(String[] args) {
     
        person person1 = new Person();
         
        //frog1.name = "Daenerys Targaryen";
        //frog1.age = 25;
         
        frog1.setName("Daenerys Targaryen");
        frog1.setAge(26);
         
        System.out.println(person1.getName());
    }
 
}