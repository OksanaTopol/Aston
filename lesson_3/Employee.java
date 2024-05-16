package lesson_3;

public class Employee {
    private String name;
    private String position;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPosition(){
        return position;
    }

    public void setPosition(String position){
        this.position = position;
    }    
    
    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }    
    
    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }    
    
    public int getAge(){
        return age;
    }

    public void setName(int age){
        this.age = age;
    }

    public void showEmployee(){
        System.out.println("Employee: " + name + " - " + position + " phone number: " + phone + ", salary: " + salary + ", age: " + age);
    }
}
