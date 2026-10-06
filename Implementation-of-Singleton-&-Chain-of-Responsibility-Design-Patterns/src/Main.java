public class Main {

    public static void main(String[] args) {

        LeaveManagement system1 = LeaveManagement.getInstance();
        LeaveManagement system2 = LeaveManagement.getInstance();

        System.out.println(system1 == system2);

        System.out.println();

        system1.processLeave(new LeaveRequest("bro", -1));

        system1.processLeave(new LeaveRequest("Natasha", 1));

        system1.processLeave(new LeaveRequest("sam", 5));

        system1.processLeave(new LeaveRequest("shanni", 10));
    }
}
