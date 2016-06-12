package br.com.rpa.client._paperelements;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.RootPanel;

public class PaperIconButton extends PaperButton {

  public static final String STYLE = "";

  public static PaperIconButton wrap(final Element element) {
    // Assert that the element is attached.
    assert Document.get().getBody().isOrHasChild(element);

    final PaperIconButton widget = new PaperIconButton(element, STYLE);

    // Mark it attached and remember it for cleanup.
    widget.onAttach();
    RootPanel.detachOnWindowClose(widget);

    return widget;
  }

  public static PaperIconButton wrap(final String id) {
    return wrap(DOM.getElementById(id));
  }

  public PaperIconButton() {
    this(Document.get().createElement(PaperIconButtonElement.TAG), STYLE);
  }

  public PaperIconButton(final Element element, final String styleName) {
    super(element, styleName);
  }

  @Override
  protected PaperIconButtonElement getPaperElement() {
    return getElement().cast();
  }

  public boolean isFill() {
    return getPaperElement().isFill();
  }

  public void setFill(final boolean status) {
    getPaperElement().setFill(status);
  }

  @Override
  public void setText(final String text) {
    // This icons has no text inside
    // super.setText(text);
  }

}
