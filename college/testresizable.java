public class testresizable {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(5, 10);
        System.out.println("original rectangle:");
        r.display();
        r.resizeheight(12);
        r.resizewidth(12);
        System.out.println("Resized rectangle:");
        r.display();

    }

}
