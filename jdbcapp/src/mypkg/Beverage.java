/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypkg;

/**
 *
 * @author gauhar
 */
//this is a design pattern basically we used in FileHandling
//this is a hypothetical abstract class
abstract class Beverage{
        String description = "Unknown Beverage";
        public String getDescription(){
                return description;
        }
        public abstract double cost();
}
abstract class CondimentDecorator extends Beverage{ 
        @Override
        public abstract String getDescription();
}
class Espresso extends Beverage{ 
        public Espresso(){ 
                description = "Expresso";
        }
        @Override
        public double cost(){ 
                return 50.0;
        }
}
class HouseBlend extends Beverage{ 
        public HouseBlend(){ 
                description = "House Blend Coffee";
        }
        @Override
        public double cost(){ 
                return 35.0;
        }
}
class Mocha extends CondimentDecorator{ 
        Beverage beverage;
        public Mocha(Beverage beverage){ 
                this.beverage = beverage;
        }
        @Override
        public String getDescription(){ 
                return beverage.getDescription()+"Mocha";
        }
        @Override
        public double cost(){
                return 56.0 + beverage.cost();
        }
}
 class ClassStarbuck {
    public static void main(String[] args) {
        // Create an instance of Espresso
     /*   Beverage beverage = new Expresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // Create an instance of House Blend Coffee and decorate it with Mocha
        Beverage b = new HouseBlend();
        beverage = new Mocha(beverage); // Decorate with Mocha
        System.out.println(b.getDescription() + " $" + b.cost());*/
        //we use liskov substitution principle , ham isme beverage ka espresso me rakh rahe hai
        Beverage b = new Espresso();
        System.out.println(b.getDescription()+ " Rs " + b.cost());
        //decorate with mocha
        Beverage b2 = new Mocha(b);
        System.out.println(b2.getDescription()+ " Rs " + b2.cost());
    }
}


