/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author NgocSon
 */
public class Homework {
    private String name;
    private double height;
    private String position;
    /**
     * @param args the command line arguments
     */
    public Homework(String name, double height, String position){
        this.name=name;
        this.height=height;
        this.position=position;
        System.out.println("Hello "+ name);
    }
    public void height(){
        System.out.println("Height " + height);
        // TODO code application logic here
    }
    public void position(){
        System.out.println("Position "+ position);
    }
    
}
