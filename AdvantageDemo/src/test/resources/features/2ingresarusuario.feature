@Author:John_Soto

Feature: Ingresar Usuario Registrado

  Como usuario
  Yo quiero ingresar al  perfil de la pagina
  para hacer las compras


  Rule: Ingresar el usuario con credenciales correctas


    Scenario Outline: Ingresar Usuario correctamente
      Given El usuario quiere ingresar a la pagina
      When necesita hacer una compra y debe ingresar con sus credenciales
        | username   | password   |
        | <username> | <password> |
      Then el sistema valida el ingreso exitoso
        | username   |
        | <username> |

      Examples:
        | username    | password |
        | username100 | Jjsm606  |
