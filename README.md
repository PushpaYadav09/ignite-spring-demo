# Ignite Spring Boot Demo

This repository contains a minimal but well-structured Spring Boot application created specifically for testing cloud deployments on **Viduli**.  
It is designed to help verify:

- Build and deployment flows  
- Build customization features  
- Automatic rebuilds on GitHub push  
- Free Tier vs Paid Tier behavior  
- Basic runtime functionality and logs  

Although small, the project follows clear structure and production-friendly conventions, making it suitable for QA validation and platform testing.

---

## 🔧 Technology Stack

- **Java 17+**
- **Spring Boot 3.x**
- **Spring Web**
- **Spring Boot Actuator** (optional, included)
- **Maven** (or Maven Wrapper)

This stack ensures fast startup, small build size, and easy cloud deployment.

##  Project Overview

The application exposes two simple endpoints:

1. A JSON response endpoint (`/java-app`)
2. A basic health check endpoint (`/health`)

These endpoints are intentionally minimal to make deployment testing fast and reliable while still validating key platform features such as routing, logs, environment variables, and rebuilds.

##  Project Structure
ignite-spring-demo/

├ src/main/java/com/example/demo/

 │ - DemoApplication.java # Application entry point

 │ - HelloController.java # /java-app endpoint

 │ - HealthController.java # /health endpoint

 | - IgniteSpringDemoApplication.java 

├ src/main/resources/

 │ - application.properties # App configuration

├ pom.xml # Dependencies + Build config

Each class is small and easy to understand , ideal for testing cloud builds.

##  API Endpoints

### **1) `/java-app`**
A simple JSON response used as the primary test endpoint.

**Example Response:**
```json
{
  "status": "ok",
  "message": "Hello from Viduli QA Test!"
}

```
Purpose:

Verify the app deployed successfully

Confirm routing is working

Validate changes after rebuilds
## /health
 Simple text response indicating application health.
``` text
UP
```
Purpose:

Quick readiness check

Used during debugging or verifying instance restarts
