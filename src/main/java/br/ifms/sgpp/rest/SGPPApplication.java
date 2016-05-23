/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.sgpp.rest;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.core.Application;

/**
 *
 * @author Gustavo
 */
public class SGPPApplication extends Application {
    @Override
	public Map<String, Object> getProperties() {
		Map<String, Object> properties = new HashMap<>();
		// Configura o pacote para fazer scan das classes com anotações REST.
		properties.put("jersey.config.server.provider.packages", "br.ifms.sgpp");
		return properties;
	}
}
