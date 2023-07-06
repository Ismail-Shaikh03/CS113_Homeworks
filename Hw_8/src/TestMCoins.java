import java.util.*;
public class TestMCoins {
    public static void main(String[] args){
        Random gen=new Random();
        MonetaryCoin[][] array=new MonetaryCoin[3][10];
        for(int i=0;i<array.length;i++){
            int totalHeads=0;
            for(int j=0;j<array[0].length;j++){
                array[i][j]=new MonetaryCoin(gen.nextInt(100)+1);
                System.out.println("("+array[i][j].toString()+")");
                if(array[i][j].isHeads()){
                    totalHeads+=array[i][j].getValue();
                }
        }
            System.out.println("Total Value of Heads in the Row "+(i+1)+":"+totalHeads);

    }


}}
