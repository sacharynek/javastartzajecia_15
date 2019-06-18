public class Person implements Comparable<Person> {

    String fname, lname, pesel;

    public Person(String fname, String lname, String pesel) {
        this.fname = fname;
        this.lname = lname;
        this.pesel = pesel;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public int compareTo(Person o) {
        return o.getLname().compareTo(this.getLname());
    }

    @Override
    public String toString() {
        return  fname + " " + lname + " "+ pesel;
    }
}
