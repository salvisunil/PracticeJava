import java.sql.SQLOutput;
import java.util.*;
//
//class Students{
//       int id;
//        String name;
//        char Grade;
//
//public Students(int id , String name, char Grade)
//        {
//        this.id=id;
//        this.name=name;
//        this.Grade=Grade;
//
//        }
//
//
//
//}
//public class JavastreamExample{
//        public static void main(String[] args) {
//                List<Students>StudentsList=new ArrayList<Students>();
//                //adding students
//                StudentsList.add(new Students(1,"Sunil", 'B'));
//                StudentsList.add(new Students(2,"Pavan",'A'));
//                StudentsList.add(new Students(3,"Nirali",'C'));
//                StudentsList.add(new Students(4,"karan",'D'));
//                StudentsList.add(new Students(5,"sahil",'E'));
//
//                System.out.println("Highest Grade is:");
//
//                Students StudentsA =StudentsList.stream().max((Students1, Students5)->Students1.Grade>Students5.Grade ? 1:1).get();
//                System.out.println(StudentsA.Grade);
//
//                System.out.println("Lowest Grade is:");
//                Students StudentsB =StudentsList.stream().min((Students1, Students5)->Students1.Grade>Students5.Grade ? 1:1).get();
//                System.out.println(StudentsB.Grade);
//
//
//        }
//
//}


//class students{
//        int id;
//        String name;
//        float marks;
//        public students(int id, String name, float marks) {
//                this.id=id;
//                this.name=name;
//                this.marks=marks;
//
//
//        }
//
//}
//
//public class JavastreamExample {
//        public static void main(String[]args){
//                List<students>studentsList=new ArrayList<students>();
//
//                studentsList.add(new students(1,"sunil" ,89));
//                studentsList.add(new students(2,"ajay",78));
//                studentsList.add(new students(3,"vijay",90));
//
//                students studentsA=studentsList.stream().max((students1, students2)->students1.marks>students2.marks? 1:-1).get();
//                System.out.println(studentsA.marks);
//
//                students studentsB=studentsList.stream().min((students1,students2)->students1.marks>students2.marks?1:-1).get();
//                System.out.println(studentsB.marks);
//
//
//
//
//
//
//
//}
//
//}


class students
{
        int id;
        String name;
        float marks;
        public students(int id, String name, float marks)
        {
                this.id=id;
                this.name=name;
                this.marks=marks;
        }

}


public class JavastreamExample {
        public static void main(String[] args) {
                List<students>studentsList=new ArrayList<students>();
                studentsList.add(new students(1,"sunil",89));
                studentsList.add(new students(2,"nirali",78));
                studentsList.add(new students(3,"pavan",90));

                students studentsA=studentsList.stream().max((students1,students2)->students1.marks>students2.marks? 1:-1).get();
                System.out.println(studentsA.marks);
                students studentsB=studentsList.stream().min((students1,students2)->students1.marks>students2.marks? 1:-1).get();
                System.out.println(studentsB.marks);
        }
}