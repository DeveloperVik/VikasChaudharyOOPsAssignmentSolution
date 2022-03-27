
public class Main {
	public static void main(String[] args) {
        AdminDepartment ad = new AdminDepartment();
        HRDepartment sd = new HRDepartment();
        TechDepartment td = new TechDepartment();
        // System.out.println(sd.departmentName());
       
    }
}

class SuperDepartment {
    public String departmentName(){
        return " Super Department";
    }
    public String getTodaysWork(){
        return " No work as of now";
    }
    public String getWorkDeadline(){
        return " Nil";
    }
    public String isTodayAHoliday(){
        return " Today is not a holiday";
    }
}

class AdminDepartment extends SuperDepartment {
    public AdminDepartment(){
        System.out.println("Welcome to"+departmentName()+getTodaysWork()+getWorkDeadline()+isTodayAHoliday());
    }
    public String departmentName(){
        return " Admin Department";
    }
    public String getTodaysWork(){
        return " Complete your documents Submission";
    }
    public String getWorkDeadline(){
        return " Complete by EOD";
    }
}

class HRDepartment extends SuperDepartment {
    public HRDepartment(){
        System.out.println("Welcome to"+departmentName()+doActivity()+getTodaysWork()+getWorkDeadline()+isTodayAHoliday());
    }
   
    public String departmentName(){
        return " Hr Department";
    }
    public String getTodaysWork(){
        return " Fill todays worksheet and mark your attendance";
    }
    public String getWorkDeadline(){
        return " Complete by EOD";
    }
    public String doActivity(){
        return " Team Lunch";
    }
}

class TechDepartment extends SuperDepartment{
    public TechDepartment(){
        System.out.println("Welcome to"+departmentName()+getTodaysWork()+getWorkDeadline()+getTechStackInformation()+isTodayAHoliday());
    }
    public String departmentName(){
        return " Tech Department";
    }
    public String getTodaysWork(){
        return " Complete coding of module 1";
    }
    public String getWorkDeadline(){
        return " Complete by EOD";
    }
    public String getTechStackInformation(){
        return " core Java";
    }
}
