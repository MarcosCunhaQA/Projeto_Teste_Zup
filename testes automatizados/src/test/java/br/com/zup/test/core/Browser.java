package br.com.zup.test.core;

import br.com.zup.test.exceptions.BrowserInvalidoException;

public class Browser {

	private String nome;
	private String propriedade;
	private String arquivo;
	
	public Browser(String nome, String propriedade, String caminho) {
		this.nome = nome;
		this.propriedade = propriedade;
		this.arquivo = caminho;
	}

	public String getNome() {
		return nome;
	}

	public String getPropriedade() {
		return propriedade;
	}

	public String getArquivo() {
		return arquivo;
	}
	
	public static Browser validaBrowser(String navegador) throws BrowserInvalidoException {
		if(navegador.equals("chrome") || navegador.equals("googlechrome")) {
			return new Browser("chrome", "webdriver.chrome.driver", "chromedriver.exe");
		}
		else if(navegador.equals("firefox")) {
			return new Browser("firefox", "webdriver.gecko.driver", "geckodriver.exe"); 
		}
		else if(navegador.equals("MicrosoftEdge")) {
			return new Browser("MicrosoftEdge", "webdriver.edge.driver", "MicrosoftWebDriver.exe");
		}
		else if(navegador.equals("internet explorer")) {
			return new Browser("internet explorer", "webdriver.ie.driver", "IEDriverServer.exe");
		}
		
		throw new BrowserInvalidoException();
}
}
