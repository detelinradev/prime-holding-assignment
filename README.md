# prime-holding-assignment
internship assignment for Prime Holding Plovdiv Bulgaria
The first part is an algorithmic task. It comes down to searching for 3 consecutive digits in an int array, counting and removing them. 
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

Second part 
