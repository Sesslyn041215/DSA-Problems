package tues17;

import java.util.Scanner;

//Dinesh is fond of video games. Due to the pandemic, he designs a video game
//called Corona world. In this game, the player enters the game with a certain energy.
//The player should defeat all the corona infected zombies to reach the next level.
//When time increases the zombies will increase double the previous minute. Anyhow
//the player can manage to fight against all the zombies. In this case, definitely the
//player can not achieve the promotion. Hence the player gets a superpower to
//
//destroy all the zombies in the current level when the current game time is a
//palindrome. Anyhow the player can manage only if he knows the time taken to get
//the superpower. Help the player by providing the minimum minutes needed to get
//the superpower by which he can destroy all the zombies. You will be provided with
//the starting time of the game.
//Input:
//05:39
//Output:
//11
//Constraints:
//Input time will be in 24 hours format

public class DifferenceBetweenTheTime {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int hh, mm;
		hh = (str.charAt(0) - 48) * 10 + (str.charAt(1) - 48);
		mm = (str.charAt(3) - 48) * 10 + (str.charAt(4) - 48);
		int requiredTime = 0;
		while (hh % 10 != mm / 10 || hh / 10 != mm % 10) {
			++mm;
			if (mm == 60) {
				mm = 0;
				++hh;
			}
			if (hh == 24)
				hh = 0;
			++requiredTime;
		}
		System.out.println(requiredTime);
	
	}
}
