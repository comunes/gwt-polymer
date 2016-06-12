package br.com.rpa.client._paperelements;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.TagName;

import br.com.rpa.client._ironelements.IronRangeBehaviorElement;

@TagName(PaperProgressElement.TAG)
public class PaperProgressElement extends IronRangeBehaviorElement {

  public static final String TAG = "paper-progress";

  /**
   * Assert that the given {@link Element} is compatible with this class and
   * automatically typecast it.
   */
  public static PaperProgressElement as(final Element elem) {
    assert elem.getTagName().equalsIgnoreCase(TAG);
    return (PaperProgressElement) elem;
  }

  protected PaperProgressElement() {
  }

  public final native int getSecondaryProgress() /*-{
		return this.secondaryProgress;
  }-*/;

  public final native boolean isIndeterminate() /*-{
		return this.inderteminate;
  }-*/;

  public final native void setIndeterminate(boolean indeterminate) /*-{
		this.indeterminate = indeterminate;
  }-*/;

  public final native void setSecondaryProgress(int secondaryProgress) /*-{
		this.secondaryProgress = secondaryProgress;
  }-*/;

}
