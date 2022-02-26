package Practice_Collections;

public class Customer implements Comparable<Customer>{
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Customer other) {
        // this < o -> -1
        // this == o -> 0
        // this > o -> 1
        return this.name.compareTo(other.name);  //this.name > o.name works only with numbers and characters
    }


}
