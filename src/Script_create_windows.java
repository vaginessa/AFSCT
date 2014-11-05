import jdk.nashorn.internal.runtime.ECMAException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by matthewelbing on 9/10/14.
 */
public class Script_create_windows {
    public void Windows_create(){

        JFrame frame = new JFrame("Warning");

        JPanel panel = new JPanel();

        JPanel buttonPanel = new JPanel();

        JButton dont_quit = new JButton("Continue");
        JButton exit = new JButton("Exit");

        JLabel lab = new JLabel("<HTML>This will only work in windows if you run the shell script with cygwin <br> to download copy the link into the url bar of your browser <br> then place the automation script in your cygwin home folder and run it from the cygwin command line");

        JTextField link = new JTextField("https://www.cygwin.com/");



        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        panel.add(lab);
        panel.add(link);

        buttonPanel.add(dont_quit);
        buttonPanel.add(exit);

        dont_quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Script_Create_linux_mac s = new Script_Create_linux_mac();
                try {
                    s.create();
                } catch (Exception a) {
                    a.printStackTrace();
                }
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


    }
}
