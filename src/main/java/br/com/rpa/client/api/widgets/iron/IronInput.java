package br.com.rpa.client.api.widgets.iron;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.TextBoxBase;

import br.com.rpa.client.api.elements.iron.IronInputElement;

public class IronInput extends TextBoxBase {
	private boolean valueChangeHandlerInitialized = false;

	public IronInput() {
		this(Document.get().createElement(IronInputElement.TAG));
	}

	protected IronInput(Element elem) {
		super(elem);
	}

	public boolean isEmpty() {
		String value = getValue();
		if((value == null) || (value.isEmpty())) {
			return true;
		}
		return false;
	}

	@Override
	public String getText() {
		return getCoreElement().getInputValue();
	}

	@Override
	public void setText(String text) {
		setValue(text);
	}

	@Override
	public String getValue() {
		return getCoreElement().getValue();
	}

	@Override
	public void setValue(String value) {
		getCoreElement().setValue(value);
	}

	public boolean getMultiline() {
		return getCoreElement().getMultiline();
	}

	public void setMultiline(boolean multiline) {
		getCoreElement().setMultiline(multiline);
	}

	public boolean getRequired() {
		return getCoreElement().getRequired();
	}

	public void setRequired(boolean required) {
		getCoreElement().setRequired(required);
	}

	public String getPlaceholder() {
		return getCoreElement().getPlaceholder();
	}

	public void setPlaceholder(String placeholder) {
		if (placeholder != null)
			getCoreElement().setPlaceholder(placeholder);
	}

	public String getPattern() {
		return getCoreElement().getPattern();
	}

	public void setPattern(String pattern) {
		if (pattern != null)
			getCoreElement().setPattern(pattern);
	}

	public boolean getDisabled() {
		return getCoreElement().getDisabled();
	}

	public void setDisabled(boolean disabled) {
		getCoreElement().setDisabled(disabled);
	}

	public double getMin() {
		return getCoreElement().getMin();
	}

	public void setMin(double min) {
		getCoreElement().setMin(min);
	}

	public double getMax() {
		return getCoreElement().getMax();
	}

	public void setMax(double max) {
		getCoreElement().setMax(max);
	}

	public int getMaxRows() {
		return getCoreElement().getMaxRows();
	}

	public void setMaxRows(int maxRows) {
		getCoreElement().setMaxRows(maxRows);
	}

	public boolean getInvalid() {
		return getCoreElement().getInvalid();
	}

	public void setInvalid(boolean invalid) {
		getCoreElement().setInvalid(invalid);
	}

	public boolean getWillValidate() {
		return getCoreElement().getWillValidate();
	}

	public void setWillValidate(boolean willValidate) {
		getCoreElement().setWillValidate(willValidate);
	}

	public boolean isAutoFocus() {
		return getCoreElement().isAutoFocus();
	}

	public void setAutoFocus(boolean autoFocus) {
		getCoreElement().setAutoFocus(autoFocus);
	}

	private IronInputElement getCoreElement() {
		Element elem = super.getElement();
		return elem.cast();
	}
}
