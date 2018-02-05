public class Sport {
    private String name;
    private String typeOfSport;
    private int age;

    public Sport(String name, String typeOfSport,int age) {
        this.setName(name);
        this.setTypeOfSport(typeOfSport);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfSport() {
        return typeOfSport;
    }

    public void setTypeOfSport(String typeOfSport) {
        this.typeOfSport = typeOfSport;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(!(obj instanceof Sport))
            return false;

        Sport sport = (Sport) obj;

        if(this.getName() != null)
            if(this.getName().equals(sport.getName()))
                 if(this.getTypeOfSport() != null)
                      if(this.getTypeOfSport().equals(sport.getTypeOfSport()))
                          if(this.getAge() == sport.getAge())
                                return true;

        return false;
    }

    @Override
    public String toString() {
        return "Ulubiony sportowiec " + getName() + "\n Sport który uprawia to " + getTypeOfSport() + " i ma " + getAge() + " lat.";
    }
}
