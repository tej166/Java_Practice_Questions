interface Human{
    void walk();
}
interface Animal{
    void crawl();
}

class AdiManav implements Human, Animal{
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
        AdiManav adiManav = new AdiManav();
        adiManav.walk();
        adiManav.crawl();
        adiManav.proof();
    }
}
