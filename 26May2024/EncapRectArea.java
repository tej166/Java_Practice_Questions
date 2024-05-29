class rect{
    private int length;
    private int widgth;

    public int getLength(){
        return this.length;
    }
    public void setLength(int length){
        this.length = length;
    }

    public int getwidth(){
        return this.widgth;
    }

    public void setwidgth(int widgth){
        this.widgth = widgth;
    }

    public int recArea(){
        return this.length * this.widgth;
    }
}
public class EncapRectArea {
    public static void main(String[] args) {
        rect r = new rect();
        r.setLength(3);
        r.setwidgth(6);
        
        System.out.println("Length: " + r.getLength());
        System.out.println("width: " + r.getwidth());
        System.out.println("area of rectangle: " + r.recArea());
    }
}
