package com.company;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare){
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    public int getSquares(){
        return this.squares;
    }

    public int getPricePerSquare(){
        return this.pricePerSquare;
    }

    public boolean largerThan(Apartment a){
        if(this.squares> a.getSquares()){
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment a){
        return (this.pricePerSquare*this.squares) - (a.pricePerSquare*a.squares);
    }


}
