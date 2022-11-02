import java.util.*;

/**
 * The type Student arraylist.
 */
public class Student_list_set {

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main( String [] args){
            List<Student> St_Arraylist = new ArrayList<>();
            for( int i =0; i<4000;i++){
              St_Arraylist.add( new Student(i,i));
            }
            for ( Student st_obj: St_Arraylist){
                System.out.println( st_obj.getAge());
                System.out.println(st_obj.getRoll_no());
            }
            St_Arraylist.add( new Student(4000,4000));
            long Time = System.currentTimeMillis();

            List<Student> St_Linkedlist = new LinkedList<>();
            for( int i =0; i<4000;i++){
                St_Linkedlist.add( new Student(i,i));
            }
            for ( Student st_obj: St_Linkedlist){
                System.out.println( st_obj.getAge());
                System.out.println(st_obj.getRoll_no());
            }
            St_Linkedlist.add( new Student(4000,4000));
            long Time1 = System.currentTimeMillis();

            Set<Student> St_Hashset = new HashSet<>();
            for( int i =0; i<4000;i++){
                St_Hashset.add( new Student(i,i));
            }
            for ( Student st_obj: St_Hashset){
                System.out.println( st_obj.getAge());
                System.out.println(st_obj.getRoll_no());
            }
            St_Hashset.add( new Student(4000,4000));
            long Time2 = System.currentTimeMillis();
            System.out.println( Time);
            System.out.println( Time1);
            System.out.println( Time2);
        }

}

