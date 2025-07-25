@feature1
Feature: Inicio de sesion

  @testLogin
  Scenario: Validar el login de la pagina OrangeHrm
    Given estoy en la web "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When ingreso el usuario "Admin"
    And ingreso el password "admin123"
    And presiono el boton Login
    Then valido el ingreso con exito