/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package premidterm;

/**
 *
 * @author ADMIN
 */
public class Premidterm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
       
       //three variables
      // int is datatype, age  is variable, 20 is the value
       int age = 20;
       double height = 1.8;
       double weight =60;
       String name = "natasha";
       //variable name does not have spacing
       boolean ishealthy= false;
       //getbmi(name, height, weight);
       
       
       //how to write a string
       
       String[] names= { "natasha", "beatrice", "levit"};
       int[] ages = {20, 30, 40};
       
       for (int x=0; x<ages.length; x++){
       System.out.println(ages[x]+names[x]);
       
       }
               
    }
    //method is as below , calculate bmi should always be one word then close stuff sfollowed by curly brackets
    public static void getbmi(String name, double h, double w ){
        //how to pass parameters . it comes inside a method AND IT SHOULD BE SPACED. what you write does not affect anything(variable name
        double bmi = w/(h*h);
        //you cant write a variable that does not exist. it should be inside the parameters.
        //remember the + sign before and after
        System.out.println("hey my name is " + name +" and my bmi is "+ bmi+getstatement());
        
    }
    public static String getstatement(){
        
        return " i am healthy";
    }
    
}
