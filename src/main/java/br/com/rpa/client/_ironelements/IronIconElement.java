package br.com.rpa.client._ironelements;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

@TagName(IronIconElement.TAG)
public class IronIconElement extends Element {
  public static final String TAG = "iron-icon";

  /**
   * Assert that the given {@link Element} is compatible with this class and
   * automatically typecast it.
   */
  public static IronIconElement as(final Element elem) {
    assert elem.getTagName().equalsIgnoreCase(TAG);
    return (IronIconElement) elem;
  }

  protected IronIconElement() {
  }

  public final native String getAlt() /*-{
		return this.alt
  }-*/;

  public final native String getIcon() /*-{
		return this.icon
  }-*/;

  public final native String getIconSrc() /*-{
		return this.src
  }-*/;

  public final native void setAlt(String alt) /*-{
		this.alt = alt;
  }-*/;

  public final native void setIcon(String icon) /*-{
		this.icon = icon;
  }-*/;

  public final native void setIconSrc(String src) /*-{
		this.src = src;
  }-*/;

}
