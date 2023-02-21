import java.util.Scanner;
import java.lang.String;
import java.util.Map;
import java.util.HashMap;

class Student {
    private String name;
    private int cutOffMarks;
    String branch;
    private String getName() {
        return name;
    }
    private int getcutOffMarks() {
        return cutOffMarks;
    }
    public String getBranch() {
        return branch;
    }

    public void printStudent(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        int i, j, temp;
        System.out.println("Enter the details of students ");
        int[] cutOff;
        cutOff = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("Enter the name:");
            String name = input.next();
            System.out.println("Enter  the student roll number: ");
            int rollNumber = input.nextInt();

            System.out.print("Enter the total marks:");
            int totalMarks = input.nextInt();
            System.out.print("Enter the obtained marks:");
            int obtainedMarks = input.nextInt();
            float cutoffPercentage = (obtainedMarks * 100) / totalMarks;
            System.out.println("Your percentage is:" + cutoffPercentage);
            input.nextLine();
            System.out.println("Enter the maths marks:");
            int maths = input.nextInt();
            System.out.println("Enter the chem marks:");
            int chem = input.nextInt();
            System.out.println("Enter the phy marks:");
            int phy = input.nextInt();
            int cutOffMarks = (maths / 2) + (chem / 4) + (phy / 4);
            cutOff[i] = cutOffMarks;
            System.out.println("Counseling Report");
            System.out.println("-----------------");
            System.out.println("name:" + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("cutoff:" + cutOffMarks);
            System.out.println("-----------------");
            System.out.println("\n");
        }
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (cutOff[i] < cutOff[j]) {
                    temp = cutOff[i];
                    cutOff[i] = cutOff[j];
                    cutOff[j] = temp;

                }
            }
            System.out.println(cutOff[i]);
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}
class College {
    String name;
    int filledSeats;
    boolean vacantSeats;

    public String getName() {
        return name;
    }

    public void fillSeat() {
        filledSeats++;
    }

    public boolean VacantSeats() {
        return vacantSeats;
    }

    public static void main(String[] args) {
        Student classObj = new Student();
        classObj.printStudent();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            Map<Integer, String> col = new HashMap<Integer, String>();
            col.put(7218, "Rathinam");
            col.put(7108, "PSG");
            col.put(7106, "CIT");
            System.out.println("college:" + col);


            System.out.print("Enter the college(1(7218-Rathinam),2(7180-PSG),3(7106-CIT)):");
            int college = input.nextInt();
            System.out.print("Enter student's branch  (1-CSE, 2-IT, 3-Mech):");
            int branch = input.nextInt();
            System.out.println("Counseling Report");
            System.out.println("-----------------");
            System.out.println("college:" + college);
            System.out.println("branch:" + branch);
            System.out.println("roll number: ");
            int rollNumber = input.nextInt();
            System.out.println("-----------------");
            System.out.println(rollNumber);

            switch (branch) {
                case 1:
                    System.out.println("Branch Alloted: CSE");
                    break;
                case 2:
                    System.out.println("Branch Alloted: IT");
                    break;
                case 3:
                    System.out.println("Branch Alloted: Mech");
            }
            switch (college) {
                case 1:
                    System.out.println("College Alloted:" + 7218);
                    break;
                case 2:
                    System.out.println("College Alloted:" + 7108);
                    break;
                case 3:
                    System.out.println("College Alloted:" + 7106);
            }

           
            }
        }
    }




