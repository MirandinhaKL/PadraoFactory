package PadraoFactory;

import testeformas.FXMLDocumentController;

/*
 * No diagrma de classes do padrão Factory, no material em anexo, essa classe 
 * seria ConcretProduct. Está classe concreta tem a função de implemntar todos 
 * os métodos que são apresentados na interface Forma.
 */
public class Quadrado implements Forma {
    
    FXMLDocumentController controller;

    @Override
    public String desenhaForma() {
       return "Desenha um quadrado na tela.";
    }
}
