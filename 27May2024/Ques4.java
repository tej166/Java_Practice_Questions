interface human{
    void walk();
}
interface Animal{
    void crawl();
}

class adimanav implements human, Animal{
    public void walk(){
        System.out.println("I can walk");
    }
    public void crawl(){
        System.out.println("I can crawl");
    }
    public void proof(){
        System.out.println("Hence prooved I am Adimanav");
    }
}
public class Ques4 {
    public static void main(String[] args) {
        adimanav a1 = new adimanav();
        a1.walk();
        a1.crawl();
        a1.proof();
    }
}
