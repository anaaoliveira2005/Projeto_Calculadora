package calculadora;

/**
 * Classe responsável por executar testes funcionais da classe
 * {@link Calculadora}.
 *
 * <p>Os testes realizados verificam:</p>
 *
 * <ul>
 *     <li>Operações matemáticas válidas</li>
 *     <li>Tratamento de divisão por zero</li>
 *     <li>Tratamento de operadores inválidos</li>
 * </ul>
 *
 * <p>O objetivo desta classe é validar o comportamento esperado
 * dos métodos da calculadora.</p>
 *
 * @author Seu Nome
 * @version 1.0
 */

public class TesteCalculadora {

    /**
     * Método principal responsável por executar os testes
     * da aplicação.
     *
     * @param args argumentos da linha de comando
     */
    public static void main(String[] args) {

        // Instância da calculadora utilizada nos testes
        Calculadora calculadora = new Calculadora();

        // Testes das operações válidas
        System.out.println(calculadora.calcular(2, 3, "+")); // esperado: 5

        System.out.println(calculadora.calcular(10, 4, "-")); // esperado: 6

        System.out.println(calculadora.calcular(3, 5, "*")); // esperado: 15

        System.out.println(calculadora.calcular(8, 2, "/")); // esperado: 4

        // Teste de exceção para divisão por zero
        try {

            calculadora.calcular(8, 0, "/");

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
        }

        // Teste de exceção para operador inválido
        try {

            calculadora.calcular(5, 5, "x");

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
        }
    }
}