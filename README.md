# InnovaTech - Microservicio de Proyectos

## Descripción

Microservicio encargado de la gestión de proyectos dentro de la plataforma InnovaTech.

Permite administrar la información relacionada con proyectos, facilitando la creación, consulta, actualización y eliminación de registros mediante una API REST.

Forma parte de una arquitectura de microservicios compuesta por:

- Frontend
- Backend For Frontend (BFF)
- Microservicio de Proyectos
- Microservicio de Usuarios
-Microservicio de monitoreo

---

## Tecnologías

- Java 23
- Spring Boot
- Spring Data JPA
- Maven
- REST API
- JUnit 5
- Mockito

---

## Arquitectura

                                 Frontend
                                    │ 
                                    ▼
                                   BFF
                                    │
Microservicio Recursos  ────────────├──────────── Microservicio Monitoreo
                                    ├
                                    ├
                          Microservicio Proyectos
