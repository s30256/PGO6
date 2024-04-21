import java.util.ArrayList;

public class Manager extends Employee{
        ArrayList<Goal> listOfGoals = new ArrayList<>();

        public Manager (String name, String surname, String address, String email, String PESEL, int yearOfEmployment) {
            super (name,surname,address,email,PESEL,yearOfEmployment);
        }
        public void addGoals(Goal goal){
            listOfGoals.add(goal);
        }
        @Override
        public int calculateSalary(){
            int salary = super.calculateSalary();
            for(Goal g : listOfGoals){
                if(g.year<2024)
                    salary+=g.bonus;
                if(g.year==2024 && g.month<4)
                    salary+=g.bonus;
                if(g.year==2024 && g.month==4 && g.day<21)
                    salary+=g.bonus;
            }
            return salary;
        }
}


