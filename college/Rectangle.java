public class Rectangle implements resizable
{
    private int height;
    private int width;

   public Rectangle(int width,int height)
    {
        this.width=width;
        this.height=height;
    }

    public void resizewidth(int width)
    {
        this.width=width;
    }

    public void resizeheight(int height)
    {
        this.height=height;
    }

    void display()
    {
        System.out.println("Rectangle width:"+width);
        System.out.println("Rectangle height:"+height);
    }
}