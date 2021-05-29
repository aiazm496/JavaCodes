package com.company;

public class Point3d extends Point {
    private int z;

    public Point3d(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    @Override
    public int manhattanDistanceFromOrigin(){
        return super.manhattanDistanceFromOrigin() +this.z;
    }

    @Override
    public String location(){
        return super.location() + "," + this.z;
    }


}
