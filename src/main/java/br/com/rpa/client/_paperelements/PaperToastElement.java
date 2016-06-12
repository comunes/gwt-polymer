package br.com.rpa.client._paperelements;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

@TagName(PaperToastElement.TAG)
public class PaperToastElement extends PaperFocusableElement {

  public static final String TAG = "paper-toast";

  /**
   * Assert that the given {@link Element} is compatible with this class and
   * automatically typecast it.
   */
  public static PaperToastElement as(final Element elem) {
    assert elem.getTagName().equalsIgnoreCase(TAG);
    return (PaperToastElement) elem;
  }

  protected PaperToastElement() {
  }

  public final native int getDuration() /*-{
		return this.duration;
  }-*/;

  public final native String getResponsiveWidth() /*-{
		return this.responsiveWidth;
  }-*/;

  public final native String getText() /*-{
		return this.text;
  }-*/;

  public final native void hide() /*-{
		this.hide();
  }-*/;

  public final native boolean isAutoCloseDisabled() /*-{
		return this.autoCloseDisabled;
  }-*/;

  public final native boolean isOpened() /*-{
		return this.opened;
  }-*/;

  public final native boolean isSwipeDisabled() /*-{
		return this.swipeDisabled;
  }-*/;

  public final native void setAutoCloseDisabled(boolean autoCloseDisabled) /*-{
		this.autoCloseDisabled = autoCloseDisabled;
  }-*/;

  public final native void setDuration(int duration) /*-{
		this.duration = duration;
  }-*/;

  public final native void setOpened(boolean opened) /*-{
		this.opened = opened;
  }-*/;

  public final native void setResponsiveWidth(String responsiveWidth) /*-{
		this.responsiveWidth = responsiveWidth;
  }-*/;

  public final native void setSwipeDisabled(boolean swipeDisabled) /*-{
		this.swipeDisabled = swipeDisabled;
  }-*/;

  public final native void setText(String text) /*-{
		this.text = text;
  }-*/;

  public final native void show() /*-{
		this.show();
  }-*/;

  public final native void toggle() /*-{
		this.toggle();
  }-*/;

}
