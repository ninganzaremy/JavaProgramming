public class JavaEncapsulation {
    //private variables can only be accessed within the same class (an outside class has no access to it). However,
    // it is possible to access them if we provide public get and set methods.
    //The get method returns the variable value, and the set method sets the value.
    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }


}
