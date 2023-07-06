public class TestArraysAndRecursion {
    public static int salesRange(int[][] sales) {
        int min = sales[0][0];
        int max = sales[0][0];
        for(int[]row:sales){
            for(int sale:row){
                if (sale<min){
                    min=sale;
                }
                if (sale>max){
                    max=sale;
                }
            }
        }
        int range=max-min;
        return range;
    }
    public static int[] dieStats(Die[][] dice){
        int[] array1=new int[dice.length];
        for(int i=0;i< dice.length;i++){
            int count=0;
            for (Die die: dice[i]){
                die.roll();
                if(die.getFaceValue()%2==1){
                    count++;
                }
            }
            array1[i]=count;
        }
        return array1;

    }
    public static void printDigits(int num) {
        if (num < 10) {
            System.out.println(num);
        } else {
            printDigits(num / 10);
            System.out.println(num % 10);
        }
    }
    public static int prodArray(int numArray[],int count){
        if(count<=0)
            return 1;
        else{
            return prodArray(numArray,count-1)*numArray[count-1];
        }
    }

public static void main(String[] args){
        System.out.println("Test Case 1:");
        int[][] sales={
                {200,350,400},
                {150,375,225}
        };
        System.out.println(salesRange(sales));
        System.out.println("Test Case 2:");
        Die[][] dice={
                {new Die(),new Die(),new Die()},
                {new Die(),new Die(),new Die()}
        };
        int[] array1=dieStats(dice);
        for(int stat:array1){
            System.out.println("# of odd rolls in Row:"+stat);
        }
        System.out.println("Test Case 3:");
        printDigits(23147);
        System.out.println("Test Case 4:");
        int numArray[]={1,3,2,5};
        System.out.println(prodArray(numArray,3));
        System.out.println(prodArray(numArray,4));
}
}
