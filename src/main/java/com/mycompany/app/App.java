/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/
package com.mycompany.app;

import com.mycompany.app.week2.Code2.Initialization.*;
//import com.mycompany.app.week2.Code1.Time;

public class App {
    public static void main(String[] args) {
      
      // demonstrate exercise - Initialization and Cleanup
      E3 e3 = new E3();
      E4 e4 = new E4(" Prints a message.");

      //Ex5+6
      Dog dog = new Dog();
      dog.bark(2); // int
      dog.bark("Luck"); // String

  }
}
  