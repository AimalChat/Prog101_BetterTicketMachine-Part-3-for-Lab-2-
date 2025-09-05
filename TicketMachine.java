/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 7.1
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    //The toggle for discounted ticket price.
    private boolean discount;
    //The price of discounted tickets
    private int discountedPrice;

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
        discount = false
        discountedPrice = price/2;
    }

    /**
    *Apply the discount to ticket price.
    */
    public boolean applyDiscount()
    {
        discount = true;
        return discount;

    /**
    *Compare budget to price of ticket.
    */
    public void affordable(int budget)
    {
        if (budget <= price){
            System.out.println("Too expensive, your budget is only : " + budget);
        }
        else {
            System.out.println("Just right!");
        }
    }

    /**
    *empty the machine of money and show how much was collected
    */
    public int emptyMachine()
    {
        int collectedCredits;
        collectedCredits = total;
        total = 0;
        return colletedCredits;
    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return The amount of money already inserted for the next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
    *@Return The price of a discounted ticket.
    */
    public int getDiscountPrice()
    {
        return discountedPrice;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) {
            balance = balance + amount;
        }
        else {
            System.out.println("Use a positive amount rather than: " + amount);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        int currentPrice;
        if(discount){
            currentPrice = discountedPrice;
        }
        else{
            currentPrice = price;
        }
        amountLeftToPay = currentPrice - balance;
        if(amountLeftToPay <= 0) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + currentPrice + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + currentPrice;
            // Reduce the balance by the price.
            balance = balance - currentPrice;
            //Remove the discount for next ticket.
            discount = false;
        }
        else {
            System.out.printf("You must insert at least %d more cents.%n",
                              amountLeftToPay);
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
