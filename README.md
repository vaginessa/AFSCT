#                                            ADB and FASTBOOT Script Creation Tool
This is a GUI tool for scripting ADB and FASTBOOT commands in an autiomated manner.  Allow users to eisily create a .sh (shell script)
withmany commands that allow for mass automation of the andriod building and development proccess.  For example one could use
the GUI to reboot to bootloader flash a system.img reboot back into the OS install an app reboot again flash a cache.img
and reboot all with one script that is created by the program.
You chooses multiple commands in the program and then click create and the script is created for you.

You may need to enter admin password

**Rename your .img's to the following**
```
system ----> system.img

userdata ----> userdata.img

cache ----> cache.img

boot -----> boot.img

recovery ----> recovery.img
```

*1: Will only work if a shell is already running in ADB


---------------------------------------------------------------------------------------------------------------------
Touchwiz samsung phones do not use the fastboot, so if you have a sasmung device ONLY the adb commands will work
The only exception is Google Play Edtion samsung device

[XDA-Developers](http://forum.xda-developers.com/android/software/tool-adb-fastboot-scripting-automation-t2946760)


Matthew Elbing
2014


