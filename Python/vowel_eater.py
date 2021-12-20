##Scenario - 1 
## The continue statement is used to skip the current block and move ahead to the next iteration, without executing the statements inside the loop.
## It can be used with both the while and for loops.
##Your task here is very special: you must design a vowel eater! Write a program that uses:
##  a for loop;
##  the concept of conditional execution (if-elif-else)
##  the continue statement.


# Prompt the user to enter a word
# and assign it to the user_word variable.
user_word = str(input("Enter a word:"))
user_word = user_word.upper()

for letter in user_word:
    # Complete the body of the for loop.
    if letter=="A":
        continue
    elif letter=="E":
        continue
    elif letter=="I":
        continue
    elif letter=="O":
        continue
    elif letter=="U":
        continue
    print(letter)
    
## Scenario 2

## Your task here is even more special than before:
#  you must redesign the (ugly) vowel eater from the previous
#  lab (3.1.2.10) and create a better, upgraded (pretty) vowel eater


word_without_vowels = ""

# Prompt the user to enter a word
# and assign it to the user_word variable.
user_word = str(input("Enter a word:"))
user_word = user_word.upper()

for letter in user_word:
    if letter == 'A':
        word = letter
        continue
    elif letter == 'E':
        continue
    elif letter == 'I':
        continue
    elif letter == 'O':
        continue
    elif letter == 'U':
        continue
    else:
        word_without_vowels+=letter

print(word_without_vowels)