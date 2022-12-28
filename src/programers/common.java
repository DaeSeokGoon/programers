package programers;

public class common {
	public static void main(String[] args) {
		int answer = 0;
		int[]common = {2,4,8};
		
		int x = common[1] - common[0];
		int y = common[2] - common[1];
		
		if(x == y) {
			answer = common[common.length-1]+x;
		}else {
			x = common[1]/common[0];
			answer = common[common.length-1]*x;
		}
		System.out.println(answer);
		
	}
}
