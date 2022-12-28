package programers;

import java.util.ArrayList;
import java.util.List;



public class check {
	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		String [] zoka = {"aya","ye","woo","ma"};
		//한글자
		for(int i = 0; i < zoka.length; i++) {
			words.add(zoka[i]);
		}
		//두글자
		for(int i=0; i <zoka.length-1; i++) {
			for(int j=1+i; j<zoka.length; j++) {
				words.add(zoka[i]+zoka[j]);
				words.add(zoka[j]+zoka[i]);
			}
		}
		//세글자
		for(int i=0; i<zoka.length-2;i++) {
			for(int j=1+i; j<zoka.length-1;j++) {
				for(int k=j+1; k<zoka.length;k++) {
					words.add(zoka[i]+zoka[j]+zoka[k]);
					words.add(zoka[i]+zoka[k]+zoka[j]);
					words.add(zoka[j]+zoka[i]+zoka[k]);
					words.add(zoka[j]+zoka[k]+zoka[i]);
					words.add(zoka[k]+zoka[i]+zoka[j]);
					words.add(zoka[k]+zoka[j]+zoka[i]);
				}
			}
		}
		//네글자
		words.add(zoka[0]+zoka[1]+zoka[2]+zoka[3]);
	String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		int answer = 0;
		for(int i=0; i<babbling.length; i++) {
			boolean say = words.contains(babbling[i]);
			if(say) {
				answer +=1;
			}
		}
	}
}
