# Lab 1.7 Chat (Part 2)

## Instructions

You are going to write a program that you can have a conversation with. This program will evolve over several labs. In this version you will be able to say (or rather, type) something to your program and it will respond appropriately.

All Java programs start by executing the main method. This is where you will always write the code that "bootstraps" your program.

This particular program will greet the user with a friendly message, then allow the user to type something into the program. It will then *process* that input to generate a response and output the response to the user.


### Part 1: Startup Code

The starter code is setup to read a line of text from the user and pass that text to the process method. It then outputs the response to the screen.

You will update this method to keep reading input from the user until the user enters a blank message (they just press enter without typing anything else)

You want to write code in the main method that follows the following algorithm:

get data from the user

while that data is not the empty string
* process it
* output the response
* get more data from the user

You can test this code by running it and typing several messages into your program. It should keep saying "That's interesting." until you enter an empty string by just pressing the enter key. For example:

```
Hello.
Hi
That's interesting.
I like tacos
That's interesting.
Your face is interesting!
That's interesting.
```

### Part 2: process

The process method is setup to just return a single message. You should change it so that it returns the response "Sleep1 That's where I'm a viking!" if the message contains the word "sleep".

For example:

```
Hello.
I want to go to sleep
Sleep! That's where I'm a viking!
```

However, it won't quite work because the findKeyword method isn't programmed correctly (yet).

Notice the findKeyword method is declared later in the program:

```
public static int findKeyword(String message, String keyword)
```

Read the comment associated with that method to learn what it is *supposed* to do so that you can call it appropriately in the process method. How can you use that method to determine whether the word "sleep" is in message or not?

### Part 4: findKeyword

The findKeyword method will identify the index of a keyword in a message, but it will ignore the keyword if it is inside another word.

Consider these examples:

* findKeyword("I will sleep when I'm tired", "sleep") -> 2
* findKeyword("Are you asleep", "sleep") -> -1
* findKeyword("sleeping is for the birds", "sleep") -> -1
* findKeyword("sleep sleep sleep", "sleep") -> 0

To accomplish this your code needs to check for the following situations

* Does the message contain they keyword at all?
* Is the character before the keyword a space?
* Is the character after the keyword a space?

Make sure you check for the situation where the keyword is the first word in the message and when it is the last word in the message! (Hint: there isn't a character before the first word in the message and there isn't a character after the last word in the message)

For testing, break this problem down into smaller problems:

* Just find the index of the keyword, regardless of what characters come before or after it
* Make it find the word if it is in the middle of the message ("xx keyword xx", but not "xx XXkeywordXX xx")
* Make it find the word if it is at the beginning of the message ("keyword xx")
* Make it find the word if it is at the end of the message ("xx keyword")

After you accomplish each of the above goals, test your code to make sure it works. Then move on to the next goal.

## Testing

Run your program and enter different messages. Make sure you get the appropriate response from your program. Make sure to test your code for situations where your if-statements should evaluate to true, and for situations where your if-statement should evaluate to false.

## Grading

This lab will be automatically graded by comparing the output of the program to the expected output. If your output matches the expected output, then you will receive credit for this lab.

## Turning it in

When you have finished this lab, upload it to [MrMayCS.com/turnitin](http://mrmaycs.com/turnitin)
