import java.util.Scanner;

public class WordCounter{
    public static void wordCounter(String str){
        int count=0;
        String[] s1=str.split(" ");
        for(int i=0;i<s1.length;i++)count++;
        System.out.println("The total words are :"+count);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the text :");
        String txt=sc.nextLine();
        wordCounter(txt);
        sc.close();
    }
}