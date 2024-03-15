/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/
package com.mycompany.app;


import com.mycompany.app.week2.Code2.AccessControl.*;
import com.mycompany.app.week2.Code2.AccessControl.Ex6.*;
import com.mycompany.app.week2.Code2.AccessControl.Ex3.Debug;
import com.mycompany.app.week2.Code2.AccessControl.Ex3.Debugoff;
import com.mycompany.app.week2.Code1.Time;

public class App extends Ex4{
    public static void main(String[] args) {
      
      // demonstrate exercise 3 - Access Control 
      Debug debug = new Debug();
      Debugoff debugoff = new Debugoff();

      debug.debug("Ok");


      // exercise 4
      Ex4 exercise = new Ex4();
      // exercise.test();


      // exercise 5 :
      Ex5 ex5 = new Ex5();
      // ex5.a; // error access
      // ex5.b; // error access 
      ex5.c = 10;
      System.out.println(ex5.c);

      // ex6
      Class2 ex6 = new Class2();
      ex6.test2();

  }
}
  