class LeaveFactory {

    public static LeaveRequest createLeave(String type) {

        if(type.equalsIgnoreCase("CL"))
            return new CasualLeave();

        else if(type.equalsIgnoreCase("ML"))
            return new MedicalLeave();

        else if(type.equalsIgnoreCase("OD"))
            return new OnDutyLeave();

        return null;
    }
}