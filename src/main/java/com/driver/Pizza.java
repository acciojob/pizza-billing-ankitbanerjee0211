package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean cheeseAdded, toppingsAdded, paperBag;
    private String cheese, toppings, paper;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        bill = "Base Price Of The Pizza: " + ((isVeg)?"300\n":"400\n");
        price += (isVeg)?300:400;
        cheese = "";
        toppings = "";
        paper = "";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheeseAdded){
            price += 80;
            cheeseAdded = true;
            cheese = "Extra Cheese Added: 80\n";
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppingsAdded){
            if (isVeg){
                price += 70;
                toppings = "Extra Toppings Added: 70\n";
            } else{
                price += 120;
                toppings = "Extra Toppings Added: 120\n";
            }
            toppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!paperBag){
            price += 20;
            paperBag = true;
            paper = "Paperbag Added: 20\n";
        }
    }

    public String getBill(){
        // your code goes here
        if(cheeseAdded) bill += cheese;
        if(toppingsAdded) bill += toppings;
        if(paperBag) bill += paper;
        bill += "Total Price: " + getPrice();

        return this.bill;
    }
}
