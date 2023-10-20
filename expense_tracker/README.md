# hw1- Manual Review

The homework will be based on this project named "Expense Tracker",where users will be able to add/remove daily transaction. 

## Compile

To compile the code from terminal, use the following command:
```
cd src
javac ExpenseTrackerApp.java
java ExpenseTracker
```

You should be able to view the GUI of the project upon successful compilation. 

## Java Version
This code is compiled with ```openjdk 17.0.7 2023-04-18```. Please update your JDK accordingly if you face any incompatibility issue.

## Application Features
Add Transactions -
  Users can enter the amount and category of the transaction and click on Add Transaction Button to add the transaction to the list.

Filter Transactions -
  The filter feature allows the users to filter the list of transactions by providing an input in the form of attribute and attribute value. The primary goal of this extension is to allow users to view and analyze their expenses more effectively by applying filters based on: Category and Amount.

The users will see a dropdown panel on the UI where they can select the filter criteria to filter on (e.g. Category or Amount).
Once the filter criteria is selected the user enters the particular value in the corresponding input field that they want the transaction list to be filtered with. Input validation checks have been implemented on the inputs.
Once the field and the corresponding value is selected the user can click on the Filter button to filter the list of transactions based on that filter provided.
The transactions satisfying the criteria would be highlighted through a colour.