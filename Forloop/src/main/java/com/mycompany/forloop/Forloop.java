/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.forloop;

/**
 *
 * @author Emin
 */
public class Forloop {

 public static void main(String[] args) {
        int myNumber = 21;
        boolean myCondition = true; // Change this to false to subtract 13

        if (myCondition) {
            myNumber = myNumber + 7;
        } else {
            myNumber = myNumber - 13;
        }

        System.out.println(myNumber); // If myCondition was false, the result would be 8
    }
}