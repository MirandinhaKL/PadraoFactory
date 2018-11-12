
package PadraoFactory;

/*
 * No diagrma de classes do padrão Factory, no material em anexo, essa interface
 * seria Product. 
 * Aqui deveriam ser inseridos todos os métodos que seriam os mesmos para as 
 * várias formas geométricas apresentadas no painel de formas, por exemplo: 
 * editarForma, removerForma, mudar cor, etc.
 */

public interface Forma {
    
    /**
     * Método que desenha a forma geométrica na tela.
     * @return String com a criação da forma.
     */
    String desenhaForma();
    
}
