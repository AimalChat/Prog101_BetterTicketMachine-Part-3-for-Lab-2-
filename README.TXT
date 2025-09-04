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

47a.Check that the behavior we have discussed here is accurate by creating a TicketMachine instance and 
calling insertMoney with various actual parameter values. Check the balance both before and after calling
insertMoney. Does the balance ever change in the cases when an error message is printed? Try to predict 
what will happen if you enter the value zero as the parameter, and then see if you are right.

47b.

48a.Predict what you think will happen if you change the test in insertMoney to use the greater-than or 
equal-to operator: if(amount >= 0)
Check your predictions by running some tests. What difference does it make to the behavior
of the method?

48b.

49a.Rearrange the statements in the if-else statement of insertMoney as below, but also rewrite the boolean 
expression so that the method still behaves correctly. In other words, if an amount greater than 0 is 
inserted then the balance is increased, but otherwise an error message is printed. The main change you 
will have to make is to the boolean expression to use a different relational operator. Thoroughly check 
your change to ensure that it behaves exactly as the original version that used the “>” operator.
if (changed condition goes here) {
System.out.prinln(“Use a positive amount rather than: ” + amount);
}
else {
balance = balance + amount;
}

49b.

50a.In the figures project we looked at in Chapter 1 we used a boolean field to control a feature of the circle 
objects. What was that feature? Was it well suited to being controlled by a type with only two different 
values?

50b.

51a.In this version of printTicket, we also do something slightly different with the total and balance fields. 
Compare the implementation of the method from the naive-ticket-machine project with that of the 
better-ticket-machine to see whether you can tell what those differences are. Then check your 
understanding by experimenting within BlueJ.

51b.

52a.Is it possible to remove the else part of the if statement in the printTicket method (i.e., remove the word
else and the block attached to it)? Try doing this and seeing if the code still compiles. What happens 
now if you try to print a ticket without inserting any money?

52b.

53a.After a ticket has been printed, could the value in the balance field ever be set to a negative value by 
subtracting price from it? Justify your answer.

53b.

54a.

54b.

55a.Write an assignment statement that will store the result of multiplying two variables, price and discount,
into a third variable, saving.

55b.

56a.Write an assignment statement that will divide the value in total by the value in count and store the 
result in mean.

56b.

57a. Add the following method to the class:
public void affordable(int budget){
// TODO: Write an if-statement that checks budget against price and prints
// a message saying weather a ticket is affordable
}
In the body of this method, write an if statement that will compare the value in price against the value in
budget. If price is greater than budget, then print the message “Too expensive”; otherwise print the 
message “Just right”. Test your method.

57b.

58a.Modify your answer to the previous exercise so that the message includes the value of your budget if the 
price is too high. Write two different versions: one using and one using . Which version do you find 
easier to understand?

58b.

59a.Why does the following version of refundBalance not give the same results as the original?
public int refundBalance()
{
balance = 0;
return balance;
}
What tests can you run to demonstrate that it does not?

59b.

60a.What happens if you try to compile the TicketMachine class with the following version of 
refundBalance?
public int refundBalance()
{
return balance;
balance = 0;
}
What do you know about return statements that helps to explain why this version does not compile?

60b.

61a.Challenge exercise Carefully compare the following constructor with the original one from 
TicketMachine. What is different in this version?
public TicketMachine(int cost)
{
int price = cost;
balance = 0;
total = 0;
}
Try out this version in the better-ticket-machine project. Does this version compile? Create an object and 
then inspect its fields. Do you notice something wrong about the value of the price field in the inspector 
with this version? Can you explain why this is?

61b.

62a.Add a new method, emptyMachine, that is designed to simulate emptying the machine of money. It 
should reset total to be zero but also return the value that was stored in total before it was reset.

62b.

63a.Rewrite the printTicket method so that it declares a local variable, amountLeftToPay. This should then 
be initialized to contain the difference between price and balance. Rewrite the test in the conditional 
statement to check the value of amountLeftToPay. If its value is less than or equal to zero, a ticket 
should be printed; otherwise, an error message should be printed stating the amount left to pay. Test your
version to ensure that it behaves in exactly the same way as the original version. Make sure that you call
the method more than once, when the machine is in different states, so that both parts of the conditional
statement will be executed on separate occasions.

63b.

64a.Challenge exercise Suppose we want a TicketMachine object to be able to issue a ticket at a discounted 
price; such as for half price. A user might press a button on the physical machine to select a discounted 
ticket price and would then only need to insert enough money to pay the discounted price for that ticket. 
The discount would only apply to one ticket and the machine would then return to the original price for 
the next ticket (unless the discount option was selected again).What further methods and/or fields would
need to be added to TicketMachine to allow this kind of functionality? Do you think that many of the 
existing methods would need to be changed as well? Save the better-ticket-machine project under a new 
name and implement your changes in the new project.

64b.
