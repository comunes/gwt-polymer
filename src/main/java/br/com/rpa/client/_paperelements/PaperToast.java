package br.com.rpa.client._paperelements;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.FocusWidget;
import com.google.gwt.user.client.ui.RootPanel;

public class PaperToast extends FocusWidget {

  public static String STYLE = "";

  public static PaperToast wrap(final Element element) {
    // Assert that the element is attached.
    assert Document.get().getBody().isOrHasChild(element);

    final PaperToast fab = new PaperToast(element, STYLE);

    // Mark it attached and remember it for cleanup.
    fab.onAttach();
    RootPanel.detachOnWindowClose(fab);

    return fab;
  }

  public static PaperToast wrap(final String id) {
    return wrap(DOM.getElementById(id));
  }

  public PaperToast() {
    this(Document.get().createElement(PaperToastElement.TAG), STYLE);
  }

  protected PaperToast(final Element elem) {
    super(elem);
  }

  public PaperToast(final Element element, String styleName) {
    this(element);
    if (styleName != null && !styleName.equalsIgnoreCase(STYLE)) {
      styleName = STYLE + " " + styleName;
    }
    if (!styleName.isEmpty()) {
      setStyleName(styleName);
    }
  }

  public int getDuration() {
    return getPaperElement().getDuration();
  }

  protected PaperToastElement getPaperElement() {
    return getElement().cast();
  }

  public String getResponsiveWidth() {
    return getPaperElement().getResponsiveWidth();
  }

  public String getText() {
    return getPaperElement().getText();
  }

  public void hide() {
    getPaperElement().hide();
  }

  public boolean isAutoCloseDisabled() {
    return getPaperElement().isAutoCloseDisabled();
  }

  public boolean isOpened() {
    return getPaperElement().isOpened();
  }

  public boolean isSwipeDisabled() {
    return getPaperElement().isSwipeDisabled();
  }

  public void setAutoCloseDisabled(final boolean autoCloseDisabled) {
    getPaperElement().setAutoCloseDisabled(autoCloseDisabled);
  }

  public void setDuration(final int duration) {
    getPaperElement().setDuration(duration);
  }

  public void setOpened(final boolean opened) {
    getPaperElement().setOpened(opened);
  }

  public void setResponsiveWidth(final String responsiveWidth) {
    getPaperElement().setResponsiveWidth(responsiveWidth);
  }

  public void setSwipeDisabled(final boolean swipeDisabled) {
    getPaperElement().setSwipeDisabled(swipeDisabled);
  }

  public void setText(final String text) {
    getPaperElement().setText(text);
  }

  public void show() {
    getPaperElement().show();
  }

  public void toggle() {
    getPaperElement().toggle();
  }

}
