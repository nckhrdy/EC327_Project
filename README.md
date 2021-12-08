# EC327_Project

## Team Name: 
Razkey

## Team Members: 
  Nicholas Hardy (nckhrdy@bu.edu)
  Kaede Kawata (kkawata@bu.edu)
  Yen Vo (vnicky@bu.edu)
  James Sullivan (jamesjs@bu.edu)

## Project Overview: 
  Our project is a secure passwords and sensitive information Android App that allows user to store and retrieve information on Raspberry Pi.

## How to Run: 
  Backend:
  
  Download RazKey.java, command.sh, and main.java. Give command.sh a permission to excute shell command from the file (More instruction below). Run main.java 
  
  Front end: 
  
  First, download Android Studio. Then create a new project and set preffered code to Java. Once the project is set up, copy our final_activity_main.xml file into the initial activity_main.xml file given within Android Studio. Subsequently, copy our FinalMainActivity.java file into the initial MainActivity.java tab that is given.
  Next, right click on the 'app' folder in the upper left of Android Studio and select 'New' -> 'Activity' -> 'Empty Activity.' Name the new activity 'activity2'.
  From there copy our final_activity_2.xml and finalactivity2.java files into the corresponding tabs given by Android Studio.
  Once finished, click the green run button at the top of Android Studio and enjoy the android emulator.

## Build Overview: 
  The project was split into two main aspects. The front end app design and code using  Android Studio, and the back end raspberry pi component. The Raspberry Pi functions as our back end program and is written in Java. The primary focus for us was to create a fully functional and robust backend program that stores and passes information safely upon request. 

## Youtube Video Link:

## Set up Raspberry Pi
  In this project, we used Raspberry Pi 3 Model B+. To start, we first installed the operating system, Raspbian, via the the Raspberry Pi Imager from [the following link](https://www.raspberrypi.com/software/) into SD card. And then, we inserted the SD card to the Raspberry Pi. To display the desktop of Raspbian, we connected the monitor in PHO 307 with the Raspberry Pi using HDMI cable. Also, in order to control the display with mouse and keyboard, connect the mouse and keyboard to a USB port on the Raspberry Pi.

  Because we wanted to access to the files on the Raspberry Pi from other divices via ssh, we needed to enable SSH on Raspberry Pi. To do so, we followed the following steps.
1. Click the raspberry logo at left top of the display.
2. Choose **Preference** and Click on **Raspberry Pi Configuration**.
3. Click on **Interfaces** tab and look for **SSH** in the second line.
4. Enable **SSH** and click **Ok**.

  Also, make sure that the divice and the Raspberry Pi is connected to the same WiFi.

## Give Permission to .sh File
  Because we wanted to excute shell command from .java file, we needed to give a permission to .sh file to excute command from the file. In order to do so, open Terminal (for Mac) or Cygwin (for Windows) and type the following command
  ```
  chmod u+r+x command.sh
  ```
In Terminal or Cygwin, make sure you are in the same directly as the .sh file is in. 
