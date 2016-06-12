package br.com.rpa.client._paperelements;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Text;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;

import br.com.rpa.client._ironelements.HasIcon;

public class PaperButton extends PaperFocusable implements HasIcon, HasText {

  public static final String STYLE = "";

  public static PaperButton wrap(final Element element) {
    // Assert that the element is attached.
    assert Document.get().getBody().isOrHasChild(element);

    final PaperButton widget = new PaperButton(element, STYLE);

    // Mark it attached and remember it for cleanup.
    widget.onAttach();
    RootPanel.detachOnWindowClose(widget);

    return widget;
  }

  public static PaperButton wrap(final String id) {
    return wrap(DOM.getElementById(id));
  }

  private final Text textNode;

  public PaperButton() {
    this(Document.get().createElement(PaperButtonElement.TAG), STYLE);
  }

  public PaperButton(final Element element, String styleName) {
    super(element);
    if (styleName != null && !styleName.equalsIgnoreCase(STYLE)) {
      styleName = STYLE + " " + styleName;
    }
    if (!styleName.isEmpty()) {
      setStyleName(styleName);
    }
    textNode = Document.get().createTextNode("");
    element.appendChild(textNode);
  }

  @Override
  public String getIcon() {
    return getPaperElement().getIcon();
  }

  @Override
  public String getIconSrc() {
    return getPaperElement().getIconSrc();
  }

  @Deprecated
  public String getLabel() {
    return getPaperElement().getLabel();
  }

  @Override
  protected PaperButtonElement getPaperElement() {
    return getElement().cast();
  }

  @Override
  public String getText() {
    return textNode.getData();
  }

  public boolean isRaisedButton() {
    return getPaperElement().isRaisedButton();
  }

  @Override
  public void setIcon(final String ico) {
    getPaperElement().setIcon(ico);
  }

  @Override
  public void setIconSrc(final String iconsrc) {
    getPaperElement().setIconSrc(iconsrc);
  }

  @Deprecated
  public void setLabel(final String lbl) {
    getPaperElement().setLabel(lbl);
  }

  public void setRaisedButton(final boolean status) {
    getPaperElement().setRaisedButton(status);
  }

  @Override
  public void setText(final String text) {
    textNode.setData(text);
  }

}
