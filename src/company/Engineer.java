package company;

import java.util.Arrays;
import java.util.List;

public class Engineer extends Employee {
    private List<String> skills;

    public Engineer(String name, String department, double salary, List<String> skills) {
        super(name, department, salary);
        this.skills = skills;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }


    @Override
    public String toString() {
        return "Engineer{" +
                super.toString() +
                ", skills=" + skills +
                '}';
    }
}
