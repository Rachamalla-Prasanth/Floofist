# Floofist
SendGrid Integration with Spring Boot
This is a sample Spring Boot project that demonstrates how to integrate SendGrid, a cloud-based email delivery and management service, with a Spring Boot application.

Prerequisites
Before you begin, make sure you have the following:

A SendGrid account with API key
Java Development Kit (JDK) version 8 or later installed on your system
Spring Boot version 2.5.0 or later installed on your system
Apache Maven build tool installed on your system
Setup
To set up the project, follow these steps:

Clone the project from the GitHub repository:

Copy code
git clone https://github.com/your-username/your-project.git
Open the project in Eclipse or your preferred IDE.

Create a new file called application.properties in the src/main/resources folder, and add the following line to it, replacing your-api-key-here with your SendGrid API key:

Copy code
sendgrid.api.key=your-api-key-here
Save the application.properties file.
Usage
To use the project, follow these steps:

Run the Spring Boot application by executing the following Maven command:
Copy code
mvn spring-boot:run
Navigate to http://localhost:9003/send-email in your postman.

Enter the email details, including the recipient's email address, subject, and message in the request body and send the request.

Check your email inbox to verify that the email was sent successfully.

Conclusion
Congratulations! You have successfully integrated SendGrid with a Spring Boot project and sent an email using the SendGrid API. Feel free to modify the project to suit your specific use case, and explore the many features and capabilities of the SendGrid service.
