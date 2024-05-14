# SOLID-with-Design-Pattern

The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.

Currently, the Student object has methods like borrowBook(), borrowJournal() with a parameter of title, which directly depend on specific resource types.

To adhere to the Dependency Inversion Principle (DIP) and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

Your solution should not violate other SOLID principles.

# UML Class Diagram

![SOLID Principles with Design Pattern](https://github.com/lloydestrada/SOLID-with-Design-Pattern/assets/142376663/f8e7d3de-eb85-4801-a826-f475da36be10)
