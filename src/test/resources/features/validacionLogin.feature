@feature1
Feature: Inicio de sesion

  @testLoginCorrecto
  Scenario: Validar el login de la pagina OrangeHrm
    Given estoy en la web "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When ingreso el usuario "Admin"
    And ingreso el password "admin123"
    And presiono el boton Login
    Then valido el ingreso con exito

  @testLoginIncorrecto
  Scenario: Validar el login de forma negativa de la pagina OrangeHrm
    Given estoy en la web "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When ingreso el usuario "Cualquiera"
    And ingreso el password "asdkasdashdh"
    And presiono el boton Login
    Then valido que no se permite el ingreso

  @testCambioContraseña
  Scenario: Validar que al presionar Forgot your password permita realizar la accion indicada
    Given estoy en la web "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When presiono el boton Forgot your password
    And permite ingresar el nombre de usuario
    And presiono el boton ResetPassword
    Then valido que que se envie el correo de recuperacion "Reset Password link sent successfully"