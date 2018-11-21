package woopich;

import woopich.GUI.Frame;
import woopich.GUI.MyComponent;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        JFrame jFrame = Frame.displayInterface();
        jFrame.add(new MyComponent());
    }
}
