package ru.top.practic.oop.hw;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    //Разработать набор классов для решения задачи подсчета зароботной платы сотрудников некоторой фирмы.
    //На фирме есть несколько способов оплаты труда:
    //■ ставка – указывается, сколько сотрудник получает за
    //рабочий день; для каждого сотрудника записывается,
    //сколько дней он отработал в месяце;
    //■ почасовая – указывается, сколько сотрудник получает в
    //час, для каждого сотрудника; записывается, сколько часов
    //он отработал в месяце
    //■ сдельная – указывается, сколько сотрудник получит за
    //выполненную работу; для каждого сотрудника записываются
    //суммы для каждой работы, что он успел сделать за месяц.

    //Программа должна уметь выводить отчет по всем сотрудникам фирмы о заработной плате в виде:
    //ФИО Вид оплаты Сумма
    //Иванов ставка 3000 грн
    //Сидоров почасовая 800 грн
    //Петров сдельная 5500 грн
    //Итого 9300 гр

    public static void main(String[] args) {
        AbstractWorker[] abstractWorkers = new AbstractWorker[100];
        AbstractWorker worker1 = getWorkerFromConsole();
        AbstractWorker worker2 = getWorkerFromConsole();
        abstractWorkers[0] = worker1;
        abstractWorkers[1] = worker2;

        printWorkersInfo(abstractWorkers);
    }

    private static void printWorkersInfo(AbstractWorker[] abstractWorkers) {
        int sum = 0;
        System.out.println("ФИО Вид оплаты Сумма");

        for (AbstractWorker abstractWorker : abstractWorkers) {
            if (abstractWorker == null) {
                continue;
            }
            sum += abstractWorker.getSalary();
            System.out.println(abstractWorker);
        }
        System.out.println("Итого " + sum);
    }

    private static AbstractWorker getWorkerFromConsole() {
        System.out.println("Введите фио");
        String fio = scanner.nextLine();
        System.out.println("Введите тип оплаты " + Arrays.toString(SalaryType.values()));
        String salaryType = scanner.nextLine();

        if (salaryType.equals(SalaryType.BET.name())) {
            System.out.println("Введите ставку");
            String bet = scanner.nextLine();
            System.out.println("Введите количество дней");
            String dayCount = scanner.nextLine();
            return new BetWorker(fio, SalaryType.fromName(salaryType), Integer.valueOf(bet), Integer.valueOf(dayCount));
        } else {
            System.out.println("Введите почасовую оплату");
            String hourSalary = scanner.nextLine();
            System.out.println("Введите количество часов");
            String hourCount = scanner.nextLine();
            return new HourWorker(fio, SalaryType.fromName(salaryType), Integer.valueOf(hourSalary), Integer.valueOf(hourCount));
        }
    }
}
