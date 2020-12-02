import java.util.Arrays;

public class U4
{
    private static int[] keyboard=new int[]{40,35,70,15,45};
    private static int[] USB=new int[]{20, 15, 40,15};

    static int cheapkeyboard()
    {//searching for the cheapest keyboard
        int min=keyboard[0];
        for(int i=1;i<keyboard.length;++i)
        {
            if(min>keyboard[i])
                min=keyboard[i];
        }
        return min;
    }

    static int cheapUSB(){//searching for the cheapest USB
        int min=USB[0];
        for(int i=1;i<USB.length;++i)
        {
            if(min>USB[i])
                min=USB[i];
        }
        return min;
    }

    static int mostexpensive()
    {
        int max=keyboard[0];
        for(int i=1;i<keyboard.length;++i)
        {//searching for the most expensive item
            if(max<keyboard[i])
                max=keyboard[i];
        }
        for(int i=0;i<USB.length;++i)
        {//searching for the most expensive item
            if(max<USB[i])
                max=USB[i];
        }
        return max;
    }

    static int affordable(int b)
    {
        int max=USB[0];
        for(int i=0;i<USB.length;++i)
        {//searching for the highest price,that still fits the budget
            if(max<USB[i] && USB[i]<=b)
                max=USB[i];
        }
        return max;
    }

    static int buy(int b)
    {
        if(cheapkeyboard()+cheapUSB()>b) return -1;//if budget is too tight
        Arrays.sort(keyboard);
        Arrays.sort(USB);
        int max=keyboard[0]+USB[0];//cheapest combo
        //int pk=keyboard[0];//price of the keyboard
        //int pu=USB[0];//price of the USB
        for(int i=0;i<keyboard.length;++i)
        {
            for (int j=1;j<USB.length;++j)
            {
                if(keyboard[i]+USB[j]>max && keyboard[i]+USB[j]<=b)
                    max=keyboard[i]+USB[j];
            }
        }
        return max;
    }

}
