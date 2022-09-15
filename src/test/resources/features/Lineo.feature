@Linio
Feature: Login Linio
  Yo, como usuario
  Quiero, iniciar sesión y validar Access Denied y despues
  Para añadir un producto al carrito de compras sin iniciar sesion


  @linioAccessDenied
  Scenario:Inicio de sesion en linio y valido un producto
    Given que me encuentro en la página de login de linio
    When ingreso el email "angelzapataPrueba@gmail.com" y ingreso la contraseña "Prueba123"


  @linioSinSession
    Scenario: Ingresar a lineo y añadir un producto al carrito
    Given que me encuentro en la pagina linio
    When hago clic en Remate
    And hago clic en un producto
    And Añadir al carrito
    Then valido el producto agregado "Tu producto se agregó al carrito"

