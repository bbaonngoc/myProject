/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/
package com.mycompany.app;

import java.util.Scanner;
import java.util.*;
import java.io.*;
import com.mycompany.app.week1.Exercise1;
import com.mycompany.app.week1.Ex2;
import com.mycompany.app.week1.Ex3;
import com.mycompany.app.week1.Exercise4;
import com.mycompany.app.week1.exTestSwitch;
import com.mycompany.app.week1.exBreakContinue;

import com.mycompany.app.week2.JavaMethods;
import com.mycompany.app.week2.Code1.*;
import com.mycompany.app.week2.Methods;
import com.mycompany.app.week2.Classes;


public class App {
    public static void main(String[] args) {
        Exercise1 ex = new Exercise1();
        Exercise4 ex2 = new Exercise4();
        Ex2 exc = new Ex2();
        Ex3 exc3 = new Ex3();
        exTestSwitch ex5 = new exTestSwitch();
        exBreakContinue ex6 = new exBreakContinue();
        exBreakContinue exc6 = new exBreakContinue();
        JavaMethods method = new JavaMethods();
        Book book = new Book();
        Book book2 = new Book("Thinking in java", "Bao ngoc", 1000);
        book2.in();


        Methods method = new Methods();
        Classes myObj = new Classes();


        ex.testIf();
        ex2.testWh();
        exc.ex2();
        exc3.exc();
        ex5.testSwitch();
        ex6.testBreak();
        exc6.testContinue();
        method.myMethod();

        book.book();

        myObj.myObj();



  }
}
  