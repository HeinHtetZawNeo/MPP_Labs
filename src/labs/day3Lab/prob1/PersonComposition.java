package labs.day3Lab.prob1;

public class PersonComposition {
    private String name;
    public PersonComposition(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
    public boolean equals(Object obj) {
        if(obj == null) return false;
        
        if(!(obj instanceof PersonComposition)) return false;
        
        return ((PersonComposition)obj).getName().equals(this.name);
    }
}