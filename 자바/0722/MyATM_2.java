package ja_0722; //synchronized 두번째 방법

class ATM_2
{
	private int total;
	
	public ATM_2(int total) 
	{
		this.total = total;
	}
	
		void deposit(int amount, String name) 
		{ //synchronized는 동시접근을 막는 키워드야 synchronized에 없이 실행 했다면 금액들이 맞지 않아
		total += amount;
		System.out.println(name + " 님 입금 금액 : " + amount + " 원");//입금
	}
	 void withdraw(int amount, String name) 
	 {
		if ((total - amount)>0) 
		{ //출금 가능하면
			total -= amount;
			System.out.println(name + " 님 출금 금액 : " + amount +" 원");	//출금		
		}
		else 
		{
			System.out.println(" 님 잔액이 부족해 출금할 수 없습니다."); //불가능하면
		}
	}
	 public void getTotal() 
	 {
		System.out.println("\n 현재 계좌의 금액 : " + total + "\n");
	}
}

class ATM_USER_2 extends Thread //ATM 사용자(는 스레드를 통해서 만들 것) // Runnable로 바꿔서 해보기
{
	boolean flag = false; // 입금, 출금
	
	ATM_2 obj; //세사람이 하나의 카드를 갖고 있다고 생각하기
	
	public ATM_USER_2(ATM_2 obj, String name) 
	{
		super(name);
		this.obj = obj;
	}
	
	@Override
	public void run() 
	{
		for (int i = 0; i < 5; i++) 
		{
			
			try 
			{
				sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
			synchronized (obj) 
			{
			
			if (flag) 
			{
				obj.deposit((int)(Math.random() * 10000),getName()); 
				//deposit 입금 (금액은 난수를 써서 정할 것)
				obj.getTotal();
			}
			else 
			{
				obj.withdraw((int)(Math.random() * 10000),getName());  
				//withdraw 출금
				obj.getTotal();
			}
			}
			flag = !flag;  
			// 한 번 출금이었으면 입금 , 입금이었으면 출금...
		}
	}
}

public class MyATM_2 {

	public static void main(String[] args) 
	{
		ATM_2 atm = new ATM_2(10000);  // 계좌에 10000원이 들어 있음
		
		ATM_USER_2 user1 = new ATM_USER_2(atm,"유현진");
		ATM_USER_2 user2 = new ATM_USER_2(atm,"손흥민");
		ATM_USER_2 user3 = new ATM_USER_2(atm,"김연경");
		
		user1.start();
		user2.start();
		user3.start();
	}
}