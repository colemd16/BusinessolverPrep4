public class BonusCalculator {

    public double calculateBonus(Employee e) {

        if (e.role.equals("manager")) {
            return e.salary * 0.20;
        }

        if (e.role.equals("developer")) {
            return e.salary * 0.10;
        }

        if (e.role.equals("intern")) {
            return e.salary * 0.05;
        }

        return 0;
    }
}
