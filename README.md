# prime-holding-assignment
**Internship assignment for Prime Holding Plovdiv Bulgaria**

  **The first part** is an algorithmic task. It comes down to searching for 3 consecutive digits in an int array, counting and removing them. 
The positions of the digits will be random in the data structure and after that, the structure should be updated to be in consecutive order.  
I decided to try two options - with Stack and Linked List.  
  First gives us constant time for removing and adding from the top of the stack where we could add digits one by one from the original array
and performs two checks: for consecutiveness ahead in the array and back in the already added digits in the stack. If 3 consecutive digits appear ahead we are passing them and iterate 2 positions ahead in the array, if they are 1 or 2 already in the stack we are deleting them
from the stack and starting checks again 2 digits back and ahead.  
There is additional check after we iterate through all the array, because of the last blind digit, caused by escaping rule for the while 
loop to be -2 elements from the length of the array.  
The second option gives us constant time for removing and O(n) for iterating where n is the number of positions we need to move back when 
consecutive digits are removed.  
Comes out the second variant is around 30% per cent faster, because of many unnecessary checks omitted, as well as fewer fields created.
Both of the variants use Buffered Reader, as there is no need to parse the input, and it is considerably faster then Scanner.  
Error handling is achieved with try/catch block to prevent I/O exception when using Buffered Reader. Because the input thereafter remain
String no errors could be produced from wrong input content.  
Both of the variants offer O(n) time as the check is made with just one iteration over the original array.  

**The second part** is the OOP task. An application should be made for a market store, handling 3 different discount cards, allowing the user to have 
various discounts, based on the type of the card and the amount of the turnover from the previous month.  
I decided to implement a factory design pattern for creating the objects, thus the structure is the classes that are going to be instantiated implement a common interface, which allows user to choose concrete implementation on runtime. I created two levels of interfaces, so every class has its interface as well as the common one, which they extend. This allows us to add specific functionality for the class and create new groups of classes sharing the same functionality.  
Because the classes share the same fields as well, I created an abstract class which they all extend, to reduce repeating code through inheritance.
The fields itself are objects too, what creates aggregation relation, which helps with code reuse as well and helps to keep modules more de-coupled compared to inheritance.  
Moreover, I decide to make use of the strategy pattern for adding the functionality for calculation the proper discount based on preexisting
criteria. So I created all concrete calculation strategies as classes, they all implement an interface, and that interface is a field in another class, allowing me to add the calculation method for the discount from the interface (where it is decoupled from concrete implementation) in a class that I can instantiate on run time and thus choose what concrete implementation of the discount strategy to use on run time. That helps to keep classes loose coupled and follows the SOLID principle "open for extension and close for modification".  
When creating a card object I decided to use a Builder design pattern, as it comes with immutability what is important when we creating 
object from other objects, and allows us to change easily the components of the card object, adding or removing some.
For the sake of keeping the inheritance and code reuse for the group of classes that creates cards, I had to implement a generic Builder in the abstract class BaseCard and with use of self() method (which every concrete implementation should override), as it is described in Bloch's book Effective Java, to properly inherit it.  
I used enums for the exact rates of discount, which allows easily to change them, without changing the other code and improve code readability.  
The application can be started from the class Start-Up, where instances of the cards are created and mock data is filled, the result will be printed out with the help of Pay desk class printOut method.


