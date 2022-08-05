#Autor: Anibal Cotes


@Escenario
Feature: Agregar al carrito
  Yo como usuario
  Deseo agregar productos al carrito
  Para poder visualizar productos deseados
  Scenario: Agregar prouctos
    Given Que el usuario ingresa a la pagina
    When Selecciona los productos
    Then Verifica y realiza acciones en el carrito