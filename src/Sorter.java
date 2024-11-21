
public class Sorter {

    /*
    // מיון בועות סיבוכיות של o(n^2)
    public static Employee[] bubbleSort(Employee[] employees) {
        long startTime = System.nanoTime();
        int n = employees.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (employees[j].getSalary() > employees[j + 1].getSalary()) {
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }

        long endTime = System.nanoTime();
        System.out.println("Bubble sort completed in: " + (endTime - startTime) + " ns");
        return employees;
    }
    */


    // מיון מיזוג בסיבוכיות של O(n*log(n))

    public static Employee[] mergeSort(Employee[] employees) {
        long startTime = System.nanoTime();

        if (employees.length <= 1) {
            return employees;
        }

        // Split the array into two halves
        int mid = employees.length / 2;
        Employee[] left = new Employee[mid];
        Employee[] right = new Employee[employees.length - mid];

        System.arraycopy(employees, 0, left, 0, mid);
        System.arraycopy(employees, mid, right, 0, employees.length - mid);

        // Recursively sort both halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(employees, left, right);

        long endTime = System.nanoTime();
        System.out.println("Merge sort completed in: " + (endTime - startTime) + " ns");
        return employees;
    }

    private static void merge(Employee[] employees, Employee[] left, Employee[] right) {
        int i = 0, j = 0, k = 0;

        // Merge arrays while comparing elements
        while (i < left.length && j < right.length) {
            if (left[i].getSalary() <= right[j].getSalary()) {
                employees[k++] = left[i++];
            } else {
                employees[k++] = right[j++];
            }
        }

        // Copy remaining elements from left array
        while (i < left.length) {
            employees[k++] = left[i++];
        }

        // Copy remaining elements from right array
        while (j < right.length) {
            employees[k++] = right[j++];
        }
    }


}