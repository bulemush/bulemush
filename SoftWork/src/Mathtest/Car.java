package Mathtest;

class FirstThread extends Thread {
    public void run() {try{System.out.println("First thread starts running.");for(int i=0; i<6; i++) {System.out.println("First " + i);
    Thread.sleep(1000);}System.out.println("First thread finishes running.");} catch (InterruptedException e) {}}}
class SecondThread extends Thread {
    public void run() {try{System.out.println("\tSecond thread starts running.");for(int i=0; i<6; i++) {System.out.println("\tSecond " + i);
    Thread.sleep(1000);}System.out.println("\tSecond thread finishes running");}catch (InterruptedException e) {}}}
public class Car {public Car() {FirstThread first = new FirstThread();SecondThread second = new SecondThread();first.start();second.start();}public static void main(String[] args) {new Car();}}