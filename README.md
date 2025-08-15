# 🎯 Mini Project – Online Quiz App

## 📌 Objective
Create a **console-based quiz application** in Java that allows users to answer multiple-choice questions and displays the final score with feedback.

---

## 🛠️ Tools & Technologies
- **Java** (Core Java, OOP concepts)
- **Console Input/Output** (Scanner class)

---

## 📂 Project Structure
OnlineQuizApp.java


---

## 📝 Features
- Multiple-choice questions
- User-friendly console interface
- Automatic score calculation
- Feedback based on performance
- Easy to extend with more questions

---

## 🚀 How to Run
1. **Save the code** in a file named `OnlineQuizApp.java`
2. **Open terminal/command prompt** in the project folder
3. **Compile the program**  
   ```bash
   javac OnlineQuizApp.java


Run the program

java OnlineQuizApp

💻 Sample Output
=== Welcome to the Online Quiz App ===

What is the capital of India?
1. Mumbai
2. New Delhi
3. Kolkata
4. Chennai
Enter your answer (1-4): 2
✅ Correct!

Which language is used for Android app development?
1. Python
2. Kotlin
3. C++
4. Java
Enter your answer (1-4): 2
✅ Correct!

...

=== Quiz Completed ===
Your score: 4/5
👍 Good job! You can do even better!

📜 Code Overview
Question Class

Stores the question text, options, and correct answer

askQuestion() method displays the question and checks correctness

OnlineQuizApp Main Class

Stores an array of Question objects

Loops through each question and records the score

Displays the final result and feedback

✨ Future Improvements

Add timer for each question

Load questions from a file or database

Add levels (Easy, Medium, Hard)

Implement random question order
