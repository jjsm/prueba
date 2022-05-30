@Author:John_Soto

Feature: Comprar productos

  Como usuario
  Yo quiero seleccionar un producto
  para hacer la compra


  Rule: Realizar compras de productos

    Background:
      Given El usuario quiere ingresar a la pagina
      When necesita hacer una compra para registrarse
        | username    | email           | password | confirm_password | first_name | last_name | phone_number | country  | city     | address        | state     | postal_code |
        | username100 | email@email.com | Jjsm606  | Jjsm606          | John       | Soto      | 3206457046   | Colombia | Medellin | Transversal 38 | antioquia | 1234567890  |

    Scenario: el usuario hace la compra
      When el usuario selecciona los productos para pagar



