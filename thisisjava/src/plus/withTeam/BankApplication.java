package plus.withTeam;

import java.util.Scanner;

public class BankApplication {
	
	// 최대 100개의 계좌를 저장할 배열 선언
	private static Account[] accountArray = new Account[100];
	// 현재 배열에 저장된 계좌의 개수를 추적하는 변수
	private static int count = 0; 
	private static Scanner scanner = new Scanner(System.in); 

	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("[게좌목록 실행 결과]");
			System.out.println("---------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			
			int num = scanner.nextInt();
			
			if (num == 1) {
				createAccount();
			} else if (num == 2) {
				accountList();
			} else if (num == 3) {
				deposit();
			} else if (num == 4) {
				withdraw();
			} else if (num == 5) {
				run = false;
			} else {
				System.out.println("선택 오류");
			}
		}
		
		System.out.println("프로그램 종료");
	}
	
	/**
	 * 1. 계좌 생성 (createAccount)
	 */
	private static void createAccount() {
		System.out.println("\n-----------");
		System.out.println("계좌생성");
		System.out.println("-----------");
		
		System.out.print("계좌번호: ");
		String AccountNum = scanner.next();
		
		System.out.print("계좌주: ");
		String name = scanner.next();
		
		System.out.print("초기입금액: ");
		long money = scanner.nextLong();
		
		// 새로운 Account 객체 생성
		Account newAccount = new Account(AccountNum, name, money);
		
		// 배열에 저장하고 count 증가
		accountArray[count] = newAccount;
		count++;
		
		System.out.println("결과: 계좌가 생성되었습니다.");
	}
	
	/**
	 * 2. 계좌 목록 (accountList)
	 */
	private static void accountList() {
		System.out.println("\n-----------");
		System.out.println("계좌목록");
		System.out.println("-----------");
		
		if (count == 0) {
			System.out.println("결과: 생성된 계좌가 없습니다.");
			return;
		}
		
		// count 만큼 반복하며 계좌 정보 출력
		for (int i = 0; i < count; i++) {
			Account account = accountArray[i];
			System.out.printf("%s\t%s\t%d\n", 
					account.getAccountNum(), 
					account.getName(), 
					account.getMoney());
		}
	}
	
	/**
	 * 3. 예금 (deposit)
	 */
	private static void deposit() {
		System.out.println("\n-----------");
		System.out.println("예금");
		System.out.println("-----------");
		
		System.out.print("계좌번호: ");
		String AccountNum = scanner.next();
		
		System.out.print("예금액: ");
		long ammount = scanner.nextLong();
		
		// 계좌 찾기
		Account account = findAccount(AccountNum);
		
		if (account == null) {
			System.out.println("결과: 계좌가 존재하지 않습니다.");
			return;
		}
		
		if (account.despoit(ammount)) { 
			System.out.println("결과: 예금이 성공되었습니다.");
			} else {
				System.out.println("결과: 예금액은 0보다 커야 합니다.");
		}
		
	}
	
	/**
	 * 4. 출금 (withdraw)
	 */
	private static void withdraw() {
		System.out.println("\n-----------");
		System.out.println("출금");
		System.out.println("-----------");
		
		System.out.print("계좌번호: ");
		String AccountNum = scanner.next();
		
		System.out.print("출금액: ");
		long ammount = scanner.nextLong();
		
		// 계좌 찾기
		Account account = findAccount(AccountNum);
		
		if (account == null) {
			System.out.println("결과: 계좌가 존재하지 않습니다.");
			return;
		}
		
		if (account.withdraw(ammount)) {
	        System.out.println("결과: 출금이 성공되었습니다.");
	    } else {
	        // 출금 실패 시의 메시지 출력
	        System.out.println("결과: 출금 실패했습니다.");
	    }
		
	}
	
	/**
	 * 계좌번호로 Account 객체를 찾는 메소드
	 */
	private static Account findAccount(String AccountNum) {
		Account account = null;
		
		// count 만큼 반복하며 계좌번호 일치 여부 확인
		for (int i = 0; i < count; i++) {
			if (accountArray[i].getAccountNum().equals(AccountNum)) {
				account = accountArray[i];
				break;
			}
		}
		return account;
	}
}