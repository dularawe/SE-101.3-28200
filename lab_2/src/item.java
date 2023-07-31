public class item {

    protected int location;
    protected String description;

    public item(int location, String description) {

        this.location = location;
        this.description = description;
    }

    public void set(int location, String descrption) {
        this.description = descrption;
        this.location = location;
    }

    public int  get() {
       return location;
    }
    public String get1(){
        return description;
    }

}
