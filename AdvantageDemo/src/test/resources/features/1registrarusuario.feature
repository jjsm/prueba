@Author:John_Soto

Feature: Registrar Usuario

  Como usuario
  Yo quiero ingresar al sistema para hacer las compras
  con elcarrito


  Rule: Registrar el usuario con todos los campos requeridos


    Scenario Outline: Registrar Usuario
      Given El usuario quiere ingresar a la pagina
      When necesita hacer una compra para registrarse
        | username   | email   | password   | confirm_password   | first_name   | last_name   | phone_number   | country   | city   | address   | state   | postal_code   |
        | <username> | <email> | <password> | <confirm_password> | <first_name> | <last_name> | <phone_number> | <country> | <city> | <address> | <state> | <postal_code> |
      Then el sistema termina de hacer su registro
        | username   |
        | <username> |

      Examples:
        | username    | email           | password | confirm_password | first_name | last_name | phone_number | country  | city     | address        | state     | postal_code |
        | username100 | email@email.com | Jjsm606  | Jjsm606          | John       | Soto      | 3206457046   | Colombia | Medellin | Transversal 38 | antioquia | 1234567890  |




