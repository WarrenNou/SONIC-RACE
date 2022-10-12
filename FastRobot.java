

public class FastRobot extends Robot{
    public FastRobot(){
        super();
    }
    public FastRobot(String name, int position){
        super(name, position);

    }
    public void move(int max) throws OutOfRangeException {
       int maxe=getPosition()+2;
        if (maxe >max) {
            throw new OutOfRangeException("reached out of range");

        }
    }
    public Object clone(){

        return new FastRobot(this.getName(), this.getPosition());
    }
    public String toString(){
        return String.format("%-10s\t%s", "Fast", super.toString());
    }

}
