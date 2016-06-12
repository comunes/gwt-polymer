package br.com.rpa.client._ironelements;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

@TagName(IronSelectorElement.TAG)
public class IronSelectorElement extends Element {

  public static final String TAG = "iron-selector";

  /**
   * Assert that the given {@link Element} is compatible with this class and
   * automatically typecast it.
   */
  public static IronSelectorElement as(final Element elem) {
    assert elem.getTagName().equalsIgnoreCase(TAG);
    return (IronSelectorElement) elem;
  }

  protected IronSelectorElement() {
  }

  public final native String getActivateEvent() /*-{
		return this.activateEvent;
  }-*/;

  public final native String getItemSelector() /*-{
		return this.itemSelector;
  }-*/;

  public final native String getSelected() /*-{
		return this.selected;
  }-*/;

  public final native String getSelectedAttribute() /*-{
		return this.selectedAttribute;
  }-*/;

  public final native String getSelectedClass() /*-{
		return this.selectedClass;
  }-*/;

  public final native int getSelectedIndex() /*-{
		return this.selectedIndex;
  }-*/;

  public final native String getSelectedProperty() /*-{
		return this.selectedProperty;
  }-*/;

  public final native Element getTarget() /*-{
		return this.target;
  }-*/;

  public final native String getValueAttribute() /*-{
		return this.valueattr;
  }-*/;

  public final native boolean isMulti() /*-{
		return this.multi;
  }-*/;

  public final native boolean isNotap() /*-{
		return this.notap;
  }-*/;

  public final native void setActivateEvent(String evt) /*-{
		this.activateEvent = evt;
  }-*/;

  public final native void setItemSelector(String selector) /*-{
		this.itemSelector = selector;
  }-*/;

  public final native void setMulti(boolean status) /*-{
		this.multi = status;
  }-*/;

  public final native void setNotap(boolean status) /*-{
		this.notap = status;
  }-*/;

  public final native void setSelected(String selection) /*-{
		this.selected = selection;
  }-*/;

  public final native void setSelectedAttribute(String attr) /*-{
		this.selectedAttribute = attr;
  }-*/;

  public final native void setSelectedClass(String cls) /*-{
		this.selectedClass = cls;
  }-*/;

  public final native void setSelectedIndex(int index) /*-{
		this.selectedIndex = index;
  }-*/;

  public final native void setSelectedProperty(String prop) /*-{
		this.selectedProperty = prop;
  }-*/;

  public final native void setTarget(Element target) /*-{
		this.target = target;
  }-*/;

  public final native void setValueAttribute(String attr) /*-{
		this.valueattr = attr;
  }-*/;

}
