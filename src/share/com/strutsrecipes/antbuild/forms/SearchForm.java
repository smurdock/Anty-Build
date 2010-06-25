package com.strutsrecipes.antbuild.forms;

import org.apache.struts.action.ActionForm;


public class SearchForm extends ActionForm {
	String symbol;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

}
