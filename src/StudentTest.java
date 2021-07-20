import java.util.Scanner;

// Stwórz 3 obiekty klasy student. Przypisz wartosci do pól. Stwórz tablice i dodaj studentów do tablicy.
//Przejdź przez studentów w tablicy i wywołaj wszytskie 4 metody
//
public class StudentTest {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.imię = "Ania";
        student1.nazwisko = "Chrupek";
        student1.email = "ania@interia.pl";
        student1.numerIndeksu = 458777;
        student1.nick = "Chrupciak";

        Student student2 = new Student();
        student2.imię = "Przemyslaw";
        student2.nazwisko = "Chupkowski";
        student2.nick = "Chrupeczek";
        student2.email = "przemw@ii.pl";
        student2.numerIndeksu = 458799;

        Student student3 = new Student();
        student3.imię = "Chrupas";
        student3.numerIndeksu = 452111;
        student3.email = "chrup@interia.pl";
        student3.nick = "chrupcio";
        student3.nazwisko = "Chruupus";

        Student[] students = new Student[]{student1, student2, student3};

        for(int i = 0; i < students.length; i++){
            students[i].przedstawSie();
            students[i].podajEmail();
            students[i].zalogujSie();
            students[i].podajNrIndeksu();

        }

        String imie = "Kasia";
        imie.strip();
        Scanner scanner = new Scanner(System.in);
            }
}
