package br.com.kotrix.capitulo_07_06;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import br.com.kotrix.capitulo_07_06.modelo.Produto;


public class SalvandoProduto {

	public static void main(String[] args) throws FileNotFoundException {
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("produto", Produto.class);
		// Outra forma de fazer
		xstream.aliasAttribute(Produto.class, "codigo", "codigo");
		
		Produto sabonete = new Produto(1L, "Sabonete", new BigDecimal("2.30"));
		
		String xml = xstream.toXML(sabonete);
		System.out.println(xml);
		
		// Transformar em um arquivo XML, o arquivo FileOutputStream requer throws FileNotFoundException
		OutputStream os = new FileOutputStream("./produto2.xml");
		xstream.toXML(sabonete, os);
	}
}
