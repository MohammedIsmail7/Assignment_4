package assignment_4;
    import java.util.Scanner;
public class Assignment_4 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String type;
        int y;
        System.out.println("Memeber is:-");
        type=input.next();
        System.out.println("Years of work: ");
        y=input.nextInt();
        memeberFactory mF=new memeberFactory();
        staff m=mF.getmemeber(type);
        m.GetSalary();
        m.getYearsOfWork(y);
    }
    
}
