package day05_modul02.uni_;

import day02_modul02.Books;

public class UniApplication {
    public static void main(String[] args) {
        //inheritanceIntroduction();
        Student sasha = new Student("12348769", "Саша", "Васильев", 28);
        Teacher masha = new Teacher("Маша");
        Worker glasha = new Worker("Глаша");
        UniUser pasha = new Student("4326798090", "Паша", "Иванов", 28);
        UniUser sergej = new Student("9877556", "Сергей", "Кошкин", 38);
        UniUser andrej = new Student("65687980", "Андрей", "Курочкин", 31);
        Object ob = new Teacher("Завуч");
        Teacher newTeacher = (Teacher) ob;
        //Student st = (Student) ob;
        //System.out.println(ob);
        // System.out.println(newTeacher);
        UniUser kolia = new Student("3455789", "Коля", "Уточкин", 20);
        UniUser vasia = new Student("6567867534", "Вася", "Петухов", 22);

        UniUser[] neArray = new UniUser[]{pasha, sasha, andrej, kolia, vasia};
        //Student[] colleagues = new Student[20];
        uniUsersSort(neArray);
    }

    private static void uniUsersSort(UniUser[] input) {
        for (int i = 1; i < input.length; i++) {
            UniUser temp = input[i];
            for (int j = i; j > 0; j--) {
                if (input[j].getAge() < input[j - 1].getAge()) {
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                } else if (input[j].getAge() > input[j - 1].getAge()) {
                    break;
                }
            }
        }
    }


    private static void inheritanceIntroduction() {
        Student pasha = new Student("345",
                "",
                "",
                34);
        System.out.println(pasha);

        Worker agafia = new Worker(234,
                "Агафья",
                "Петрова", "2346789",
                29,
                "cook");
        System.out.println(agafia);

        Teacher dasha = new Teacher(
                "Даша",
                "Соловьёва",
                "1234567",
                35,
                "Профессор"
        );
        System.out.println(dasha);
        Teacher zina = new Teacher("Зина", "Петрова", "", 51, "Учитель");
        System.out.println(zina);
    }

}
