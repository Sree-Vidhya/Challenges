package com.company;

import java.time.LocalDateTime;

public class SmartPhone implements Phone, Camera, MusicPlayer, Calculator{
    private static int picCount = 0;
    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double subtract(double a, double b) {
        return a-b;
    }

    @Override
    public double multiply(double a, double b) {
        return a*b;
    }

    @Override
    public double divide(double a, double b) {
        return a/b;
    }

    @Override
    public void takePicture() {
        System.out.println("Picture Taken" + LocalDateTime.now());
    }

    @Override
    public void processPicture() {
        System.out.println("processing Picture");
    }

    @Override
    public void savePicture() {
        System.out.println("Pictures save as img" +(++picCount));
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music");
    }

    @Override
    public void skipToNextMusic() {
        System.out.println("Skip to next song");
    }

    @Override
    public void skipToPreviousMusic() {
        System.out.println("Skip to previous song");
    }

    @Override
    public void forward() {
        System.out.println("Skipping to little ahead");
    }

    @Override
    public void rewind() {
        System.out.println("Skipping to little behind");
    }

    @Override
    public void call() {
        System.out.println("Calling...");
    }

    @Override
    public void receiveCall() {
        System.out.println("Receiving call");
    }

    @Override
    public void storenumberToPhoneBook() {
        System.out.println("Stored number to phone");
    }

    @Override
    public void retrieveNumberfromPhoneBook() {
    }
}
