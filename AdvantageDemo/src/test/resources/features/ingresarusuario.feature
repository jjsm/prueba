@Author:John_Soto

Feature: Ingresar Usuario Registrado

  Como usuario
  Yo quiero ingresar al  perfil de la pagina
  para hacer las compras


  Rule: Ingresar el usuario con credenciales correctas
    Background:
      Given El usuario quiere ingresar a la pagina
      When necesita hacer una compra para registrarse
        | username       | email           | password | confirm_password | first_name | last_name | phone_number | country  | city     | address        | state     | postal_code |
        | user4004040404 | email@email.com | Jjsm606  | Jjsm606          | John       | Soto      | 3206457046   | Colombia | Medellin | Transversal 38 | antioquia | 1234567890  |
      And salir del sistema

    Scenario Outline: Ingresar Usuario correctamente
      When necesita hacer una compra y debe ingresar con sus credenciales
        | username   | password   |
        | <username> | <password> |
      Then el sistema valida el ingreso exitoso
        | username   |
        | <username> |

      Examples:
        | username       | password |
        | user4004040404 | Jjsm606  |

  Rule: Ingresar el usuario con credenciales incorrectas

    Scenario Outline: Ingresar Usuario registrado con password incorrectamente
      Given El usuario quiere ingresar a la pagina
      When necesita hacer una compra y debe ingresar con sus credenciales
        | username   | password   |
        | <username> | <password> |
      Then el sistema valida el ingreso no exitoso
        | message   |
        | <message> |

      Examples:
        | username       | password | message                          |
        | user4004040404 | sdgff    | Incorrect user name or password. |
