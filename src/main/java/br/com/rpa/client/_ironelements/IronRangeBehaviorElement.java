package br.com.rpa.client._ironelements;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

@TagName(IronRangeBehaviorElement.TAG)
public class IronRangeBehaviorElement extends Element {
  public static final String TAG = "iron-range-behavior";

  /**
   * Assert that the given {@link Element} is compatible with this class and
   * automatically typecast it.
   */
  public static IronRangeBehaviorElement as(final Element elem) {
    assert elem.getTagName().equalsIgnoreCase(TAG);
    return (IronRangeBehaviorElement) elem;
  }

  protected IronRangeBehaviorElement() {
  }

  public final native int getMax() /*-{
		return this.max
  }-*/;

  public final native int getMin() /*-{
		return this.min;
  }-*/;

  public final native int getRatio() /*-{
		return this.ratio;
  }-*/;

  public final native int getStep() /*-{
		return this.step;
  }-*/;

  public final native int getValue() /*-{
		return this.value;
  }-*/;

  public final native void setMax(int max) /*-{
		this.max = max;
  }-*/;

  public final native void setMin(int min) /*-{
		this.min = min;
  }-*/;

  public final native void setRatio(int ratio) /*-{
		this.ratio = ratio;
  }-*/;

  public final native void setStep(int step) /*-{
		this.step = step;
  }-*/;

  public final native void setValue(int value) /*-{
		this.value = value;
  }-*/;

}
