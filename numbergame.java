import java.util.*;
public class numbergame{
    static Scanner sc=new Scanner(System.in);
    protected static int guessnum;
    protected static int x;
    protected static String name;
    protected static int count;
    public static void guess(){
        Random r=new Random();
        x=r.nextInt(1,101);
        count=1;
        int totalattempts=7;
        System.out.println("Guess the number from1 to 100");
        while (count<=totalattempts) {
              guessnum=sc.nextInt();    
        if(guessnum>x){
            System.out.println("Your guess is too high");
            count++;
        }else if(guessnum<x){
            System.out.println("Your guess is too low");
            count++;
        }if(guessnum==x){
        display();
        }
        }
    Again();
    }
    private static void display(){
        System.out.println("Correct guess");
        System.out.println(name+"You guessed in"+count+"attempt");
        switch(count){
            case 1:
            System.out.println("Your score is 100");
            Again();
            break;
            case 2:
            System.out.println("Your score is 90");
            Again();
            break;
            case 3:
            System.out.println("Your score is 80");
            Again();
            break;
            case 4:
            System.out.println("Your score is 70");
            Again();
            break;
            case 5:
            System.out.println("Your score is 60");
            Again();
            break;
            case 6:
            System.out.println("Your score is 50");
            Again();
            break;
            case 7:
            System.out.println("Your score is 40");
            Again();
            break;
        }
    }
    public static void Again(){
        while (true) {
            System.out.println("1.Play Again");
            System.out.println("2.Exit");
            System.out.println("Enter the choice");
            int n=sc.nextInt();
            switch(n){
                case 1:
                System.out.println("Player Name");
                name=sc.next();
                guess();
                break;
                case 2:
                System.out.println("Game over");
                System.exit(0);
                break;
                default:
                System.out.println("Invalid choice");
            }
        }
    }
    public static void main(String args[]){
        System.out.println("Enter the player name");
        name=sc.next();
        guess();
    }
        
    }

