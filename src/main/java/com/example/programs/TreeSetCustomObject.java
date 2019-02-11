package com.example.programs;
import java.util.Set;
import java.util.TreeSet;
 
public class TreeSetCustomObject {
    public static void main(String a[]) {
        Set<Employe> ts = new TreeSet<Employe>();
        ts.add(new Employe(104, "Arjun", 10000));
        ts.add(new Employe(105, "Dinesh", 50000));
        ts.add(new Employe(101, "John", 40000));
        ts.add(new Employe(102, "Krish", 44500));
        ts.add(new Employe(103, "Arun", 20000));
        // adding duplicate entry
        ts.add(new Employe(103, "Arun", 20000));
        // check if duplicate entry is there or not
        for (Employe e : ts) {
            System.out.println(e);
        }
    }
}
 
class Employe implements Comparable<Employe> {
      private int empId;
      private String empName;
      private int empSal;
 
      public Employe(int id, String name, int sal) {
          this.empId = id;
          this.empName = name;
          this.empSal = sal;
      }
 
      public int getEmpId() {
          return empId;
      }
 
      public void setEmpId(int empId) {
         this.empId = empId;
      }
 
      public String getEmpName() {
         return empName;
      }
 
      public void setEmpName(String empName) {
         this.empName = empName;
      }
 
      public int getEmpSal() {
         return empSal;
      }
 
      public void setEmpSal(int empSal) {
         this.empSal = empSal;
      }
 
      public String toString() {
         return empId + " : " + empName + " : " + empSal;
      }

      @Override
      public int compareTo(Employe emp) {
         if (this.empId == emp.getEmpId()) {
             return 0;
         } else if (this.empId < emp.getEmpId()) {
             return -1;
         }
         return 1;
      }
}      
