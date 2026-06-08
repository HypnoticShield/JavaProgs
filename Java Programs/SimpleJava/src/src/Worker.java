/*Define a Worker class with DailyWorker and SalariedWorker as its subclasses.
Each worker has a name and salary rate.
Implement a method computePay(int hours) to compute weekly pay.
DailyWorker is paid based on the number of days worked (assuming 8 hours per day),
whereas SalariedWorker receives a fixed wage for 40 hours per week, regardless of actual hours worked.
Use polymorphism to implement this program and test worker salary calculations.
 */
package src;

class DailyWorker extends Worker{
    private String name;
    private double salaryRate;
    public DailyWorker(String name, double salaryRate){
        this.name = name;
        this.salaryRate = salaryRate;
    }
    public double computePay(int hours){
        return hours * salaryRate;
    }
}
class SalariedWorker extends Worker{
    private String name;
    private double salaryRate;
    public SalariedWorker(String name, double salaryRate){
        this.name = name;
        this.salaryRate = salaryRate;
    }
    public double computePay(int hours){
        return 40 * salaryRate;
    }
}
public class Worker {
    public static void main(String[] args) {
        DailyWorker dailyWorker = new DailyWorker("John", 10);
        SalariedWorker salariedWorker = new SalariedWorker("Doe", 20);
        System.out.println("Daily Worker's weekly pay: " + dailyWorker.computePay(5));
        System.out.println("Salaried Worker's weekly pay: " + salariedWorker.computePay(5));
    }
}
