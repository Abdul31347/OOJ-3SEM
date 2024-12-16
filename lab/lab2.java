import java.io.*;
import java.util.Scanner;
public class lab2{
	Scanner sc=new Scanner(System.in);
	String usn;
	String name;
	int [] credit;
	int [] marks;
	public student(int numsubjects){
	credit=new int[numsubjects];
	marks=new int[numsubjects];
	}
	void accept(){
		System.out.println("enter usn=");
		usn=sc.nextLine();
		System.out.println("enter name=");
		name=sc.nextLine();
		for(int i=0;i<credit.length();i++){
			System.out.printf("enter credit of subject%d=",i);
			credit[i]=sc.nextLine();
		}
		for(int j=0;j<marks.length();j++){
			System.out.printf("enter marks of subject%d=",i);
			marks[i]=sc.nextLine();
		}
	}
	void display(){
		System.out.println("usn="+usn);
		System.out.println("name="+name);
		for(int i=0;i<credit.length();i++){
			System.out.printf("credit of subject%d=%d",i,credit[i]);
			
		}
		for(int j=0;j<marks.length();j++){
			System.out.printf("marks of subject%d=",i,marks[j]);
		}
	}
	void calc(){
		int totalcredit=0;
		int wmarks;
		for(int i=0;i<credit.length();i++){
			int mmars=(marks[i]/10)+1;
			totalcredit=totalcredit+credit[i];
			wmarks=wmarks+mmarks*credit[i];
		}
		if(totalcredit==0){
			return 0;
		}
		System.out.println("gpa="+(wmarks/totalcredit));
		}
	public static void main(String[] args){
		int numsubjects=sc.nextInt();
		student s1=new student(numsubjects);
		s1.accept();
		s1.display();
		s1.calc();
	}
}