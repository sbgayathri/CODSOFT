import java.util.Scanner;

public class gradecalculators {
    Scanner sc=new Scanner(System.in);
    protected String name;
    protected char grade;
    protected int avg;
    protected int total_subject;
    protected int arr[];
    protected int sum=0;
    public void details(){
        System.out.println("Name");
        name=sc.next();
        System.out.println("Enter the total subject");
        total_subject=sc.nextInt();
        arr=new int[total_subject];
        System.out.println("Enter the marks in each subject out of 100");
        for(int i=0;i<total_subject;i++){
            arr[i]=sc.nextInt();
        }
        totalmarks_and_avg(arr);
    }
    public void totalmarks_and_avg(int[] arr){
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        avg=sum/arr.length;
        grade(avg);
    }
    public void grade(int avg){
        if(avg>90 && avg<=100){
            grade='A';
        }else if(avg>80 && avg<=90){
            grade='B';
        }else if(avg>70 && avg<=80){
            grade='C';
        }else if(avg>60 && avg<=70){
            grade='D';
        }else{
            grade='E';
        }
        display();
    }
    public void display(){
        System.out.println("Details of the student");
        System.out.println("Name  ---  "+name);
        System.out.println("Total subject  ---  "+total_subject);
        System.out.println("Marks in each subject out of 100");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Total marks -- "+sum);
        System.out.println("Average  --  "+avg);
        System.out.println("Grade of the student --  "+grade);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        gradecalculators a=new gradecalculators();
        while(true){
            System.out.println("1.Enter the student details");
            System.out.println("2.Exit");
            System.out.println("Enter the choice");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                a.details();
                break;
                case 2:
                System.exit(0);
                break;
            }
        }
    }
 
}
