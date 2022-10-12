public class TurboRobot extends Robot{
    public TurboRobot(){
        super();
    }
    public TurboRobot(String name, int position){
        super(name, position);
    }
    public void move(int max) throws OutOfRangeException {
         int maxe=getPosition()*2;
        if (maxe >max) {
            throw new OutOfRangeException("reached out of range");

        }
    }
    public Object clone(){
        return new TurboRobot(this.getName(), this.getPosition());
    };

    public String toString(){
        return String.format("%-10s\t%s", "Turbo", super.toString());
    }
}
