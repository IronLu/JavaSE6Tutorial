import java.util.Scanner;
 
public class ScoreAverage { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        int score = 0; 
        int sum = 0; 
        int count = -1; 
 
        while(score != -1) { 
            count++; 
            sum += score; 
            System.out.print("��J����(-1����)�G"); 
            score = scanner.nextInt();
        } 
 
        System.out.println("�����G" + (double) sum/count); 
    } 
}