package day08_modou02;

public class FamilyApplication {
    public static void main(String[] args) {
        Person houseMasterVasilij = new Person("Василий", "мальчик");
        Person vasilisa = new Person("Василимса", "девочка");
        Family fam1 = new Family(houseMasterVasilij, vasilisa, "Голубковы");
        Person glasha=new Person("Глаша","девочка");
      // Family fam2=new Family(houseMasterVasilij,glasha,"Петровы");

    }
}
