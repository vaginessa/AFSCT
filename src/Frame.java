import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by matthewelbing on 8/26/14.
 */
public class Frame {
    public void begin() {
        final String path = "/users/README.txt";
        final JFrame frame = new JFrame("Welcome");

        JPanel panel = new JPanel();
        JPanel buttonpanel = new JPanel();

        JLabel lab = new JLabel("Welcome, this creates a script that automates multiple fastboot and adb commands easily");
        JButton linux = new JButton("Linux");
        JButton windows = new JButton("Windows, with cygwin");
        JButton mac = new JButton("Mac");
        JButton Read_me = new JButton("README");

        frame.setVisible(true);
        frame.setSize(800,500);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);


        frame.add(panel, BorderLayout.NORTH);
        frame.add(buttonpanel, BorderLayout.SOUTH);
        frame.setBackground(Color.DARK_GRAY);

        panel.add(lab);
        buttonpanel.add(linux);
        buttonpanel.add(mac);
        buttonpanel.add(windows);
        buttonpanel.add(Read_me);




        linux.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Script_Create_linux_mac s = new Script_Create_linux_mac();
                try {
                    s.create();
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
                frame.dispose();
            }
        });

        mac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Script_Create_linux_mac s = new Script_Create_linux_mac();
                try {
                    s.create();
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        windows.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Script_create_windows s = new Script_create_windows();
                try {
                    s.Windows_create();
                }
                catch (Exception f){
                       f.printStackTrace();
                    }

            }
        });

        Read_me.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ProcessBuilder pb1 = new ProcessBuilder("cd", "/");
                ProcessBuilder pb2 = new ProcessBuilder("cd", "users/Desktop/Adb\\ and\\ fastboot\\ script\\ creator/");
                ProcessBuilder pb = new ProcessBuilder("open", "-a", "TextEdit","README");

                try {
                    pb.start();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

    }
}
