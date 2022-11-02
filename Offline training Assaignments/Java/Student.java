import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * The type Student.
 */
class Student{
    private int age;

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Sets roll no.
     *
     * @param roll_no the roll no
     */
    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    private int roll_no;

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets roll no.
     *
     * @return the roll no
     */
    public int getRoll_no() {
        return roll_no;
    }

    private  String name;

    /**
     * Instantiates a new Student.
     *
     * @param a the a
     * @param b the b
     */
    Student (int a, int b){
        setAge(a);
        setRoll_no(b);
    }
}

