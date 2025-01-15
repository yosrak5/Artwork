# ArtSearchApp

ArtSearchApp is a Spring Boot-based application that allows users to search for artworks from the [Art Institute of Chicago API](https://api.artic.edu/docs/). It includes a simple frontend for user interaction.

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

To document your project on GitHub, you'll create a well-structured repository with a detailed README.md file. Follow these steps to make it beginner-friendly and informative:

1. Prepare Your Repository
Create a Repository on GitHub:

Go to your GitHub account.
Click on New Repository.
Enter a name (e.g., ArtSearchApp).
Optionally, add a description (e.g., "A Spring Boot application for searching artworks with a simple frontend").
Initialize with a .gitignore for Java and optionally add a license.
Push Your Project to GitHub: If your project isn’t already a Git repository:

bash
Copy code
git init
git add .
git commit -m "Initial commit"
git branch -M main
git remote add origin <your-repo-URL>
git push -u origin main
2. Write the README.md File
Create a README.md file in your project root. Here’s an example template:

markdown
Copy code
# ArtSearchApp

ArtSearchApp is a Spring Boot-based application that allows users to search for artworks from the [Art Institute of Chicago API](https://api.artic.edu/docs/). It includes a simple frontend for user interaction.

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
src/ ├── main/ │ ├── java/tn/esprit/artsearch/ │ │ ├── Config/ │ │ ├── controller/ │ │ ├── entity/ │ │ ├── Service/ │ ├── resources/ │ │ ├── static/ │ │ │ ├── index.html │ │ │ ├── styles.css │ │ │ └── script.js │ │ └── application.properties
---

## Getting Started
### Prerequisites
- **Java 17+**
- **Maven**
- **Spring Boot**
- **Git**

### Installation
1. Clone the repository:
   ```bash
   git clone <repository-url>
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
- GET /artworks: Fetch artworks based on a search query.
  Parameters: query (String) - Search term.
  Example: /artworks?query=Monet
