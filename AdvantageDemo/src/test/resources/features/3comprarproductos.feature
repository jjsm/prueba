@Author:John_Soto

Feature: Comprar productos

  Como usuario
  Yo quiero seleccionar un producto
  para hacer la compra


  Rule: Realizar compras de productos

    Background:
      Given El usuario quiere ingresar a la pagina
      When necesita hacer una compra y debe ingresar con sus credenciales
        | username    | password |
        | username100 | Jjsm606  |

    Scenario: el usuario hace la compra
      When el usuario selecciona los productos para pagar
      Then el sistema le informa de su compra exitosamente
        | message       |
        | ORDER PAYMENT |


