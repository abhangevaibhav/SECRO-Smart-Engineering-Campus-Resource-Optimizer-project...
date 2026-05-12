<<<<<<< HEAD
import java.util.*;

public class MainSECROProject {
    public static void main(String args[]) {

        // Code for Introduction

        System.out.println("Welcome to Smart Engineering Campus Resource Optimizer");
        System.out.println("Project by PLGIET,Latur Students of B.Tech Computer Engineering");

        // Code for giving information output to the user about different options in
        // this project for doing task

        System.out.println("Enter The number according to follwing serial for that perticular task.");

        System.out.println("Enter 1 for Classroom Allocation");
        System.out.println("Enter 2 for Faculty TimeTable Conflict Detector");
        System.out.println("Enter 3 for Lab Equipment Utilization Tracker");
        System.out.println("Enter 4 for Smart Attendance Pattern Analyzer");
        System.out.println("Enter 5 for Energy Saving Classroom Suggestion");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        switch (a) {

            case 1:

                // Code for Classroom Allocation

                System.out.println("For Classroom Allocation");
                ClassroomAllocator obj = new ClassroomAllocator();
                obj.input(sc);
                obj.allocate();
                break;

            case 2:

                // Code for Faculty TimeTable Conflict Detector

                System.out.println("For Faculty TimeTable Conflict Detector");
                Conflictdetector obj1 = new Conflictdetector();
                obj1.conflictdetected(sc);

                break;

            case 3:

                // Code for Lab Equipment Utilization Tracker
                lab obj3 = new lab();
                obj3.EquipmentUtilizationTracker(sc);

                break;

            case 4:

                // Code for Smart Attendance Pattern Analyzer
                PatternAnalyzer obj4 = new PatternAnalyzer();
                obj4.AttendancePattern(sc);

                break;

            case 5:

                // Code for Energy Saving Classroom Suggestion
                Energy object = new Energy();
                object.EnergySavingClassroomSuggestion();

                break;
            default:
                System.out.println("You Entered Invalid choice,Please Enter valid choice from 1-5.");
        }
    }
}

// here is the class for the classroom allocator.

class ClassroomAllocator {
    int[] students;
    int[] capacity;
    int n;

    void input(Scanner sc) {
        System.out.println("Enter number of classrooms are there:");
        n = sc.nextInt();

        students = new int[n];
        capacity = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number of Students in classroom " + (i + 1) + " : ");
            students[i] = sc.nextInt();

            System.out.print("Enter capacity of classroom " + (i + 1) + " : ");
            capacity[i] = sc.nextInt();
        }

    }

    void allocate() {
        boolean Way = false;

        for (int i = 0; i < n; i++) {
            if (capacity[i] >= students[i]) {
                System.out.println("Classroom " + (i + 1) + " is allocated successfully.");
                Way = true;
            } else {
                System.out.println("Classroom " + (i + 1) + " has less capacity so the allocation fails");
            }
        }
        if (!Way) {
            System.out.println(
                    " No any classrooms can not suitable for allocation due to less capacity of that classrooms");
        }
    }
}

class Conflictdetector {

    void conflictdetected(Scanner sc) {
        System.out.print("Enter Total Number of Periods is assigned to Faculty ");
        int Periods = sc.nextInt();
        System.out.print("Enter total number of timeslot in Timetable:");
        int Timeslot = sc.nextInt();
        if (Timeslot < Periods) {
            System.out.println("conflict is Detected");
        } else {
            System.out.println("There is no conflict");
        }
    }

}

class lab {
    void EquipmentUtilizationTracker(Scanner sc) {
        System.out.println("For Lab Equipment Utilization Tracker");
        System.out.println("Enter number of Labs ");
        int Labs = sc.nextInt();
        int TotalEquipment[] = new int[Labs];
        int UsedEquipment[] = new int[Labs];
        for (int i = 0; i < Labs; i++) {
            System.out.println("Enter number of Lab Equipment are present in total in Lab " + (i + 1) + " : ");
            TotalEquipment[i] = sc.nextInt();
            System.out.println("Enter number of Lab Equipment are used in Lab " + (i + 1) + " : ");
            UsedEquipment[i] = sc.nextInt();
        }
        System.out.println("Enter the Number of Equipment Atleast must be free for being not overused");
        int Num = sc.nextInt();
        int NumOverused = 0;
        for (int i = 0; i < Labs; i++) {
            if ((TotalEquipment[i] - UsedEquipment[i]) < Num) {
                NumOverused += 1;
            }
        }
        System.out.println("The Number of Overused Labs are: " + NumOverused);
    }
}

class PatternAnalyzer {
    void AttendancePattern(Scanner sc) {
        System.out.println("For Smart Attendance Pattern Analyzer");
        System.out.println("Enter number of Students in the class :");
        int Strength = sc.nextInt();
        int Percentage[] = new int[Strength];
        for (int i = 0; i < Strength; i++) {
            System.out.print("Enter Attendence Percentage of Student of Roll no. or PRL no. " + (i + 1) + ":");
            Percentage[i] = sc.nextInt();
            System.out
                    .println("The Attendence of Student of Roll no. or PRL no." + (i + 1) + "is in the condition of :");
            if (Percentage[i] > 90) {
                System.out.println("Excellent Attendence");
            } else if (Percentage[i] >= 75) {
                System.out.println("Good Attendence");
            } else {
                System.out.println("Poor Attendence need to improve");
            }
        }

    }
}

class Energy {
    void EnergySavingClassroomSuggestion() {
        System.out.println("For Energy Saving Classroom Suggestion");
        System.out.println("Suggestion is for using minimum Classrooms to save electricity.");
        System.out.println(
                "Saving electricity in the classroom is crucial to lower environmental pollution , \n reduce school utility bills, \n and conserve finite natural resources.");
    }
}
=======
import java.util.*;

public class MainSECROProject {
    public static void main(String args[]) {

        // Code for Introduction

        System.out.println("Welcome to Smart Engineering Campus Resource Optimizer");
        System.out.println("Project by PLGIET,Latur Students of B.Tech Computer Engineering");

        // Code for giving information output to the user about different options in
        // this project for doing task

        System.out.println("Enter The number according to follwing serial for that perticular task.");

        System.out.println("Enter 1 for Classroom Allocation");
        System.out.println("Enter 2 for Faculty TimeTable Conflict Detector");
        System.out.println("Enter 3 for Lab Equipment Utilization Tracker");
        System.out.println("Enter 4 for Smart Attendance Pattern Analyzer");
        System.out.println("Enter 5 for Energy Saving Classroom Suggestion");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        switch (a) {

            case 1:

                // Code for Classroom Allocation

                System.out.println("For Classroom Allocation");
                ClassroomAllocator obj = new ClassroomAllocator();
                obj.input(sc);
                obj.allocate();
                break;

            case 2:

                // Code for Faculty TimeTable Conflict Detector

                System.out.println("For Faculty TimeTable Conflict Detector");
                Conflictdetector obj1 = new Conflictdetector();
                obj1.conflictdetected(sc);

                break;

            case 3:

                // Code for Lab Equipment Utilization Tracker
                lab obj3 = new lab();
                obj3.EquipmentUtilizationTracker(sc);

                break;

            case 4:

                // Code for Smart Attendance Pattern Analyzer
                PatternAnalyzer obj4 = new PatternAnalyzer();
                obj4.AttendancePattern(sc);

                break;

            case 5:

                // Code for Energy Saving Classroom Suggestion
                Energy object = new Energy();
                object.EnergySavingClassroomSuggestion();

                break;
            default:
                System.out.println("You Entered Invalid choice,Please Enter valid choice from 1-5.");
        }
    }
}

// here is the class for the classroom allocator.

class ClassroomAllocator {
    int[] students;
    int[] capacity;
    int n;

    void input(Scanner sc) {
        System.out.println("Enter number of classrooms are there:");
        n = sc.nextInt();

        students = new int[n];
        capacity = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number of Students in classroom " + (i + 1) + " : ");
            students[i] = sc.nextInt();

            System.out.print("Enter capacity of classroom " + (i + 1) + " : ");
            capacity[i] = sc.nextInt();
        }

    }

    void allocate() {
        boolean Way = false;

        for (int i = 0; i < n; i++) {
            if (capacity[i] >= students[i]) {
                System.out.println("Classroom " + (i + 1) + " is allocated successfully.");
                Way = true;
            } else {
                System.out.println("Classroom " + (i + 1) + " has less capacity so the allocation fails");
            }
        }
        if (!Way) {
            System.out.println(
                    " No any classrooms can not suitable for allocation due to less capacity of that classrooms");
        }
    }
}

class Conflictdetector {

    void conflictdetected(Scanner sc) {
        System.out.print("Enter Total Number of Periods is assigned to Faculty ");
        int Periods = sc.nextInt();
        System.out.print("Enter total number of timeslot in Timetable:");
        int Timeslot = sc.nextInt();
        if (Timeslot < Periods) {
            System.out.println("conflict is Detected");
        } else {
            System.out.println("There is no conflict");
        }
    }

}

class lab {
    void EquipmentUtilizationTracker(Scanner sc) {
        System.out.println("For Lab Equipment Utilization Tracker");
        System.out.println("Enter number of Labs ");
        int Labs = sc.nextInt();
        int TotalEquipment[] = new int[Labs];
        int UsedEquipment[] = new int[Labs];
        for (int i = 0; i < Labs; i++) {
            System.out.println("Enter number of Lab Equipment are present in total in Lab " + (i + 1) + " : ");
            TotalEquipment[i] = sc.nextInt();
            System.out.println("Enter number of Lab Equipment are used in Lab " + (i + 1) + " : ");
            UsedEquipment[i] = sc.nextInt();
        }
        System.out.println("Enter the Number of Equipment Atleast must be free for being not overused");
        int Num = sc.nextInt();
        int NumOverused = 0;
        for (int i = 0; i < Labs; i++) {
            if ((TotalEquipment[i] - UsedEquipment[i]) < Num) {
                NumOverused += 1;
            }
        }
        System.out.println("The Number of Overused Labs are: " + NumOverused);
    }
}

class PatternAnalyzer {
    void AttendancePattern(Scanner sc) {
        System.out.println("For Smart Attendance Pattern Analyzer");
        System.out.println("Enter number of Students in the class :");
        int Strength = sc.nextInt();
        int Percentage[] = new int[Strength];
        for (int i = 0; i < Strength; i++) {
            System.out.print("Enter Attendence Percentage of Student of Roll no. or PRL no. " + (i + 1) + ":");
            Percentage[i] = sc.nextInt();
            System.out
                    .println("The Attendence of Student of Roll no. or PRL no." + (i + 1) + "is in the condition of :");
            if (Percentage[i] > 90) {
                System.out.println("Excellent Attendence");
            } else if (Percentage[i] >= 75) {
                System.out.println("Good Attendence");
            } else {
                System.out.println("Poor Attendence need to improve");
            }
        }

    }
}

class Energy {
    void EnergySavingClassroomSuggestion() {
        System.out.println("For Energy Saving Classroom Suggestion");
        System.out.println("Suggestion is for using minimum Classrooms to save electricity.");
        System.out.println(
                "Saving electricity in the classroom is crucial to lower environmental pollution , \n reduce school utility bills, \n and conserve finite natural resources.");
    }
}
>>>>>>> 1919225f19a468edd93a4f600a69642b9d942995
