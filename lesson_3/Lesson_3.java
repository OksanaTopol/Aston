package lesson_3;
import lesson_3.Employee;
import lesson_3.Park.Attraction;

public class Lesson_3 {
    public static void main(String[] args) {
		Employee[] empCorp = new Employee[5];
			empCorp[0] = new Employee("Ivanov Ivan", "Engineer", "892312312",50000,30);
			empCorp[1] = new Employee("Petrov Petr", "Designer", "892312313",50000,31);
			empCorp[2] = new Employee("Nikolaev Nikolaj", "QA", "892312314",10000,32);
			empCorp[3] = new Employee("Maksimov Maksim", "Team assistent", "892312315",5000,33);
			empCorp[4] = new Employee("Naomi Campbel", "Office manager", "892312316",3000,34);
        for (Employee employee : empCorp){
            if (employee.getAge()<32) employee.showEmployee();
        }
     	
        Park park = new Park();
        park.addAttraction(
            new Park.Attraction("Koleso", "09.00 - 21.00", 100)
        );

        park.addAttraction(
            new Park.Attraction("Kacheli", "09.00 - 22.00", 200)
        );
        
        park.getAttractions();
    }
}
