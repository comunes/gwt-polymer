package br.com.rpa.client.api.elements.paper;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

import br.com.rpa.client.api.elements.iron.IronInputElement;

@TagName(PaperInputElement.TAG)
public class PaperInputElement extends IronInputElement {

	public static final String TAG = "paper-input";

	protected PaperInputElement() {
	}

	public static PaperInputElement as(Element elem) {
		String tagName = elem.getTagName();
		assert tagName.equalsIgnoreCase(TAG);
		return (PaperInputElement) elem;
	}

	public final native String getLabel() /*-{
		return this.label;
	}-*/;

	public final native void setLabel(String label) /*-{
		this.label = label;
	}-*/;

	public final native boolean isFocused() /*-{
		return this.focused;
	}-*/;

	public final native boolean isFloatingLabel() /*-{
		return this.floatingLabel;
	}-*/;

	public final native void setFloatingLabel(boolean floatingLabel) /*-{
		this.floatingLabel = floatLabel;
	}-*/;

	public final native String getErrorMessage() /*-{
		return this.error;
	}-*/;

	public final native void setErrorMessage(String errorMessage) /*-{
		this.error = errorMessage;
	}-*/;

	public final native boolean isPressed() /*-{
		return this.pressed;
	}-*/;

}
