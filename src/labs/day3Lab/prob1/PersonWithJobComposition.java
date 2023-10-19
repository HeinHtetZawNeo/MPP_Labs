package labs.day3Lab.prob1;

public class PersonWithJobComposition {
    private double salary;

    private PersonComposition person;

    public double getSalary() {
        return salary;
    }

    public PersonComposition getPersonComposition() {
    	return this.person;
    }
    
    public PersonWithJobComposition(String name,double salary) {
        this.salary = salary;
        person=new PersonComposition(name);
    }

    @Override
    public boolean equals(Object obj){
    	if(obj == null) return false;
    	
        if(this==obj)return true;
        
        if(!(obj instanceof PersonWithJobComposition)) return false;
        
        PersonWithJobComposition p =(PersonWithJobComposition)obj;
        
        return p.getPersonComposition().equals(this.person)&&(p.getSalary()==this.salary);
    }

    public static void main(String[] args) {
        PersonWithJobComposition p1 = new PersonWithJobComposition("Joe", 30000);
        PersonWithJobComposition p2 = new PersonWithJobComposition("Joe", 30000);

        PersonComposition p3 = new PersonComposition("HellishBoy");
        PersonComposition p4 = new PersonComposition("HellishBoy");
        System.out.println("p1.equals(p2)? " + p1.equals(p2));
        System.out.println("p3.equals(p4)? " + p3.equals(p4));
    }

}
