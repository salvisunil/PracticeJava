package Exam2;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class TrafficSignal implements Runnable {
    public enum  Color {GREEN,ORANGE,RED};
    public List<Color> light = Arrays.asList(Color.GREEN, Color.ORANGE, Color.RED);
    public static int counter =0;
    public int i;

    public static final Object lock = new Object();

    public TrafficSignal(Color color)
    {
        this.i = light.indexOf(color);
    }
    @Override
    public void run()
    {
        synchronized (lock)
        {
            while (true)
            {
                System.out.println(light.get(counter % light.size()));
                counter++;
                try
                {
                    if(light.get(counter % light.size()).toString().equals("GREEN"))
                        Thread.sleep(2000);

                    else if(light.get(counter % light.size()).toString().equals("ORANGE"))
                        Thread.sleep(3000);

                    else if(light.get(counter % light.size()).toString().equals("RED"))
                        Thread.sleep(5000);
                }catch (Exception e)
                {
                    System.out.println(e);
                }
            }
        }
    }
    public static void main(String [] args)
    {
        new Thread(new TrafficSignal(Color.GREEN)).start();
        new Thread(new TrafficSignal(Color.ORANGE)).start();
        new Thread(new TrafficSignal(Color.RED)).start();
    }


}
