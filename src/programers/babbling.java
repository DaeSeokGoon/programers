package programers;

public class babbling {
	public static void main(String[] args) {
		int answer = 0;
		
		String [] babbling = {"ayaye","woo","ma"};
		for(int i=0; i <babbling.length; i++) {
			babbling[i] = babbling[i].replace("aya", "1");
			babbling[i] = babbling[i].replace("woo", "1");
			babbling[i] = babbling[i].replace("ye", "1");
			babbling[i] = babbling[i].replace("ma", "1");
			babbling[i] = babbling[i].replace("1", "");
			if(babbling[i].isEmpty()) {
				answer = answer +1;
			}
		}
		System.out.println(answer);
	}
}
