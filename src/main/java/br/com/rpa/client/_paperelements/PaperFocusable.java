package br.com.rpa.client._paperelements;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.ButtonBase;

public class PaperFocusable extends ButtonBase {

  protected PaperFocusable(final Element elem) {
    super(elem);
  }

  protected PaperFocusableElement getPaperElement() {
    return getElement().cast();
  }

  public boolean isActive() {
    return getPaperElement().isActive();
  }

  public boolean isDisabled() {
    return getPaperElement().isDisabled();
  }

  public boolean isFocused() {
    return getPaperElement().isFocused();
  }

  public boolean isPressed() {
    return getPaperElement().isPressed();
  }

  public boolean isToggle() {
    return getPaperElement().isToggle();
  }

  public void setActive(final boolean status) {
    getPaperElement().setActive(status);
  }

  public void setDisabled(final boolean status) {
    getPaperElement().setDisabled(status);
  }

  public void setFocused(final boolean status) {
    getPaperElement().setFocused(status);
  }

  public void setPressed(final boolean status) {
    getPaperElement().setPressed(status);
  }

  public void setToggle(final boolean status) {
    getPaperElement().setToggle(status);
  }

}
