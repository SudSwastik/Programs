import java.util.*; 
class Student{
	   private int id;
	   private String fname;
	   private double cgpa;
	   public Student(int id, String fname, double cgpa) {
	      super();
	      this.id = id;
	      this.fname = fname;
	      this.cgpa = cgpa;
	   }
	   public int getId() {
	      return id;
	   }
	   public String getFname() {
	      return fname;
	   }
	   public double getCgpa() {
	      return cgpa;
	   }
}
class Sorting implements Comparator<Student>{
    public int  compare(Student a, Student b) {
        if (b.getCgpa() == a.getCgpa()) {
            if(b.getFname().equals(a.getFname()))
                return (b.getId()-a.getId());
            return (a.getFname().compareTo(b.getFname()));
        } else {
            return (int)(b.getCgpa()*1000 - a.getCgpa()*1000);
        }
    }
}
public class MultipleFieldComparator {
		 public static void main(String[] args){
		      Scanner in = new Scanner(System.in);
		      int testCases = Integer.parseInt(in.nextLine());
		      List<Student> studentList = new ArrayList<Student>();
		      while(testCases>0){
		         int id = in.nextInt();
		         String fname = in.next();
		         double cgpa = in.nextDouble();
		         
		         Student st = new Student(id, fname, cgpa);
		         studentList.add(st);
		         
		         testCases--;
		    }
		    Collections.sort(studentList,new Sorting());
		    for(Student st: studentList){
		         System.out.println(st.getFname());
        }

	}

}
