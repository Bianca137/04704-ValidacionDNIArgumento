/*
 * Copyright 2019 Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es.
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
package org.japo.java.app;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es
 */
public final class App {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
//    public static final int DNI_NUM = 12345678;
//    public static final char DNI_CTR = 'W';
    int dni = 12345678;
    char letra = 'Z' ;

    public final void launchApp() {

        System.out.println("Introduce numero:");
        dni = SCN.nextInt();
//        System.out.println("Introduce letra: ");
//        letra = SCN.nextLine().charAt(0);
//    
        
        
        
        System.out.println("VALIDACIÓN DE DNI");
        System.out.println("=================");

        //Mostrar DNI
        System.out.printf("DNI ......: %d%c%n", dni, letra);

        System.out.println("---");

        // llamo al método validar y le paso el dni y la letra, él me devuelve true o false
        boolean dniOK = validar(dni, letra);

        //Resultado
        System.out.printf("Validez ...:%s%n", dniOK ? "Correcto" : "Incorrecto");
    }

    //calcula y devuelve la letra de control asociada al número DNI suminsitrado.
    public static final char calcular(int num) {
        return LETRAS.charAt(num % 23);
    }

    //analiza y devuelve si DNI correcto (true) o DNI incorrecto(false)
    public static final boolean validar(int num, char ctr) {
        return ctr == calcular(num);
    }

}
