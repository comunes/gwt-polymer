package br.com.rpa.client._ironelements;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class IronIcon extends Widget implements HasIcon {

  public static final String STYLE = "";

  public static IronIcon wrap(final Element element) {
    // Assert that the element is attached.
    assert Document.get().getBody().isOrHasChild(element);

    final IronIcon widget = new IronIcon(element, STYLE);

    // Mark it attached and remember it for cleanup.
    widget.onAttach();
    RootPanel.detachOnWindowClose(widget);

    return widget;
  }

  public static IronIcon wrap(final String id) {
    return wrap(DOM.getElementById(id));
  }

  public IronIcon() {
    this(Document.get().createElement(IronIconElement.TAG), STYLE);
  }

  protected IronIcon(final Element elem) {
    setElement(elem);
  }

  public IronIcon(final Element element, String styleName) {
    this(element);
    if (styleName != null && !styleName.equalsIgnoreCase(STYLE)) {
      styleName = STYLE + " " + styleName;
    }
    if (!styleName.isEmpty()) {
      setStyleName(styleName);
    }
  }

  public String getAlt() {
    return getCoreElement().getAlt();
  }

  private IronIconElement getCoreElement() {
    return getElement().cast();
  }

  @Override
  public String getIcon() {
    return getCoreElement().getIcon();
  }

  @Override
  public String getIconSrc() {
    return getCoreElement().getIconSrc();
  }

  public void setAlt(final String alt) {
    getCoreElement().setAlt(alt);
  }

  @Override
  public void setIcon(final String icon) {
    getCoreElement().setIcon(icon);
  }

  @Override
  public void setIconSrc(final String src) {
    getCoreElement().setIconSrc(src);
  }

}
