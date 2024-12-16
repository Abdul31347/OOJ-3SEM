import java.util.Scanner;
class wrongage extends Exception{
    public wrongage(String msg){
        super(msg);
    }
}
class father{
    int age;
    public father(int age)throws wrongage{
        if(age<0){
            throw new wrongage("age can not be negative");
        }
        this.age=age;
    }
}
class son extends father{
    int sage;
    public son(int fage,int sage) throws wrongage{
        
        super(fage);
        if(sage<0){
            throw new wrongage("son age can not be negative");
        }
        if(sage>=fage){
            throw new wrongage("son age can not be greater than father age");
        }
        this.sage=sage;
    }
}
public class lab7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter father age=");
        int fage=sc.nextInt();
        System.out.print("enter son age=");
        int sage=sc.nextInt();
        try{
            son son=new son(fage,sage);
            System.out.print("the difference is");
            System.out.print(fage-sage);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}