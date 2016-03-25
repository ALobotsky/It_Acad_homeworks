package ui;

import Connection.Connection;
import MyException.MyException;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException, MyException {

        final String LINK_XML = "http://kiparo.ru/t/bus_schedule.xml";
        final String LINK_JSON = "http://kiparo.ru/t/bus_schedule.json";
        final String SAX = "SAX";
        final String JSON = "JSON";
        final String GSON = "GSON";

        final  String FILE_PATH_XML = "bus_schedule.xml";
        final  String FILE_PATH_JSON = "bus_schedule.json";
        final  String FILE_PATH = "bus_schedule";

        int choice = Integer.MAX_VALUE;

        do {
            try {
                System.out.println("Для выбора операции введите:");

                int maxSizemain = menuMain();
                choice = menuChoice(1, maxSizemain);
                File filexml = new File(FILE_PATH_XML);
                File filejs = new File(FILE_PATH_JSON);

                switch (choice) {
                    case 1:
                        if (!filexml.exists() && !filejs.exists()) {
                            Thread thread = new Thread(new Runnable() {

                                @Override
                                public void run() {
                                    System.out.print("Downloading");
                                    for (int i = 0; i < 15; i++) {
                                        try {
                                            Thread.sleep(500);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        System.out.print(".");
                                    }
                                }
                            });
                            thread.start();
                            thread.join();
                            Manager.getInstance().downloadFiles(LINK_XML, FILE_PATH_XML);
                            Manager.getInstance().downloadFiles(LINK_JSON,FILE_PATH_JSON);
                            System.out.println("\n");
                            System.out.println("Файлы успешно скачены");
                            System.out.println("\n");
                        } else {
                            System.out.println("Файлы уже существуют");
                            int max_operation_download = menuChoicedownload();
                            int choice_download = menuChoice(1, max_operation_download);
                            if (choice_download == 1) {
                                Manager.getInstance().downloadFiles(LINK_XML, FILE_PATH_XML);
                                Manager.getInstance().downloadFiles(LINK_JSON, FILE_PATH_JSON);
                                System.out.println("Файлы успешно перезаписаны ");
                                System.out.println("\n");

                            } else if (choice_download == 2) {
                                continue;
                            }
                        }

                        break;

                    case 2:
                        if (!filexml.exists() && !filejs.exists()) {
                            System.out.println("Файлы не найдены");
                        } else {
                            int max_operation_delete = menuChoiceDelete();
                            int choice_delete = menuChoice(1, max_operation_delete);
                            if (choice_delete == 1) {
                                Manager.getInstance().deleteFiles(FILE_PATH_XML);
                                Manager.getInstance().deleteFiles(FILE_PATH_JSON);
                                System.out.println("Файлы успешно удалены");
                                System.out.println("\n");
                            } else if (choice_delete == 2) {
                                continue;
                            }
                        }
                        break;

                    case 3:

                        int max_operation_file = menuChoiceFile();
                        int choice_file = menuChoice(1, max_operation_file);
                        if (choice_file == 1) {
                            Manager.getInstance().setFilePath(FILE_PATH_XML);
                        } else if (choice_file == 2) {
                            Manager.getInstance().setFilePath(FILE_PATH_JSON);
                        } else if (choice_file == 3) {
                            continue;
                        }

                        int max_operation_parse = menuChoiceParse();
                        int choice_parse = menuChoice(1, max_operation_parse);
                        if (choice_parse == 1) {
                            Manager.getInstance().setChoiceParse(SAX);

                        } else if (choice_parse == 2) {
                            Manager.getInstance().setChoiceParse(JSON);
                        } else if (choice_parse == 3) {
                            continue;
                        }
                        System.out.println("Файл успешно распарсили");
                        System.out.println("\n");
                        break;

                    case 4:
                        if (Manager.getInstance().getRoot() != null) {
                            Manager.getInstance().showRoot(Manager.getInstance().getRoot());
                            System.out.println("Root успешно показан");
                            System.out.println("\n");
                        } else if (Manager.getInstance().getRoot() == null) {
                            System.out.println("Для начала скачайте и распарсите файлы");
                            System.out.println("Root = null");
                        }
                        break;
//                    case 5:
//                        if (Manager.getInstance().getRoot() != null) {
//                            Manager.getInstance().cleanRoot();
//                            System.out.println(Constans.MAIN_TEXT_FIRST_ROOT_CLEAN);
//                        } else if (Manager.getInstance().getRoot() == null) {
//                            System.out.println(Constans.MAIN_TEXT_FIRST_DOWNLOAD);
//                            System.out.println(Constans.MAIN_TEXT_FIRST_ROOT_NULL);
//                        }
//                        break;
                    case 6:
                        if (Manager.getInstance().getRoot() != null) {
                            Manager.getInstance().showShelduls(Manager.getInstance().searchSсheduls());
                        } else if (Manager.getInstance().getRoot() == null) {
                            System.out.println("First download and parse files");
                            System.out.println("Root = null");
                        }
                        break;
//                    case 7:
//                        if (Manager.getInstance().getRoot() != null) {
//                            Manager.getInstance().showCustomers(Manager.getInstance().searchDate());
//                        } else if (Manager.getInstance().getRoot() == null) {
//                            System.out.println(Constans.MAIN_TEXT_FIRST_DOWNLOAD);
//                            System.out.println(Constans.MAIN_TEXT_FIRST_ROOT_NULL);
//                        }
//                        break;
//                    case 8:
//                        if (Manager.getInstance().getRoot() != null) {
//                            Manager.getInstance().showCustomers(Manager.getInstance().searchAuto());
//                        } else if (Manager.getInstance().getRoot() == null) {
//                            System.out.println(Constans.MAIN_TEXT_FIRST_DOWNLOAD);
//                            System.out.println(Constans.MAIN_TEXT_FIRST_ROOT_NULL);
//                        }
//                        break;
//                    case 9:
//                        if (Manager.getInstance().getRoot() != null) {
//                            Manager.getInstance().showCustomers(Manager.getInstance().searchBirthDay());
//                        } else if (Manager.getInstance().getRoot() == null) {
//                            System.out.println(Constans.MAIN_TEXT_FIRST_DOWNLOAD);
//                            System.out.println(Constans.MAIN_TEXT_FIRST_ROOT_NULL);
//                        }
//                        break;
//                    case 0:
//                        System.exit(0);
//                        break;

                }
            } catch (MyException e) {
                System.out.println("MyException main error " + e.getRussianMessage());

            } catch (IOException e) {
                System.out.println("IOException main error "+ e.getMessage());

            } catch (Exception e) {
                System.out.println("UnknownException main error " + e.getMessage());
            }

        } while (choice != 0);


    }

    //Меню
    public static int menuMain() {
        final int max = 9;
        System.out.println("1 - скачать файлы xml и json");
        System.out.println("2 - удалить файлы");
        System.out.println("3 - распарсить файлы");
        System.out.println("4 - показать все расписание");
        System.out.println("6 - Поиск по № автобуса");

        return max;
    }

    //метод выбора функций меню
    public static int menuChoice(int choiceFist, int choiceLates) {

        int choise = 0;

        do {
            System.out.print("\n");
            System.out.print("Введите значение от " + choiceFist + " до " + choiceLates + ": ");

            Scanner scanner = new Scanner(System.in);

            if (scanner.hasNextInt()) {
                choise = scanner.nextInt();
                System.out.println();
                if (choise >= choiceFist && choise <= choiceLates) {
                    break;
                } else {
                    System.out.println("Введено некорректное значение");
                }
            }
        } while (true);
        return choise;
    }

    //метод выбора скачки файла
    public static int menuChoicedownload() {
        int max = 2;
        System.out.println("Введите: ");
        System.out.println("\"1\" - перезаписать файлы");
        System.out.println("\"2\" - вернуться в главное меню");

        return max;
    }

    //метод выбора удаления файла
    public static int menuChoiceDelete() {
        final int max = 2;
        System.out.println("Введите: ");
        System.out.println("\"1\" - удалить файлы");
        System.out.println("\"2\" - вернуться в главное меню");
        return max;
    }

    //метод выбора файла для парсинга
    public static int menuChoiceFile() {
        final int max = 3;
        System.out.println("Введите: ");
        System.out.println("\"1\" - файл xml");
        System.out.println("\"2\" - файл json");
        System.out.println("\"3\" - выйти в главное меню");

        return max;
    }

    // метод выбора парсера
    public static int menuChoiceParse() {
        final int max = 3;
        System.out.println("Введите: ");
        System.out.println("\"1\" - выбрать парсер - \"SAX\"");
        System.out.println("\"2\" - выбрать парсер - \"JSON\"");
        System.out.println("\"3\" - выйти в главное меню");
        return max;
    }


}


