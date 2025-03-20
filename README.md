# EmployeeApp

EmployeeApp is an employee management project developed with Spring Boot, DAO, and JSP.

## :clipboard: Requirements
> [!NOTE]
>
> To run the project, you need:
>
>- **Java 17** or a higher version.
>- **MySQL** with an active database.
>- The file `schema-MySql.sql` located in `src/main/resources` contains the necessary operations to create the schema and the table in the database.

## :gear: Database Configuration

1. Create a database in MySQL to store employee data.
2. In the file `EmployeeDAOImpl` located at `src/main/java/edu/uptc/swii/employeeapp/service/EmployeeDAOImpl.java`, modify the `USER` and `PASSWORD` variables with your MySQL database credentials.

   ```java
    private static final String USER = "your_user";
    private static final String PASSWORD = "your_password";

## :gear: Port Configuration

1. Create the `application.properties` file in the `src/main/resources` directory and set the desired port for running the application. Refer to the configuration in the `application-example.properties` file located in the same directory as an example.

## :heavy_check_mark: Running the Project

1. Download the project and ensure it is in an appropriate location.
2. Open the project in your preferred IDE.
3. Run the main file `EmployeeappApplication.java` located at `src/main/java/edu/uptc/swii/employeeapp`.

The application will run at the URL `http://localhost:PORT`, where `PORT` is the value you configured earlier in the `application.properties` file.

## :handshake: Contributors

Project created by:

### - Juan David Ochoa
[![Github](https://img.shields.io/badge/github-%2324292e.svg?&style=for-the-badge&logo=github&logoColor=white)](https://github.com/JuanDavid0)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/juan-david-ochoa-pinilla/)
### - William Cely
[![Github](https://img.shields.io/badge/github-%2324292e.svg?&style=for-the-badge&logo=github&logoColor=white)](https://github.com/WilliamC111)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/williamcelyl%C3%B3pez/)
### - Andrés Maldonado
[![Github](https://img.shields.io/badge/github-%2324292e.svg?&style=for-the-badge&logo=github&logoColor=white)](https://github.com/AndresMaldonado200338)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/amaldonados/)