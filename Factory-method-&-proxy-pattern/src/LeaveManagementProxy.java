class LeaveManagementProxy implements LeaveManagement {

    private String username;
    private String password;

    private RealLeaveManagement realSystem;

    public LeaveManagementProxy(String username,String password){

        this.username=username;
        this.password=password;

        realSystem=new RealLeaveManagement();

    }

    private boolean authenticate(){

        return username.equals("faculty") &&
                password.equals("64489");

    }

    public void submitLeave(LeaveRequest leave){

        if(authenticate()){

            System.out.println("Login Successful.");

            realSystem.submitLeave(leave);

        }

        else{

            System.out.println("Access Denied... Invalid Credentials.");

        }

    }

}