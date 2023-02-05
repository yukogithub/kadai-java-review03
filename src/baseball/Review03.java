package baseball;

import baseball.BaseBallTeam;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam swallows = new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
        BaseBallTeam baystars = new BaseBallTeam("横浜DeNAベイスターズ",73,68,2);
        BaseBallTeam tigers = new BaseBallTeam("阪神タイガース",68,71,4);
        BaseBallTeam giants = new BaseBallTeam("読売ジャイアンツ",68,72,3);
        BaseBallTeam carp = new BaseBallTeam("広島東洋カープ",66,74,3);
        BaseBallTeam dragons = new BaseBallTeam("中日ドラゴンズ",66,75,2);
        
        swallows.report();
        baystars.report();
        tigers.report();
        giants.report();
        carp.report();
        dragons.report();

    }

}
//public class RPG {
//
//    public static void main(String[] args) {
//        // 勇者と敵のキャラクターを生成
//        Character hero = new Character("勇者",10,5,3);
//        Character slime = new Character("スライム",5,2,2);
//        
//        hero.attack(slime);//勇者がスライムに攻撃する
//        slime.attack(hero);//スライムが勇者に攻撃する
//    }