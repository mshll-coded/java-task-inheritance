import company.Director;
import company.Engineer;
import company.SalesPerson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Director director = new Director("Janna", "Creative Control", 9999.999, 10);
        System.out.println(director);

        List<String> engSkills = new ArrayList<String>();
        Collections.addAll(engSkills, "Patient", "Java", "Oracle");
        Engineer engineer = new Engineer("Abdullah", "Backend", 10.01, engSkills);
        System.out.println(engineer);

        SalesPerson salesPerson = new SalesPerson("Yousef", "HR", -4, 0);
        System.out.println(salesPerson);
    }
}