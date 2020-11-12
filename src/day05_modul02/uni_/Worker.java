package day05_modul02.uni_;


    public class Worker extends UniUser{
        String position;

        public Worker(int libraryCard, String firstName, String secondName,
                      String uniID, int age, String position) {
            super(libraryCard, firstName, secondName, uniID);
            this.position = position;
        }
        public Worker(String firstName) {
            super(firstName);
        }

        public Worker(String uniID, int age) {
            super(uniID, age);
        }

        public void works() {
            System.out.println("Работать!");
        }
    }

