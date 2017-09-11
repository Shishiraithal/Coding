package structural.decorator;

class Paneer extends ToppingsDecorator
{
    // we need a reference to obj we are decorating
    Pizza pizza;
 
    public Paneer(Pizza pizza) { this.pizza = pizza; }
    public String getDescription() {
        return pizza.getDescription() + ", Paneer ";
    }
    public int getCost() { return 40 + pizza.getCost(); }
}