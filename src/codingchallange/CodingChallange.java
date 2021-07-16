
package codingchallange;
import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

public class CodingChallange {

    public static void main(String[] args) {

        
      int data[]= readFiles ("InputData.txt");
        System.out.println(Arrays.toString(data));
          System.out.println("The sum of the fuel requirements for all of the modules on our spacecraft is : "+Sum(data));
       
    }
    
    public static int [] readFiles(String file){
    
    try{
        
        File f= new File(file);
        Scanner s= new Scanner (f);
        int ctr =0;
        while (s.hasNextInt()){
        ctr++;
        s.nextInt();
        }
        int [] arr=new int[ctr];
        Scanner s1=new Scanner(f);
        for(int i=0;i<arr.length;i++)
            arr[i]=s1.nextInt();
        return arr;
    
    }
    
    catch(Exception e){
    return null;
    }
    
    }
    
    public static int Sum(int [] a ){
    
        int sum=0;
        for(int i=0;i<a.length;i++){
        sum=sum+(a[i]/3)-2;
        }
      
    return sum;
    }
    
}
