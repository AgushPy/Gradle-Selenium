# Background va a ser una funcion utilizada para dar por entendido una funcionalidad que se va a hacer en todos los scenarios

Feature: Probar la busqueda en Google

# Rule nos va a decir que regla de negocio estamos buscando ejecutar
# Rule: Navegacion en google

# Background: Ingresar a google
#     Given navego en google
    @Test
    Scenario Outline:  Busco algo en google.
        Given navego en google
        When busco <valorBuscar> algo
        And toco boton de busqueda
        Then obtengo resultado

        Examples:
        |valorBuscar|
        |JavaGod|