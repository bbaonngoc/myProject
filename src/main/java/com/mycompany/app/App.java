/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/
package com.mycompany.app;

import com.mycompany.app.week2.Code2.AccessControl.Ex3.Debug;
import com.mycompany.app.week2.Code2.AccessControl.Ex3.Debugoff;

public class App extends Ex4{
    public static void main(String[] args) {
      
      // demonstrate exercise 3 - Access Control 
      Debug debug = new Debug();
      Debugoff debugoff = new Debugoff();

      debug.debug("Ok");


      // exercise 4
      Ex4 exercise = new Ex4();
      exercise.test();

  }
}
  