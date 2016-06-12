package br.com.rpa.client._paperelements;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

import br.com.rpa.client._ironelements.IronSelectorElement;

@TagName(PaperRadioGroupElement.TAG)
public class PaperRadioGroupElement extends IronSelectorElement {

	public static final String TAG = "paper-radio-group";

	/**
	 * Assert that the given {@link Element} is compatible with this class and
	 * automatically typecast it.
	 */
	public static PaperRadioGroupElement as(Element elem) {
		assert elem.getTagName().equalsIgnoreCase(TAG);
		return (PaperRadioGroupElement) elem;
	}

	protected PaperRadioGroupElement() {}

}
