# Lab: Binary

## OBJECTIVES  
- Compose a method that converts a decimal number to binary.  
- Read data from the keyboard.  
- Display information in a user-friendly format.  

## PROGRAM DESCRIPTION  
In this program, you will write a method that converts base-10 (decimal) numbers to base-2 (binary).  

To convert a decimal integer to its binary equivalent:  
1. Divide the number by 2. The remainder is the **least-significant bit**.  
2. Take the quotient and divide it by 2 again; its remainder becomes the **next least-significant bit**.  
3. Repeat this process until the quotient reaches **zero**.  
4. The sequence of remainders, read from bottom to top, forms the binary value.  

For example, converting **26₁₀** to binary:  

| Division | Quotient | Remainder |
|----------|---------|-----------|
| 26 ÷ 2   | 13      | 0         |
| 13 ÷ 2   | 6       | 1         |
| 6 ÷ 2    | 3       | 0         |
| 3 ÷ 2    | 1       | 1         |
| 1 ÷ 2    | 0       | 1         |

Therefore, **26₁₀ = 11010₂**.  

## PROGRAM SPECIFICATIONS  
Declare a class called `Binary` with the following parts:  

### Part I: Implement the `toBinaryString` Method
1. Write a method with the header:  
   ```java
   public static String toBinaryString(int decimal)
   ```
2. Declare a `String` variable called `binary` and initialize it to an empty string.

3. Use a `while` loop to apply the division algorithm described above.

4. In the loop, concatenate the remainders to binary.

5. Return `binary`.

### Part II: Implement the `main` Method
1. Create a `Scanner` object to read user input.

2. Use a do-while loop to prompt the user until they enter a non-negative integer.

3. Call the `toBinaryString` method to convert the user's input to `binary` and print the result.

## SAMPLE OUTPUT
```
This program converts decimal numbers to binary!
Please enter a non-negative integer:
26
Decimal: 26
Binary: 11010
```

## CODING STANDARDS
- Adhere to Java naming conventions for identifiers.

- Remove any auto-generated comments.

- Use JavaDoc to document your code.

- Attribute yourself as the author using the `@author` tag.

- Ensure the output is user-friendly, easy to read, and understandable.
