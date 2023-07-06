import java.util.*;
public class TestArrays {
    public static int[] numberFreq(){
        Random generator=new Random();
        int[] array1=new int[11];
        for(int i=1;i<=1000;i++){
            int num=generator.nextInt(11);
            array1[num]++;
        }
         return array1;
    }
    public static int[] fibo(int total){
        int[] array2=new int[total];
        array2[0]=1; array2[1]=2;
        for(int i=2;i<total;i++){
            array2[i]=array2[i-1]+array2[i-2];
        }
        return array2;
    }
    public static int oddDie(Die[] dice){
        int counter=0;
        for(int i=0;i<dice.length;i++){
            dice[i].roll();
            if(dice[i].getFaceValue()%2 == 1){
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args){
        System.out.println("Test Case for Method 1:");
        int[] frequency=numberFreq();
        for (int i = 0; i<frequency.length;i++){
            System.out.println("The number:"+ i + " The frequency:"+frequency[i]);
        }
        System.out.println("Test Case for Method 2:");
        int total= 12;
        int[] fibo=fibo(total);
        System.out.println("The sequence is:");
        for(int i=0;i< fibo.length;i++){
            System.out.println(fibo[i]+"");
        }
        System.out.println("Test Case for Method 3");
        Die[] dies=new Die[10];
        for(int i=0; i<dies.length;i++){
            dies[i]=new Die();
        }
        System.out.println("\nThe # of odd dice:"+oddDie(dies));

    }
}
