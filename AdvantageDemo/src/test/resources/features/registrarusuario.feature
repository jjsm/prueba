@Author:John_Soto

Feature: Registrar Usuario

  Como usuario
  Yo quiero ingresar al sistema para hacer las compras
  con elcarrito


  Rule: Registrar el usuario con todos los campos requeridos
    Scenario Outline: Registrar Usuario nuevo
      Given El usuario quiere ingresar a la pagina
      When necesita hacer una compra para registrarse
        | username   | email   | password   | confirm_password   | first_name   | last_name   | phone_number   | country   | city   | address   | state   | postal_code   |
        | <username> | <email> | <password> | <confirm_password> | <first_name> | <last_name> | <phone_number> | <country> | <city> | <address> | <state> | <postal_code> |
      Then el sistema termina de hacer su registro
        | username   |
        | <username> |

      Examples:
        | username     | email           | password | confirm_password | first_name | last_name | phone_number | country  | city     | address        | state     | postal_code |
        | user77770707 | email@email.com | Jjsm606  | Jjsm606          | John       | Soto      | 3206457046   | Colombia | Medellin | Transversal 38 | antioquia | 1234567890  |

  Rule: Registrar el usuario con todos los campos requeridos repitiendo nombre de  usuario
    Scenario Outline: Registrar Usuario repetido
      Given El usuario quiere ingresar a la pagina
      When necesita hacer una compra para registrarse
        | username   | email   | password   | confirm_password   | first_name   | last_name   | phone_number   | country   | city   | address   | state   | postal_code   |
        | <username> | <email> | <password> | <confirm_password> | <first_name> | <last_name> | <phone_number> | <country> | <city> | <address> | <state> | <postal_code> |
      Then el sistema no termina de hacer su registro
        | message   |
        | <message> |

      Examples:
        | username     | email           | password | confirm_password | first_name | last_name | phone_number | country  | city     | address        | state     | postal_code | message                                                                             |
        | user77770707 | email@email.com | Jjsm606  | Jjsm606          | John       | Soto      | 3206457046   | Colombia | Medellin | Transversal 38 | antioquia | 1234567890  | I agree to the www.AdvantageOnlineShopping.com Conditions of Use and Privacy Notice |
