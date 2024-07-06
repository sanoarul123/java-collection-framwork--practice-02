import java.util.*;

public class student {
    String name;
    int rollNo;

    public student(String name, int rollNo) {

        this.name = name;
        this.rollNo = rollNo;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                "rollNo=" + rollNo +
                '}';
    }

}
