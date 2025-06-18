# WireMock Mock API Server for Angular

This project provides a WireMock server for mocking backend APIs during Angular development.

## Prerequisites
- Java 8 or higher
- Maven

## Project Structure
- `mappings/` — Place your mock API JSON files here.
- `__files/` — Place static files (if needed) here.
- `src/main/java/ngdemo_api_mock/Main.java` — Main entry point for the WireMock server.

## Common Commands

### Clean and Build the Project
```
mvn clean install
```

### Run the WireMock Server (default port 8080)
```
mvn exec:java
or
mvn exec:java -Dexec.mainClass=ngdemo_api_mock.Main
```

### Change the Server Port
Edit `src/main/java/ngdemo_api_mock/Main.java`:
```
WireMockServer wireMockServer = new WireMockServer(options().port(8080).usingFilesUnderDirectory("."));
```
Change `8080` to your desired port (e.g., `3000`).

### Add or Update Mock APIs
- Add or edit JSON files in the `mappings/` directory.
- **Restart the server** after making changes for them to take effect.

### Example Endpoints
- Health check: `GET http://localhost:8080/heartbeat`
- Employees list: `GET http://localhost:8080/employees`

## Troubleshooting
- If you get `ECONNREFUSED`, make sure the server is running.
- If a new mapping is not recognized, restart the server.

## Useful Links
- [WireMock Documentation](http://wiremock.org/docs/)
