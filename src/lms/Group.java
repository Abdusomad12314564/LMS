package lms;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Group implements ListArr {
    private int id;
    private String groupName;
    private String description;
    private List<Lesson> lessons;
    private List<Student> students;
    private String ps = "admin";

    public Group() {
    }

    public Group(int id, String groupName, String description, List<Lesson> lessons, List<Student> students) {
        this.id = id;
        this.groupName = groupName;
        this.description = description;
        this.lessons = lessons;
        this.students = students;
    }

    public Group(String groupName, String description) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return id == group.id && Objects.equals(groupName, group.groupName) && Objects.equals(description, group.description) && Objects.equals(lessons, group.lessons) && Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, groupName, description, lessons, students);
    }

    @Override
    public String toString() {
        return "Group:" +
                "\nid = " + id +
                "\ngroupName = " + groupName +
                "\ndescription = " + description +
                "\nlessons = " + lessons +
                "\nstudents = " + students;
    }

    public static void cloc() {
        LocalTime localTime = LocalTime.now();
        if (localTime.getHour() > 17 && localTime.getHour() <23 && localTime.getMinute()<59) {
            System.out.printf("Кутман кеч! Саат: %s\b\b\b\b\b\b\b\b\b\b\b\b\b", localTime);
        } else if (localTime.getHour() < 5 && localTime.getHour() >0) {
            System.out.printf("Кутман түн! Саат: %s\b\b\b\b\b\b\b\b\b\b\b\b\b", localTime);
        } else System.out.printf("Кутман күн! Саат: %s\b\b\b\b\b\b\b\b\b\b\b\b\b", localTime);
        System.out.print("""
                \n1-Эгер катталган болсоңуз
                2-Паролду унуттуңузбу?
                №:""");
    }

    public void text() {
        System.out.print("""
                \n*** Бир команда тандаңыз! ***
                  1 -> Жаңы группа түзүү
                  2 -> Группаны аты боюнча издөө
                  3 -> Группанын атын өзгөртүү
                  4 -> Бардык группаны көрүү
                  5 -> Группага жаңы студент кошуу
                  6 -> Студенттин аты жөнүн өзгөртүү
                  7 -> Студенттин аты боюнча издөө
                  8 -> Бардык студенттерди группанын аты менен алыңыз
                  9 -> Студенттин бардык сабактарын көрүү
                  10 -> Студентти өчүрүү
                  11 -> Группага жаңы сабак кошуу
                  12 -> Cабактын аты боюнча издөө
                  13 -> Бардык сабактарды группанын аты боюнча издөө
                  14 -> Сабакты өчүрүү
                  15 -> Группаны өчүрүү
                  0  -> Программаны токтотуу
                  №: """);
    }

    public String getPs() {
        return ps;
    }

    public void setPs(String ps) {
        this.ps = ps;
    }

    @Override
    public void eEmail(ArrayList<String> e) {
        String em = "admin@gmail.com";
        if (e.equals(em)) {
        }
    }

    public void pPassword(String p) {
        if (p.equals(ps)) {
            System.out.println("Кош келиңиз!");
        } else System.out.println("\nПароль же почтаңыз туура эмес терилди!\n");
    }

    public void newPassword(String p) {
        getPs().replaceAll(getPs(), p);
        System.out.println("Кош келиңиз!\nПаролунузду ийгиликтүү өзгөрттүңүз: " + p);
    }

    @Override
    public void newGroup(ArrayList<String> g) {
        System.out.print("Жаңы группа: ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Сүрөттөмөсү (описания): ");
        String description = new Scanner(System.in).nextLine();
        g.add(String.valueOf(new Group(name,description)));
        System.out.println("Аты: "+name + "\nСүрөттөмөсү: "+description);
    }

}



