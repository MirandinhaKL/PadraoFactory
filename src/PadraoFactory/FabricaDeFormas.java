package PadraoFactory;

/*
 * No diagrma de classes do padrão Factory, no material em anexo, essa classe
 * seria Factory. É aqui que é implementada a lógica que criará o objeto
 * adequado quando o usuário clicar na tela, sobre uma determinada forma.
 */
public class FabricaDeFormas {

    /**
     * Método que retorna um objeto do tipo Forma.
     *
     * @param tipoDeForma String.
     * @return objeto do tipo forma.
     */
    public static Forma makeForma(String tipoDeForma) {
        if (tipoDeForma == null) {
            return null;
        }
        if (tipoDeForma.equalsIgnoreCase("CIRCULO")) {
            return new Circulo();

        } else if (tipoDeForma.equalsIgnoreCase("RETANGULO")) {
            return new Retangulo();

        } else if (tipoDeForma.equalsIgnoreCase("QUADRADO")) {
            return new Quadrado();
        }

        return null;
    }
}
