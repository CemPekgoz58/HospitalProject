# Hospital Appointment System

This is a simple Java Swing desktop application for managing hospital patient appointments. It allows users to add, view, query, and cancel patient appointments linked to doctors.

## Features

- Add new patient appointments with Patient ID, Name, Surname, and assigned Doctor.
- View all appointments in a table.
- Query appointments by Doctor name or Patient ID.
- Cancel selected appointments.
- Refresh the appointment list.
- Uses MySQL database for storing patient and appointment data.

## Technologies Used

- Java (JDK 8+)
- Java Swing for GUI
- MySQL database
- JDBC for database connection

## How to Run

1. Make sure you have Java and MySQL installed.
2. Create a database and a table named `Patients` with appropriate columns (`PatientID`, `PatientName`, `PatientSurname`, `DoctorName`).
3. Configure your database connection details in the `DBConnection.java` file.
4. Build and run the project using your preferred IDE or command line.
5. Use the GUI to manage patient appointments.

## Note

- The `DBConnection.java` file is excluded from the repository via `.gitignore` to protect your database credentials.
- Make sure to configure the database connection before running.

## Author

Cem Pekgöz
