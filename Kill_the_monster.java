import java.util.*;

public class Kill_the_monster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long health_char = sc.nextLong();   
            long attack_char = sc.nextLong();   

            long health_mon = sc.nextLong();    
            long attack_mon = sc.nextLong();    

            int max_coins = sc.nextInt();       
            long extra_attack = sc.nextLong();  
            long extra_health = sc.nextLong();  

            boolean win = false;

            for (int i = 0; i <= max_coins; i++) {

                long new_health =
                        health_char + (long) i * extra_health;

                long new_attack =
                        attack_char + (long) (max_coins - i) * extra_attack;

                long time_for_char_to_kill_monster =
                        (health_mon + new_attack - 1) / new_attack;

                long time_for_monster_to_kill_char =
                        (new_health + attack_mon - 1) / attack_mon;

                if (time_for_char_to_kill_monster
                        <= time_for_monster_to_kill_char) {
                    win = true;
                    break;
                }
            }

            System.out.println(win ? "YES" : "NO");
        }

        sc.close();
    }
}
