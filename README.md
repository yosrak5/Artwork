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

src/
├── main/
│   ├── java/
│   │   └── tn/
│   │       └── esprit/
│   │           └── artsearch/
│   │               ├── Config/
│   │               ├── controller/
│   │               ├── entity/
│   │               ├── Service/
│   ├── resources/
│   │   ├── static/
│   │   │   ├── index.html
│   │   │   ├── styles.css
│   │   │   └── script.js
│   │   └── application.properties

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
