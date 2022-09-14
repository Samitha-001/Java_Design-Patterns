/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton_pattern;

/**
 *
 * @author Samitha 😎🤟
 */
public class Singleton_object {

    private static Singleton_object instance = new Singleton_object();
    
    private Singleton_object(){}
    
    public static Singleton_object getInstance(){
        return instance;
    }
    
    public void showMessage(){
        System.out.println("Hello World");
    }
    
    public static void main(String[] args) {
        Singleton_object obj = new Singleton_object();
        obj.showMessage();
    }
    
}
