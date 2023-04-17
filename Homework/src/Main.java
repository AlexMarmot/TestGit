import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Flight> polets = new ArrayList<>();
        while (true) {
            System.out.println("1) Добавление нового рейса\n2) Вывод всех рейсов\n3) Выход из программы");
            switch (in.nextLine()) {
                case "1":
                    Flight newPolets = new Flight();
                    System.out.println("Добавление рейса");
                    boolean unNum;
                    do {
                        unNum = false;
                        System.out.println("Введите номер рейса (в формате АА0000)");
                        while (!newPolets.setNumber(in.nextLine())) ;
                        for (Flight unPolet : polets) {
                            if (unPolet.equals(newPolets)) {
                                unNum = true;

                            }
                        }
                    } while (unNum);
                    System.out.println("Аэропорт");
                    newPolets.setAirport(in.nextLine());
                    System.out.println("Наименование авиакомпании");
                    newPolets.setAirport(in.nextLine());
                    System.out.println("Пункт прибытия");
                    newPolets.setArrival(in.nextLine());
                    System.out.println("Время вылета (в формате 00:00)");
                    while (!newPolets.setTime(in.nextLine())) ;
                    System.out.println("Цена билета");
                    newPolets.setCost(in.nextInt());
                    in.nextLine();
                    System.out.println("1) Добавить рейс\n2) Отмена");
                    switch (in.nextLine()) {
                        case "1":
                            polets.add(newPolets);
                            System.out.println("Рейс добавлен");
                            break;
                        case "2":
                            break;
                        default:
                            System.out.println("некорректный ответ, рейс не сохранен");
                            break;
                    }
                    break;
                case "2":
                    for (Flight all : polets) {
                        System.out.println(all);
                    }
                    break;
                case "3":
                    return;

            }
        }
    }
}

