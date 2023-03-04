public abstract class Main {
    public static void main(String[] args) {
        Gryffindor Harry = new Gryffindor("Гарри Поттер", 15, 16, 12, 11, 19);
        Gryffindor Hermione = new Gryffindor("Гермиона Грейнджер", 18, 13, 24, 11, 18);
        Gryffindor Ron = new Gryffindor("Рон Уизли", 10, 9, 11, 7, 15);
        Hufflepuff Zacharias = new Hufflepuff("Захария Смит", 6, 7, 8, 9, 10);
        Hufflepuff Cedric = new Hufflepuff("Седрик Диггори", 11, 12, 13, 14, 15);
        Hufflepuff Justin = new Hufflepuff("Джастин Финч-Флетчли", 3, 4, 5, 6, 7);
        Ravenclaw Cho = new Ravenclaw("Чжоу Чанг", 6, 8, 9, 11, 4, 2);
        Ravenclaw Padma = new Ravenclaw("Падма Патил", 7, 3, 5, 8, 1, 5);
        Ravenclaw Markus = new Ravenclaw("Маркус Белби", 3, 7, 12, 10, 2, 1);
        Slytherin Draco = new Slytherin ("Драко Малфой", 2, 8, 9, 11, 4, 2, 11);
        Slytherin Graham = new Slytherin("Грэхэм Монтегю", 1, 6, 3, 4, 2, 1, 1);
        Slytherin Gregory = new Slytherin("Грэгори Гойл", 1, 5, 2, 1, 2, 1, 1);
        Harry.print();
        Hermione.print();
        Ron.print();
        Zacharias.print();
        Cedric.print();
        Justin.print();
        Cho.print();
        Padma.print();
        Markus.print();
        Draco.print();
        Graham.print();
        Gregory.print();
        Harry.qualitiesHogwarts(Zacharias);
        Harry.qualitiesGryffindor(Hermione);

    }




}
