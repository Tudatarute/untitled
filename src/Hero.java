public class Hero {
    String name;
    int hp;
    Sword sword;


    public  void sleep(){
        this.hp = 100;
        System.out.println(this.name +  "は、　眠って回復した！");
    }
    public  void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "は、　" + sec +"秒座った！");
        System.out.println("HPが" + sec + "");
    }
    public  void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ！");
        System.out.println("5のダメージ！");
    }
    public  void run() {
        System.out.println(this.name + "は、　逃げ出した！");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは" + this.hp + "でした");

    }
    public Hero(String name) {
        this.hp = 100;
        this.name = name;
    }
    public Hero(){
        this("だみ");
    }
    /*public Hero(int hp, String name) {//同じ名前
        this.hp = hp;
        this.name = name;
        System.out.println("引数2つ");
    }
}
    /*public  Wizard(String name) {
        this.hp = 50;
        this.name = name;
    }*/
}

