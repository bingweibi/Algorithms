package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Num690 {

    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }

    public int getImportance(List<Employee> employees, int id) {
        int importance = 0;
        List<Integer> subordinates;
        for(Employee e : employees){
            if(e.id == id){
                importance = e.importance;
                subordinates = e.subordinates;
                for(Integer i : subordinates) {
                    importance = importance + getImportance(employees,i);
                }
                break;
            }

        }
        return importance;
    }
}
