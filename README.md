# ArtSearchApp

ArtSearchApp is a Spring Boot-based application that allows users to search for artworks from the [Art Institute of Chicago API](https://api.artic.edu/docs/). It includes a simple frontend for user interaction.


![image](https://github.com/user-attachments/assets/6a4e0b35-64e9-4918-83e0-dc9b2adff633)

---

## Features
- **Backend**: Built with Spring Boot, includes REST APIs to fetch artwork data.
- **Frontend**: Simple HTML, CSS, and JavaScript for user interaction.
- **API Integration**: Fetches data from the Art Institute of Chicago's public API.

---

## Technologies Used
- **Backend**: Java, Spring Boot
- **Frontend**: HTML, CSS, JavaScript
- **API Client**: RestTemplate
- **Tools**: IntelliJ IDEA, Git, GitHub

---

## Directory Structure
![image](https://github.com/user-attachments/assets/066abfc2-b249-44d2-9d0b-5505255edee1)


## Getting Started
### Prerequisites
- **Java 17+**
- **Maven**
- **Spring Boot**
- **Git**

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yosrak5/Artwork.git
   cd ArtSearchApp
     ```
2. Build the project:
    ```bash
   mvn clean install
     ```
3. Run The Project
   ```bash
   mvn spring-boot:run
     ```
4. Open the app in a browser:
   http://localhost:8080
## API Documentation
### Endpoints

**GET /artworks**
Fetch artworks based on a search query.
- `query` (String): Search term to filter artworks.

**GET /artworks?query=Monet**

This will fetch artworks related to "Monet".
# CI/CD Suggestions for the Project

To streamline the development process, automate testing, and ensure reliable deployments, the following CI/CD practices are recommended for this project.

1. Automated Build Process
Use of automation tools like **Jenkins** to automatically build the project every time code is pushed to the repository.


2. Automated Testing
- **Unit Tests**: Integration of  **JUnit** into the CI pipeline to run automated tests on every code update.

3. Code Quality Checks
Integration of **SonarQube** into the pipeline to automatically analyze code quality, detect bugs, vulnerabilities, and enforce coding standards.

4. Automated Deployment 
Use of  **Docker** to containerize the application, ensuring consistent environments across development, staging, and production.

5. Monitoring and Alerts
- **Prometheus/Grafana**: Integration of  **Prometheus** for application monitoring and **Grafana** for visualization. This will allow for monitoring the application's performance and health after deployment.
- **Alerting**: Setying  up **alerting** mechanisms to notify the team in case of build failures, test failures, or production downtime via tools like **Slack** or **Email**.





