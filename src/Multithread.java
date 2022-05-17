//WAP to implement a three thread application. The first thread generates random integer
//and the second computes the square of the number if it is even
// if its odd it computes the cube of the number
import java.util.Random;

class RandomIntegerThread extends Thread {
    @Override
    public void run(){
        Random random=new Random();
        int limit=10;
        //first thread
        for(int i=0;i<limit;i++){
            int randomInt=random.nextInt(100);
            System.out.println("Random Integer is :"+randomInt);
//            second thread
            if((randomInt&1)==0){
                SquareThread sqrThread=new SquareThread(randomInt);
                sqrThread.start();
            } else {
//                third thread
                CubeThread cbthread=new CubeThread(randomInt);
                cbthread.start();
            } try {
                Thread.sleep(100);
            } catch (Exception e){
                System.out.println("Exception is caught");
            }
        }
    }
}
class SquareThread extends Thread{
    private int num;
    SquareThread(int randNum){ num=randNum;}
    @Override
    public void run(){ System.out.println("Square of "+num+" is "+(num*num));}
}
class CubeThread extends Thread{
    private int num;
    CubeThread(int randNum){ num=randNum;}
    @Override
    public void run(){ System.out.println("Cube of "+num+" is "+(num*num*num));}
}
public class Multithread {
    public static void main(String[] args) {
        RandomIntegerThread  randThreadTest = new RandomIntegerThread();
        randThreadTest.start();
    }
}
