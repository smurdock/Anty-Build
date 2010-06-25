package com.strutsrecipes.antbuild.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.strutsrecipes.antbuild.beans.Element;
import com.strutsrecipes.antbuild.business.BusinessFacade;
import com.strutsrecipes.antbuild.forms.SearchForm;

public class SearchAction extends Action {
	public ActionForward execute(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response)
		throws Exception {

		SearchForm searchForm = (SearchForm) form;

		BusinessFacade businessFacade = new BusinessFacade();
		Element element = businessFacade.getElement(searchForm.getSymbol());

		if (element != null) {
			request.setAttribute("element", element);
			request.setAttribute("ip", request.getRemoteAddr());;
			return mapping.findForward("success");
		}

        ActionErrors errors = new ActionErrors();
        errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.notfound"));
        saveErrors(request, errors);
		return mapping.getInputForward();
	}

}
