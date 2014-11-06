package lab4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author dworgolet
 */
public class Startup {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        
       Employee e1 = new Employee("Wargolet", "Daniel", "333-333-3333", "187813");
       Employee e2 = new Employee("Wargolet", "Daniel", "333-333-3333", "187813");
       Employee e3 = new Employee("Buth", "Steven", "444-444-4444", "189211"); 
       Employee e4 = new Employee("Buth", "Matthew", "555-555-5555", "983813");  
       
       //adding object to list
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        

        Set<Employee> dupes = new HashSet<>(employeeList);
        employeeList = new ArrayList<>(dupes);
        
        for(Employee e : employeeList) {
            System.out.println(e.toString());
        }

        System.out.println(employeeList.size());
    }
    
    
}
