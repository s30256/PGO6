import java.util.ArrayList;

public class Developer extends Employee{
        public ArrayList<Technology> listOfTechnologis=new ArrayList<>();
        public Developer(String name, String surname, String address, String email, String PESEL, int yearOfEmployment) {
            super (name,surname,address,email,PESEL,yearOfEmployment);

        }
        public void addTechnology(Technology t){
            listOfTechnologis.add(t);
        }

        @Override
        public int calculateSalary() {
            int salary = super.calculateSalary();
            for(Technology i : listOfTechnologis){
                salary+=i.bonus;
            }
            return salary;
        }
    }
