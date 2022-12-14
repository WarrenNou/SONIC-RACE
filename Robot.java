public abstract class Robot
    implements Cloneable, Movable,Comparable<Robot>{
    private String name;
    private int position;
    protected Robot(){
        name = "none";
        position = 0;
    }
    protected Robot(String name, int position){
        this.name = name;
        this.position = position;
    }
    public String getName(){
        return name;
    }
    public int getPosition(){
        return position;
    }
    public void setName(String n){
        name = n;
    }
    public void setPosition(int p){
        position = p;
    }
    public String toString(){
        return String.format("%-10s\t%-5d", name, position);
    }
    public abstract void move(int max) throws OutOfRangeException;
    public abstract Object clone();
    public int compareTo(Robot s){
        if(getPosition()==s.getPosition()){
            return 0;
        }else if(getPosition()<s.getPosition()){
            return - 1;
        }else {
            return 1;
        }

    }
}
