public class Main {

    public static void main(String[] args) {

        System.out.println(" _______________Factory Method ___________");

        LeaveRequest cl = LeaveFactory.createLeave("CL");
        LeaveRequest ml = LeaveFactory.createLeave("ML");
        LeaveRequest od = LeaveFactory.createLeave("OD");

        cl.applyLeave();
        ml.applyLeave();
        od.applyLeave();

        System.out.println();

        System.out.println("________ Proxy Demo (Valid Login)_____________");

        LeaveManagement proxy1 =
                new LeaveManagementProxy("faculty","64489");

        proxy1.submitLeave(cl);

        System.out.println("\n");

        System.out.println("__________ Proxy Demo (Invalid Login) ___________");

        LeaveManagement proxy2 =
                new LeaveManagementProxy("admin","90302");

        proxy2.submitLeave(ml);

    }

}