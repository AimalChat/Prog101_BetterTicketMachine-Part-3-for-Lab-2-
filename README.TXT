Project: better-ticket-machine
Authors: David Barnes and Michael Kölling

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling
   Pearson Education

It is discussed in chapter 2.

Purpose of project: To illustrate conditional statements.
How to start this project: Create one or more TicketMachine objects.

Lab report (part a = question. part b = answer)

47a.Check that the behavior we have discussed here is accurate by 
creating a TicketMachine instance and calling insertMoney with various 
actual parameter values. Check the balance both before and after calling
insertMoney. Does the balance ever change in the cases when an error 
message is printed? Try to predict what will happen if you enter the 
value zero as the parameter, and then see if you are right.

47b.It will not since the descritpion of the machine states that there are 
checks that verify is the inputted value is part of the accepted ones. I
would hope it doesnt change the balance since there are checks that refuse
adding invalid values into the program. I was right for both of these
assumptions.

48a.Predict what you think will happen if you change the test in 
insertMoney to use the greater-than or equal-to operator: if(amount >= 0)
Check your predictions by running some tests. What difference does it make 
to the behavior of the method?

48b.I believe it will now allow the value : 0 to be inputted and "count" it
in the balance. It now accepts 0 in the parameter of the object when intializing 
it. 

49a.Rearrange the statements in the if-else statement of insertMoney as below, 
but also rewrite the boolean expression so that the method still behaves 
correctly. In other words, if an amount greater than 0 is inserted then the 
balance is increased, but otherwise an error message is printed. The main change 
you will have to make is to the boolean expression to use a different relational 
operator. Thoroughly check your change to ensure that it behaves exactly as 
the original version that used the “>” operator.
if (changed condition goes here) {
System.out.println(“Use a positive amount rather than: ” + amount);
}
else {
balance = balance + amount;
}

49b.Yes, it works the same as the previous code.

50a.In the figures project we looked at in Chapter 1 we used a boolean field to 
control a feature of the circle objects. What was that feature? Was it well 
suited to being controlled by a type with only two different values?

50b.The setVisible method. Yes, since the visibility of the circle would be either,
visble or invisible. Not a scaling nuumber, unless if we wanted to implement
transparency as a feature then yes it is sufficient enough  in this case.

51a.In this version of printTicket, we also do something slightly different 
with the total and balance fields. Compare the implementation of the method 
from the naive-ticket-machine project with that of the better-ticket-machine 
to see whether you can tell what those differences are. Then check your 
understanding by experimenting within BlueJ.

51b.Firstly, there is now a conditional statement that checks if the value
stored in the field : "balance" is greater than or equal to the value stored 
in the filed "price". If yes, print out ticket. If not, print out message :
"You must insert at least %d more cents.%n". Second, the total is now
calculated by adding the price value to the total value, instead of adding the
balance value to the total value. Lastly, as to the old machine who would wipe 
thebalance clean after print the ticket, the better machine now subtracts the
price of the ticket from the balance value.

52a.Is it possible to remove the else part of the if statement in the 
printTicket method (i.e., remove the word else and the block attached to it)? 
Try doing this and seeing if the code still compiles. What happens now if you 
try to print a ticket without inserting any money?

52b.It is possible and it even compiles according to Java. Nothing happens.

53a.After a ticket has been printed, could the value in the balance field ever 
be set to a negative value by subtracting price from it? Justify your answer.

53b.No, becasue the conditional statement requires there be more or enough
credits to print a ticket. If I did try printing, the lowest id be able to
go in my balance is 0 wihtout being able to reach the negatives. In the end,
the machine requires credits and when you spend those, there are no loopholes
that I could exploit to acheive this endeavour.

54a.So far, we have introduced you to two arithmetic operators, + and -, that 
can be used in arithmetic expressions in Java. Take a look at the textbook’s 
Appendix C to find out what other operators are available.

54b.
+ addition
— subtraction
* multiplication
/ division
% modulus, or remainder after division

55a.Write an assignment statement that will store the result of multiplying 
two variables, price and discount,into a third variable, saving.

55b.
public int showSavings()
{
int saving;
saving = price * discount;
return saving;
}

56a.Write an assignment statement that will divide the value in total by the 
value in count and store the result in mean.

56b.
public int showMean()
{
int mean;
mean = total/count;
return mean;
}

57a. Add the following method to the class:
public void affordable(int budget){
// TODO: Write an if-statement that checks budget against price and prints
// a message saying weather a ticket is affordable
}
In the body of this method, write an if statement that will compare the value 
in price against the value in budget. If price is greater than budget, then 
print the message “Too expensive”; otherwise print the message “Just right”. 
Test your method.

57b.
public void affordable(int budget)
    {
        if (budget <= price){
            System.out.println("Too expensive.");
        }
        else {
            System.out.println("Just right!");
        }
    }

58a.Modify your answer to the previous exercise so that the message includes 
the value of your budget if the price is too high. Write two different 
versions: one using and one using(Use what????). Which version do you find 
easier to understand?

58b.
public void affordable(int budget)
    {
        if (budget <= price){
            System.out.println("Too expensive, your budget is only : " + budget);
        }
        else {
            System.out.println("Just right!");
        }
    }

59a.Why does the following version of refundBalance not give the same results 
as the original?
public int refundBalance()
{
balance = 0;
return balance;
}
What tests can you run to demonstrate that it does not?

59b. It simply returns/displays the value stored in the field "balance",
which was stated to be 0, so it simply shows the new value of said
variable. A test that can properly demonstrate the differences are
doing as usual on both the new refundBalance method and original method
side by side. After insterting both 1000 credits in the machines, I check
the balance of both and a clear difference can be seen. The modified
machine displayed 0 even though it should have been 900. Thankfully, the
original machine displays 900, the correct ammount in my balance after
prchasing the ticket. The first wiped my balance clean whilst the other
showed the ammount I wanted refunded.I

60a.What happens if you try to compile the TicketMachine class with the 
following version of refundBalance?
public int refundBalance()
{
return balance;
balance = 0;
}
What do you know about return statements that helps to explain why this 
version does not compile?

60b.After a return statement, the rest of the method will be skipped
over, since when a return method is called it is always the last one 
Java will execute, nothing else will be computed.

61a.Challenge exercise Carefully compare the following constructor with 
the original one from TicketMachine. What is different in this version?
public TicketMachine(int cost)
{
int price = cost;
balance = 0;
total = 0;
}
Try out this version in the better-ticket-machine project. Does this 
version compile? Create an object and then inspect its fields. Do you notice 
something wrong about the value of the price field in the inspector with this 
version? Can you explain why this is?

61b.Yes, it does compile. However when invoking the getPrice method, it returned
with the value "0". even though I inputted 100. I think this is because the added
"int" at the first line of the body, which was originally "price = cost;" ,
makes it so that there isnt a value being compared to another, but rather a
parameter with a value. Since we never gave a value to said parameter inside the
body or the one named "int price", it defaulted to 0 as does every other
int type of data when not getting attributed a value to store by the caller.

62a.Add a new method, emptyMachine, that is designed to simulate emptying 
the machine of money. It should reset total to be zero but also return the 
value that was stored in total before it was reset.

62b.

63a.Rewrite the printTicket method so that it declares a local variable, 
amountLeftToPay. This should then be initialized to contain the difference 
between price and balance. Rewrite the test in the conditional statement 
to check the value of amountLeftToPay. If its value is less than or equal 
to zero, a ticket should be printed; otherwise, an error message should be 
printed stating the amount left to pay. Test yourversion to ensure that it 
behaves in exactly the same way as the original version. Make sure that you call
the method more than once, when the machine is in different states, so that both
parts of the conditionalstatement will be executed on separate occasions.

63b.

64a.Challenge exercise Suppose we want a TicketMachine object to be able to
issue a ticket at a discounted price; such as for half price. A user might 
press a button on the physical machine to select a discounted ticket price 
and would then only need to insert enough money to pay the discounted price 
for that ticket. The discount would only apply to one ticket and the machine 
would then return to the original price for the next ticket (unless the 
discount option was selected again).What further methods and/or fields would
need to be added to TicketMachine to allow this kind of functionality? Do 
you think that many of the existing methods would need to be changed as well? 
Save the better-ticket-machine project under a new name and implement your 
changes in the new project.

64b.
