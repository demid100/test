package test01;

public class Zoo
{
    private static int count = 7;
    private int mouseCount = 1;

    public static int getAnimalCount()
    {
        return count;
    }

    public int getMouseCount()
    {
        return mouseCount;
    }

    public static class Mouse
    {
        public Mouse()
        {
        }
        public int getTotalCount()
        {
        //    return count + mouseCount; //ошибка компиляции.
            return 0;
        }
    }
}

class Home
{
    public static void main(String[] args)
    {
        Zoo.Mouse mouse = new Zoo.Mouse();
    }
}