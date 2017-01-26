import java.io.*;

class project3ioBonus{
    public static void main(String[]args){
        System.out.println("Hi Guys! :)");
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader p = new BufferedReader(r);
        System.out.println("Enter height of triangle:");
        int num =0;
        try{
            num=Integer.valueOf(p.readLine());
        }
        catch(Exception j){
            System.out.println("Invalid Number!");

        }
        for(int z=1; z<=num; z++){
            for( int y=1; y<num -(y-1); y++){
                System.out.print(" ");
            }
            for( int x=1; x<=z; x++){
                System.out.print("*");
                for( int x1=1; x1<x; x1+=x){
                System.out.print("*");
                }
            }
            System.out.println(" ");
        }
        System.out.println();
        
    }
}