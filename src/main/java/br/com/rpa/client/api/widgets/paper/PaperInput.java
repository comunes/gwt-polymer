package br.com.rpa.client.api.widgets.paper;

import br.com.rpa.client.api.elements.paper.PaperInputElement;
import br.com.rpa.client.api.widgets.iron.IronInput;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;

public class PaperInput extends IronInput {

	public PaperInput() {
		this(Document.get().createElement(PaperInputElement.TAG));
	}

	protected PaperInput(Element elem) {
		super(elem);
		// Assert that the element is attached.
		assert PaperInputElement.as(elem).getTagName().equalsIgnoreCase(PaperInputElement.TAG);
	}

	public String getLabel() {
		return getPaperElement().getLabel();
	}

	public void setLabel(String label) {
		getPaperElement().setLabel(label);
	}

	public String getErrorMessage() {
		return getPaperElement().getErrorMessage();
	}

	public void setErrorMessage(String errorMessage) {
		getPaperElement().setErrorMessage(errorMessage);
	}

	public boolean isFocused() {
		return getPaperElement().isFocused();
	}

	public boolean isPressed() {
		return getPaperElement().isPressed();
	}

	public boolean isFloatingLabel() {
		return getPaperElement().isFloatingLabel();
	}

	public void setFloatingLabel(boolean floatLabel) {
		getPaperElement().setFloatingLabel(floatLabel);
	}

	private PaperInputElement getPaperElement() {
		Element elem = super.getElement();
		return elem.cast();
	}
}
