package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");


        // lo crea spring y yo lo reutilizo para reutilizar espacio en memoria  // es decir utiliza un patron singleton por lo que no crea otro objeto solo utiliza el ya creado
        CalculatorService calculadora = (CalculatorService) context.getBean("calculatorService");

        System.out.println(calculadora.holaMundo());

    }
}