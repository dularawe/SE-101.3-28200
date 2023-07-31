public class App {
    public static void main(String[] args) throws Exception {
        Employee emp = new Employee(10000);

        emp.setName("Bogdan");
        emp.setBasicSalary(50000);
        String name = emp.getName();
        double basicSalary = emp.getBasicSalary();
        double bonus = emp.getBonus();
        double bonusAmount = emp.getBonusAmount();
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Bonus Amount: " + bonusAmount);
    }
}
