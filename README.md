Factory-Robot-Hazard-Analyzer
🤖 Factory Robot Hazard Analyzer
📌 Overview
The Factory Robot Hazard Analyzer is a structured system designed to evaluate robot safety risks in an industrial environment.
It is implemented using a Use Case (UC) based incremental development approach, where each UC adds a new feature to the system.

🧩 Use Case Details
🟢 UC1: System Initialization
🎯 Objective
Display a system title when the program starts.

💡 Description
This use case ensures the user understands the system they are interacting with.

📌 Output Behavior
Displays a welcome banner
Indicates system startup
🟢 UC2: Accept and Display Input
🎯 Objective
Collect robot hazard parameters from the user.

💡 Description
The system takes the following inputs:

Arm precision value
Worker density in factory
Machine condition (Worn / Faulty / Critical)
📌 Output Behavior
Accepts user inputs
Displays confirmation after successful input
🟢 UC3: Refactor Logic into Auditor Module
🎯 Objective
Separate hazard calculation logic into a dedicated module.

💡 Description
This improves system structure by isolating calculation logic from input handling.

📌 Benefits
Better code organization
Easier maintenance
Reusability of logic
🟢 UC4: Custom Exception Handling
🎯 Objective
Introduce a custom exception for invalid hazard inputs.

💡 Description
This ensures the system can handle incorrect or unsafe input values gracefully.

📌 Benefits
Strong error handling
Improved system reliability
Clear error messages
🟢 UC5: Input Validation with Exception Handling
🎯 Objective
Validate all user inputs before processing.

💡 Description
The system checks:

Arm precision must be within valid range
Worker density must be within allowed limits
Machine state must be valid (Worn, Faulty, Critical)
📌 Benefits
Prevents invalid calculations
Ensures system safety
Avoids runtime errors
🟢 UC6: Hazard Risk Calculation Enhancement
🎯 Objective
Improve accuracy of hazard risk scoring.

💡 Description
Risk is computed using weighted factors based on:

Robot arm precision
Worker density
Machine condition risk level
📌 Outcome
More realistic hazard evaluation
Better simulation of industrial conditions
🟢 UC7: User-Friendly Output Integration
🎯 Objective
Display a structured hazard report.

💡 Description
All inputs and calculated risk values are combined into a readable report format.

📌 Output Includes
Arm precision value
Worker density
Machine condition
Final hazard risk score
🟢 UC8: Graceful Program Termination
🎯 Objective
Ensure proper system shutdown.

💡 Description
The system closes resources and terminates safely after execution.

📌 Benefits
Prevents resource leaks
Provides clean exit experience
Professional system behavior
🏗️ Overall System Flow
UC1 → System Startup
UC2 → Input Collection
UC3 → Logic Separation
UC4 → Exception Creation
UC5 → Input Validation
UC6 → Risk Calculation
UC7 → Final Report Generation
UC8 → System Shutdown

⚙️ Technologies Used
Java (Console Application)
Object-Oriented Programming (OOP)
Exception Handling
Modular Design Principles
📈 Future Enhancements
GUI-based monitoring dashboard
IoT sensor integration for real-time data
Database logging of hazard reports
AI-based predictive risk analysis
Cloud-based factory monitoring system
