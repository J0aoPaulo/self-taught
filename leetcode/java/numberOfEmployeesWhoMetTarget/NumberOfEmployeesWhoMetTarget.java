package numberOfEmployeesWhoMetTarget;

/**
 * NumberOfEmployeesWhoMetTarget
 */
public class NumberOfEmployeesWhoMetTarget {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int sum = 0;

        for (int hour : hours)
            if (hour >= target) sum++;
        
        return sum;
    }
}