# FILE_HANDLING_UTILITY

**COMPANY:** CODTECH IT SOLUTIONS

**NAME:** ROSHITHA SRI APPARI

**INTERN ID:** CT08DM1273

**DOMAIN:** JAVA PROGRAMMING

**DURATION:** 8 WEEKS

**MENTOR:** NEELA SANTOSH

---

**DESCRIPTION:**

During my internship at **CodTech**, I was assigned a project to develop a basic **File Handling Utility** using **Java**. The objective was to create a simple, console-based tool that could demonstrate core file operations—writing to a file, reading from it, and modifying its content. The main focus was to keep the application beginner-friendly and demonstrate clean, modular coding practices using Java’s standard libraries.

---

**What the Tool Does:**

The utility works with a text file named `example.txt` and provides a menu-driven interface with the following four options:

1. **Write text to the file**
2. **Read and display the file’s contents**
3. **Modify the file by replacing a specific word**
4. **Exit the program**

Users interact with the tool by entering the corresponding number for their chosen operation. After each operation, the menu is re-displayed, allowing continuous interaction until the user decides to exit. This interactive loop ensures a smooth and user-friendly experience.

---

**How I Built It:**

I developed the utility using **core Java classes only**, without relying on any third-party libraries. The key classes and features used in the program include:

* `Scanner` for reading user input from the console
* File I/O classes such as `FileReader`, `FileWriter`, `BufferedReader`, and `BufferedWriter` for handling file reading and writing
* `java.nio.file` package for performing modern file operations like reading all bytes and checking file existence

The program follows a modular design with each core function encapsulated in its own method:

* **Writing to the file:** This feature prompts the user to input a line of text, which is then saved to `example.txt`, replacing any existing content. I used `BufferedWriter` with a `FileWriter` in a try-with-resources block to ensure efficient and safe writing.

* **Reading the file:** The read option uses `BufferedReader` to read each line of the file and print it to the console. This is particularly helpful for verifying what is currently stored in the file.

* **Modifying the file:** This feature allows users to perform a basic "search and replace" operation. It reads the full file content into a string, replaces all occurrences of a target word with a new word, and writes the updated content back. This is achieved using `Files.readAllBytes()` and `Files.write()` for simplicity and efficiency.

---

**Error Handling and Robustness:**

One of the key aspects I focused on was **robust error handling**. For instance, if a user tries to read or modify the file before it has been created, the application gracefully informs them to write something first, rather than throwing an exception. I also used **try-with-resources** for managing all file streams, ensuring that resources are automatically closed and potential memory leaks are avoided.

---

**Tools and Environment:**

I wrote and tested this project using **JDoodle**, a web-based online compiler for Java. JDoodle provided a convenient and efficient environment to compile, run, and debug the code without setting up a local Java development environment. This helped accelerate development and made it easy to iterate on improvements quickly.

---

**What I Learned:**

This project helped me gain practical hands-on experience with **Java file handling** and gave me a clear understanding of how file streams, error handling, and user interaction work together in real applications. It taught me the importance of modular code design and gave me confidence in building command-line tools using just the standard Java libraries.

More importantly, I learned how to think from a user’s perspective—building an interface that is not just functional but also intuitive and fault-tolerant. This experience forms a strong foundation for more advanced projects involving file manipulation, data processing, or command-line utilities.

---
**OUTPUT:**

![Image](https://github.com/user-attachments/assets/47ff8870-7ef6-44d6-8464-8c1b3670b70a)
