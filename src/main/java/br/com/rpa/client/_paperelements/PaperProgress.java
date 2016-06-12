package br.com.rpa.client._paperelements;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.RootPanel;

import br.com.rpa.client._ironelements.IronRangeBehavior;

public class PaperProgress extends IronRangeBehavior {

  public static PaperProgress wrap(final Element element) {
    // Assert that the element is attached.
    assert Document.get().getBody().isOrHasChild(element);

    final PaperProgress widget = new PaperProgress(element);

    // Mark it attached and remember it for cleanup.
    widget.onAttach();
    RootPanel.detachOnWindowClose(widget);

    return widget;
  }

  public static PaperProgress wrap(final String id) {
    return wrap(DOM.getElementById(id));
  }

  public PaperProgress() {
    this(Document.get().createElement(PaperProgressElement.TAG));
  }

  public PaperProgress(final Element element) {
    super(element);
  }

  protected PaperProgressElement getPaperElement() {
    return getElement().cast();
  }

  public int getSecondaryProgress() {
    return getPaperElement().getSecondaryProgress();
  }

  public boolean isIndeterminate() {
    return getPaperElement().isIndeterminate();
  }

  public void setIndeterminate(final boolean indeterminate) {
    getPaperElement().setIndeterminate(indeterminate);
  }

  public void setSecondaryProgress(final int secondaryProgress) {
    getPaperElement().setSecondaryProgress(secondaryProgress);
  }

}
