@Author:John_Soto

Feature: Registrar Usuario

  Como usuario
  Yo quiero ingresar al sistema para hacer las compras
  con elcarrito


  Rule: Registrar el usuario con todos los campos requeridos


    Scenario: Registrar Usuario
      Given El usuario quiere ingresar a la pagina
      When necesita hacer una compra para registrarse
      Then el sistema termina de hacer su registro


