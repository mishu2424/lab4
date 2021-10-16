
package Mishu;

/*
 *Name:Apurbo dey Mishu
 *id:2012020266
 *Sec:F
 *apurbomishu24@gmail.com
 */

public class Cricket extends Sports {
    String matchType;
    int over;
    Player player;
    Cricket(String matchType,int over,Player player){
        this.matchType=matchType;
        this.over=over;
        this.player=player;
    }

    void display(){
        System.out.println("MatchType: "+matchType);
        System.out.println("Over: "+over);
        System.out.println("Player's Name: "+player.playerName);
        System.out.println("Player's Jersey Number: "+player.jerseyNumber);
    }
}
