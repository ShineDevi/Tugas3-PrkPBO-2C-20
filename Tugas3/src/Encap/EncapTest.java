/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encap;

/**
 *
 * @author -LENOVO-
 */
public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap1=new EncapDemo();
        encap1.setName("James");
        encap1.setAge(35);
        
        System.out.println("Name    : "+encap1.getName());
        System.out.println("Age     : "+encap1.getAge());
        
        EncapDemo encap2=new EncapDemo();
        encap2.setName("Hannah");
        encap2.setAge(17);
        
        System.out.println("Name    : "+encap2.getName());
        System.out.println("Age     : "+encap2.getAge());
    }
}
