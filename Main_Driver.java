import java.time.LocalDate;
import java.util.ArrayList;

public class Main_Driver {

    public static void main(String[] args){

        ArrayList<StaffMember> staffMem = new ArrayList<>();

        staffMem.add(new Employee("Micheal", "Jackson", LocalDate.of(1990, 1, 15),
                new Address(), "0500000001", "micheal.jackson@example.com", "micheal.jackson@company.com"));
        staffMem.add(new Employee("Lebron", "James", LocalDate.of(1992, 3, 20),
                new Address(), "0500000002", "lebron.james@example.com", "lebron.james@company.com"));

        staffMem.add(new Volunteer("Alex", "Random", LocalDate.of(1995, 5, 10),
                new Address(), "0500000003", "alex.random@example.com", "alex.random@company.com"));
        staffMem.add(new Volunteer("Hamza", "Hani", LocalDate.of(1994, 7, 25),
                new Address(), "0500000004", "hamza.hani@example.com", "hamza.hani@company.com"));

        staffMem.add(new HourlyEmployee("Islam", "Rami", LocalDate.of(1988, 2, 12),
                new Address(), "0500000005", "islam.rami@example.com", "islam.rami@company.com"));
        staffMem.add(new HourlyEmployee("Sari", "Jizmawi", LocalDate.of(1991, 4, 18),
                new Address(), "0500000006", "sari.jizmawi@example.com", "sari.jizmawi@company.com"));

        staffMem.add(new WeeklyEmployee("Harry", "Potter", LocalDate.of(1989, 6, 8),
                new Address(), "0500000007", "harry.potter@example.com", "harry.potter@company.com"));
        staffMem.add(new WeeklyEmployee("Peter", "Parker", LocalDate.of(1993, 8, 14),
                new Address(), "0500000008", "peter.parker@example.com", "peter.parker@company.com"));

        staffMem.add(new SalariedEmployee("Max", "Verstappen", LocalDate.of(1987, 9, 3),
                new Address(), "0500000009", "max.verstappen@example.com", "max.verstappen@company.com"));
        staffMem.add(new SalariedEmployee("Lewis", "Hamilton", LocalDate.of(1996, 10, 22),
                new Address(), "0500000010", "lewis.hamilton@example.com", "lewis.hamilton@company.com"));

        staffMem.add(new ContractEmployee("Isack", "Hadjar", LocalDate.of(1990, 11, 11),
                new Address(), "0500000011", "isack.hadjar@example.com", "isack.hadjar@company.com"));
        staffMem.add(new ContractEmployee("Lando", "Norris", LocalDate.of(1992, 12, 6),
                new Address(), "0500000012", "lando.norris@example.com", "lando.norris@company.com"));

        staffMem.add(new CommissionEmployee("Fernando", "Alonso", LocalDate.of(1986, 1, 28),
                new Address(), "0500000013", "fernando.alonso@example.com", "fernando.alonso@company.com"));
        staffMem.add(new CommissionEmployee("Jenson", "Button", LocalDate.of(1997, 3, 9),
                new Address(), "0500000014", "jenson.button@example.com", "jenson.button@company.com"));

        staffMem.add(new EmployeeBasedCommission("Cristiano", "Ronadldo", LocalDate.of(1985, 5, 17),
                new Address(), "0500000015", "cristiano.ronadldo@example.com", "cristiano.ronadldo@company.com"));
        staffMem.add(new EmployeeBasedCommission("Lionel", "Messi", LocalDate.of(1998, 7, 2),
                new Address(), "0500000016", "lionel.messi@example.com", "lionel.messi@company.com"));


            
    }
    public void printList(ArrayList<StaffMember> staff){
        for (StaffMember member: staff){
            System.out.println(member);
        }

    } 
    public void totalPayment(ArrayList<StaffMember> staff){
        double total=0.0;
        for (StaffMember member: staff){
          
        }

    }

}
