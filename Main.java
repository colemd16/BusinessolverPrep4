public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("John", 50000, "manager");
        Employee e2 = new Employee("Sally", 40000, "developer");
        Employee e3 = new Employee("Mike", 30000, "intern");

        BonusCalculator calc = new BonusCalculator();

        System.out.println(e1.name + " bonus: " + calc.calculateBonus(e1));
        System.out.println(e2.name + " bonus: " + calc.calculateBonus(e2));
        System.out.println(e3.name + " bonus: " + calc.calculateBonus(e3));
    }
}
