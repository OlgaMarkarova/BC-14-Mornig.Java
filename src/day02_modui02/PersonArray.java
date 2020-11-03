package day02_modui02;

public class PersonArray {
    public static void main(String[] args) {
        Person p1 = new Person("Anton", 90, 190, 31);
        Person p2 = new Person("Merkel", 90, 190, 15);
        Person p3 = new Person("Putin", 90, 190, 45);
        Person p4 = new Person("Macron", 90, 190, 10);
        Person p5 = new Person("Trump", 90, 190, 70);
        Person p6 = new Person("Biden", 90, 190, 100);
        Person p7 = new Person("Merz", 90, 190, 28);
        Person p8 = new Person("Laschen", 90, 190, 53);
        Person p9 = new Person("Caligula", 90, 190, 37);
        Person p10 = new Person("Peter", 90, 190, 16);
        Person[] arrP = new Person[]{p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};
        bubbleSort(arrP);
        //arrP[0].displayInfo();
        //System.out.println(arrP[0].age);
        //System.out.println(p1);
        //System.out.println(p7.age);
        // System.out.println(arrP[7].age);
        /*Person p13 = p1;
        System.out.println(p13);
        p13.displayInfo();
        p1.displayInfo();
        p13.name = "Sergej";
        p13.displayInfo();
        p1.displayInfo();*/
        printArr(arrP);
    }

    public static void printArr(Person[] arr) {
        for (Person user : arr) {
            user.displayInfo();
        }
    }

    private static void bubbleSort(Person[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].age <= arr[i + 1].age) {
                continue;
            }
            Person temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            count++;
        }
        if (count > 0) {
            bubbleSort(arr);
        }
    }
}
