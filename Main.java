package multithreading;
class Armstrong1 extends Thread {
	@Override
	public void run() {
		int reminder, temp, sum=0; 
		 for(int i = 1; i <= 1000; i++)//for iterating 1 to 1000 range 
	        {
	            temp = i; //storing i value in temp to execute while loop 
	            while(temp > 0) //check condition wether temp value is greater then 0 or not
	            {
	                reminder= temp % 10; 
	                sum += reminder * reminder * reminder;
	                temp = temp / 10;
	            }
	            if(sum == i) //checking original number and result value and printing the armstrong value
	            {
	                System.out.print(i+" ");
	            }
	        
	            sum = 0; //resetting result value to get next armstrong number 
	        }

	}
	
}
class PrimeNum1 extends Thread {
	public void run() {
		for(int i=1000;i>=1;i--) {
			boolean temp=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
				temp=false;
				break;
				}
			}
			if(temp){
				System.out.println(i);
			}
		}
	}
	
}
public class Main{
public static void main(String[] args) {
	System.out.println("Armstrong Number 1 to 1000");
	Armstrong1 armstrong1 = new Armstrong1();
	armstrong1.start();
	System.out.println("Prime Number 1000 to 1");
	PrimeNum1 number1=new PrimeNum1();
	number1.start();
}
}
