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

**1. Version Control System (VCS):**

Developers commit code changes to a version control system like Git.

**2. Continuous Integration (CI) with Jenkins:**

Jenkins monitors the VCS for changes.
Upon detecting a change, Jenkins triggers the build process, compiles the code, and runs unit tests to ensure code quality.


**3. Code Quality Analysis with SonarQube:**

After a successful build, Jenkins integrates with SonarQube.
SonarQube analyzes the code for potential bugs, vulnerabilities, and code smells, providing feedback to developers and ensuring high-quality code.
Artifact Management with Nexus:

**4. Containerization with Docker:**

Jenkins uses Docker to containerize the application, ensuring consistency across different environments (development, staging, production).
Docker images are built using the artifacts stored in Nexus.
Deployment to Staging Environment:

The Docker container, containing the application, is deployed to a staging environment that mirrors production, allowing for thorough testing.

**5. Monitoring with Prometheus and Grafana:**

Prometheus collects metrics from the application and infrastructure, while Grafana visualizes these metrics.
Alerts are configured to notify the team of any anomalies or performance issues.
