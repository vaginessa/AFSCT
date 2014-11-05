import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by matthewelbing on 8/26/14.
 */
public class Script_Create_linux_mac {

    final String Filename = "automation.sh";

    public void create() throws FileNotFoundException {
        final PrintWriter output = new PrintWriter(Filename);



        final JFrame frame =  new JFrame("Select the commands");




        JPanel row1 = new JPanel();
        JPanel row2 = new JPanel();
        JPanel row3 = new JPanel();
        row1.setBackground(Color.DARK_GRAY);
        row2.setBackground(Color.DARK_GRAY);
        row3.setBackground(Color.DARK_GRAY);






        JLabel lab = new JLabel("Select that commands you want below");

        //ADB command buttons
        JButton adb_install = new JButton("ADB Install");
        JButton adb_reboot = new JButton("ADB Reboot");
        JButton adb_reboot_bootloader = new JButton("ADB Reboot Bootloader");
        JButton adb_reboot_recovery = new JButton("ADB Reboot Recovery");
        JButton adb_logcat = new JButton("ADB Logcat");
        JButton adb_devices = new JButton("ADB Devices");
        JButton adb_shell = new JButton("ADB Shell");
        JButton adb_shell_gain_superuser = new JButton("Upgrade ADB shell to SU *1");
        JButton adb_system_push_superuser = new JButton("Push app to /system");

        //Fastboot commands buttons
        //reboot
        JButton fastboot_reboot = new JButton("Fastboot reboot");
        JButton fastboot_reboot_bootloader = new JButton("Fastboot reboot bootloader");
        //Flashing
        JButton fastboot_flash_recovery = new JButton("Flash Recovery");
        JButton fastboot_flash_system = new JButton("Flash system");
        JButton fastboot_flash_userdata = new JButton("Flash userdata");
        JButton fastboot_flash_cache = new JButton("Flash cache");
        JButton fastboot_flash_boot = new JButton("Flash boot");
        //other
        JButton fastboot_devices = new JButton("Fastboot Devices");
        JButton create_script = new JButton("Create script");
        final JButton nornalStart = new JButton("fastboot continue booting");
        final JButton getVar = new JButton("getvar all");
        final JButton formatCache = new JButton("format cache");
        JButton exit = new JButton("Exit");

        frame.setVisible(true);
        frame.setSize(1000, 400);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        frame.add(row1, BorderLayout.NORTH);
        frame.add(row2, BorderLayout.CENTER);
        frame.add(row3, BorderLayout.SOUTH);

        //Adds adb command buttons to row 1
        row1.add(adb_install);
        row1.add(adb_reboot);
        row1.add(adb_reboot_bootloader);
        row1.add(adb_reboot_recovery);
        row1.add(adb_logcat);
        row1.add(adb_devices);
        row1.add(adb_shell);
        row1.add(adb_shell_gain_superuser);
        row1.add(adb_system_push_superuser);

        //adds fastboot commands to row2
        row2.add(fastboot_reboot);
        row2.add(fastboot_reboot_bootloader);
        row2.add(fastboot_flash_recovery);
        row2.add(fastboot_flash_system);
        row2.add(fastboot_flash_userdata);
        row2.add(fastboot_flash_userdata);
        row2.add(fastboot_flash_cache);
        row2.add(fastboot_flash_boot);
        row2.add(fastboot_devices);
        row2.add(nornalStart);
        row2.add(getVar);
        row2.add(formatCache);


        //adds buttons to third row
        row3.add(create_script);
        row3.add(exit);



        adb_install.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    output.println("echo make sure the apk is called app.apk");
                    output.flush();
                    output.println("sleep 5");
                    output.flush();
                    output.println("sudo adb install app.apk");
                    output.flush();
                }

                catch (Exception a){
                    a.printStackTrace();

                }

            }
        });

        adb_reboot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    output.println("echo Rebooting...");
                    output.flush();
                    output.println("sleep 5");
                    output.flush();
                    output.println("sudo adb reboot");
                    output.flush();
                }

                catch (Exception a){
                    a.printStackTrace();

                }
            }
        });



        adb_reboot_bootloader.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    output.println("echo Rebooting bootloader...");
                    output.flush();
                    output.println("sleep 5");
                    output.flush();
                    output.println("sudo adb reboot bootloader");
                    output.flush();
                }

                catch (Exception a){
                    a.printStackTrace();

                }
            }
        });

        adb_reboot_recovery.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    output.println("echo Rebooting recovery...");
                    output.flush();
                    output.println("sleep 5");
                    output.flush();
                    output.println("sudo adb reboot recovery");
                    output.flush();
                }

                catch (Exception a){
                    a.printStackTrace();

                }
            }
        });

        adb_logcat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    output.println("echo Logcat Running");
                    output.flush();
                    output.println("sudo adb logcat");
                    output.flush();
                }

                catch (Exception a){
                    a.printStackTrace();

                }
            }
        });

        adb_devices.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    output.println("echo Listing devices");
                    output.flush();
                    output.println("sleep 5");
                    output.flush();
                    output.println("sudo adb devices");
                    output.flush();
                }

                catch (Exception a){
                    a.printStackTrace();

                }
            }
        });

        adb_shell.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    output.println("echo Entering shell prompt");
                    output.flush();
                    output.println("sleep 5");
                    output.flush();
                    output.println("sudo adb shell");
                    output.flush();
                }

                catch (Exception a){
                    a.printStackTrace();

                }
            }
        });

        adb_shell_gain_superuser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    output.println("Make sure a defualt access shell is already running");
                    output.println("echo and that adb is allowed to open a root prompt as well as accepting the su");
                    output.println("echo request");
                    output.flush();
                    output.println("sleep 5");
                    output.flush();
                    output.println("su");
                    output.flush();
                }

                catch (Exception a){
                    a.printStackTrace();

                }
            }
        });

        fastboot_reboot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    output.println("echo rebooting");
                    output.flush();
                    output.println("sleep 5");
                    output.flush();
                    output.println("sudo fastboot reboot");
                    output.flush();
                }

                catch (Exception a){
                    a.printStackTrace();

                }
            }
        });

        fastboot_reboot_bootloader.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    output.println("echo Rebooting to bootloader...");
                    output.flush();
                    output.println("sleep 5");
                    output.flush();
                    output.println("sudo fastboot reboot-bootloader");
                    output.flush();
                }

                catch (Exception a){
                    a.printStackTrace();

                }
            }
        });

        fastboot_flash_recovery.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    output.println("echo Flashing recovery make sure the .img is named recovery.img");
                    output.flush();
                    output.println("sleep 5");
                    output.flush();
                    output.println("sudo fastboot flash recovery recovery.img");
                    output.flush();
                }

                catch (Exception a){
                    a.printStackTrace();

                }
            }
        });

        fastboot_flash_system.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    output.println("echo flashing system with system.img");
                    output.flush();
                    output.println("sleep 5");
                    output.flush();
                    output.println("sudo fastboot flash system system.img");
                    output.flush();
                }

                catch (Exception a){
                    a.printStackTrace();

                }
            }
        });


        fastboot_flash_userdata.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    output.println("echo Flashing userdata with userdata.img");
                    output.flush();
                    output.println("sleep 5");
                    output.flush();
                    output.println("sudo fastboot flash userdata userdata.img");
                }

                catch (Exception a){
                    a.printStackTrace();

                }
            }
        });

        fastboot_flash_cache.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    output.println("echo Flashing cache with cache.img");
                    output.flush();
                    output.println("sleep 5");
                    output.flush();
                    output.println("sudo fastboot flash cache cache.img");
                    output.flush();
                }

                catch (Exception a){
                    a.printStackTrace();

                }
            }
        });

        fastboot_flash_boot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    output.println("echo Flashing boot with boot.img");
                    output.flush();
                    output.println("sleep 5");
                    output.flush();
                    output.println("sudo fastboot flash boot boot.img");
                    output.flush();
                }

                catch (Exception a){
                    a.printStackTrace();

                }
            }
        });

        fastboot_devices.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    output.println("echo Listing fastboot devices");
                    output.flush();
                    output.println("sleep 5");
                    output.flush();
                    output.println("sudo fastboot devices");
                    output.flush();
                }

                catch (Exception a){
                    a.printStackTrace();

                }
            }
        });

        adb_system_push_superuser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    output.println("You need to already be running as the superuser, run superuser shell in advance and adb shell");
                    output.flush();
                    output.println("sleep 5");
                    output.flush();
                    output.println("sudo adb shell");
                    output.flush();
                    output.println("su root");
                    output.flush();
                    output.println("sudo adb push app.apk /system");
                    output.flush();
                }

                catch (Exception a){
                    a.printStackTrace();

                }
                nornalStart.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {

                            output.println("booting");
                            output.println("sudo fastboot continue");
                        }
                        catch (Exception ex) {
                            ex.printStackTrace();
                        }

                    }
                });
                getVar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try{

                            output.println("Getting bootloader stats...");
                            output.println("sleep 5");
                            output.println("sudo fastboot getvar all");
                        }
                        catch (Exception e2){
                            e2.printStackTrace();
                        }
                    }

                });
                formatCache.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try{
                            output.println("formating cache");
                            output.println("sleep 5");
                            output.println("sudo fastboot format cache");
                        }
                        catch (Exception e5){
                            e5.printStackTrace();
                        }
                    }
                });






        try{
            output.println("clear");
            output.println("exit");


        }
        catch (Exception e1){
            e1.printStackTrace();
        }
            }
        });


        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        create_script.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame1 = new JFrame("run .sh");

                JPanel panel1 = new JPanel();

                JPanel buttonpanel1 = new JPanel();

                JLabel lab = new JLabel("<HTML>To run this script open the terminal and navigate to this directory<br>then type sudo chmod +x automation.sh and then ./automation.sh");

                JButton exit1 = new JButton("Exit");

                frame1.setVisible(true);
                frame1.setSize(500, 500);
                frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);

                frame1.add(panel1, BorderLayout.NORTH);
                frame1.add(buttonpanel1, BorderLayout.SOUTH);

                panel1.add(lab);

                buttonpanel1.add(exit1);

                exit1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });


            }
        });










    }
}
