/* 
 * Copyright 2019 Lluís CP - aw.lluiscerda@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lluís CP - aw.lluiscerda@gmail.com
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        final String MSG_SI = "SI";
        final String MSG_NO = "NO";
        
        

//CABECERA
        try {
//año a analizar

            System.out.printf("Análisis año ...: ");
            int any = SCN.nextInt();

// separadopr
            System.out.println("---");

//variables
            String decision;

//analiza año
            if (any % 400 == 0) {
                decision = "SI";
            } else if (any % 100 == 0) {
                decision = "NO";
            } else if (any % 4 == 0) {
                decision = "SI";
            } else {
                decision = "NO";
            }

//	mensaje result
            System.out.printf("El año %d ....: %s es bisiesto %n", any, decision);
        } catch (Exception e) {
            System.out.println("ERROR: entrada incorecta");
        } finally {
            SCN.nextLine();
        }
    }

}
