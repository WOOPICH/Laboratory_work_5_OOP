package woopich.GUI;

import javax.swing.*;

public class Frame
{
    public static JFrame displayInterface()
    {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setTitle("BAZINGA!");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(0,0,700,550);
      //  jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        return jFrame;
    }

}
