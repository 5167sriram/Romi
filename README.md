Author: Sri ram K 
Department:Information Technology 
Profile URL:

Description:
Input Handling
The program asks the user to enter a Roman numeral.
It converts the input to uppercase to ensure consistency.
Roman Value Mapping
A LinkedHashMap is used to store Roman symbols and their integer values:
I → 1
V → 5
X → 10
L → 50
C → 100
D → 500
M → 1000
Processing Logic
The program iterates through the string from right to left.
For each character:
It compares the current symbol (v1) with the next symbol (v2).
If v1 > v2, it applies subtraction rule (e.g., IV = 5 - 1 = 4).
Otherwise, it simply adds the value.
Summation
The computed values are added to a variable sum.
Output
Finally, the program prints the integer equivalent of the Roman numeral.

Conclusion:
From this program, people can understand how Roman numerals are converted into integers using logical rules. It demonstrates the importance of:

Mapping characters to values using data structures like Map
String processing and traversal techniques (especially right-to-left iteration)
Handling special cases such as subtraction in Roman numerals (e.g., IV, IX)
Basic problem-solving and algorithm design in Java

Overall, this program helps learners build a strong foundation in string manipulation, conditional logic, and real-world problem solving using programming.
