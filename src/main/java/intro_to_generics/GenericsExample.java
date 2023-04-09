/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intro_to_generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class GenericsExample {
    public static void main(String[] args) {
       //Example without Generics
       List names;
       names = new ArrayList();
       names.add("pasindu");
       String name = (String) names.get(0);
       System.out.println("First name:" + name);
       
       //Example With Generics
       List<String> names2 = new ArrayList();
       names2.add("pasindu");
       String name2 = names2.get(0);
       System.out.println("First name:" + name2);
       
    }
}
