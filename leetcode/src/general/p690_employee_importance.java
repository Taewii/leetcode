package general;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p690_employee_importance {
    static Map<Integer, Employee> map = new HashMap<>();

    public static void main(String[] args) {

    }

    public static int getImportance(List<Employee> employees, int id) {
        for (Employee emp : employees) map.put(emp.id, emp);
        return getImportance(map.get(id));
    }

    private static int getImportance(Employee emp) {
        int importance = emp.importance;
        for (Integer sub : emp.subordinates) {
            importance += getImportance(map.get(sub));
        }

        return importance;
    }

    private static class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }
}
