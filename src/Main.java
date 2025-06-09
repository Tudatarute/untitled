//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;

        Hero h1 = new Hero("ミナト");
        System.out.println(h1.name);
        System.out.println(h1.hp);
        //h1.name = "ミナト"
        //h1.hp = 100;
        //h1.sword = s;


        Hero h2 = new Hero();
        System.out.println(h2.name);
        System.out.println(h2.hp);
        //h2.name = "アカサ";
        //h2.hp = 100;

        /*Wizard w =new Wizard();
        w.name = "スガワラ";
        w.hp = 50;
        w.heal(h1);
        w.heal(h2);
        w.heal(h2);



        System.out.println("現在の武器は" + h1.sword.name);

        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';

        Matango m3 = new Matango();
        m3.hp = 46;
        m3.suffix = 'C';

        //System.out.println("勇者"+h.name+"を生み出しました！");
        //h.sit( 5);
        h1.slip();
        m1.run();
        m2.run();
        m3.run();
        //h.sit( 25);
        h1.run();*/
    }
}