/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv22weatherinyear;
import tasks.InitProject;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class App {
    private final Scanner scanner;

    public App() { /*insert code -> constructor*/
        scanner = new Scanner(System.in);
    }
    

    public void run() {
        System.out.println("----- Weather in year -----");
        boolean repeat = true;
        InitProject initProject = new InitProject();
        initProject.init();
        do {
            System.out.println("--- Задачи ---");
            System.out.println("0.Закончить программу");
            System.out.println("1.Погода в указанную дату");
            System.out.println("2.Дни в которые былла самая тёплая и холодная погода");
            System.out.println("3.Средняя температура за указанный месяц");
            System.out.println("4.Средняя температура по всем месяцам");
            System.out.print("Выберите номер задачи: ");
            int task = scanner.nextInt();scanner.nextLine();
            switch (task) { /*sw-> tab*/
                case 0:
                    System.out.println("Выбран выход из программы");
                    repeat = false;
                    break;
                case 1:
                    
                    break;
                case 2:
                    
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                default:
                    System.out.println("Выберите номер из списка");  
                    }  
                }while (repeat);
                System.out.println("--- end ---");
                
    }
    
}
