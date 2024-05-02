# Software Testing and Quality Assurance
Lab work and final project for Software Testing and Quality Assurance. Feel free to reference, but avoid copying.

Exploring a diverse range of methodologies for verifying and validating software as well as software-hardware co-design systems, placing a special focus on the intricacies of designing and implementing system-level software. This encompasses System-On-Chip systems, Electronic-Design-Automation tool flows, and embedded systems.

# Project (Software Testing Practices on Mindustry) Overview
This project applies software testing practices to an open-source project, specifically targeting Mindustry, a factory-building game with tower defense and real-time strategy elements. Mindustry allows players to create complex supply chains, construct structures, and defend against enemy attacks. The objective is to thoroughly test various features of the game, identify faults, and propose improvements based on the findings. The primary objective of this project is to demonstrate the application of software testing practices, ***including unit testing, boundary value analysis, control flow testing, data flow testing, and logic-based testing***, on an open-source project like Mindustry. The focus is on testing critical features and functionalities to ensure the game operates as intended and to identify any potential issues or bugs.

## Findings and Results
The project conducted testing on several features of Mindustry, including factory building, initialization, health and damage mechanics, tower defense mechanisms, and more. Test results were documented, including boundary value analysis for specific methods and logic-based testing for various scenarios. The project achieved close to 100% class coverage and 50% line coverage in the tested classes.

## Input Space Partitioning, applying Boundry Value Analysis Testing (onDestroyed() for constructBlock.java)
<img width="800" alt="Screen Shot 2024-05-02 at 5 19 36 PM" src="https://github.com/ark22oct/Software-Testing-and-Quality-Assurance/assets/77360623/05707f45-0b2a-4577-9352-cf77898f0ad2">

## Control Flow Graph (onDestroyed() for constructBlock.java)
<img width="800" alt="Screen Shot 2024-05-02 at 5 25 10 PM" src="https://github.com/ark22oct/Software-Testing-and-Quality-Assurance/assets/77360623/f7526bd0-30a3-41bd-bef9-805190edf806">

## Data Flow Graph (Health.java & LiquidBlock.java)
<img width="800" alt="Screen Shot 2024-05-02 at 5 26 03 PM" src="https://github.com/ark22oct/Software-Testing-and-Quality-Assurance/assets/77360623/b4324777-62b6-42f2-a840-7c3330f3b42b">
<img width="800" alt="Screen Shot 2024-05-02 at 5 33 51 PM" src="https://github.com/ark22oct/Software-Testing-and-Quality-Assurance/assets/77360623/9bc8d5a8-afad-4f20-b356-0a77bb950001">


## Logic Based Testing (onDestroyed() for constructBlock.java)
<img width="800" alt="Screen Shot 2024-05-02 at 5 27 01 PM" src="https://github.com/ark22oct/Software-Testing-and-Quality-Assurance/assets/77360623/5e6529ca-6ca4-4d19-8e7c-3390d0f10bf5">

## Coverage Sample
<img width="800" alt="Screen Shot 2024-05-02 at 5 11 49 PM" src="https://github.com/ark22oct/Software-Testing-and-Quality-Assurance/assets/77360623/ba484f6a-7787-4479-8cd0-e980a0bba4fc">
<img width="800" alt="Screen Shot 2024-05-02 at 5 12 13 PM" src="https://github.com/ark22oct/Software-Testing-and-Quality-Assurance/assets/77360623/b9b18ec5-7524-43aa-a0c0-225ee15605f5">

# Key Objectives:
1. Developing a deep understanding of systematic methods to debug complex object oriented
   programs.
   
2. Be able to develop, maintain, document and execute test cases.
   
3. Understand and implement at different testing levels including unit, integration, system and
   operational acceptance levels.
   
4. Be able to develop documentation for testing exercises and communicate findings with
   developers.
   
5. Consider environmental implications of software programs when testing for operational
   acceptance.
   
6. Plan for software testing projects with continuous integration and test-driven development.
