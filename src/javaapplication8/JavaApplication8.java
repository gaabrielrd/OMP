/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import jomp.runtime.*;

/**
 *
 * @author Gabriel
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int myId;
        OMP.setNumThreads(15);

        //omp parallel private(myId)
        {
            myId = OMP.getThreadNum();
            System.out.println("Hello from " + myId);
        }
    }
}


